package media.tiger.tigerbox.usecase;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.data.network.ScalarTigerBoxWebService;

/* loaded from: classes4.dex */
public final class RequestPemCertificateUseCase_Factory implements Factory<RequestPemCertificateUseCase> {
    private final Provider<ScalarTigerBoxWebService> scalarTigerBoxWebServiceProvider;

    public RequestPemCertificateUseCase_Factory(Provider<ScalarTigerBoxWebService> scalarTigerBoxWebServiceProvider) {
        this.scalarTigerBoxWebServiceProvider = scalarTigerBoxWebServiceProvider;
    }

    @Override // javax.inject.Provider
    public RequestPemCertificateUseCase get() {
        return newInstance(this.scalarTigerBoxWebServiceProvider.get());
    }

    public static RequestPemCertificateUseCase_Factory create(Provider<ScalarTigerBoxWebService> scalarTigerBoxWebServiceProvider) {
        return new RequestPemCertificateUseCase_Factory(scalarTigerBoxWebServiceProvider);
    }

    public static RequestPemCertificateUseCase newInstance(ScalarTigerBoxWebService scalarTigerBoxWebService) {
        return new RequestPemCertificateUseCase(scalarTigerBoxWebService);
    }
}
