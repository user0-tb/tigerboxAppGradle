package j$.time;

import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import j$.time.zone.ZoneRulesProvider;

/* loaded from: classes2.dex */
final class ZoneRegion extends ZoneId {
    private final String id;
    private final transient ZoneRules rules;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneRegion(String str, ZoneRules zoneRules) {
        this.id = str;
        this.rules = zoneRules;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneRegion ofId(String str, boolean z) {
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
                }
            }
            ZoneRules zoneRules = null;
            try {
                zoneRules = ZoneRulesProvider.getRules(str, true);
            } catch (ZoneRulesException e) {
                if (z) {
                    throw e;
                }
            }
            return new ZoneRegion(str, zoneRules);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    @Override // j$.time.ZoneId
    public String getId() {
        return this.id;
    }

    @Override // j$.time.ZoneId
    public ZoneRules getRules() {
        ZoneRules zoneRules = this.rules;
        return zoneRules != null ? zoneRules : ZoneRulesProvider.getRules(this.id, false);
    }
}
