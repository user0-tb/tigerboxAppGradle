package net.sqlcipher.database;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class SQLiteCompiledSql {
    private static final String TAG = "SQLiteCompiledSql";
    SQLiteDatabase mDatabase;
    private String mSqlStmt;
    long nHandle;
    long nStatement = 0;
    private boolean mInUse = false;

    private final native void native_compile(String str);

    private final native void native_finalize();

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        this.nHandle = 0L;
        this.mSqlStmt = null;
        if (!sQLiteDatabase.isOpen()) {
            throw new IllegalStateException("database " + sQLiteDatabase.getPath() + " already closed");
        }
        this.mDatabase = sQLiteDatabase;
        this.mSqlStmt = str;
        this.nHandle = sQLiteDatabase.mNativeHandle;
        compile(str, true);
    }

    private void compile(String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        } else if (z) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                Log.v(TAG, "closed and deallocated DbObj (id#" + this.nStatement + ")");
            }
            native_finalize();
            this.nStatement = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean acquire() {
        if (this.mInUse) {
            return false;
        }
        this.mInUse = true;
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            Log.v(TAG, "Acquired DbObj (id#" + this.nStatement + ") from DB cache");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void release() {
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            Log.v(TAG, "Released DbObj (id#" + this.nStatement + ") back to DB cache");
        }
        this.mInUse = false;
    }

    protected void finalize() throws Throwable {
        try {
            if (this.nStatement == 0) {
                return;
            }
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                Log.v(TAG, "** warning ** Finalized DbObj (id#" + this.nStatement + ")");
            }
            releaseSqlStatement();
        } finally {
            super.finalize();
        }
    }
}
