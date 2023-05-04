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
package software.xdev.chart_java.options.scales;

import java.math.BigDecimal;


public class Time
{
	
	/**
	 * Default {@code -}
	 *
	 * @see #setDisplayFormats(DisplayFormats)
	 */
	protected DisplayFormats displayFormats;
	
	/**
	 * Default {@code false}
	 *
	 * @see #setIsoWeekday(Boolean)
	 */
	protected Boolean isoWeekday;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setMax(Time)
	 */
	protected Time max;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setMin(Time)
	 */
	protected Time min;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setParser(String)
	 */
	protected String parser;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setRound(String)
	 */
	protected String round;
	
	/**
	 * Default {@code ''}
	 *
	 * @see #setTooltipFormat(String)
	 */
	protected String tooltipFormat;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setUnit(String)
	 */
	protected String unit;
	
	/**
	 * Default {@code 1}
	 *
	 * @see #setUnitStepSize(BigDecimal)
	 */
	protected BigDecimal unitStepSize;
	
	/**
	 * @see #setDisplayFormats(DisplayFormats)
	 */
	public DisplayFormats getDisplayFormats()
	{
		return this.displayFormats;
	}
	
	/**
	 * See Display Formats section below.
	 */
	public Time setDisplayFormats(final DisplayFormats displayFormats)
	{
		this.displayFormats = displayFormats;
		return this;
	}
	
	/**
	 * @see #setIsoWeekday(Boolean)
	 */
	public Boolean getIsoWeekday()
	{
		return this.isoWeekday;
	}
	
	/**
	 * If true and the unit is set to 'week', iso weekdays will be used.
	 */
	public Time setIsoWeekday(final Boolean isoWeekday)
	{
		this.isoWeekday = isoWeekday;
		return this;
	}
	
	/**
	 * @see #setMax(Time)
	 */
	public Time getMax()
	{
		return this.max;
	}
	
	/**
	 * If defined, this will override the data maximum
	 */
	public Time setMax(final Time max)
	{
		this.max = max;
		return this;
	}
	
	/**
	 * @see #setMin(Time)
	 */
	public Time getMin()
	{
		return this.min;
	}
	
	/**
	 * If defined, this will override the data minimum
	 */
	public Time setMin(final Time min)
	{
		this.min = min;
		return this;
	}
	
	/**
	 * @see #setParser(String)
	 */
	public String getParser()
	{
		return this.parser;
	}
	
	/**
	 * If defined as a string, it is interpreted as a custom format to be used by moment to parse the date. If this
	 * is a
	 * function, it must return a moment.js object given the appropriate data value.
	 */
	public Time setParser(final String parser)
	{
		this.parser = parser;
		return this;
	}
	
	/**
	 * @see #setRound(String)
	 */
	public String getRound()
	{
		return this.round;
	}
	
	/**
	 * If defined, dates will be rounded to the start of this unit. See Time Units below for the allowed units.
	 */
	public Time setRound(final String round)
	{
		this.round = round;
		return this;
	}
	
	/**
	 * @see #setTooltipFormat(String)
	 */
	public String getTooltipFormat()
	{
		return this.tooltipFormat;
	}
	
	/**
	 * The moment js format string to use for the tooltip.
	 */
	public Time setTooltipFormat(final String tooltipFormat)
	{
		this.tooltipFormat = tooltipFormat;
		return this;
	}
	
	/**
	 * @see #setUnit(String)
	 */
	public String getUnit()
	{
		return this.unit;
	}
	
	/**
	 * If defined, will force the unit to be a certain type. See Time Units section below for details.
	 */
	public Time setUnit(final String unit)
	{
		this.unit = unit;
		return this;
	}
	
	/**
	 * @see #setUnitStepSize(BigDecimal)
	 */
	public BigDecimal getUnitStepSize()
	{
		return this.unitStepSize;
	}
	
	/**
	 * The number of units between grid lines.
	 */
	public Time setUnitStepSize(final BigDecimal unitStepSize)
	{
		this.unitStepSize = unitStepSize;
		return this;
	}
}
