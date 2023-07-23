package media.tiger.tigerbox.services.implementations;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.domain.BatterySummary;
import media.tiger.tigerbox.services.implementations.DisplayService;
import media.tiger.tigerbox.services.implementations.HardwareBatteryService$batteryStatusReceiver$2;
import media.tiger.tigerbox.services.interfaces.BatteryChangesListener;
import media.tiger.tigerbox.services.interfaces.BatteryService;
import media.tiger.tigerbox.services.interfaces.InfoSoundService;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.services.interfaces.TigerButtonLightEvent;
import media.tiger.tigerbox.services.interfaces.TigerButtonLightEventKt;
import okhttp3.internal._UtilJvmKt;
import timber.log.Timber;

/* compiled from: HardwareBatteryService.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0017H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0017H\u0016R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/HardwareBatteryService;", "Lmedia/tiger/tigerbox/services/interfaces/BatteryService;", "context", "Landroid/content/Context;", "soundService", "Lmedia/tiger/tigerbox/services/interfaces/InfoSoundService;", "lightControlService", "Lmedia/tiger/tigerbox/services/interfaces/LightControlService;", "displayService", "Lmedia/tiger/tigerbox/services/implementations/DisplayService;", "(Landroid/content/Context;Lmedia/tiger/tigerbox/services/interfaces/InfoSoundService;Lmedia/tiger/tigerbox/services/interfaces/LightControlService;Lmedia/tiger/tigerbox/services/implementations/DisplayService;)V", "batteryStatusReceiver", "Landroid/content/BroadcastReceiver;", "getBatteryStatusReceiver", "()Landroid/content/BroadcastReceiver;", "batteryStatusReceiver$delegate", "Lkotlin/Lazy;", "didPlay20Sound", "", "didPlay5PercentBootSound", "didPlay5Sound", "listeners", "Ljava/util/ArrayList;", "Lmedia/tiger/tigerbox/services/interfaces/BatteryChangesListener;", "Lkotlin/collections/ArrayList;", "oldBatterySummary", "Lmedia/tiger/tigerbox/model/domain/BatterySummary;", "fetchBatteryStatus", "Landroid/content/Intent;", "getBatteryPercent", "", "isCharging", "isPlugged", "playBatteryBelow5PercentIfNeeded", "", "subscribeToBatteryChanges", "listener", "unsubscribeFromBatteryChanges", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HardwareBatteryService implements BatteryService {
    public static final Companion Companion = new Companion(null);
    private static final int INVALID = -1;
    private static final int MAX_SCALE = 100;
    private final Lazy batteryStatusReceiver$delegate;
    private final Context context;
    private boolean didPlay20Sound;
    private boolean didPlay5PercentBootSound;
    private boolean didPlay5Sound;
    private final DisplayService displayService;
    private final LightControlService lightControlService;
    private ArrayList<BatteryChangesListener> listeners;
    private BatterySummary oldBatterySummary;
    private final InfoSoundService soundService;

    public HardwareBatteryService(Context context, InfoSoundService soundService, LightControlService lightControlService, DisplayService displayService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(soundService, "soundService");
        Intrinsics.checkNotNullParameter(lightControlService, "lightControlService");
        Intrinsics.checkNotNullParameter(displayService, "displayService");
        this.context = context;
        this.soundService = soundService;
        this.lightControlService = lightControlService;
        this.displayService = displayService;
        this.listeners = new ArrayList<>();
        this.oldBatterySummary = new BatterySummary(0.0f, false, false);
        this.batteryStatusReceiver$delegate = LazyKt.lazy(new Function0<HardwareBatteryService$batteryStatusReceiver$2.AnonymousClass1>() { // from class: media.tiger.tigerbox.services.implementations.HardwareBatteryService$batteryStatusReceiver$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [media.tiger.tigerbox.services.implementations.HardwareBatteryService$batteryStatusReceiver$2$1] */
            @Override // kotlin.jvm.functions.Function0
            public final AnonymousClass1 invoke() {
                final HardwareBatteryService hardwareBatteryService = HardwareBatteryService.this;
                return new BroadcastReceiver() { // from class: media.tiger.tigerbox.services.implementations.HardwareBatteryService$batteryStatusReceiver$2.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        ArrayList arrayList;
                        BatterySummary batterySummary;
                        LightControlService lightControlService2;
                        LightControlService lightControlService3;
                        LightControlService lightControlService4;
                        DisplayService displayService2;
                        boolean z;
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        InfoSoundService infoSoundService;
                        InfoSoundService infoSoundService2;
                        LightControlService lightControlService5;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intrinsics.checkNotNullParameter(intent, "intent");
                        arrayList = HardwareBatteryService.this.listeners;
                        List<BatteryChangesListener> immutableList = _UtilJvmKt.toImmutableList(arrayList);
                        String action = intent.getAction();
                        if (action != null) {
                            int hashCode = action.hashCode();
                            if (hashCode != -1538406691) {
                                if (hashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    for (BatteryChangesListener batteryChangesListener : immutableList) {
                                        batteryChangesListener.onCablePluggedIn();
                                    }
                                }
                            } else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                                BatterySummary batterySummary2 = new BatterySummary(HardwareBatteryService.this.getBatteryPercent(), HardwareBatteryService.this.isCharging(), HardwareBatteryService.this.isPlugged());
                                batterySummary = HardwareBatteryService.this.oldBatterySummary;
                                if (Intrinsics.areEqual(batterySummary, batterySummary2)) {
                                    return;
                                }
                                HardwareBatteryService.this.oldBatterySummary = batterySummary2;
                                for (BatteryChangesListener batteryChangesListener2 : immutableList) {
                                    batteryChangesListener2.onStatusChanged(batterySummary2);
                                }
                                lightControlService2 = HardwareBatteryService.this.lightControlService;
                                lightControlService2.removeTigerButtonLightEvents(TigerButtonLightEventKt.toBit(TigerButtonLightEvent.BATTERY_BETWEEN_5_10) | TigerButtonLightEventKt.toBit(TigerButtonLightEvent.BATTERY_UNDER_5) | TigerButtonLightEventKt.toBit(TigerButtonLightEvent.BATTERY_FULL_PLUGGED));
                                if (batterySummary2.getBatteryPercent() < 5.0f && !HardwareBatteryService.this.isPlugged()) {
                                    lightControlService5 = HardwareBatteryService.this.lightControlService;
                                    lightControlService5.addTigerButtonLightEvents(TigerButtonLightEventKt.toBit(TigerButtonLightEvent.BATTERY_UNDER_5));
                                } else if (batterySummary2.getBatteryPercent() >= 5.0f && batterySummary2.getBatteryPercent() < 11.0f && !HardwareBatteryService.this.isPlugged()) {
                                    lightControlService4 = HardwareBatteryService.this.lightControlService;
                                    lightControlService4.addTigerButtonLightEvents(TigerButtonLightEventKt.toBit(TigerButtonLightEvent.BATTERY_BETWEEN_5_10));
                                } else if (batterySummary2.getBatteryPercent() > 99.0f && HardwareBatteryService.this.isPlugged()) {
                                    lightControlService3 = HardwareBatteryService.this.lightControlService;
                                    lightControlService3.addTigerButtonLightEvents(TigerButtonLightEventKt.toBit(TigerButtonLightEvent.BATTERY_FULL_PLUGGED));
                                }
                                displayService2 = HardwareBatteryService.this.displayService;
                                boolean z5 = displayService2.getCurrentState() != DisplayService.DisplayState.TIGERBOX_DISPLAY_OFF;
                                Timber.Forest forest = Timber.Forest;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Battery changed ");
                                sb.append(batterySummary2.getBatteryPercent());
                                sb.append(" didPlay20Sound: ");
                                z = HardwareBatteryService.this.didPlay20Sound;
                                sb.append(z);
                                sb.append(" didPlay5Sound ");
                                z2 = HardwareBatteryService.this.didPlay5Sound;
                                sb.append(z2);
                                sb.append(" isPlugged: ");
                                sb.append(HardwareBatteryService.this.isPlugged());
                                sb.append(" screenIsOn: ");
                                sb.append(z5);
                                forest.i(sb.toString(), new Object[0]);
                                if (z5) {
                                    z3 = HardwareBatteryService.this.didPlay20Sound;
                                    if (!z3 && batterySummary2.getBatteryPercent() > 5.0f && batterySummary2.getBatteryPercent() <= 20.0f && !HardwareBatteryService.this.isPlugged()) {
                                        infoSoundService2 = HardwareBatteryService.this.soundService;
                                        infoSoundService2.playSound(InfoSoundService.SoundType.LOW_BATTERY_20);
                                        HardwareBatteryService.this.didPlay20Sound = true;
                                    }
                                    z4 = HardwareBatteryService.this.didPlay5Sound;
                                    if (z4 || batterySummary2.getBatteryPercent() > 5.0f || HardwareBatteryService.this.isPlugged()) {
                                        return;
                                    }
                                    infoSoundService = HardwareBatteryService.this.soundService;
                                    infoSoundService.playSound(InfoSoundService.SoundType.LOW_BATTERY_5);
                                    HardwareBatteryService.this.didPlay5Sound = true;
                                }
                            }
                        }
                    }
                };
            }
        });
        BroadcastReceiver batteryStatusReceiver = getBatteryStatusReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        Unit unit = Unit.INSTANCE;
        context.registerReceiver(batteryStatusReceiver, intentFilter);
    }

    private final BroadcastReceiver getBatteryStatusReceiver() {
        return (BroadcastReceiver) this.batteryStatusReceiver$delegate.getValue();
    }

    private final Intent fetchBatteryStatus() {
        return this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Override // media.tiger.tigerbox.services.interfaces.BatteryService
    public float getBatteryPercent() {
        Intent fetchBatteryStatus = fetchBatteryStatus();
        if (fetchBatteryStatus != null) {
            return (fetchBatteryStatus.getIntExtra("level", -1) * 100) / fetchBatteryStatus.getIntExtra("scale", -1);
        }
        return -1.0f;
    }

    @Override // media.tiger.tigerbox.services.interfaces.BatteryService
    public boolean isCharging() {
        Intent fetchBatteryStatus = fetchBatteryStatus();
        int intExtra = fetchBatteryStatus != null ? fetchBatteryStatus.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // media.tiger.tigerbox.services.interfaces.BatteryService
    public boolean isPlugged() {
        Intent fetchBatteryStatus = fetchBatteryStatus();
        int intExtra = fetchBatteryStatus != null ? fetchBatteryStatus.getIntExtra("plugged", -1) : -1;
        return intExtra == 1 || intExtra == 2 || intExtra == 4;
    }

    @Override // media.tiger.tigerbox.services.interfaces.BatteryService
    public void subscribeToBatteryChanges(BatteryChangesListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    @Override // media.tiger.tigerbox.services.interfaces.BatteryService
    public void unsubscribeFromBatteryChanges(BatteryChangesListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // media.tiger.tigerbox.services.interfaces.BatteryService
    public void playBatteryBelow5PercentIfNeeded() {
        if (!(this.displayService.getCurrentState() != DisplayService.DisplayState.TIGERBOX_DISPLAY_OFF) || this.didPlay5PercentBootSound || getBatteryPercent() > 5.0f || isPlugged()) {
            return;
        }
        this.soundService.playSound(InfoSoundService.SoundType.LOW_BATTERY_5_SWITCH_ON);
        this.didPlay5PercentBootSound = true;
    }

    /* compiled from: HardwareBatteryService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/HardwareBatteryService$Companion;", "", "()V", "INVALID", "", "MAX_SCALE", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
