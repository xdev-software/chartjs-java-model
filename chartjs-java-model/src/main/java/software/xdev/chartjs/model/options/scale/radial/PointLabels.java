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
package software.xdev.chartjs.model.options.scale.radial;

import software.xdev.chartjs.model.javascript.JavaScriptFunction;
import software.xdev.chartjs.model.options.Font;


/**
 * @see <a href="https://www.chartjs.org/docs/latest/axes/radial/linear.html#point-label-options">ChartJS Docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3520">ChartJS Source</a>
 */
public class PointLabels
{
	protected Object backdropColor;
	protected Object backdropPadding;
	protected Object borderRadius;
	protected Object display;
	protected JavaScriptFunction callback;
	protected Object color;
	protected Font font;
	protected Number padding;
	protected Boolean centerPointLabels;
	
	public Object getBackdropColor()
	{
		return this.backdropColor;
	}
	
	public PointLabels setBackdropColor(final Object backdropColor)
	{
		this.backdropColor = backdropColor;
		return this;
	}
	
	public Object getBackdropPadding()
	{
		return this.backdropPadding;
	}
	
	public PointLabels setBackdropPadding(final Object backdropPadding)
	{
		this.backdropPadding = backdropPadding;
		return this;
	}
	
	public Object getBorderRadius()
	{
		return this.borderRadius;
	}
	
	public PointLabels setBorderRadius(final Object borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}
	
	public Object getDisplay()
	{
		return this.display;
	}
	
	public PointLabels setDisplay(final Object display)
	{
		this.display = display;
		return this;
	}
	
	public JavaScriptFunction getCallback()
	{
		return this.callback;
	}
	
	public PointLabels setCallback(final JavaScriptFunction callback)
	{
		this.callback = callback;
		return this;
	}
	
	public Object getColor()
	{
		return this.color;
	}
	
	public PointLabels setColor(final Object color)
	{
		this.color = color;
		return this;
	}
	
	public Font getFont()
	{
		return this.font;
	}
	
	public PointLabels setFont(final Font font)
	{
		this.font = font;
		return this;
	}
	
	public Number getPadding()
	{
		return this.padding;
	}
	
	public PointLabels setPadding(final Number padding)
	{
		this.padding = padding;
		return this;
	}
	
	public Boolean getCenterPointLabels()
	{
		return this.centerPointLabels;
	}
	
	public PointLabels setCenterPointLabels(final Boolean centerPointLabels)
	{
		this.centerPointLabels = centerPointLabels;
		return this;
	}
}
