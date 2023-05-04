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

import software.xdev.chart_java.options.ticks.Ticks;


/**
 * The radial linear scale is used specifically for the radar and polar are chart types. It overlays the chart area,
 * rather than being positioned on one of the edges.
 */
public class RadialLinearScale<T extends Ticks<T>> extends Scale<T, RadialLinearScale<T>>
{
	protected Boolean lineArc;
	protected AngleLines angleLines;
	protected PointLabels pointLabels;
	
	public String getType()
	{
		return "radialLinear";
	}
	
	/**
	 * @see #setLineArc(Boolean)
	 */
	public Boolean getLineArc()
	{
		return this.lineArc;
	}
	
	/**
	 * <p>
	 * If true, circular arcs are used else straight lines are used. The former is used by the polar area chart and the
	 * latter by the radar chart
	 * </p>
	 *
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public RadialLinearScale setLineArc(final Boolean lineArc)
	{
		this.lineArc = lineArc;
		return this;
	}
	
	/**
	 * @see #setAngleLines(AngleLines)
	 */
	public AngleLines getAngleLines()
	{
		return this.angleLines;
	}
	
	/**
	 * <p>
	 * See the Angle Line Options section below for details.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public RadialLinearScale setAngleLines(final AngleLines angleLines)
	{
		this.angleLines = angleLines;
		return this;
	}
	
	/**
	 * @see #setPointLabels(PointLabels)
	 */
	public PointLabels getPointLabels()
	{
		return this.pointLabels;
	}
	
	/**
	 * <p>
	 * See the Point Label Options section below for details.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public RadialLinearScale setPointLabels(final PointLabels pointLabels)
	{
		this.pointLabels = pointLabels;
		return this;
	}
}
