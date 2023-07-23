package j$.time.format;

/* loaded from: classes2.dex */
public enum TextStyle {
    FULL(2, 0),
    FULL_STANDALONE(32770, 0),
    SHORT(1, 1),
    SHORT_STANDALONE(32769, 1),
    NARROW(4, 1),
    NARROW_STANDALONE(32772, 1);
    
    private final int zoneNameStyleIndex;

    TextStyle(int i, int i2) {
        this.zoneNameStyleIndex = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zoneNameStyleIndex() {
        return this.zoneNameStyleIndex;
    }
}
