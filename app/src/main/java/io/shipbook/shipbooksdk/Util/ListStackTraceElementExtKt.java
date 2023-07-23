package io.shipbook.shipbooksdk.Util;

import io.shipbook.shipbooksdk.Models.StackTraceElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ListStackTraceElementExt.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0007H\u0000¨\u0006\t"}, d2 = {"toInternal", "", "Lio/shipbook/shipbooksdk/Models/StackTraceElement;", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)Ljava/util/List;", "toJson", "Lorg/json/JSONArray;", "toListStackTraceElement", "shipbooksdk_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListStackTraceElementExtKt {
    public static final List<StackTraceElement> toListStackTraceElement(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        Iterator<Integer> it = RangesKt.until(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            StackTraceElement.Companion companion = StackTraceElement.Companion;
            JSONObject jSONObject = jSONArray.getJSONObject(nextInt);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "this.getJSONObject(it)");
            arrayList.add(companion.create(jSONObject));
        }
        return arrayList;
    }

    public static final List<StackTraceElement> toInternal(StackTraceElement[] stackTraceElementArr) {
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = stackTraceElementArr.length;
        int i = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            i++;
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            String methodName = stackTraceElement.getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "it.methodName");
            arrayList.add(new StackTraceElement(className, methodName, stackTraceElement.getFileName(), stackTraceElement.getLineNumber()));
        }
        return arrayList;
    }

    public static final JSONArray toJson(List<StackTraceElement> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : list) {
            jSONArray.put(stackTraceElement.toJson());
        }
        return jSONArray;
    }
}
