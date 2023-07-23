package net.sqlcipher;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public interface IContentObserver extends IInterface {

    /* loaded from: classes4.dex */
    public static class Default implements IContentObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // net.sqlcipher.IContentObserver
        public void onChange(boolean z) throws RemoteException {
        }
    }

    void onChange(boolean z) throws RemoteException;

    /* loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IContentObserver {
        private static final String DESCRIPTOR = "net.sqlcipher.IContentObserver";
        static final int TRANSACTION_onChange = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IContentObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IContentObserver)) {
                return (IContentObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onChange(parcel.readInt() != 0);
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static class Proxy implements IContentObserver {
            public static IContentObserver sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // net.sqlcipher.IContentObserver
            public void onChange(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onChange(z);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IContentObserver iContentObserver) {
            if (Proxy.sDefaultImpl == null) {
                if (iContentObserver != null) {
                    Proxy.sDefaultImpl = iContentObserver;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        public static IContentObserver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
