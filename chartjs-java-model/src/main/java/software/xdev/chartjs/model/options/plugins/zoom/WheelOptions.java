/*
 * Copyright © 2023 XDEV Software (https://xdev.software)
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
package software.xdev.chartjs.model.options.plugins.zoom;

public class WheelOptions {
    protected Boolean enabled;
    protected Number speed;
    protected String modifierKey;

    public Boolean getEnabled() {
        return enabled;
    }

    public WheelOptions setEnabled(Boolean enabled) {
        this.enabled = enabled;
		return this;
    }

    public Number getSpeed() {
        return speed;
    }

    public WheelOptions setSpeed(Number speed) {
        this.speed = speed;
		return this;
    }

    public String getModifierKey() {
        return modifierKey;
    }

    public WheelOptions setModifierKey(String modifierKey) {
        this.modifierKey = modifierKey;
		return this;
    }
}
