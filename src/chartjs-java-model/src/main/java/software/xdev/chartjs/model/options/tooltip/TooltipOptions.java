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
package software.xdev.chartjs.model.options.tooltip;

import software.xdev.chartjs.model.javascript.JavaScriptFunction;
import software.xdev.chartjs.model.options.Font;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.8/src/types/index.d.ts#L2720">ChartJS Source<</a>
 */
public class TooltipOptions
{
	protected Boolean enabled;
	protected JavaScriptFunction external;
	protected String mode;
	protected Boolean intersect;
	protected String position;
	protected TooltipCallbacks callbacks;
	protected JavaScriptFunction itemSort;
	protected JavaScriptFunction filter;
	protected Object backgroundColor;
	protected Object titleColor;
	protected Font titleFont;
	protected String titleAlign;
	protected Number titleSpacing;
	protected Number titleMarginBottom;
	protected Object bodyColor;
	protected Font bodyFont;
	protected Number bodySpacing;
	protected Object footerColor;
	protected Font footerFont;
	protected String footerAlign;
	protected Number footerSpacing;
	protected Number footerMarginTop;
	protected Object padding;
	protected Number caretPadding;
	protected Number caretSize;
	protected Number cornerRadius;
	protected Object multiKeyBackground;
	protected Boolean displayColors;
	protected Number boxWidth;
	protected Number boxHeight;
	protected Number boxPadding;
	protected Boolean usePointStyle;
	protected Object borderColor;
	protected Number borderWidth;
	protected Boolean rtl;
	protected String textDirection;
	protected String xAlign;
	protected String yAlign;
	
	public Boolean getEnabled()
	{
		return this.enabled;
	}
	
	public TooltipOptions setEnabled(final Boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}
	
	public JavaScriptFunction getExternal()
	{
		return this.external;
	}
	
	public TooltipOptions setExternal(final JavaScriptFunction external)
	{
		this.external = external;
		return this;
	}
	
	public String getMode()
	{
		return this.mode;
	}
	
	public TooltipOptions setMode(final String mode)
	{
		this.mode = mode;
		return this;
	}
	
	public Boolean getIntersect()
	{
		return this.intersect;
	}
	
	public TooltipOptions setIntersect(final Boolean intersect)
	{
		this.intersect = intersect;
		return this;
	}
	
	public String getPosition()
	{
		return this.position;
	}
	
	public TooltipOptions setPosition(final String position)
	{
		this.position = position;
		return this;
	}
	
	public TooltipCallbacks getCallbacks()
	{
		return this.callbacks;
	}
	
	public TooltipOptions setCallbacks(final TooltipCallbacks callbacks)
	{
		this.callbacks = callbacks;
		return this;
	}
	
	public JavaScriptFunction getItemSort()
	{
		return this.itemSort;
	}
	
	public TooltipOptions setItemSort(final JavaScriptFunction itemSort)
	{
		this.itemSort = itemSort;
		return this;
	}
	
	public JavaScriptFunction getFilter()
	{
		return this.filter;
	}
	
	public TooltipOptions setFilter(final JavaScriptFunction filter)
	{
		this.filter = filter;
		return this;
	}
	
	public Object getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	public TooltipOptions setBackgroundColor(final Object backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this;
	}
	
	public Object getTitleColor()
	{
		return this.titleColor;
	}
	
	public TooltipOptions setTitleColor(final Object titleColor)
	{
		this.titleColor = titleColor;
		return this;
	}
	
	public Font getTitleFont()
	{
		return this.titleFont;
	}
	
	public TooltipOptions setTitleFont(final Font titleFont)
	{
		this.titleFont = titleFont;
		return this;
	}
	
	public String getTitleAlign()
	{
		return this.titleAlign;
	}
	
	public TooltipOptions setTitleAlign(final String titleAlign)
	{
		this.titleAlign = titleAlign;
		return this;
	}
	
	public Number getTitleSpacing()
	{
		return this.titleSpacing;
	}
	
	public TooltipOptions setTitleSpacing(final Number titleSpacing)
	{
		this.titleSpacing = titleSpacing;
		return this;
	}
	
	public Number getTitleMarginBottom()
	{
		return this.titleMarginBottom;
	}
	
	public TooltipOptions setTitleMarginBottom(final Number titleMarginBottom)
	{
		this.titleMarginBottom = titleMarginBottom;
		return this;
	}
	
	public Object getBodyColor()
	{
		return this.bodyColor;
	}
	
	public TooltipOptions setBodyColor(final Object bodyColor)
	{
		this.bodyColor = bodyColor;
		return this;
	}
	
	public Font getBodyFont()
	{
		return this.bodyFont;
	}
	
