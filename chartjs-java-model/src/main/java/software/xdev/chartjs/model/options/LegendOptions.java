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
package software.xdev.chartjs.model.options;

import software.xdev.chartjs.model.javascript.JavaScriptFunction;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.6/src/types/index.d.ts#L2360">ChartJS Source</a>
 */
public class LegendOptions
{
	protected Boolean display;
	protected Object position;
	protected String align;
	protected Number maxHeight;
	protected Number maxWidth;
	protected Boolean fullSize;
	protected Boolean reverse;
	protected JavaScriptFunction onClick;
	protected JavaScriptFunction onHover;
	protected JavaScriptFunction onLeave;
	protected Labels labels;
	protected Boolean rtl;
	protected String textDirection;
	protected Title title;
	
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	public LegendOptions setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	public Object getPosition()
	{
		return this.position;
	}
	
	public LegendOptions setPosition(final Object position)
	{
		this.position = position;
		return this;
	}
	
	public String getAlign()
	{
		return this.align;
	}
	
	public LegendOptions setAlign(final String align)
	{
		this.align = align;
		return this;
	}
	
	public Number getMaxHeight()
	{
		return this.maxHeight;
	}
	
	public LegendOptions setMaxHeight(final Number maxHeight)
	{
		this.maxHeight = maxHeight;
		return this;
	}
	
	public Number getMaxWidth()
	{
		return this.maxWidth;
	}
	
	public LegendOptions setMaxWidth(final Number maxWidth)
	{
		this.maxWidth = maxWidth;
		return this;
	}
	
	public Boolean getFullSize()
	{
		return this.fullSize;
	}
	
	public LegendOptions setFullSize(final Boolean fullSize)
	{
		this.fullSize = fullSize;
		return this;
	}
	
	public Boolean getReverse()
	{
		return this.reverse;
	}
	
	public LegendOptions setReverse(final Boolean reverse)
	{
		this.reverse = reverse;
		return this;
	}
	
	public JavaScriptFunction getOnClick()
	{
		return this.onClick;
	}
	
	public LegendOptions setOnClick(final JavaScriptFunction onClick)
	{
		this.onClick = onClick;
		return this;
	}
	
	public JavaScriptFunction getOnHover()
	{
		return this.onHover;
	}
	
	public LegendOptions setOnHover(final JavaScriptFunction onHover)
	{
		this.onHover = onHover;
		return this;
	}
	
	public JavaScriptFunction getOnLeave()
	{
		return this.onLeave;
	}
	
	public LegendOptions setOnLeave(final JavaScriptFunction onLeave)
	{
		this.onLeave = onLeave;
		return this;
	}
	
	public Labels getLabels()
	{
		return this.labels;
	}
	
	public LegendOptions setLabels(final Labels labels)
	{
		this.labels = labels;
		return this;
	}
	
	public Boolean getRtl()
	{
		return this.rtl;
	}
	
	public LegendOptions setRtl(final Boolean rtl)
	{
		this.rtl = rtl;
		return this;
	}
	
	public String getTextDirection()
	{
		return this.textDirection;
	}
	
	public LegendOptions setTextDirection(final String textDirection)
	{
		this.textDirection = textDirection;
		return this;
	}
	
	public Title getTitle()
	{
		return this.title;
	}
	
	public LegendOptions setTitle(final Title title)
	{
		this.title = title;
		return this;
	}
	
	/**
	 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.6/src/types/index.d.ts#L2407">ChartJS Source</a>
	 */
	public static class Labels
	{
		protected Number boxWidth;
		protected Number boxHeight;
		protected Object color;
		protected Font font;
		protected Number padding;
		protected Number pointStyleWidth;
		protected JavaScriptFunction generateLabels;
		protected JavaScriptFunction filter;
		protected JavaScriptFunction sort;
		protected String textAlign;
		protected Boolean usePointStyle;
		protected Boolean useBorderRadius;
		protected Number borderRadius;
		
