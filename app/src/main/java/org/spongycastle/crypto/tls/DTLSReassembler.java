package org.spongycastle.crypto.tls;

import java.util.Vector;

/* loaded from: classes4.dex */
class DTLSReassembler {
    private final byte[] body;
    private Vector missing;
    private final short msg_type;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTLSReassembler(short s, int i) {
        Vector vector = new Vector();
        this.missing = vector;
        this.msg_type = s;
        this.body = new byte[i];
        vector.addElement(new Range(0, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public short getType() {
        return this.msg_type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] getBodyIfComplete() {
        if (this.missing.isEmpty()) {
            return this.body;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void contributeFragment(short s, int i, byte[] bArr, int i2, int i3, int i4) {
        int i5 = i3 + i4;
        if (this.msg_type == s && this.body.length == i && i5 <= i) {
            int i6 = 0;
            if (i4 == 0) {
                if (i3 == 0 && !this.missing.isEmpty() && ((Range) this.missing.firstElement()).getEnd() == 0) {
                    this.missing.removeElementAt(0);
                    return;
                }
                return;
            }
            while (i6 < this.missing.size()) {
                Range range = (Range) this.missing.elementAt(i6);
                if (range.getStart() >= i5) {
                    return;
                }
                if (range.getEnd() > i3) {
                    int max = Math.max(range.getStart(), i3);
                    int min = Math.min(range.getEnd(), i5);
                    System.arraycopy(bArr, (i2 + max) - i3, this.body, max, min - max);
                    if (max == range.getStart()) {
                        if (min == range.getEnd()) {
                            this.missing.removeElementAt(i6);
                            i6--;
                        } else {
                            range.setStart(min);
                        }
                    } else if (min == range.getEnd()) {
                        range.setEnd(max);
                    } else {
                        i6++;
                        this.missing.insertElementAt(new Range(min, range.getEnd()), i6);
                        range.setEnd(max);
                    }
                }
                i6++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reset() {
        this.missing.removeAllElements();
        this.missing.addElement(new Range(0, this.body.length));
    }

    /* loaded from: classes4.dex */
    private static class Range {
        private int end;
        private int start;

        Range(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public int getStart() {
            return this.start;
        }

        public void setStart(int i) {
            this.start = i;
        }

        public int getEnd() {
            return this.end;
        }

        public void setEnd(int i) {
            this.end = i;
        }
    }
}
