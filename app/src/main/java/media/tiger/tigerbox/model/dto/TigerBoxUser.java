package media.tiger.tigerbox.model.dto;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: TigerBoxUser.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bG\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010(J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u000bHÆ\u0003J\t\u0010Q\u001a\u00020\u000bHÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u000bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u001dHÆ\u0003J\t\u0010[\u001a\u00020\u001fHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014HÆ\u0003J\t\u0010`\u001a\u00020%HÆ\u0003J\t\u0010a\u001a\u00020'HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u000bHÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003JÍ\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'HÆ\u0001J\u0013\u0010j\u001a\u00020\u000b2\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010l\u001a\u00020\u0003HÖ\u0001J\t\u0010m\u001a\u00020\u0005HÖ\u0001R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00107R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00107R\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00107R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u00107R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00106¨\u0006n"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerBoxUser;", "", TtmlNode.ATTR_ID, "", "firstName", "", "lastName", "accountType", MessageBundle.TITLE_ENTRY, NotificationCompat.CATEGORY_EMAIL, "newsletter", "", "country", "language", "city", "postalCode", "maxDevices", "isEnabled", "isValidated", "roles", "", "version", "metaData", "Lmedia/tiger/tigerbox/model/dto/MetaDataX;", "applicationInstanceId", "isGuest", "affiliate", "library", "settings", "Lmedia/tiger/tigerbox/model/dto/SettingsX;", "shopLayouts", "Lmedia/tiger/tigerbox/model/dto/ShopLayouts;", "username", "pin", "subscriptionMessage", "recentlyUsedProducts", "_links", "Lmedia/tiger/tigerbox/model/dto/LinksX;", "_embedded", "Lmedia/tiger/tigerbox/model/dto/Embedded;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/util/List;ILmedia/tiger/tigerbox/model/dto/MetaDataX;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/SettingsX;Lmedia/tiger/tigerbox/model/dto/ShopLayouts;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmedia/tiger/tigerbox/model/dto/LinksX;Lmedia/tiger/tigerbox/model/dto/Embedded;)V", "get_embedded", "()Lmedia/tiger/tigerbox/model/dto/Embedded;", "get_links", "()Lmedia/tiger/tigerbox/model/dto/LinksX;", "getAccountType", "()Ljava/lang/String;", "getAffiliate", "getApplicationInstanceId", "getCity", "getCountry", "getEmail", "getFirstName", "getId", "()I", "()Z", "getLanguage", "getLastName", "getLibrary", "getMaxDevices", "getMetaData", "()Lmedia/tiger/tigerbox/model/dto/MetaDataX;", "getNewsletter", "getPin", "getPostalCode", "getRecentlyUsedProducts", "()Ljava/util/List;", "getRoles", "getSettings", "()Lmedia/tiger/tigerbox/model/dto/SettingsX;", "getShopLayouts", "()Lmedia/tiger/tigerbox/model/dto/ShopLayouts;", "getSubscriptionMessage", "getTitle", "getUsername", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerBoxUser {
    private final Embedded _embedded;
    private final LinksX _links;
    private final String accountType;
    private final String affiliate;
    private final String applicationInstanceId;
    private final String city;
    private final String country;
    private final String email;
    private final String firstName;
    private final int id;
    private final boolean isEnabled;
    private final boolean isGuest;
    private final boolean isValidated;
    private final String language;
    private final String lastName;
    private final String library;
    private final int maxDevices;
    private final MetaDataX metaData;
    private final boolean newsletter;
    private final String pin;
    private final String postalCode;
    private final List<String> recentlyUsedProducts;
    private final List<String> roles;
    private final SettingsX settings;
    private final ShopLayouts shopLayouts;
    private final String subscriptionMessage;
    private final String title;
    private final String username;
    private final int version;

    public final int component1() {
        return this.id;
    }

    public final String component10() {
        return this.city;
    }

    public final String component11() {
        return this.postalCode;
    }

    public final int component12() {
        return this.maxDevices;
    }

    public final boolean component13() {
        return this.isEnabled;
    }

    public final boolean component14() {
        return this.isValidated;
    }

    public final List<String> component15() {
        return this.roles;
    }

    public final int component16() {
        return this.version;
    }

    public final MetaDataX component17() {
        return this.metaData;
    }

    public final String component18() {
        return this.applicationInstanceId;
    }

    public final boolean component19() {
        return this.isGuest;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component20() {
        return this.affiliate;
    }

    public final String component21() {
        return this.library;
    }

    public final SettingsX component22() {
        return this.settings;
    }

    public final ShopLayouts component23() {
        return this.shopLayouts;
    }

    public final String component24() {
        return this.username;
    }

    public final String component25() {
        return this.pin;
    }

    public final String component26() {
        return this.subscriptionMessage;
    }

    public final List<String> component27() {
        return this.recentlyUsedProducts;
    }

    public final LinksX component28() {
        return this._links;
    }

    public final Embedded component29() {
        return this._embedded;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.accountType;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.email;
    }

    public final boolean component7() {
        return this.newsletter;
    }

    public final String component8() {
        return this.country;
    }

    public final String component9() {
        return this.language;
    }

    public final TigerBoxUser copy(int i, String str, String str2, String accountType, String str3, String email, boolean z, String country, String language, String str4, String str5, int i2, boolean z2, boolean z3, List<String> roles, int i3, MetaDataX metaData, String str6, boolean z4, String str7, String str8, SettingsX settings, ShopLayouts shopLayouts, String str9, String str10, String str11, List<String> recentlyUsedProducts, LinksX _links, Embedded _embedded) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(roles, "roles");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(shopLayouts, "shopLayouts");
        Intrinsics.checkNotNullParameter(recentlyUsedProducts, "recentlyUsedProducts");
        Intrinsics.checkNotNullParameter(_links, "_links");
        Intrinsics.checkNotNullParameter(_embedded, "_embedded");
        return new TigerBoxUser(i, str, str2, accountType, str3, email, z, country, language, str4, str5, i2, z2, z3, roles, i3, metaData, str6, z4, str7, str8, settings, shopLayouts, str9, str10, str11, recentlyUsedProducts, _links, _embedded);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerBoxUser) {
            TigerBoxUser tigerBoxUser = (TigerBoxUser) obj;
            return this.id == tigerBoxUser.id && Intrinsics.areEqual(this.firstName, tigerBoxUser.firstName) && Intrinsics.areEqual(this.lastName, tigerBoxUser.lastName) && Intrinsics.areEqual(this.accountType, tigerBoxUser.accountType) && Intrinsics.areEqual(this.title, tigerBoxUser.title) && Intrinsics.areEqual(this.email, tigerBoxUser.email) && this.newsletter == tigerBoxUser.newsletter && Intrinsics.areEqual(this.country, tigerBoxUser.country) && Intrinsics.areEqual(this.language, tigerBoxUser.language) && Intrinsics.areEqual(this.city, tigerBoxUser.city) && Intrinsics.areEqual(this.postalCode, tigerBoxUser.postalCode) && this.maxDevices == tigerBoxUser.maxDevices && this.isEnabled == tigerBoxUser.isEnabled && this.isValidated == tigerBoxUser.isValidated && Intrinsics.areEqual(this.roles, tigerBoxUser.roles) && this.version == tigerBoxUser.version && Intrinsics.areEqual(this.metaData, tigerBoxUser.metaData) && Intrinsics.areEqual(this.applicationInstanceId, tigerBoxUser.applicationInstanceId) && this.isGuest == tigerBoxUser.isGuest && Intrinsics.areEqual(this.affiliate, tigerBoxUser.affiliate) && Intrinsics.areEqual(this.library, tigerBoxUser.library) && Intrinsics.areEqual(this.settings, tigerBoxUser.settings) && Intrinsics.areEqual(this.shopLayouts, tigerBoxUser.shopLayouts) && Intrinsics.areEqual(this.username, tigerBoxUser.username) && Intrinsics.areEqual(this.pin, tigerBoxUser.pin) && Intrinsics.areEqual(this.subscriptionMessage, tigerBoxUser.subscriptionMessage) && Intrinsics.areEqual(this.recentlyUsedProducts, tigerBoxUser.recentlyUsedProducts) && Intrinsics.areEqual(this._links, tigerBoxUser._links) && Intrinsics.areEqual(this._embedded, tigerBoxUser._embedded);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.id * 31;
        String str = this.firstName;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.accountType.hashCode()) * 31;
        String str3 = this.title;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.email.hashCode()) * 31;
        boolean z = this.newsletter;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int hashCode4 = (((((hashCode3 + i2) * 31) + this.country.hashCode()) * 31) + this.language.hashCode()) * 31;
        String str4 = this.city;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.maxDevices) * 31;
        boolean z2 = this.isEnabled;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode6 + i3) * 31;
        boolean z3 = this.isValidated;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode7 = (((((((i4 + i5) * 31) + this.roles.hashCode()) * 31) + this.version) * 31) + this.metaData.hashCode()) * 31;
        String str6 = this.applicationInstanceId;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z4 = this.isGuest;
        int i6 = (hashCode8 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        String str7 = this.affiliate;
        int hashCode9 = (i6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.library;
        int hashCode10 = (((((hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.settings.hashCode()) * 31) + this.shopLayouts.hashCode()) * 31;
        String str9 = this.username;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pin;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.subscriptionMessage;
        return ((((((hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31) + this.recentlyUsedProducts.hashCode()) * 31) + this._links.hashCode()) * 31) + this._embedded.hashCode();
    }

    public String toString() {
        return "TigerBoxUser(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", accountType=" + this.accountType + ", title=" + this.title + ", email=" + this.email + ", newsletter=" + this.newsletter + ", country=" + this.country + ", language=" + this.language + ", city=" + this.city + ", postalCode=" + this.postalCode + ", maxDevices=" + this.maxDevices + ", isEnabled=" + this.isEnabled + ", isValidated=" + this.isValidated + ", roles=" + this.roles + ", version=" + this.version + ", metaData=" + this.metaData + ", applicationInstanceId=" + this.applicationInstanceId + ", isGuest=" + this.isGuest + ", affiliate=" + this.affiliate + ", library=" + this.library + ", settings=" + this.settings + ", shopLayouts=" + this.shopLayouts + ", username=" + this.username + ", pin=" + this.pin + ", subscriptionMessage=" + this.subscriptionMessage + ", recentlyUsedProducts=" + this.recentlyUsedProducts + ", _links=" + this._links + ", _embedded=" + this._embedded + ')';
    }

    public TigerBoxUser(int i, String str, String str2, String accountType, String str3, String email, boolean z, String country, String language, String str4, String str5, int i2, boolean z2, boolean z3, List<String> roles, int i3, MetaDataX metaData, String str6, boolean z4, String str7, String str8, SettingsX settings, ShopLayouts shopLayouts, String str9, String str10, String str11, List<String> recentlyUsedProducts, LinksX _links, Embedded _embedded) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(roles, "roles");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(shopLayouts, "shopLayouts");
        Intrinsics.checkNotNullParameter(recentlyUsedProducts, "recentlyUsedProducts");
        Intrinsics.checkNotNullParameter(_links, "_links");
        Intrinsics.checkNotNullParameter(_embedded, "_embedded");
        this.id = i;
        this.firstName = str;
        this.lastName = str2;
        this.accountType = accountType;
        this.title = str3;
        this.email = email;
        this.newsletter = z;
        this.country = country;
        this.language = language;
        this.city = str4;
        this.postalCode = str5;
        this.maxDevices = i2;
        this.isEnabled = z2;
        this.isValidated = z3;
        this.roles = roles;
        this.version = i3;
        this.metaData = metaData;
        this.applicationInstanceId = str6;
        this.isGuest = z4;
        this.affiliate = str7;
        this.library = str8;
        this.settings = settings;
        this.shopLayouts = shopLayouts;
        this.username = str9;
        this.pin = str10;
        this.subscriptionMessage = str11;
        this.recentlyUsedProducts = recentlyUsedProducts;
        this._links = _links;
        this._embedded = _embedded;
    }

    public final int getId() {
        return this.id;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getNewsletter() {
        return this.newsletter;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final int getMaxDevices() {
        return this.maxDevices;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public final List<String> getRoles() {
        return this.roles;
    }

    public final int getVersion() {
        return this.version;
    }

    public final MetaDataX getMetaData() {
        return this.metaData;
    }

    public final String getApplicationInstanceId() {
        return this.applicationInstanceId;
    }

    public final boolean isGuest() {
        return this.isGuest;
    }

    public final String getAffiliate() {
        return this.affiliate;
    }

    public final String getLibrary() {
        return this.library;
    }

    public final SettingsX getSettings() {
        return this.settings;
    }

    public final ShopLayouts getShopLayouts() {
        return this.shopLayouts;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getPin() {
        return this.pin;
    }

    public final String getSubscriptionMessage() {
        return this.subscriptionMessage;
    }

    public final List<String> getRecentlyUsedProducts() {
        return this.recentlyUsedProducts;
    }

    public final LinksX get_links() {
        return this._links;
    }

    public final Embedded get_embedded() {
        return this._embedded;
    }
}