		public Number getBoxWidth()
		{
			return this.boxWidth;
		}
		
		public Labels setBoxWidth(final Number boxWidth)
		{
			this.boxWidth = boxWidth;
			return this;
		}
		
		public Number getBoxHeight()
		{
			return this.boxHeight;
		}
		
		public Labels setBoxHeight(final Number boxHeight)
		{
			this.boxHeight = boxHeight;
			return this;
		}
		
		public Object getColor()
		{
			return this.color;
		}
		
		public Labels setColor(final Object color)
		{
			this.color = color;
			return this;
		}
		
		public Font getFont()
		{
			return this.font;
		}
		
		public Labels setFont(final Font font)
		{
			this.font = font;
			return this;
		}
		
		public Number getPadding()
		{
			return this.padding;
		}
		
		public Labels setPadding(final Number padding)
		{
			this.padding = padding;
			return this;
		}
		
		public Number getPointStyleWidth()
		{
			return this.pointStyleWidth;
		}
		
		public Labels setPointStyleWidth(final Number pointStyleWidth)
		{
			this.pointStyleWidth = pointStyleWidth;
			return this;
		}
		
		public JavaScriptFunction getGenerateLabels()
		{
			return this.generateLabels;
		}
		
		public Labels setGenerateLabels(final JavaScriptFunction generateLabels)
		{
			this.generateLabels = generateLabels;
			return this;
		}
		
		public JavaScriptFunction getFilter()
		{
			return this.filter;
		}
		
		public Labels setFilter(final JavaScriptFunction filter)
		{
			this.filter = filter;
			return this;
		}
		
		public JavaScriptFunction getSort()
		{
			return this.sort;
		}
		
		public Labels setSort(final JavaScriptFunction sort)
		{
			this.sort = sort;
			return this;
		}
		
		public String getTextAlign()
		{
			return this.textAlign;
		}
		
		public Labels setTextAlign(final String textAlign)
		{
			this.textAlign = textAlign;
			return this;
		}
		
		public Boolean getUsePointStyle()
		{
			return this.usePointStyle;
		}
		
		public Labels setUsePointStyle(final Boolean usePointStyle)
		{
			this.usePointStyle = usePointStyle;
			return this;
		}
		
		public Boolean getUseBorderRadius()
		{
			return this.useBorderRadius;
		}
		
		public Labels setUseBorderRadius(final Boolean useBorderRadius)
		{
			this.useBorderRadius = useBorderRadius;
			return this;
		}
		
		public Number getBorderRadius()
		{
			return this.borderRadius;
		}
		
		public Labels setBorderRadius(final Number borderRadius)
		{
			this.borderRadius = borderRadius;
			return this;
		}
	}
	
	
	/**
	 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.6/src/types/index.d.ts#L2490">ChartJS Source</a>
	 */
	public static class Title
	{
		protected Boolean display;
		protected Object color;
		protected Font font;
		protected String position;
		protected Object padding;
		protected String text;
		
		public Boolean getDisplay()
		{
			return this.display;
		}
		
		public Title setDisplay(final Boolean display)
		{
			this.display = display;
			return this;
		}
		
		public Object getColor()
		{
			return this.color;
		}
		
		public Title setColor(final Object color)
		{
			this.color = color;
			return this;
		}
		
		public Font getFont()
		{
			return this.font;
		}
		
		public Title setFont(final Font font)
		{
			this.font = font;
			return this;
		}
		
		public String getPosition()
		{
			return this.position;
		}
		
		public Title setPosition(final String position)
		{
			this.position = position;
			return this;
		}
		
		public Object getPadding()
		{
			return this.padding;
		}
		
		public Title setPadding(final Object padding)
		{
			this.padding = padding;
			return this;
		}
		
		public String getText()
		{
			return this.text;
		}
		
		public Title setText(final String text)
		{
			this.text = text;
			return this;
		}
	}
}
