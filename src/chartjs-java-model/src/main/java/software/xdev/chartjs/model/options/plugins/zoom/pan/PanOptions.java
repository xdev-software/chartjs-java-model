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
package software.xdev.chartjs.model.options.plugins.zoom.pan;

/**
 * <a href="https://www.chartjs.org/chartjs-plugin-zoom/latest/guide/options.html#pan-options">ChartJS docs</a>
 */
public class PanOptions
{
	protected Boolean enabled;
	protected String mode;
	protected String modifierKey;
	protected String scaleMode;
	protected String overScaleMode;
	protected Integer threshold;
	
	public Boolean getEnabled()
	{
		return this.enabled;
	}
	
	public PanOptions setEnabled(final Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}
	
	public String getMode()
	{
		return this.mode;
	}
	
	public PanOptions setMode(final String mode)
	{
		this.mode = mode;
		return this;
	}
	
	public String getModifierKey()
	{
		return this.modifierKey;
	}
	
	public PanOptions setModifierKey(final String modifierKey)
	{
		this.modifierKey = modifierKey;
		return this;
	}
	
	public String getScaleMode()
	{
		return this.scaleMode;
	}
	
	public PanOptions setScaleMode(final String scaleMode)
	{
		this.scaleMode = scaleMode;
		return this;
	}
	
	public String getOverScaleMode()
	{
		return this.overScaleMode;
	}
	
	public PanOptions setOverScaleMode(final String overScaleMode)
	{
		this.overScaleMode = overScaleMode;
		return this;
	}
	
	public Integer getThreshold()
	{
		return this.threshold;
	}
	
	public PanOptions setThreshold(final Integer threshold)
	{
		this.threshold = threshold;
		return this;
	}
}
