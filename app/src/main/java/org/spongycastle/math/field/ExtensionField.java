package org.spongycastle.math.field;

/* loaded from: classes4.dex */
public interface ExtensionField extends FiniteField {
    int getDegree();

    FiniteField getSubfield();
}
