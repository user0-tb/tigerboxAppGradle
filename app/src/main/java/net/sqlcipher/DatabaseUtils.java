package net.sqlcipher;

import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.database.SQLException;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteProgram;
import net.sqlcipher.database.SQLiteStatement;

/* loaded from: classes4.dex */
public class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final boolean LOCAL_LOGV = false;
    private static final String TAG = "DatabaseUtils";
    private static final String[] countProjection = {"count(*)"};
    private static final char[] HEX_DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static Collator mColl = null;

    public static final void writeExceptionToParcel(Parcel parcel, Exception exc) {
        boolean z;
        int i = 1;
        if (exc instanceof FileNotFoundException) {
            z = false;
        } else if (exc instanceof IllegalArgumentException) {
            z = true;
            i = 2;
        } else if (exc instanceof UnsupportedOperationException) {
            z = true;
            i = 3;
        } else if (exc instanceof SQLiteAbortException) {
            z = true;
            i = 4;
        } else if (exc instanceof SQLiteConstraintException) {
            z = true;
            i = 5;
        } else if (exc instanceof SQLiteDatabaseCorruptException) {
            z = true;
            i = 6;
        } else if (exc instanceof SQLiteFullException) {
            z = true;
            i = 7;
        } else if (exc instanceof SQLiteDiskIOException) {
            z = true;
            i = 8;
        } else if (exc instanceof SQLiteException) {
            z = true;
            i = 9;
        } else if (!(exc instanceof OperationApplicationException)) {
            parcel.writeException(exc);
            Log.e(TAG, "Writing exception to parcel", exc);
            return;
        } else {
            z = true;
            i = 10;
        }
        parcel.writeInt(i);
        parcel.writeString(exc.getMessage());
        if (z) {
            Log.e(TAG, "Writing exception to parcel", exc);
        }
    }

    public static final void readExceptionFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return;
        }
        readExceptionFromParcel(parcel, parcel.readString(), readInt);
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(Parcel parcel) throws FileNotFoundException {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return;
        }
        String readString = parcel.readString();
        if (readInt == 1) {
            throw new FileNotFoundException(readString);
        }
        readExceptionFromParcel(parcel, readString, readInt);
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(Parcel parcel) throws OperationApplicationException {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return;
        }
        String readString = parcel.readString();
        if (readInt == 10) {
            throw new OperationApplicationException(readString);
        }
        readExceptionFromParcel(parcel, readString, readInt);
    }

    private static final void readExceptionFromParcel(Parcel parcel, String str, int i) {
        switch (i) {
            case 2:
                throw new IllegalArgumentException(str);
            case 3:
                throw new UnsupportedOperationException(str);
            case 4:
                throw new SQLiteAbortException(str);
            case 5:
                throw new SQLiteConstraintException(str);
            case 6:
                throw new SQLiteDatabaseCorruptException(str);
            case 7:
                throw new SQLiteFullException(str);
            case 8:
                throw new SQLiteDiskIOException(str);
            case 9:
                throw new SQLiteException(str);
            default:
                parcel.readException(i, str);
                return;
        }
    }

    public static void bindObjectToProgram(SQLiteProgram sQLiteProgram, int i, Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i);
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            sQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
        } else if (obj instanceof Number) {
            sQLiteProgram.bindLong(i, ((Number) obj).longValue());
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                sQLiteProgram.bindLong(i, 1L);
            } else {
                sQLiteProgram.bindLong(i, 0L);
            }
        } else if (obj instanceof byte[]) {
            sQLiteProgram.bindBlob(i, (byte[]) obj);
        } else {
            sQLiteProgram.bindString(i, obj.toString());
        }
    }

    public static int getTypeOfObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer)) ? 1 : 3;
    }

    public static void appendEscapedSQLString(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    public static String sqlEscapeString(String str) {
        StringBuilder sb = new StringBuilder();
        appendEscapedSQLString(sb, str);
        return sb.toString();
    }

    public static final void appendValueToSql(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("NULL");
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        } else {
            appendEscapedSQLString(sb, obj.toString());
        }
    }

    public static String concatenateWhere(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    public static String getCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getHexCollationKey(String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new String(encodeHex(collationKeyInBytes, HEX_DIGITS_LOWER), 0, getKeyLen(collationKeyInBytes) * 2);
    }

    private static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & Ascii.SI];
        }
        return cArr2;
    }

    private static int getKeyLen(byte[] bArr) {
        if (bArr[bArr.length - 1] != 0) {
            return bArr.length;
        }
        return bArr.length - 1;
    }

    private static byte[] getCollationKeyInBytes(String str) {
        if (mColl == null) {
            Collator collator = Collator.getInstance();
            mColl = collator;
            collator.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static void dumpCursor(android.database.Cursor cursor) {
        dumpCursor(cursor, System.out);
    }

    public static void dumpCursor(android.database.Cursor cursor, PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor " + cursor);
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static void dumpCursor(android.database.Cursor cursor, StringBuilder sb) {
        sb.append(">>>>> Dumping cursor " + cursor + "\n");
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb);
            }
            cursor.moveToPosition(position);
        }
        sb.append("<<<<<\n");
    }

    public static String dumpCursorToString(android.database.Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCursor(cursor, sb);
        return sb.toString();
    }

    public static void dumpCurrentRow(android.database.Cursor cursor) {
        dumpCurrentRow(cursor, System.out);
    }

    public static void dumpCurrentRow(android.database.Cursor cursor, PrintStream printStream) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        printStream.println("" + cursor.getPosition() + " {");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            printStream.println("   " + columnNames[i] + '=' + str);
        }
        printStream.println("}");
    }

    public static void dumpCurrentRow(android.database.Cursor cursor, StringBuilder sb) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        sb.append("" + cursor.getPosition() + " {\n");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                str = cursor.getString(i);
            } catch (SQLiteException unused) {
                str = "<unprintable>";
            }
            sb.append("   " + columnNames[i] + '=' + str + "\n");
        }
        sb.append("}\n");
    }

    public static String dumpCurrentRowToString(android.database.Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        dumpCurrentRow(cursor, sb);
        return sb.toString();
    }

    public static void cursorStringToContentValues(android.database.Cursor cursor, String str, ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorStringToInsertHelper(android.database.Cursor cursor, String str, InsertHelper insertHelper, int i) {
        insertHelper.bind(i, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorStringToContentValues(android.database.Cursor cursor, String str, ContentValues contentValues, String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorIntToContentValues(android.database.Cursor cursor, String str, ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorIntToContentValues(android.database.Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            contentValues.put(str2, (Integer) null);
        }
    }

    public static void cursorLongToContentValues(android.database.Cursor cursor, String str, ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValues(android.database.Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Long.valueOf(cursor.getLong(columnIndex)));
        } else {
            contentValues.put(str2, (Long) null);
        }
    }

    public static void cursorDoubleToCursorValues(android.database.Cursor cursor, String str, ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorDoubleToContentValues(android.database.Cursor cursor, String str, ContentValues contentValues, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, Double.valueOf(cursor.getDouble(columnIndex)));
        } else {
            contentValues.put(str2, (Double) null);
        }
    }

    public static void cursorRowToContentValues(android.database.Cursor cursor, ContentValues contentValues) {
        AbstractWindowedCursor abstractWindowedCursor = cursor instanceof AbstractWindowedCursor ? (AbstractWindowedCursor) cursor : null;
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (abstractWindowedCursor != null && abstractWindowedCursor.isBlob(i)) {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            } else {
                contentValues.put(columnNames[i], cursor.getString(i));
            }
        }
    }

    public static long queryNumEntries(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(str, countProjection, null, null, null, null, null);
        try {
            query.moveToFirst();
            return query.getLong(0);
        } finally {
            query.close();
        }
    }

    public static long longForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return longForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static long longForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                i = i2;
            }
        }
        return sQLiteStatement.simpleQueryForLong();
    }

    public static String stringForQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return stringForQuery(compileStatement, strArr);
        } finally {
            compileStatement.close();
        }
    }

    public static String stringForQuery(SQLiteStatement sQLiteStatement, String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                i = i2;
            }
        }
        return sQLiteStatement.simpleQueryForString();
    }

    public static void cursorStringToContentValuesIfPresent(android.database.Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, cursor.getString(columnIndexOrThrow));
    }

    public static void cursorLongToContentValuesIfPresent(android.database.Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, Long.valueOf(cursor.getLong(columnIndexOrThrow)));
    }

    public static void cursorShortToContentValuesIfPresent(android.database.Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, Short.valueOf(cursor.getShort(columnIndexOrThrow)));
    }

    public static void cursorIntToContentValuesIfPresent(android.database.Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, Integer.valueOf(cursor.getInt(columnIndexOrThrow)));
    }

    public static void cursorFloatToContentValuesIfPresent(android.database.Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, Float.valueOf(cursor.getFloat(columnIndexOrThrow)));
    }

    public static void cursorDoubleToContentValuesIfPresent(android.database.Cursor cursor, ContentValues contentValues, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, Double.valueOf(cursor.getDouble(columnIndexOrThrow)));
    }

    /* loaded from: classes4.dex */
    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private HashMap<String, Integer> mColumns;
        private final SQLiteDatabase mDb;
        private final String mTableName;
        private String mInsertSQL = null;
        private SQLiteStatement mInsertStatement = null;
        private SQLiteStatement mReplaceStatement = null;
        private SQLiteStatement mPreparedStatement = null;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        private void buildSQL() throws SQLException {
            StringBuilder sb = new StringBuilder(128);
            sb.append("INSERT INTO ");
            sb.append(this.mTableName);
            sb.append(" (");
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("VALUES (");
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase = this.mDb;
                cursor = sQLiteDatabase.rawQuery("PRAGMA table_info(" + this.mTableName + ")", (String[]) null);
                this.mColumns = new HashMap<>(cursor.getCount());
                int i = 1;
                while (cursor.moveToNext()) {
                    String string = cursor.getString(1);
                    String string2 = cursor.getString(4);
                    this.mColumns.put(string, Integer.valueOf(i));
                    sb.append("'");
                    sb.append(string);
                    sb.append("'");
                    if (string2 == null) {
                        sb2.append("?");
                    } else {
                        sb2.append("COALESCE(?, ");
                        sb2.append(string2);
                        sb2.append(")");
                    }
                    sb.append(i == cursor.getCount() ? ") " : ", ");
                    sb2.append(i == cursor.getCount() ? ");" : ", ");
                    i++;
                }
                sb.append((CharSequence) sb2);
                this.mInsertSQL = sb.toString();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        private SQLiteStatement getStatement(boolean z) throws SQLException {
            if (z) {
                if (this.mReplaceStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    this.mReplaceStatement = this.mDb.compileStatement("INSERT OR REPLACE" + this.mInsertSQL.substring(6));
                }
                return this.mReplaceStatement;
            }
            if (this.mInsertStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
            }
            return this.mInsertStatement;
        }

        private synchronized long insertInternal(ContentValues contentValues, boolean z) {
            SQLiteStatement statement;
            try {
                statement = getStatement(z);
                statement.clearBindings();
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    DatabaseUtils.bindObjectToProgram(statement, getColumnIndex(entry.getKey()), entry.getValue());
                }
            } catch (SQLException e) {
                Log.e(DatabaseUtils.TAG, "Error inserting " + contentValues + " into table  " + this.mTableName, e);
                return -1L;
            }
            return statement.executeInsert();
        }

        public int getColumnIndex(String str) {
            getStatement(false);
            Integer num = this.mColumns.get(str);
            if (num == null) {
                throw new IllegalArgumentException("column '" + str + "' is invalid");
            }
            return num.intValue();
        }

        public void bind(int i, double d) {
            this.mPreparedStatement.bindDouble(i, d);
        }

        public void bind(int i, float f) {
            this.mPreparedStatement.bindDouble(i, f);
        }

        public void bind(int i, long j) {
            this.mPreparedStatement.bindLong(i, j);
        }

        public void bind(int i, int i2) {
            this.mPreparedStatement.bindLong(i, i2);
        }

        public void bind(int i, boolean z) {
            this.mPreparedStatement.bindLong(i, z ? 1L : 0L);
        }

        public void bindNull(int i) {
            this.mPreparedStatement.bindNull(i);
        }

        public void bind(int i, byte[] bArr) {
            if (bArr == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindBlob(i, bArr);
            }
        }

        public void bind(int i, String str) {
            if (str == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindString(i, str);
            }
        }

        public long insert(ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public long execute() {
            SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (sQLiteStatement == null) {
                throw new IllegalStateException("you must prepare this inserter before calling execute");
            }
            try {
                return sQLiteStatement.executeInsert();
            } catch (SQLException e) {
                Log.e(DatabaseUtils.TAG, "Error executing InsertHelper with table " + this.mTableName, e);
                return -1L;
            } finally {
                this.mPreparedStatement = null;
            }
        }

        public void prepareForInsert() {
            SQLiteStatement statement = getStatement(false);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public void prepareForReplace() {
            SQLiteStatement statement = getStatement(true);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public long replace(ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }

        public void close() {
            SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            SQLiteStatement sQLiteStatement2 = this.mReplaceStatement;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }
    }

    public static void cursorFillWindow(android.database.Cursor cursor, int i, android.database.CursorWindow cursorWindow) {
        boolean putNull;
        if (i < 0 || i >= cursor.getCount()) {
            return;
        }
        int position = cursor.getPosition();
        int columnCount = cursor.getColumnCount();
        cursorWindow.clear();
        cursorWindow.setStartPosition(i);
        cursorWindow.setNumColumns(columnCount);
        if (cursor.moveToPosition(i)) {
            while (cursorWindow.allocRow()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= columnCount) {
                        break;
                    }
                    int type = cursor.getType(i2);
                    if (type == 0) {
                        putNull = cursorWindow.putNull(i, i2);
                    } else if (type == 1) {
                        putNull = cursorWindow.putLong(cursor.getLong(i2), i, i2);
                    } else if (type == 2) {
                        putNull = cursorWindow.putDouble(cursor.getDouble(i2), i, i2);
                    } else if (type == 4) {
                        byte[] blob = cursor.getBlob(i2);
                        if (blob != null) {
                            putNull = cursorWindow.putBlob(blob, i, i2);
                        } else {
                            putNull = cursorWindow.putNull(i, i2);
                        }
                    } else {
                        String string = cursor.getString(i2);
                        if (string != null) {
                            putNull = cursorWindow.putString(string, i, i2);
                        } else {
                            putNull = cursorWindow.putNull(i, i2);
                        }
                    }
                    if (!putNull) {
                        cursorWindow.freeLastRow();
                        break;
                    }
                    i2++;
                }
                i++;
                if (!cursor.moveToNext()) {
                    break;
                }
            }
        }
        cursor.moveToPosition(position);
    }
}
