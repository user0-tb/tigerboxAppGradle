package j$.time.format;

import j$.time.DateTimeException;

/* loaded from: classes2.dex */
public class DateTimeParseException extends DateTimeException {
    public DateTimeParseException(String str, CharSequence charSequence, int i) {
        super(str);
        charSequence.toString();
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i, Throwable th) {
        super(str, th);
        charSequence.toString();
    }
}
