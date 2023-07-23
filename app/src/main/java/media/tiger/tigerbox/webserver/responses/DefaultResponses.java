package media.tiger.tigerbox.webserver.responses;

import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.domain.ActiveProfileDto;
import media.tiger.tigerbox.model.domain.TigerBoxProfileDomain;
import media.tiger.tigerbox.webserver.dto.DeviceInfoDto;
import media.tiger.tigerbox.webserver.dto.IsAliveDto;
import media.tiger.tigerbox.webserver.dto.OfflineProductDto;
import media.tiger.tigerbox.webserver.dto.PlaybackDto;

/* compiled from: DefaultResponses.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/webserver/responses/DefaultResponses;", "", "()V", "JSON_RESPONSE_TYPE", "", "ClientErrorResponses", "ErrorResponse", "ServerErrorResponses", "SuccessResponses", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultResponses {
    public static final DefaultResponses INSTANCE = new DefaultResponses();
    public static final String JSON_RESPONSE_TYPE = "application/json";

    private DefaultResponses() {
    }

    /* compiled from: DefaultResponses.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/webserver/responses/DefaultResponses$SuccessResponses;", "", "()V", "currentPlaybackResponse", "", "playbackDto", "Lmedia/tiger/tigerbox/webserver/dto/PlaybackDto;", "getDeviceIdentifierResponse", "isAliveDto", "Lmedia/tiger/tigerbox/webserver/dto/IsAliveDto;", "getDeviceInfoResponse", "deviceInfoDto", "Lmedia/tiger/tigerbox/webserver/dto/DeviceInfoDto;", "offlineAvailableContentResponse", "products", "", "Lmedia/tiger/tigerbox/webserver/dto/OfflineProductDto;", "profilesActiveResponse", "profileId", "", "profilesContentResponse", "profiles", "Lmedia/tiger/tigerbox/model/domain/TigerBoxProfileDomain;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SuccessResponses {
        public static final SuccessResponses INSTANCE = new SuccessResponses();

        private SuccessResponses() {
        }

        public final String offlineAvailableContentResponse(List<OfflineProductDto> products) {
            Intrinsics.checkNotNullParameter(products, "products");
            String json = new Gson().toJson(products);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(products)");
            return json;
        }

        public final String currentPlaybackResponse(PlaybackDto playbackDto) {
            Intrinsics.checkNotNullParameter(playbackDto, "playbackDto");
            String json = new Gson().toJson(playbackDto);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(playbackDto)");
            return json;
        }

        public final String getDeviceInfoResponse(DeviceInfoDto deviceInfoDto) {
            Intrinsics.checkNotNullParameter(deviceInfoDto, "deviceInfoDto");
            String json = new Gson().toJson(deviceInfoDto);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(deviceInfoDto)");
            return json;
        }

        public final String getDeviceIdentifierResponse(IsAliveDto isAliveDto) {
            Intrinsics.checkNotNullParameter(isAliveDto, "isAliveDto");
            String json = new Gson().toJson(isAliveDto);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(isAliveDto)");
            return json;
        }

        public final String profilesContentResponse(List<TigerBoxProfileDomain> profiles) {
            Intrinsics.checkNotNullParameter(profiles, "profiles");
            String json = new Gson().toJson(profiles);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(profiles)");
            return json;
        }

        public final String profilesActiveResponse(int i) {
            String json = new Gson().toJson(new ActiveProfileDto(Integer.valueOf(i)));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ActiveProfileDto(profileId))");
            return json;
        }
    }

    /* compiled from: DefaultResponses.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lmedia/tiger/tigerbox/webserver/responses/DefaultResponses$ClientErrorResponses;", "", "()V", "badRequestResponse", "", "message", "resource", "methodNotAllowedResponse", "notAllowedResponse", "notFoundDefaultResponse", "notFoundResponse", "unauthorizedResponse", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ClientErrorResponses {
        public static final ClientErrorResponses INSTANCE = new ClientErrorResponses();

        private ClientErrorResponses() {
        }

        public final String badRequestResponse(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            String json = new Gson().toJson(new ErrorResponse(message, null));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorResponse(message, null))");
            return json;
        }

        public final String badRequestResponse(String message, String resource) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(resource, "resource");
            String json = new Gson().toJson(new ErrorResponse(message, resource));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorResponse(message, resource))");
            return json;
        }

        public final String unauthorizedResponse(String message, String resource) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(resource, "resource");
            String json = new Gson().toJson(new ErrorResponse(message, resource));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorResponse(message, resource))");
            return json;
        }

        public final String notAllowedResponse(String message, String resource) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(resource, "resource");
            String json = new Gson().toJson(new ErrorResponse(message, resource));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorResponse(message, resource))");
            return json;
        }

        public final String notFoundDefaultResponse() {
            String json = new Gson().toJson(new ErrorResponse("Requested resource not found", null));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorRespo…source not found\", null))");
            return json;
        }

        public final String notFoundDefaultResponse(String resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            String json = new Gson().toJson(new ErrorResponse("Requested resource not found", resource));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorRespo…ce not found\", resource))");
            return json;
        }

        public final String notFoundResponse(String message, String resource) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(resource, "resource");
            String json = new Gson().toJson(new ErrorResponse(message, resource));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorResponse(message, resource))");
            return json;
        }

        public final String methodNotAllowedResponse() {
            String json = new Gson().toJson(new ErrorResponse("Method not allowed", null));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorRespo…thod not allowed\", null))");
            return json;
        }

        public final String methodNotAllowedResponse(String resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            String json = new Gson().toJson(new ErrorResponse("Method not allowed", resource));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorRespo… not allowed\", resource))");
            return json;
        }
    }

    /* compiled from: DefaultResponses.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/webserver/responses/DefaultResponses$ServerErrorResponses;", "", "()V", "internalServerErrorResponse", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ServerErrorResponses {
        public static final ServerErrorResponses INSTANCE = new ServerErrorResponses();

        private ServerErrorResponses() {
        }

        public final String internalServerErrorResponse() {
            String json = new Gson().toJson(new ErrorResponse("Oops, something went wrong.", null));
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(ErrorRespo…hing went wrong.\", null))");
            return json;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultResponses.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/webserver/responses/DefaultResponses$ErrorResponse;", "", "message", "", "resource", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getResource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ErrorResponse {
        private final String message;
        private final String resource;

        public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorResponse.message;
            }
            if ((i & 2) != 0) {
                str2 = errorResponse.resource;
            }
            return errorResponse.copy(str, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.resource;
        }

        public final ErrorResponse copy(String message, String str) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorResponse(message, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ErrorResponse) {
                ErrorResponse errorResponse = (ErrorResponse) obj;
                return Intrinsics.areEqual(this.message, errorResponse.message) && Intrinsics.areEqual(this.resource, errorResponse.resource);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.resource;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ErrorResponse(message=" + this.message + ", resource=" + this.resource + ')';
        }

        public ErrorResponse(String message, String str) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.resource = str;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getResource() {
            return this.resource;
        }
    }
}
