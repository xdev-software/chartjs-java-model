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
package software.xdev.chartjs.model.options.plugins.zoom.zoom;

/**
 * <a href="https://www.chartjs.org/chartjs-plugin-zoom/latest/guide/options.html#wheel-options">ChartJS docs</a>
 */
public class WheelOptions
{
	protected Boolean enabled;
	protected Number speed;
	protected String modifierKey;
	
	public Boolean getEnabled()
	{
		return this.enabled;
	}
	
	public WheelOptions setEnabled(final Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}
	
	public Number getSpeed()
	{
		return this.speed;
	}
	
	public WheelOptions setSpeed(final Number speed)
	{
		this.speed = speed;
		return this;
	}
	
	public String getModifierKey()
	{
		return this.modifierKey;
	}
	
	public WheelOptions setModifierKey(final String modifierKey)
	{
		this.modifierKey = modifierKey;
		return this;
	}
}
