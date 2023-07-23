package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Objects;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class DecimalStyle {
    public static final DecimalStyle STANDARD = new DecimalStyle('0', '+', '-', '.');

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private DecimalStyle(char c, char c2, char c3, char c4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String convertNumberToI18N(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int convertToDigit(char c) {
        int i = c - '0';
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DecimalStyle) {
            Objects.requireNonNull((DecimalStyle) obj);
            return true;
        }
        return false;
    }

    public char getDecimalSeparator() {
        return '.';
    }

    public char getNegativeSign() {
        return '-';
    }

    public char getPositiveSign() {
        return '+';
    }

    public char getZeroDigit() {
        return '0';
    }

    public int hashCode() {
        return CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
    }

    public String toString() {
        return "DecimalStyle[0+-.]";
    }
}
