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

import software.xdev.chartjs.model.color.Color;


public class DragOptions
{
	protected Boolean enabled;
	protected Color backgroundColor;
	protected Color borderColor;
	protected Integer borderWidth;
	protected String drawTime;
	protected Integer threshold;
	protected String modifierKey;
	
	public Boolean getEnabled()
	{
		return enabled;
	}
	
	public DragOptions setEnabled(final Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}
	
	public Color getBackgroundColor()
	{
		return backgroundColor;
	}
	
	public DragOptions setBackgroundColor(final Color backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}
	
	public Color getBorderColor()
	{
		return borderColor;
	}
	
	public DragOptions setBorderColor(final Color borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}
	
	public Integer getBorderWidth()
	{
		return borderWidth;
	}
	
	public DragOptions setBorderWidth(final Integer borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}
	
	public String getDrawTime()
	{
		return drawTime;
	}
	
	public DragOptions setDrawTime(final String drawTime)
	{
		this.drawTime = drawTime;
		return this;
	}
	
	public Integer getThreshold()
	{
		return threshold;
	}
	
	public DragOptions setThreshold(final Integer threshold)
	{
		this.threshold = threshold;
		return this;
	}
	
	public String getModifierKey()
	{
		return modifierKey;
	}
	
	public DragOptions setModifierKey(final String modifierKey)
	{
		this.modifierKey = modifierKey;
		return this;
	}
}
