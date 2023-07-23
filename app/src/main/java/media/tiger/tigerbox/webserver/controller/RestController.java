package media.tiger.tigerbox.webserver.controller;

import fi.iki.elonen.NanoHTTPD;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;
import media.tiger.tigerbox.webserver.WebServer;
import media.tiger.tigerbox.webserver.exception.BadRequestException;
import media.tiger.tigerbox.webserver.responses.ResponseFactory;

/* compiled from: RestController.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u0018\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0004J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0004J\u0012\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u001eH\u0002J\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010 \u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u001a\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u001a\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0016\u0010#\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010$\u001a\u00020%H$J\b\u0010&\u001a\u00020'H\u0016J\f\u0010(\u001a\u00020'*\u00020\u0003H\u0002RS\u0010\b\u001a=\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012/\u0012-\u0012\u0004\u0012\u00020\n\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b0\tj\u0002`\u00110\tX¤\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lmedia/tiger/tigerbox/webserver/controller/RestController;", "", "endpointMappingUrl", "", "Lmedia/tiger/tigerbox/webserver/controller/EndpointPath;", "webServer", "Lmedia/tiger/tigerbox/webserver/WebServer;", "(Ljava/lang/String;Lmedia/tiger/tigerbox/webserver/WebServer;)V", "endpointHandlers", "", "Lfi/iki/elonen/NanoHTTPD$Method;", "Lkotlin/Function1;", "Lfi/iki/elonen/NanoHTTPD$IHTTPSession;", "Lkotlin/ParameterName;", "name", "session", "Lfi/iki/elonen/NanoHTTPD$Response;", "Lmedia/tiger/tigerbox/webserver/controller/EndpointHandler;", "getEndpointHandlers", "()Ljava/util/Map;", "setEndpointHandlers", "(Ljava/util/Map;)V", "getEndpointMappingUrl", "()Ljava/lang/String;", "attemptInsertingToPlaceholders", "path", "requestUri", "extractBody", "extractBodyFromPatchRequest", "getAllEndpointsWithPathParams", "", "getResponseForPathParamEndpoint", "endpointPath", "getResponseWithNoPathParams", "getResponseWithPathParams", "handleRequest", "registerEndpoints", "", "requiresAuthentication", "", "isPlaceholder", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RestController {
    private final String endpointMappingUrl;

    protected abstract Map<String, Map<NanoHTTPD.Method, Function1<NanoHTTPD.IHTTPSession, NanoHTTPD.Response>>> getEndpointHandlers();

    protected abstract void registerEndpoints();

    public boolean requiresAuthentication() {
        return false;
    }

    protected abstract void setEndpointHandlers(Map<String, ? extends Map<NanoHTTPD.Method, ? extends Function1<? super NanoHTTPD.IHTTPSession, ? extends NanoHTTPD.Response>>> map);

    public RestController(String endpointMappingUrl, WebServer webServer) {
        Intrinsics.checkNotNullParameter(endpointMappingUrl, "endpointMappingUrl");
        Intrinsics.checkNotNullParameter(webServer, "webServer");
        this.endpointMappingUrl = endpointMappingUrl;
        registerEndpoints();
        Map<String, Map<NanoHTTPD.Method, Function1<NanoHTTPD.IHTTPSession, NanoHTTPD.Response>>> endpointHandlers = getEndpointHandlers();
        if (endpointHandlers == null || endpointHandlers.isEmpty()) {
            throw new RuntimeException("Endpoint handlers can't be empty!");
        }
        webServer.registerController(endpointMappingUrl, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getEndpointMappingUrl() {
        return this.endpointMappingUrl;
    }

    public final NanoHTTPD.Response handleRequest(String requestUri, NanoHTTPD.IHTTPSession session) {
        Intrinsics.checkNotNullParameter(requestUri, "requestUri");
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            NanoHTTPD.Response responseWithNoPathParams = getResponseWithNoPathParams(requestUri, session);
            if (responseWithNoPathParams != null) {
                return responseWithNoPathParams;
            }
            NanoHTTPD.Response responseWithPathParams = getResponseWithPathParams(requestUri, session);
            return responseWithPathParams != null ? responseWithPathParams : ResponseFactory.Companion.notFoundResponse(requestUri);
        } catch (BadRequestException e) {
            ResponseFactory.Companion companion = ResponseFactory.Companion;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return companion.badRequestResponse(message, requestUri);
        }
    }

    private final NanoHTTPD.Response getResponseWithNoPathParams(String str, NanoHTTPD.IHTTPSession iHTTPSession) {
        Map<NanoHTTPD.Method, Function1<NanoHTTPD.IHTTPSession, NanoHTTPD.Response>> map = getEndpointHandlers().get(str);
        if (map != null) {
            Function1<NanoHTTPD.IHTTPSession, NanoHTTPD.Response> function1 = map.get(iHTTPSession.getMethod());
            if (function1 != null) {
                return function1.invoke(iHTTPSession);
            }
            return ResponseFactory.Companion.requestedMethodNotSupportedResponse(str);
        }
        return null;
    }

    private final NanoHTTPD.Response getResponseWithPathParams(String str, NanoHTTPD.IHTTPSession iHTTPSession) {
        for (String str2 : getAllEndpointsWithPathParams()) {
            String attemptInsertingToPlaceholders = attemptInsertingToPlaceholders(str2, str);
            if (attemptInsertingToPlaceholders != null && Intrinsics.areEqual(attemptInsertingToPlaceholders, str)) {
                return getResponseForPathParamEndpoint(str2, iHTTPSession);
            }
        }
        return null;
    }

    private final List<String> getAllEndpointsWithPathParams() {
        Map<String, Map<NanoHTTPD.Method, Function1<NanoHTTPD.IHTTPSession, NanoHTTPD.Response>>> endpointHandlers = getEndpointHandlers();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<NanoHTTPD.Method, Function1<NanoHTTPD.IHTTPSession, NanoHTTPD.Response>>> entry : endpointHandlers.entrySet()) {
            if (isPlaceholder(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            arrayList.add((String) entry2.getKey());
        }
        return arrayList;
    }

    private final String attemptInsertingToPlaceholders(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        List drop = CollectionsKt.drop(StringsKt.split$default((CharSequence) str2, new String[]{DownloadsManager.FOLDERS_SEPARATOR}, false, 0, 6, (Object) null), 1);
        int i = 0;
        for (Object obj : CollectionsKt.drop(StringsKt.split$default((CharSequence) str, new String[]{DownloadsManager.FOLDERS_SEPARATOR}, false, 0, 6, (Object) null), 1)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj;
            if (isPlaceholder(str3)) {
                String str4 = (String) CollectionsKt.getOrNull(drop, i);
                if (str4 == null) {
                    return null;
                }
                sb.append('/' + str4);
            } else {
                sb.append('/' + str3);
            }
            i = i2;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final NanoHTTPD.Response getResponseForPathParamEndpoint(String str, NanoHTTPD.IHTTPSession iHTTPSession) {
        Map<NanoHTTPD.Method, Function1<NanoHTTPD.IHTTPSession, NanoHTTPD.Response>> map = getEndpointHandlers().get(str);
        if (map != null) {
            Function1<NanoHTTPD.IHTTPSession, NanoHTTPD.Response> function1 = map.get(iHTTPSession.getMethod());
            if (function1 != null) {
                return function1.invoke(iHTTPSession);
            }
            ResponseFactory.Companion companion = ResponseFactory.Companion;
            String uri = iHTTPSession.getUri();
            Intrinsics.checkNotNullExpressionValue(uri, "session.uri");
            return companion.requestedMethodNotSupportedResponse(uri);
        }
        return null;
    }

    private final boolean isPlaceholder(String str) {
        String str2 = str;
        return StringsKt.contains$default((CharSequence) str2, (CharSequence) "{", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str2, (CharSequence) "}", false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String extractBody(NanoHTTPD.IHTTPSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        session.parseBody(linkedHashMap);
        String str = linkedHashMap.get("postData");
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String extractBodyFromPatchRequest(NanoHTTPD.IHTTPSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            InputStream inputStream = session.getInputStream();
            String str = session.getHeaders().get("content-length");
            int i = 1024;
            if (str != null) {
                if (str.length() > 0) {
                    i = Integer.parseInt(str);
                }
            }
            byte[] bArr = new byte[i];
            inputStream.read(bArr, 0, i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArr, 0, i);
            return byteArrayOutputStream.toString("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
