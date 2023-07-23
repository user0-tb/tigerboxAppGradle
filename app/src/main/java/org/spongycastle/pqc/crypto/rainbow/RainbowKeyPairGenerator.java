package org.spongycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.rainbow.util.ComputeInField;
import org.spongycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: classes4.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private short[][] A1;
    private short[][] A1inv;
    private short[][] A2;
    private short[][] A2inv;
    private short[] b1;
    private short[] b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;
    private SecureRandom sr;
    private int[] vi;

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.b1, this.A2inv, this.b2, this.vi, this.layers);
        int[] iArr = this.vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.rainbowParams = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.sr = new SecureRandom();
        this.vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(new SecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    private void generateL1() {
        int[] iArr = this.vi;
        int i = iArr[iArr.length - 1] - iArr[0];
        this.A1 = (short[][]) Array.newInstance(short.class, i, i);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.A1[i2][i3] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.A1);
        }
        this.b1 = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.b1[i4] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.vi;
        int i = iArr[iArr.length - 1];
        this.A2 = (short[][]) Array.newInstance(short.class, i, i);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < i; i3++) {
                    this.A2[i2][i3] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.A2);
        }
        this.b2 = new short[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.b2[i4] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i = 0;
        while (i < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.vi;
            int i2 = i + 1;
            layerArr[i] = new Layer(iArr[i], iArr[i2], this.sr);
            i = i2;
        }
    }

    private void computePublicKey() {
        Class<short> cls = short.class;
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.vi;
        int i = 0;
        int i2 = iArr[iArr.length - 1] - iArr[0];
        int i3 = iArr[iArr.length - 1];
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i3);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) cls, i2, i3);
        this.pub_scalar = new short[i2];
        short[] sArr2 = new short[i3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i4 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i4].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i4].getCoeffBeta();
            short[][] coeffGamma = this.layers[i4].getCoeffGamma();
            short[] coeffEta = this.layers[i4].getCoeffEta();
            int length = coeffAlpha[i].length;
            int length2 = coeffBeta[i].length;
            while (i < length) {
                int i6 = 0;
                while (i6 < length) {
                    Class<short> cls2 = cls;
                    int i7 = 0;
                    while (i7 < length2) {
                        int i8 = i2;
                        int i9 = i3;
                        int i10 = i6 + length2;
                        short[] multVect = computeInField.multVect(coeffAlpha[i][i6][i7], this.A2[i10]);
                        int i11 = i5 + i;
                        int i12 = i4;
                        sArr[i11] = computeInField.addSquareMatrix(sArr[i11], computeInField.multVects(multVect, this.A2[i7]));
                        short[] multVect2 = computeInField.multVect(this.b2[i7], multVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i11] = computeInField.addVect(multVect2, sArr3[i11]);
                        short[] multVect3 = computeInField.multVect(this.b2[i10], computeInField.multVect(coeffAlpha[i][i6][i7], this.A2[i7]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i11] = computeInField.addVect(multVect3, sArr4[i11]);
                        short multElem = GF2Field.multElem(coeffAlpha[i][i6][i7], this.b2[i10]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i11] = GF2Field.addElem(sArr5[i11], GF2Field.multElem(multElem, this.b2[i7]));
                        i7++;
                        i3 = i9;
                        i2 = i8;
                        coeffAlpha = coeffAlpha;
                        i4 = i12;
                        coeffEta = coeffEta;
                    }
                    i6++;
                    cls = cls2;
                }
                Class<short> cls3 = cls;
                int i13 = i3;
                int i14 = i2;
                int i15 = i4;
                short[][][] sArr6 = coeffAlpha;
                short[] sArr7 = coeffEta;
                for (int i16 = 0; i16 < length2; i16++) {
                    for (int i17 = 0; i17 < length2; i17++) {
                        short[] multVect4 = computeInField.multVect(coeffBeta[i][i16][i17], this.A2[i16]);
                        int i18 = i5 + i;
                        sArr[i18] = computeInField.addSquareMatrix(sArr[i18], computeInField.multVects(multVect4, this.A2[i17]));
                        short[] multVect5 = computeInField.multVect(this.b2[i17], multVect4);
                        short[][] sArr8 = this.pub_singular;
                        sArr8[i18] = computeInField.addVect(multVect5, sArr8[i18]);
                        short[] multVect6 = computeInField.multVect(this.b2[i16], computeInField.multVect(coeffBeta[i][i16][i17], this.A2[i17]));
                        short[][] sArr9 = this.pub_singular;
                        sArr9[i18] = computeInField.addVect(multVect6, sArr9[i18]);
                        short multElem2 = GF2Field.multElem(coeffBeta[i][i16][i17], this.b2[i16]);
                        short[] sArr10 = this.pub_scalar;
                        sArr10[i18] = GF2Field.addElem(sArr10[i18], GF2Field.multElem(multElem2, this.b2[i17]));
                    }
                }
                for (int i19 = 0; i19 < length2 + length; i19++) {
                    short[] multVect7 = computeInField.multVect(coeffGamma[i][i19], this.A2[i19]);
                    short[][] sArr11 = this.pub_singular;
                    int i20 = i5 + i;
                    sArr11[i20] = computeInField.addVect(multVect7, sArr11[i20]);
                    short[] sArr12 = this.pub_scalar;
                    sArr12[i20] = GF2Field.addElem(sArr12[i20], GF2Field.multElem(coeffGamma[i][i19], this.b2[i19]));
                }
                short[] sArr13 = this.pub_scalar;
                int i21 = i5 + i;
                sArr13[i21] = GF2Field.addElem(sArr13[i21], sArr7[i]);
                i++;
                cls = cls3;
                i3 = i13;
                i2 = i14;
                coeffAlpha = sArr6;
                i4 = i15;
                coeffEta = sArr7;
            }
            i5 += length;
            i4++;
            i = 0;
        }
        Class<short> cls4 = cls;
        int i22 = i3;
        int i23 = i2;
        short[][][] sArr14 = (short[][][]) Array.newInstance((Class<?>) cls4, i23, i22, i22);
        short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) cls4, i23, i22);
        short[] sArr16 = new short[i23];
        for (int i24 = 0; i24 < i23; i24++) {
            int i25 = 0;
            while (true) {
                short[][] sArr17 = this.A1;
                if (i25 < sArr17.length) {
                    sArr14[i24] = computeInField.addSquareMatrix(sArr14[i24], computeInField.multMatrix(sArr17[i24][i25], sArr[i25]));
                    sArr15[i24] = computeInField.addVect(sArr15[i24], computeInField.multVect(this.A1[i24][i25], this.pub_singular[i25]));
                    sArr16[i24] = GF2Field.addElem(sArr16[i24], GF2Field.multElem(this.A1[i24][i25], this.pub_scalar[i25]));
                    i25++;
                }
            }
            sArr16[i24] = GF2Field.addElem(sArr16[i24], this.b1[i24]);
        }
        this.pub_singular = sArr15;
        this.pub_scalar = sArr16;
        compactPublicKey(sArr14);
    }

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance(short.class, length, ((length2 + 1) * length2) / 2);
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < length2; i3++) {
                for (int i4 = i3; i4 < length2; i4++) {
                    if (i4 == i3) {
                        this.pub_quadratic[i][i2] = sArr[i][i3][i4];
                    } else {
                        this.pub_quadratic[i][i2] = GF2Field.addElem(sArr[i][i3][i4], sArr[i][i4][i3]);
                    }
                    i2++;
                }
            }
        }
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }
}
