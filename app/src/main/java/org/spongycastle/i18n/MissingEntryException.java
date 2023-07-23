package org.spongycastle.i18n;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;

/* loaded from: classes4.dex */
public class MissingEntryException extends RuntimeException {
    private String debugMsg;
    protected final String key;
    protected final ClassLoader loader;
    protected final Locale locale;
    protected final String resource;

    public MissingEntryException(String str, String str2, String str3, Locale locale, ClassLoader classLoader) {
        super(str);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }

    public MissingEntryException(String str, Throwable th, String str2, String str3, Locale locale, ClassLoader classLoader) {
        super(str, th);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }

    public String getKey() {
        return this.key;
    }

    public String getResource() {
        return this.resource;
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getDebugMsg() {
        URL[] uRLs;
        if (this.debugMsg == null) {
            this.debugMsg = "Can not find entry " + this.key + " in resource file " + this.resource + " for the locale " + this.locale + DownloadsManager.EXTENSION_SEPARATOR;
            ClassLoader classLoader = this.loader;
            if (classLoader instanceof URLClassLoader) {
                this.debugMsg += " The following entries in the classpath were searched: ";
                for (int i = 0; i != ((URLClassLoader) classLoader).getURLs().length; i++) {
                    this.debugMsg += uRLs[i] + " ";
                }
            }
        }
        return this.debugMsg;
    }
}
