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
package software.xdev.chartjs.model.options.scales;

import java.util.List;

import software.xdev.chartjs.model.color.Color;
import software.xdev.chartjs.model.objects.OptionalArray;


/**
 * The grid line configuration is nested under the scale configuration in the gridLines key. It defines options for the
 * grid lines that run perpendicular to the axis.
 */
public class GridLines
{
	protected final List<Color> color = new OptionalArray<>();
	protected final List<Integer> lineWidth = new OptionalArray<>();
	protected Boolean display;
	protected Boolean drawBorder;
	protected Boolean drawOnChartArea;
	protected Boolean drawTicks;
	protected Integer tickMarkLength;
	protected Integer zeroLineWidth;
	protected Color zeroLineColor;
	protected Boolean offsetGridLines;
	
	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	/**
	 * <p>
	 *
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public GridLines setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	/**
	 * @see #setColor(List)
	 */
	public List<Color> getColor()
	{
		return this.color;
	}
	
	/**
	 * <p>
	 * Color of the grid lines.
	 * </p>
	 *
	 * <p>
	 * Default {@code "rgba(0, 0, 0, 0.1)"}
	 * </p>
	 */
	public GridLines setColor(final List<Color> color)
	{
		this.color.clear();
		if(color != null)
		{
			this.color.addAll(color);
		}
		return this;
	}
	
	/**
	 * @see #setColor(List)
	 */
	public GridLines addColor(final Color color)
	{
		this.color.add(color);
		return this;
	}
	
	/**
	 * @see #setLineWidth(List)
	 */
	public List<Integer> getLineWidth()
	{
		return this.lineWidth;
	}
	
	/**
	 * <p>
	 * Stroke width of grid lines
	 * </p>
	 *
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public GridLines setLineWidth(final List<Integer> lineWidth)
	{
		this.lineWidth.clear();
		if(lineWidth != null)
		{
			this.lineWidth.addAll(lineWidth);
		}
		return this;
	}
	
	/**
	 * @see #setLineWidth(List)
	 */
	public GridLines addColor(final Integer lineWidth)
	{
		this.lineWidth.add(lineWidth);
		return this;
	}
	
	/**
	 * @see #setDrawBorder(Boolean)
	 */
	public Boolean getDrawBorder()
	{
		return this.drawBorder;
	}
	
	/**
	 * <p>
	 * If true draw border on the edge of the chart
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public GridLines setDrawBorder(final Boolean drawBorder)
	{
		this.drawBorder = drawBorder;
		return this;
	}
	
	/**
	 * @see #setDrawOnChartArea(Boolean)
	 */
	public Boolean getDrawOnChartArea()
	{
		return this.drawOnChartArea;
	}
	
	/**
	 * <p>
	 * If true, draw lines on the chart area inside the axis lines. This is useful when there are multiple axes and you
	 * need to control which grid lines are drawn
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public GridLines setDrawOnChartArea(final Boolean drawOnChartArea)
	{
		this.drawOnChartArea = drawOnChartArea;
		return this;
	}
	
	/**
	 * @see #setDrawTicks(Boolean)
	 */
	public Boolean getDrawTicks()
	{
		return this.drawTicks;
	}
	
	/**
	 * <p>
	 * If true, draw lines beside the ticks in the axis area beside the chart.
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public GridLines setDrawTicks(final Boolean drawTicks)
	{
		this.drawTicks = drawTicks;
		return this;
	}
	
	/**
	 * @see #setTickMarkLength(Integer)
	 */
	public Integer getTickMarkLength()
	{
		return this.tickMarkLength;
	}
	
	/**
	 * <p>
	 * Length in pixels that the grid lines will draw into the axis area.
	 * </p>
	 *
	 * <p>
	 * Default {@code 10}
	 * </p>
	 */
	public GridLines setTickMarkLength(final Integer tickMarkLength)
	{
		this.tickMarkLength = tickMarkLength;
		return this;
	}
	
	/**
	 * @see #setZeroLineWidth(Integer)
	 */
	public Integer getZeroLineWidth()
	{
		return this.zeroLineWidth;
	}
	
	/**
	 * <p>
	 * Stroke width of the grid line for the first index (index 0).
	 * </p>
	 *
	 * <p>
	 * Default {@code 1}
	 * </p>
	 */
	public GridLines setZeroLineWidth(final Integer zeroLineWidth)
	{
		this.zeroLineWidth = zeroLineWidth;
		return this;
	}
	
	/**
	 * @see #setZeroLineColor(Color)
	 */
	public Color getZeroLineColor()
	{
		return this.zeroLineColor;
	}
	
	/**
	 * <p>
	 * Stroke color of the grid line for the first index (index 0).
	 * </p>
	 *
	 * <p>
	 * Default {@code "rgba(0, 0, 0, 0.25)"}
	 * </p>
	 */
	public GridLines setZeroLineColor(final Color zeroLineColor)
	{
		this.zeroLineColor = zeroLineColor;
		return this;
	}
	
	/**
	 * @see #setOffsetGridLines(Boolean)
	 */
	public Boolean getOffsetGridLines()
	{
		return this.offsetGridLines;
	}
	
	/**
	 * <p>
	 * If true, labels are shifted to be between grid lines. This is used in the bar chart.
	 * </p>
	 *
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public GridLines setOffsetGridLines(final Boolean offsetGridLines)
	{
		this.offsetGridLines = offsetGridLines;
		return this;
	}
}
