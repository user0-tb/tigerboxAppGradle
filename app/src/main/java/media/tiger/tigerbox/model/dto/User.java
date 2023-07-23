package media.tiger.tigerbox.model.dto;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerBoxUser.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010G\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0015HÆ\u0003J\t\u0010J\u001a\u00020\u0017HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019HÆ\u0003J\t\u0010L\u001a\u00020\u001bHÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u001dHÆ\u0003J\t\u0010O\u001a\u00020\u001fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003Jò\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fHÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\bHÖ\u0001J\t\u0010\\\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u00100\u001a\u0004\b@\u0010/R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&¨\u0006]"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/User;", "", "createdBy", "", "createdDate", "lastModifiedBy", "lastModifiedDate", "version", "", TtmlNode.ATTR_ID, "accountId", "nickName", "birthday", "gender", "points", "avatar", "enabled", "", "shopAccess", "lastAccessDate", "metaData", "Lmedia/tiger/tigerbox/model/dto/MetaData;", "settings", "Lmedia/tiger/tigerbox/model/dto/Settings;", "preferences", "", "ageRange", "Lmedia/tiger/tigerbox/model/dto/AgeRange;", "_links", "Lmedia/tiger/tigerbox/model/dto/Links;", "_embedded", "Lmedia/tiger/tigerbox/model/dto/EmbeddedX;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/MetaData;Lmedia/tiger/tigerbox/model/dto/Settings;Ljava/util/List;Lmedia/tiger/tigerbox/model/dto/AgeRange;Lmedia/tiger/tigerbox/model/dto/Links;Lmedia/tiger/tigerbox/model/dto/EmbeddedX;)V", "get_embedded", "()Lmedia/tiger/tigerbox/model/dto/EmbeddedX;", "get_links", "()Lmedia/tiger/tigerbox/model/dto/Links;", "getAccountId", "()I", "getAgeRange", "()Lmedia/tiger/tigerbox/model/dto/AgeRange;", "getAvatar", "()Ljava/lang/String;", "getBirthday", "getCreatedBy", "getCreatedDate", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGender", "getId", "getLastAccessDate", "getLastModifiedBy", "getLastModifiedDate", "getMetaData", "()Lmedia/tiger/tigerbox/model/dto/MetaData;", "getNickName", "getPoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPreferences", "()Ljava/util/List;", "getSettings", "()Lmedia/tiger/tigerbox/model/dto/Settings;", "getShopAccess", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/MetaData;Lmedia/tiger/tigerbox/model/dto/Settings;Ljava/util/List;Lmedia/tiger/tigerbox/model/dto/AgeRange;Lmedia/tiger/tigerbox/model/dto/Links;Lmedia/tiger/tigerbox/model/dto/EmbeddedX;)Lmedia/tiger/tigerbox/model/dto/User;", "equals", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class User {
    private final EmbeddedX _embedded;
    private final Links _links;
    private final int accountId;
    private final AgeRange ageRange;
    private final String avatar;
    private final String birthday;
    private final String createdBy;
    private final String createdDate;
    private final Boolean enabled;
    private final String gender;
    private final int id;
    private final String lastAccessDate;
    private final String lastModifiedBy;
    private final String lastModifiedDate;
    private final MetaData metaData;
    private final String nickName;
    private final Integer points;
    private final List<Object> preferences;
    private final Settings settings;
    private final Boolean shopAccess;
    private final int version;

    public final String component1() {
        return this.createdBy;
    }

    public final String component10() {
        return this.gender;
    }

    public final Integer component11() {
        return this.points;
    }

    public final String component12() {
        return this.avatar;
    }

    public final Boolean component13() {
        return this.enabled;
    }

    public final Boolean component14() {
        return this.shopAccess;
    }

    public final String component15() {
        return this.lastAccessDate;
    }

    public final MetaData component16() {
        return this.metaData;
    }

    public final Settings component17() {
        return this.settings;
    }

    public final List<Object> component18() {
        return this.preferences;
    }

    public final AgeRange component19() {
        return this.ageRange;
    }

    public final String component2() {
        return this.createdDate;
    }

    public final Links component20() {
        return this._links;
    }

    public final EmbeddedX component21() {
        return this._embedded;
    }

    public final String component3() {
        return this.lastModifiedBy;
    }

    public final String component4() {
        return this.lastModifiedDate;
    }

    public final int component5() {
        return this.version;
    }

    public final int component6() {
        return this.id;
    }

    public final int component7() {
        return this.accountId;
    }

    public final String component8() {
        return this.nickName;
    }

    public final String component9() {
        return this.birthday;
    }

    public final User copy(String createdBy, String createdDate, String str, String lastModifiedDate, int i, int i2, int i3, String str2, String birthday, String gender, Integer num, String str3, Boolean bool, Boolean bool2, String lastAccessDate, MetaData metaData, Settings settings, List<? extends Object> preferences, AgeRange ageRange, Links _links, EmbeddedX _embedded) {
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(lastAccessDate, "lastAccessDate");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(ageRange, "ageRange");
        Intrinsics.checkNotNullParameter(_links, "_links");
        Intrinsics.checkNotNullParameter(_embedded, "_embedded");
        return new User(createdBy, createdDate, str, lastModifiedDate, i, i2, i3, str2, birthday, gender, num, str3, bool, bool2, lastAccessDate, metaData, settings, preferences, ageRange, _links, _embedded);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            return Intrinsics.areEqual(this.createdBy, user.createdBy) && Intrinsics.areEqual(this.createdDate, user.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, user.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, user.lastModifiedDate) && this.version == user.version && this.id == user.id && this.accountId == user.accountId && Intrinsics.areEqual(this.nickName, user.nickName) && Intrinsics.areEqual(this.birthday, user.birthday) && Intrinsics.areEqual(this.gender, user.gender) && Intrinsics.areEqual(this.points, user.points) && Intrinsics.areEqual(this.avatar, user.avatar) && Intrinsics.areEqual(this.enabled, user.enabled) && Intrinsics.areEqual(this.shopAccess, user.shopAccess) && Intrinsics.areEqual(this.lastAccessDate, user.lastAccessDate) && Intrinsics.areEqual(this.metaData, user.metaData) && Intrinsics.areEqual(this.settings, user.settings) && Intrinsics.areEqual(this.preferences, user.preferences) && Intrinsics.areEqual(this.ageRange, user.ageRange) && Intrinsics.areEqual(this._links, user._links) && Intrinsics.areEqual(this._embedded, user._embedded);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.createdBy.hashCode() * 31) + this.createdDate.hashCode()) * 31;
        String str = this.lastModifiedBy;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.lastModifiedDate.hashCode()) * 31) + this.version) * 31) + this.id) * 31) + this.accountId) * 31;
        String str2 = this.nickName;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.birthday.hashCode()) * 31) + this.gender.hashCode()) * 31;
        Integer num = this.points;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.avatar;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.enabled;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shopAccess;
        return ((((((((((((((hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.lastAccessDate.hashCode()) * 31) + this.metaData.hashCode()) * 31) + this.settings.hashCode()) * 31) + this.preferences.hashCode()) * 31) + this.ageRange.hashCode()) * 31) + this._links.hashCode()) * 31) + this._embedded.hashCode();
    }

    public String toString() {
        return "User(createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ", version=" + this.version + ", id=" + this.id + ", accountId=" + this.accountId + ", nickName=" + this.nickName + ", birthday=" + this.birthday + ", gender=" + this.gender + ", points=" + this.points + ", avatar=" + this.avatar + ", enabled=" + this.enabled + ", shopAccess=" + this.shopAccess + ", lastAccessDate=" + this.lastAccessDate + ", metaData=" + this.metaData + ", settings=" + this.settings + ", preferences=" + this.preferences + ", ageRange=" + this.ageRange + ", _links=" + this._links + ", _embedded=" + this._embedded + ')';
    }

    public User(String createdBy, String createdDate, String str, String lastModifiedDate, int i, int i2, int i3, String str2, String birthday, String gender, Integer num, String str3, Boolean bool, Boolean bool2, String lastAccessDate, MetaData metaData, Settings settings, List<? extends Object> preferences, AgeRange ageRange, Links _links, EmbeddedX _embedded) {
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(lastAccessDate, "lastAccessDate");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(ageRange, "ageRange");
        Intrinsics.checkNotNullParameter(_links, "_links");
        Intrinsics.checkNotNullParameter(_embedded, "_embedded");
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = str;
        this.lastModifiedDate = lastModifiedDate;
        this.version = i;
        this.id = i2;
        this.accountId = i3;
        this.nickName = str2;
        this.birthday = birthday;
        this.gender = gender;
        this.points = num;
        this.avatar = str3;
        this.enabled = bool;
        this.shopAccess = bool2;
        this.lastAccessDate = lastAccessDate;
        this.metaData = metaData;
        this.settings = settings;
        this.preferences = preferences;
        this.ageRange = ageRange;
        this._links = _links;
        this._embedded = _embedded;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public final String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getId() {
        return this.id;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Integer getPoints() {
        return this.points;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getShopAccess() {
        return this.shopAccess;
    }

    public final String getLastAccessDate() {
        return this.lastAccessDate;
    }

    public final MetaData getMetaData() {
        return this.metaData;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public final List<Object> getPreferences() {
        return this.preferences;
    }

    public final AgeRange getAgeRange() {
        return this.ageRange;
    }

    public final Links get_links() {
        return this._links;
    }

    public final EmbeddedX get_embedded() {
        return this._embedded;
    }
}
