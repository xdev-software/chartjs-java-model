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

import software.xdev.chart_java.options.ticks.Ticks;


public class BarScale<T extends Ticks<T>> extends Scale<T, BarScale<T>>
{
	
	/**
	 * Default {@code "Category"}
	 *
	 * @see #setType(String type)
	 */
	protected String type;
	
	/**
	 * Default {@code true}
	 *
	 * @see #setDisplay(Boolean display)
	 */
	protected Boolean display;
	
	/**
	 * Default {@code 0.8}
	 *
	 * @see #setCategoryPercentage(BigDecimal categoryPercentage)
	 */
	protected BigDecimal categoryPercentage;
	
	/**
	 * Default {@code 0.9}
	 *
	 * @see #setBarPercentage(BigDecimal barPercentage)
	 */
	protected BigDecimal barPercentage;
	
	protected BigDecimal barThickness;
	
	protected BigDecimal maxBarThickness;
	
	/**
	 * Default {@code offsetGridLines == true}
	 *
	 * @see #setGridLines(GridLines gridLines)
	 */
	protected GridLines gridLines;
	
	/**
	 * @see #setType(String type)
	 */
	public String getType()
	{
		return this.type;
	}
	
	/**
	 * As defined in Scales.
	 */
	public BarScale setType(final String type)
	{
		this.type = type;
		return this;
	}
	
	/**
	 * @see #setCategoryPercentage(BigDecimal categoryPercentage)
	 */
	public BigDecimal getCategoryPercentage()
	{
		return this.categoryPercentage;
	}
	
	/**
	 * Percent (0-1) of the available width (the space between the gridlines for small datasets) for each data-point to
	 * use for the bars.
	 */
	public BarScale setCategoryPercentage(final BigDecimal categoryPercentage)
	{
		this.categoryPercentage = categoryPercentage;
		return this;
	}
	
	/**
	 * @see #setBarPercentage(BigDecimal barPercentage)
	 */
	public BigDecimal getBarPercentage()
	{
		return this.barPercentage;
	}
	
	/**
	 * Percent (0-1) of the available width each bar should be within the category percentage. 1.0 will take the whole
	 * category width and put the bars right next to each other.
	 */
	public BarScale setBarPercentage(final BigDecimal barPercentage)
	{
		this.barPercentage = barPercentage;
		return this;
	}
	
	/**
	 * @see #setBarThickness(BigDecimal)
	 */
	public BigDecimal getBarThickness()
	{
		return this.barThickness;
	}
	
	/**
	 * Manually set width of each bar in pixels. If not set, the base sample widths are calculated automatically so
	 * that
	 * they take the full available widths without overlap. Then, the bars are sized using barPercentage and
	 * categoryPercentage.
	 */
	public BarScale setBarThickness(final BigDecimal barThickness)
	{
		this.barThickness = barThickness;
		return this;
	}
	
	/**
	 * @see #setGridLines(GridLines gridLines)
	 */
	public BigDecimal getMaxBarThickness()
	{
		return this.maxBarThickness;
	}
	
	/**
	 * Set this to ensure that bars are not sized thicker than this.
	 */
	public BarScale setMaxBarThickness(final BigDecimal maxBarThickness)
	{
		this.maxBarThickness = maxBarThickness;
		return this;
	}
}
