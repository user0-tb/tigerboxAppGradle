package com.google.crypto.tink.monitoring;

import com.google.errorprone.annotations.Immutable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Immutable
/* loaded from: classes3.dex */
public final class MonitoringAnnotations {
    public static final MonitoringAnnotations EMPTY = newBuilder().build();
    private final Map<String, String> entries;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private HashMap<String, String> builderEntries = new HashMap<>();

        public Builder addAll(Map<String, String> newEntries) {
            HashMap<String, String> hashMap = this.builderEntries;
            if (hashMap == null) {
                throw new IllegalStateException("addAll cannot be called after build()");
            }
            hashMap.putAll(newEntries);
            return this;
        }

        public Builder add(String name, String value) {
            HashMap<String, String> hashMap = this.builderEntries;
            if (hashMap == null) {
                throw new IllegalStateException("add cannot be called after build()");
            }
            hashMap.put(name, value);
            return this;
        }

        public MonitoringAnnotations build() {
            if (this.builderEntries == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            MonitoringAnnotations monitoringAnnotations = new MonitoringAnnotations(Collections.unmodifiableMap(this.builderEntries));
            this.builderEntries = null;
            return monitoringAnnotations;
        }
    }

    private MonitoringAnnotations(Map<String, String> entries) {
        this.entries = entries;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Map<String, String> toMap() {
        return this.entries;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MonitoringAnnotations) {
            return this.entries.equals(((MonitoringAnnotations) obj).entries);
        }
        return false;
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public String toString() {
        return this.entries.toString();
    }
}
