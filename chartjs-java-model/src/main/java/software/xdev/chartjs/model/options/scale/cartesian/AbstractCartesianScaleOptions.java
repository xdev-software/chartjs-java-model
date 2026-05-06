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
package software.xdev.chartjs.model.options.scale.cartesian;

import software.xdev.chartjs.model.options.Font;
import software.xdev.chartjs.model.options.scale.AbstractCoreScaleOptions;
import software.xdev.chartjs.model.options.scale.GridLineConfiguration;


/**
 * @see <a href="https://www.chartjs.org/docs/latest/axes/cartesian/#common-tick-options-to-all-cartesian-axes">ChartJS docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3168">ChartJS source</a>
 */
public abstract class AbstractCartesianScaleOptions<
	S extends AbstractCartesianScaleOptions<S, T>,
	T extends AbstractCartesianTickOptions<?>>
	extends AbstractCoreScaleOptions<S, T>
{
	protected String bounds;
	protected Object position;
	protected String stack;
	protected Number stackWeight;
	protected String axis;
	protected Boolean offset;
	protected Title title;
	protected BorderConfiguration border;
	protected GridLineConfiguration grid;
	// stacked is already defined in parent
	
	protected AbstractCartesianScaleOptions(final String type)
	{
		super(type);
	}
	
	public String getBounds()
	{
		return this.bounds;
	}
	
	public S setBounds(final String bounds)
	{
		this.bounds = bounds;
		return this.self();
	}
	
	public Object getPosition()
	{
		return this.position;
	}
	
	public S setPosition(final Object position)
	{
		this.position = position;
		return this.self();
	}
	
	public String getStack()
	{
		return this.stack;
	}
	
	public S setStack(final String stack)
	{
		this.stack = stack;
		return this.self();
	}
	
	public Number getStackWeight()
	{
		return this.stackWeight;
	}
	
	public S setStackWeight(final Number stackWeight)
	{
		this.stackWeight = stackWeight;
		return this.self();
	}
	
	public String getAxis()
	{
		return this.axis;
	}
	
	public S setAxis(final String axis)
	{
		this.axis = axis;
		return this.self();
	}
	
	public Boolean getOffset()
	{
		return this.offset;
	}
	
	public S setOffset(final Boolean offset)
	{
		this.offset = offset;
		return this.self();
	}
	
	public Title getTitle()
	{
		return this.title;
	}
	
	public S setTitle(final Title title)
	{
		this.title = title;
		return this.self();
	}
	
	public BorderConfiguration getBorder()
	{
		return this.border;
	}
	
	public S setBorder(final BorderConfiguration border)
	{
		this.border = border;
		return this.self();
	}
	
	public GridLineConfiguration getGrid()
	{
		return this.grid;
	}
	
	public S setGrid(final GridLineConfiguration grid)
	{
		this.grid = grid;
		return this.self();
	}
	
	/**
	 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3220">ChartJS source</a>
	 */
	public static class Title
	{
		protected Boolean display;
		protected String align;
		protected String text;
		protected String color;
		protected Font font;
		protected Object padding;
		
		public Boolean getDisplay()
		{
			return this.display;
		}
		
		public Title setDisplay(final Boolean display)
		{
			this.display = display;
			return this;
		}
		
		public String getAlign()
		{
			return this.align;
		}
		
		public Title setAlign(final String align)
		{
			this.align = align;
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
		
		public String getColor()
		{
			return this.color;
		}
		
		public Title setColor(final String color)
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
		
		public Object getPadding()
		{
			return this.padding;
		}
		
		public Title setPadding(final Object padding)
		{
			this.padding = padding;
			return this;
		}
	}
}
