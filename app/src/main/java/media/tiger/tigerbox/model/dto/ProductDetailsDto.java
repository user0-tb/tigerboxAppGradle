package media.tiger.tigerbox.model.dto;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: ProductDetailsDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\bX\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0080\u0001Bë\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010*J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010X\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010Y\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010)HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¼\u0003\u0010z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0002\u0010{J\u0013\u0010|\u001a\u00020\u000e2\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010~\u001a\u00020\u0003HÖ\u0001J\t\u0010\u007f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010(\u001a\u0004\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0015\u0010&\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00108\u001a\u0004\b<\u00107R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\b>\u0010.R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00108\u001a\u0004\b?\u00107R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010/\u001a\u0004\bG\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u00102R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u00102R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u00102R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u00102R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u00102R\u0013\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u00102R\u0013\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u00102¨\u0006\u0081\u0001"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto;", "", TtmlNode.ATTR_ID, "", "productType", "", "productClassification", "state", MessageBundle.TITLE_ENTRY, "author", "description", "language", "publicationDate", "automaticRelease", "", "defaultPreview", "freemium", "ageMin", "ageMax", "iapProductIdentifier", "legalNotice", NotificationCompat.CATEGORY_RECOMMENDATION, "featuredRank", "popularity", "requiredReaderVersion", "seoText", "articleNumber", "lastNameOfFirstAuthor", "authorVita", "authorClientNumber", "edition", "seriesName", "seriesIdentifier", "translator", "subjectCode", "illustrator", "externalId", "variantId", "excludeFromSearch", "videoUrl", "_links", "Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links;)V", "get_links", "()Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links;", "getAgeMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAgeMin", "getArticleNumber", "()Ljava/lang/String;", "getAuthor", "getAuthorClientNumber", "getAuthorVita", "getAutomaticRelease", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDefaultPreview", "getDescription", "getEdition", "getExcludeFromSearch", "getExternalId", "getFeaturedRank", "getFreemium", "getIapProductIdentifier", "getId", "()I", "getIllustrator", "getLanguage", "getLastNameOfFirstAuthor", "getLegalNotice", "getPopularity", "getProductClassification", "getProductType", "getPublicationDate", "getRecommendation", "getRequiredReaderVersion", "getSeoText", "getSeriesIdentifier", "getSeriesName", "getState", "getSubjectCode", "getTitle", "getTranslator", "getVariantId", "getVideoUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links;)Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto;", "equals", "other", "hashCode", "toString", "Links", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductDetailsDto {
    private final Links _links;
    private final Integer ageMax;
    private final Integer ageMin;
    private final String articleNumber;
    private final String author;
    private final String authorClientNumber;
    private final String authorVita;
    private final Boolean automaticRelease;
    private final Boolean defaultPreview;
    private final String description;
    private final String edition;
    private final Boolean excludeFromSearch;
    private final String externalId;
    private final Integer featuredRank;
    private final Boolean freemium;
    private final String iapProductIdentifier;
    private final int id;
    private final String illustrator;
    private final String language;
    private final String lastNameOfFirstAuthor;
    private final String legalNotice;
    private final Integer popularity;
    private final String productClassification;
    private final String productType;
    private final String publicationDate;
    private final String recommendation;
    private final String requiredReaderVersion;
    private final String seoText;
    private final String seriesIdentifier;
    private final String seriesName;
    private final String state;
    private final String subjectCode;
    private final String title;
    private final String translator;
    private final String variantId;
    private final String videoUrl;

    public final int component1() {
        return this.id;
    }

    public final Boolean component10() {
        return this.automaticRelease;
    }

    public final Boolean component11() {
        return this.defaultPreview;
    }

    public final Boolean component12() {
        return this.freemium;
    }

    public final Integer component13() {
        return this.ageMin;
    }

    public final Integer component14() {
        return this.ageMax;
    }

    public final String component15() {
        return this.iapProductIdentifier;
    }

    public final String component16() {
        return this.legalNotice;
    }

    public final String component17() {
        return this.recommendation;
    }

    public final Integer component18() {
        return this.featuredRank;
    }

    public final Integer component19() {
        return this.popularity;
    }

    public final String component2() {
        return this.productType;
    }

    public final String component20() {
        return this.requiredReaderVersion;
    }

    public final String component21() {
        return this.seoText;
    }

    public final String component22() {
        return this.articleNumber;
    }

    public final String component23() {
        return this.lastNameOfFirstAuthor;
    }

    public final String component24() {
        return this.authorVita;
    }

    public final String component25() {
        return this.authorClientNumber;
    }

    public final String component26() {
        return this.edition;
    }

    public final String component27() {
        return this.seriesName;
    }

    public final String component28() {
        return this.seriesIdentifier;
    }

    public final String component29() {
        return this.translator;
    }

    public final String component3() {
        return this.productClassification;
    }

    public final String component30() {
        return this.subjectCode;
    }

    public final String component31() {
        return this.illustrator;
    }

    public final String component32() {
        return this.externalId;
    }

    public final String component33() {
        return this.variantId;
    }

    public final Boolean component34() {
        return this.excludeFromSearch;
    }

    public final String component35() {
        return this.videoUrl;
    }

    public final Links component36() {
        return this._links;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.author;
    }

    public final String component7() {
        return this.description;
    }

    public final String component8() {
        return this.language;
    }

    public final String component9() {
        return this.publicationDate;
    }

    public final ProductDetailsDto copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str9, String str10, String str11, Integer num3, Integer num4, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool4, String str26, Links links) {
        return new ProductDetailsDto(i, str, str2, str3, str4, str5, str6, str7, str8, bool, bool2, bool3, num, num2, str9, str10, str11, num3, num4, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, bool4, str26, links);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetailsDto) {
            ProductDetailsDto productDetailsDto = (ProductDetailsDto) obj;
            return this.id == productDetailsDto.id && Intrinsics.areEqual(this.productType, productDetailsDto.productType) && Intrinsics.areEqual(this.productClassification, productDetailsDto.productClassification) && Intrinsics.areEqual(this.state, productDetailsDto.state) && Intrinsics.areEqual(this.title, productDetailsDto.title) && Intrinsics.areEqual(this.author, productDetailsDto.author) && Intrinsics.areEqual(this.description, productDetailsDto.description) && Intrinsics.areEqual(this.language, productDetailsDto.language) && Intrinsics.areEqual(this.publicationDate, productDetailsDto.publicationDate) && Intrinsics.areEqual(this.automaticRelease, productDetailsDto.automaticRelease) && Intrinsics.areEqual(this.defaultPreview, productDetailsDto.defaultPreview) && Intrinsics.areEqual(this.freemium, productDetailsDto.freemium) && Intrinsics.areEqual(this.ageMin, productDetailsDto.ageMin) && Intrinsics.areEqual(this.ageMax, productDetailsDto.ageMax) && Intrinsics.areEqual(this.iapProductIdentifier, productDetailsDto.iapProductIdentifier) && Intrinsics.areEqual(this.legalNotice, productDetailsDto.legalNotice) && Intrinsics.areEqual(this.recommendation, productDetailsDto.recommendation) && Intrinsics.areEqual(this.featuredRank, productDetailsDto.featuredRank) && Intrinsics.areEqual(this.popularity, productDetailsDto.popularity) && Intrinsics.areEqual(this.requiredReaderVersion, productDetailsDto.requiredReaderVersion) && Intrinsics.areEqual(this.seoText, productDetailsDto.seoText) && Intrinsics.areEqual(this.articleNumber, productDetailsDto.articleNumber) && Intrinsics.areEqual(this.lastNameOfFirstAuthor, productDetailsDto.lastNameOfFirstAuthor) && Intrinsics.areEqual(this.authorVita, productDetailsDto.authorVita) && Intrinsics.areEqual(this.authorClientNumber, productDetailsDto.authorClientNumber) && Intrinsics.areEqual(this.edition, productDetailsDto.edition) && Intrinsics.areEqual(this.seriesName, productDetailsDto.seriesName) && Intrinsics.areEqual(this.seriesIdentifier, productDetailsDto.seriesIdentifier) && Intrinsics.areEqual(this.translator, productDetailsDto.translator) && Intrinsics.areEqual(this.subjectCode, productDetailsDto.subjectCode) && Intrinsics.areEqual(this.illustrator, productDetailsDto.illustrator) && Intrinsics.areEqual(this.externalId, productDetailsDto.externalId) && Intrinsics.areEqual(this.variantId, productDetailsDto.variantId) && Intrinsics.areEqual(this.excludeFromSearch, productDetailsDto.excludeFromSearch) && Intrinsics.areEqual(this.videoUrl, productDetailsDto.videoUrl) && Intrinsics.areEqual(this._links, productDetailsDto._links);
        }
        return false;
    }

    public int hashCode() {
        int i = this.id * 31;
        String str = this.productType;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productClassification;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.author;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.language;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.publicationDate;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.automaticRelease;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.defaultPreview;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.freemium;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.ageMin;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ageMax;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.iapProductIdentifier;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.legalNotice;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.recommendation;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num3 = this.featuredRank;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.popularity;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str12 = this.requiredReaderVersion;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.seoText;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.articleNumber;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastNameOfFirstAuthor;
        int hashCode22 = (hashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.authorVita;
        int hashCode23 = (hashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.authorClientNumber;
        int hashCode24 = (hashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.edition;
        int hashCode25 = (hashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.seriesName;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.seriesIdentifier;
        int hashCode27 = (hashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.translator;
        int hashCode28 = (hashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.subjectCode;
        int hashCode29 = (hashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.illustrator;
        int hashCode30 = (hashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.externalId;
        int hashCode31 = (hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.variantId;
        int hashCode32 = (hashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Boolean bool4 = this.excludeFromSearch;
        int hashCode33 = (hashCode32 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str26 = this.videoUrl;
        int hashCode34 = (hashCode33 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Links links = this._links;
        return hashCode34 + (links != null ? links.hashCode() : 0);
    }

    public String toString() {
        return "ProductDetailsDto(id=" + this.id + ", productType=" + this.productType + ", productClassification=" + this.productClassification + ", state=" + this.state + ", title=" + this.title + ", author=" + this.author + ", description=" + this.description + ", language=" + this.language + ", publicationDate=" + this.publicationDate + ", automaticRelease=" + this.automaticRelease + ", defaultPreview=" + this.defaultPreview + ", freemium=" + this.freemium + ", ageMin=" + this.ageMin + ", ageMax=" + this.ageMax + ", iapProductIdentifier=" + this.iapProductIdentifier + ", legalNotice=" + this.legalNotice + ", recommendation=" + this.recommendation + ", featuredRank=" + this.featuredRank + ", popularity=" + this.popularity + ", requiredReaderVersion=" + this.requiredReaderVersion + ", seoText=" + this.seoText + ", articleNumber=" + this.articleNumber + ", lastNameOfFirstAuthor=" + this.lastNameOfFirstAuthor + ", authorVita=" + this.authorVita + ", authorClientNumber=" + this.authorClientNumber + ", edition=" + this.edition + ", seriesName=" + this.seriesName + ", seriesIdentifier=" + this.seriesIdentifier + ", translator=" + this.translator + ", subjectCode=" + this.subjectCode + ", illustrator=" + this.illustrator + ", externalId=" + this.externalId + ", variantId=" + this.variantId + ", excludeFromSearch=" + this.excludeFromSearch + ", videoUrl=" + this.videoUrl + ", _links=" + this._links + ')';
    }

    public ProductDetailsDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str9, String str10, String str11, Integer num3, Integer num4, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Boolean bool4, String str26, Links links) {
        this.id = i;
        this.productType = str;
        this.productClassification = str2;
        this.state = str3;
        this.title = str4;
        this.author = str5;
        this.description = str6;
        this.language = str7;
        this.publicationDate = str8;
        this.automaticRelease = bool;
        this.defaultPreview = bool2;
        this.freemium = bool3;
        this.ageMin = num;
        this.ageMax = num2;
        this.iapProductIdentifier = str9;
        this.legalNotice = str10;
        this.recommendation = str11;
        this.featuredRank = num3;
        this.popularity = num4;
        this.requiredReaderVersion = str12;
        this.seoText = str13;
        this.articleNumber = str14;
        this.lastNameOfFirstAuthor = str15;
        this.authorVita = str16;
        this.authorClientNumber = str17;
        this.edition = str18;
        this.seriesName = str19;
        this.seriesIdentifier = str20;
        this.translator = str21;
        this.subjectCode = str22;
        this.illustrator = str23;
        this.externalId = str24;
        this.variantId = str25;
        this.excludeFromSearch = bool4;
        this.videoUrl = str26;
        this._links = links;
    }

    public final int getId() {
        return this.id;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getProductClassification() {
        return this.productClassification;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getPublicationDate() {
        return this.publicationDate;
    }

    public final Boolean getAutomaticRelease() {
        return this.automaticRelease;
    }

    public final Boolean getDefaultPreview() {
        return this.defaultPreview;
    }

    public final Boolean getFreemium() {
        return this.freemium;
    }

    public final Integer getAgeMin() {
        return this.ageMin;
    }

    public final Integer getAgeMax() {
        return this.ageMax;
    }

    public final String getIapProductIdentifier() {
        return this.iapProductIdentifier;
    }

    public final String getLegalNotice() {
        return this.legalNotice;
    }

    public final String getRecommendation() {
        return this.recommendation;
    }

    public final Integer getFeaturedRank() {
        return this.featuredRank;
    }

    public final Integer getPopularity() {
        return this.popularity;
    }

    public final String getRequiredReaderVersion() {
        return this.requiredReaderVersion;
    }

    public final String getSeoText() {
        return this.seoText;
    }

    public final String getArticleNumber() {
        return this.articleNumber;
    }

    public final String getLastNameOfFirstAuthor() {
        return this.lastNameOfFirstAuthor;
    }

    public final String getAuthorVita() {
        return this.authorVita;
    }

    public final String getAuthorClientNumber() {
        return this.authorClientNumber;
    }

    public final String getEdition() {
        return this.edition;
    }

    public final String getSeriesName() {
        return this.seriesName;
    }

    public final String getSeriesIdentifier() {
        return this.seriesIdentifier;
    }

    public final String getTranslator() {
        return this.translator;
    }

    public final String getSubjectCode() {
        return this.subjectCode;
    }

    public final String getIllustrator() {
        return this.illustrator;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getVariantId() {
        return this.variantId;
    }

    public final Boolean getExcludeFromSearch() {
        return this.excludeFromSearch;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final Links get_links() {
        return this._links;
    }

    /* compiled from: ProductDetailsDto.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links;", "", "cover", "Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links$Link;", "(Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links$Link;)V", "getCover", "()Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links$Link;", "setCover", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", HttpHeaders.LINK, "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Links {
        private Link cover;

        public static /* synthetic */ Links copy$default(Links links, Link link, int i, Object obj) {
            if ((i & 1) != 0) {
                link = links.cover;
            }
            return links.copy(link);
        }

        public final Link component1() {
            return this.cover;
        }

        public final Links copy(Link cover) {
            Intrinsics.checkNotNullParameter(cover, "cover");
            return new Links(cover);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Links) && Intrinsics.areEqual(this.cover, ((Links) obj).cover);
        }

        public int hashCode() {
            return this.cover.hashCode();
        }

        public String toString() {
            return "Links(cover=" + this.cover + ')';
        }

        public Links(Link cover) {
            Intrinsics.checkNotNullParameter(cover, "cover");
            this.cover = cover;
        }

        public final Link getCover() {
            return this.cover;
        }

        public final void setCover(Link link) {
            Intrinsics.checkNotNullParameter(link, "<set-?>");
            this.cover = link;
        }

        /* compiled from: ProductDetailsDto.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto$Links$Link;", "", "href", "", "(Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "setHref", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Link {
            private String href;

            public static /* synthetic */ Link copy$default(Link link, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = link.href;
                }
                return link.copy(str);
            }

            public final String component1() {
                return this.href;
            }

            public final Link copy(String href) {
                Intrinsics.checkNotNullParameter(href, "href");
                return new Link(href);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Link) && Intrinsics.areEqual(this.href, ((Link) obj).href);
            }

            public int hashCode() {
                return this.href.hashCode();
            }

            public String toString() {
                return "Link(href=" + this.href + ')';
            }

            public Link(String href) {
                Intrinsics.checkNotNullParameter(href, "href");
                this.href = href;
            }

            public final String getHref() {
                return this.href;
            }

            public final void setHref(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.href = str;
            }
        }
    }
}