	public TooltipOptions setBodyFont(final Font bodyFont)
	{
		this.bodyFont = bodyFont;
		return this;
	}
	
	public Number getBodySpacing()
	{
		return this.bodySpacing;
	}
	
	public TooltipOptions setBodySpacing(final Number bodySpacing)
	{
		this.bodySpacing = bodySpacing;
		return this;
	}
	
	public Object getFooterColor()
	{
		return this.footerColor;
	}
	
	public TooltipOptions setFooterColor(final Object footerColor)
	{
		this.footerColor = footerColor;
		return this;
	}
	
	public Font getFooterFont()
	{
		return this.footerFont;
	}
	
	public TooltipOptions setFooterFont(final Font footerFont)
	{
		this.footerFont = footerFont;
		return this;
	}
	
	public String getFooterAlign()
	{
		return this.footerAlign;
	}
	
	public TooltipOptions setFooterAlign(final String footerAlign)
	{
		this.footerAlign = footerAlign;
		return this;
	}
	
	public Number getFooterSpacing()
	{
		return this.footerSpacing;
	}
	
	public TooltipOptions setFooterSpacing(final Number footerSpacing)
	{
		this.footerSpacing = footerSpacing;
		return this;
	}
	
	public Number getFooterMarginTop()
	{
		return this.footerMarginTop;
	}
	
	public TooltipOptions setFooterMarginTop(final Number footerMarginTop)
	{
		this.footerMarginTop = footerMarginTop;
		return this;
	}
	
	public Object getPadding()
	{
		return this.padding;
	}
	
	public TooltipOptions setPadding(final Object padding)
	{
		this.padding = padding;
		return this;
	}
	
	public Number getCaretPadding()
	{
		return this.caretPadding;
	}
	
	public TooltipOptions setCaretPadding(final Number caretPadding)
	{
		this.caretPadding = caretPadding;
		return this;
	}
	
	public Number getCaretSize()
	{
		return this.caretSize;
	}
	
	public TooltipOptions setCaretSize(final Number caretSize)
	{
		this.caretSize = caretSize;
		return this;
	}
	
	public Number getCornerRadius()
	{
		return this.cornerRadius;
	}
	
	public TooltipOptions setCornerRadius(final Number cornerRadius)
	{
		this.cornerRadius = cornerRadius;
		return this;
	}
	
	public Object getMultiKeyBackground()
	{
		return this.multiKeyBackground;
	}
	
	public TooltipOptions setMultiKeyBackground(final Object multiKeyBackground)
	{
		this.multiKeyBackground = multiKeyBackground;
		return this;
	}
	
	public Boolean getDisplayColors()
	{
		return this.displayColors;
	}
	
	public TooltipOptions setDisplayColors(final Boolean displayColors)
	{
		this.displayColors = displayColors;
		return this;
	}
	
	public Number getBoxWidth()
	{
		return this.boxWidth;
	}
	
	public TooltipOptions setBoxWidth(final Number boxWidth)
	{
		this.boxWidth = boxWidth;
		return this;
	}
	
	public Number getBoxHeight()
	{
		return this.boxHeight;
	}
	
	public TooltipOptions setBoxHeight(final Number boxHeight)
	{
		this.boxHeight = boxHeight;
		return this;
	}
	
	public Number getBoxPadding()
	{
		return this.boxPadding;
	}
	
	public TooltipOptions setBoxPadding(final Number boxPadding)
	{
		this.boxPadding = boxPadding;
		return this;
	}
	
	public Boolean getUsePointStyle()
	{
		return this.usePointStyle;
	}
	
	public TooltipOptions setUsePointStyle(final Boolean usePointStyle)
	{
		this.usePointStyle = usePointStyle;
		return this;
	}
	
	public Object getBorderColor()
	{
		return this.borderColor;
	}
	
	public TooltipOptions setBorderColor(final Object borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}
	
	public Number getBorderWidth()
	{
		return this.borderWidth;
	}
	
	public TooltipOptions setBorderWidth(final Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}
	
	public Boolean getRtl()
	{
		return this.rtl;
	}
	
	public TooltipOptions setRtl(final Boolean rtl)
	{
		this.rtl = rtl;
		return this;
	}
	
	public String getTextDirection()
	{
		return this.textDirection;
	}
	
	public TooltipOptions setTextDirection(final String textDirection)
	{
		this.textDirection = textDirection;
		return this;
	}
	
	public String getxAlign()
	{
		return this.xAlign;
	}
	
	public TooltipOptions setxAlign(final String xAlign)
	{
		this.xAlign = xAlign;
		return this;
	}
	
	public String getyAlign()
	{
		return this.yAlign;
	}
	
	public TooltipOptions setyAlign(final String yAlign)
	{
		this.yAlign = yAlign;
		return this;
	}
}
