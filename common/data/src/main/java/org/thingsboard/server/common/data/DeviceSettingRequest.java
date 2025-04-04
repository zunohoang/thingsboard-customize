/**
 * Copyright © 2016-2025 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.data;

import lombok.Data;

@Data  // Lombok annotation để tự động generate getter/setter
public class DeviceSettingRequest {
    private String deviceName;
    private String deviceDescription;
    private String deviceType;
    private Long minCircleNotification;
    private String wifiSsid;
    private String wifiPass;
    private Float minTemperature;
    private Float minHumidity;
    private Float maxTemperature;
    private Float maxHumidity;
    private Float minQuality;
    private Float maxQuality;
    private Float minRain;
    private Float maxRain;
    private Float minLight;
    private Float maxLight;
    private Float timeSend;
}