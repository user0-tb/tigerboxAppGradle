package media.tiger.tigerbox.webserver.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: DeviceInfoDto.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"validateAndSanitize", "Lmedia/tiger/tigerbox/webserver/dto/UpdateDeviceInfoDto;", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceInfoDtoKt {
    public static final UpdateDeviceInfoDto validateAndSanitize(UpdateDeviceInfoDto updateDeviceInfoDto) {
        UpdateDeviceInfoDto copy;
        UpdateDeviceInfoDto copy2;
        UpdateDeviceInfoDto copy3;
        Intrinsics.checkNotNullParameter(updateDeviceInfoDto, "<this>");
        boolean z = false;
        if (updateDeviceInfoDto.getSleepTimer() != null && updateDeviceInfoDto.getSleepTimer().intValue() < -1) {
            copy3 = updateDeviceInfoDto.copy((r24 & 1) != 0 ? updateDeviceInfoDto.deviceName : null, (r24 & 2) != 0 ? updateDeviceInfoDto.maxVolume : null, (r24 & 4) != 0 ? updateDeviceInfoDto.musicVolumeUnit : null, (r24 & 8) != 0 ? updateDeviceInfoDto.musicLightEnabled : null, (r24 & 16) != 0 ? updateDeviceInfoDto.logoLight : null, (r24 & 32) != 0 ? updateDeviceInfoDto.nightLight : null, (r24 & 64) != 0 ? updateDeviceInfoDto.sleepTimer : 0, (r24 & 128) != 0 ? updateDeviceInfoDto.timeLimitInitialTimeSeconds : null, (r24 & 256) != 0 ? updateDeviceInfoDto.timeWindowList : null, (r24 & 512) != 0 ? updateDeviceInfoDto.systemSoundEnabled : null, (r24 & 1024) != 0 ? updateDeviceInfoDto.wifiEnabled : null);
            return copy3;
        }
        IntRange intRange = new IntRange(1, 60);
        Integer sleepTimer = updateDeviceInfoDto.getSleepTimer();
        if (sleepTimer != null && intRange.contains(sleepTimer.intValue())) {
            z = true;
        }
        if (z) {
            copy2 = updateDeviceInfoDto.copy((r24 & 1) != 0 ? updateDeviceInfoDto.deviceName : null, (r24 & 2) != 0 ? updateDeviceInfoDto.maxVolume : null, (r24 & 4) != 0 ? updateDeviceInfoDto.musicVolumeUnit : null, (r24 & 8) != 0 ? updateDeviceInfoDto.musicLightEnabled : null, (r24 & 16) != 0 ? updateDeviceInfoDto.logoLight : null, (r24 & 32) != 0 ? updateDeviceInfoDto.nightLight : null, (r24 & 64) != 0 ? updateDeviceInfoDto.sleepTimer : 60, (r24 & 128) != 0 ? updateDeviceInfoDto.timeLimitInitialTimeSeconds : null, (r24 & 256) != 0 ? updateDeviceInfoDto.timeWindowList : null, (r24 & 512) != 0 ? updateDeviceInfoDto.systemSoundEnabled : null, (r24 & 1024) != 0 ? updateDeviceInfoDto.wifiEnabled : null);
            return copy2;
        } else if (updateDeviceInfoDto.getSleepTimer() == null || updateDeviceInfoDto.getSleepTimer().intValue() <= 21600) {
            return updateDeviceInfoDto;
        } else {
            copy = updateDeviceInfoDto.copy((r24 & 1) != 0 ? updateDeviceInfoDto.deviceName : null, (r24 & 2) != 0 ? updateDeviceInfoDto.maxVolume : null, (r24 & 4) != 0 ? updateDeviceInfoDto.musicVolumeUnit : null, (r24 & 8) != 0 ? updateDeviceInfoDto.musicLightEnabled : null, (r24 & 16) != 0 ? updateDeviceInfoDto.logoLight : null, (r24 & 32) != 0 ? updateDeviceInfoDto.nightLight : null, (r24 & 64) != 0 ? updateDeviceInfoDto.sleepTimer : Integer.valueOf((int) UpdateDeviceInfoDto.DEFAULT_MAX_SLEEP_TIME), (r24 & 128) != 0 ? updateDeviceInfoDto.timeLimitInitialTimeSeconds : null, (r24 & 256) != 0 ? updateDeviceInfoDto.timeWindowList : null, (r24 & 512) != 0 ? updateDeviceInfoDto.systemSoundEnabled : null, (r24 & 1024) != 0 ? updateDeviceInfoDto.wifiEnabled : null);
            return copy;
        }
    }
}
