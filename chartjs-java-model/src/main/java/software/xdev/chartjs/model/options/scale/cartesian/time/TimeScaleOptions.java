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
package software.xdev.chartjs.model.options.scale.cartesian.time;

import software.xdev.chartjs.model.options.scale.cartesian.AbstractCartesianScaleOptions;


/**
 * @see <a href="https://www.chartjs.org/docs/latest/axes/cartesian/time.html">ChartJS docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3391">ChartJS Source</a>
 */
public class TimeScaleOptions extends AbstractCartesianScaleOptions<TimeScaleOptions, TimeScaleTickOptions>
{
	protected Boolean offsetAfterAutoskip;
	protected Adapters adapters;
	protected TimeOptions time;
	
	public TimeScaleOptions()
	{
		this("time");
	}
	
	protected TimeScaleOptions(final String type)
	{
		super(type);
	}
	
	public TimeScaleOptions setMin(final Object min)
	{
		this.min = min;
		return this.self();
	}
	
	public TimeScaleOptions setMax(final Object max)
	{
		this.max = max;
		return this.self();
	}
	
	public TimeScaleOptions setSuggestedMin(final Object suggestedMin)
	{
		this.suggestedMin = suggestedMin;
		return this.self();
	}
	
	public TimeScaleOptions setSuggestedMax(final Object suggestedMax)
	{
		this.suggestedMax = suggestedMax;
		return this.self();
	}
	
	public Boolean getOffsetAfterAutoskip()
	{
		return this.offsetAfterAutoskip;
	}
	
	public TimeScaleOptions setOffsetAfterAutoskip(final Boolean offsetAfterAutoskip)
	{
		this.offsetAfterAutoskip = offsetAfterAutoskip;
		return this.self();
	}
	
	public Adapters getAdapters()
	{
		return this.adapters;
	}
	
	public TimeScaleOptions setAdapters(final Adapters adapters)
	{
		this.adapters = adapters;
		return this.self();
	}
	
	public TimeOptions getTime()
	{
		return this.time;
	}
	
	public TimeScaleOptions setTime(final TimeOptions time)
	{
		this.time = time;
		return this.self();
	}
	
	/**
	 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3336">ChartJS Source</a>
	 */
	public static class TimeOptions
	{
		protected Object parser;
		protected String round;
		protected Object isoWeekday;
		protected Object displayFormats;
		protected String tooltipFormat;
		protected String unit;
		protected String minUnit;
		
		public Object getParser()
		{
			return this.parser;
		}
		
		public TimeOptions setParser(final Object parser)
		{
			this.parser = parser;
			return this;
		}
		
		public String getRound()
		{
			return this.round;
		}
		
		public TimeOptions setRound(final String round)
		{
			this.round = round;
			return this;
		}
		
		public Object getIsoWeekday()
		{
			return this.isoWeekday;
		}
		
		public TimeOptions setIsoWeekday(final Object isoWeekday)
		{
			this.isoWeekday = isoWeekday;
			return this;
		}
		
		public Object getDisplayFormats()
		{
			return this.displayFormats;
		}
		
		public TimeOptions setDisplayFormats(final Object displayFormats)
		{
			this.displayFormats = displayFormats;
			return this;
		}
		
		public String getTooltipFormat()
		{
			return this.tooltipFormat;
		}
		
		public TimeOptions setTooltipFormat(final String tooltipFormat)
		{
			this.tooltipFormat = tooltipFormat;
			return this;
		}
		
		public String getUnit()
		{
			return this.unit;
		}
		
		public TimeOptions setUnit(final String unit)
		{
			this.unit = unit;
			return this;
		}
		
		public String getMinUnit()
		{
			return this.minUnit;
		}
		
		public TimeOptions setMinUnit(final String minUnit)
		{
			this.minUnit = minUnit;
			return this;
		}
	}
	
	/**
	 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3415">ChartJS Source</a>
	 */
	public static class Adapters
	{
		protected Object date;
		
		public Object getDate()
		{
			return this.date;
		}
		
		public Adapters setDate(final Object date)
		{
			this.date = date;
			return this;
		}
	}
}
