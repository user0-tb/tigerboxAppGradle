package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.Parameters;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@Immutable
/* loaded from: classes3.dex */
public final class MonitoringKeysetInfo {
    private final MonitoringAnnotations annotations;
    private final List<Entry> entries;
    @Nullable
    private final Integer primaryKeyId;

    @Immutable
    /* loaded from: classes3.dex */
    public static final class Entry {
        private final int keyId;
        private final Parameters parameters;
        private final KeyStatus status;

        public KeyStatus getStatus() {
            return this.status;
        }

        public int getKeyId() {
            return this.keyId;
        }

        public Parameters getParameters() {
            return this.parameters;
        }

        private Entry(KeyStatus status, int keyId, Parameters parameters) {
            this.status = status;
            this.keyId = keyId;
            this.parameters = parameters;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                return this.status == entry.status && this.keyId == entry.keyId && this.parameters.equals(entry.parameters);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.status, Integer.valueOf(this.keyId), Integer.valueOf(this.parameters.hashCode()));
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, parameters='%s')", this.status, Integer.valueOf(this.keyId), this.parameters);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        @Nullable
        private ArrayList<Entry> builderEntries = new ArrayList<>();
        private MonitoringAnnotations builderAnnotations = MonitoringAnnotations.EMPTY;
        @Nullable
        private Integer builderPrimaryKeyId = null;

        public Builder setAnnotations(MonitoringAnnotations annotations) {
            if (this.builderEntries == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.builderAnnotations = annotations;
            return this;
        }

        public Builder addEntry(KeyStatus status, int keyId, Parameters parameters) {
            ArrayList<Entry> arrayList = this.builderEntries;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new Entry(status, keyId, parameters));
            return this;
        }

        public Builder setPrimaryKeyId(int primaryKeyId) {
            if (this.builderEntries == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.builderPrimaryKeyId = Integer.valueOf(primaryKeyId);
            return this;
        }

        private boolean isKeyIdInEntries(int keyId) {
            Iterator<Entry> it = this.builderEntries.iterator();
            while (it.hasNext()) {
                if (it.next().getKeyId() == keyId) {
                    return true;
                }
            }
            return false;
        }

        public MonitoringKeysetInfo build() throws GeneralSecurityException {
            if (this.builderEntries == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.builderPrimaryKeyId;
            if (num != null && !isKeyIdInEntries(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            MonitoringKeysetInfo monitoringKeysetInfo = new MonitoringKeysetInfo(this.builderAnnotations, Collections.unmodifiableList(this.builderEntries), this.builderPrimaryKeyId);
            this.builderEntries = null;
            return monitoringKeysetInfo;
        }
    }

    private MonitoringKeysetInfo(MonitoringAnnotations annotations, List<Entry> entries, Integer primaryKeyId) {
        this.annotations = annotations;
        this.entries = entries;
        this.primaryKeyId = primaryKeyId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public MonitoringAnnotations getAnnotations() {
        return this.annotations;
    }

    public List<Entry> getEntries() {
        return this.entries;
    }

    @Nullable
    public Integer getPrimaryKeyId() {
        return this.primaryKeyId;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MonitoringKeysetInfo) {
            MonitoringKeysetInfo monitoringKeysetInfo = (MonitoringKeysetInfo) obj;
            return this.annotations.equals(monitoringKeysetInfo.annotations) && this.entries.equals(monitoringKeysetInfo.entries) && Objects.equals(this.primaryKeyId, monitoringKeysetInfo.primaryKeyId);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.annotations, this.entries);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.annotations, this.entries, this.primaryKeyId);
    }
}
