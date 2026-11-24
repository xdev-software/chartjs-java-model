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

import software.xdev.chartjs.model.options.animation.DefaultAnimation;
import software.xdev.chartjs.model.options.elements.LineElements;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.5/src/types/index.d.ts#L1892">ChartJS Source</a>
 */
public class LineOptions extends Options<LineOptions, DefaultAnimation>
{
	protected Object borderCapStyle;
	protected Number[] borderDash;
	protected Number borderDashOffset;
	protected Object borderJoinStyle;
	protected Boolean capBezierPoints;
	protected String cubicInterpolationMode;
	protected Number tension;
	protected Object stepped;
	protected Boolean showLine;
	protected Object fill;
	protected Object spanGaps;
	protected LineElements elements;
	
	public Object getBorderCapStyle()
	{
		return this.borderCapStyle;
	}
	
	public LineOptions setBorderCapStyle(final Object borderCapStyle)
	{
		this.borderCapStyle = borderCapStyle;
		return this;
	}
	
	public Number[] getBorderDash()
	{
		return this.borderDash;
	}
	
	public LineOptions setBorderDash(final Number[] borderDash)
	{
		this.borderDash = borderDash;
		return this;
	}
	
	public Number getBorderDashOffset()
	{
		return this.borderDashOffset;
	}
	
	public LineOptions setBorderDashOffset(final Number borderDashOffset)
	{
		this.borderDashOffset = borderDashOffset;
		return this;
	}
	
	public Object getBorderJoinStyle()
	{
		return this.borderJoinStyle;
	}
	
	public LineOptions setBorderJoinStyle(final Object borderJoinStyle)
	{
		this.borderJoinStyle = borderJoinStyle;
		return this;
	}
	
	public Boolean getCapBezierPoints()
	{
		return this.capBezierPoints;
	}
	
	public LineOptions setCapBezierPoints(final Boolean capBezierPoints)
	{
		this.capBezierPoints = capBezierPoints;
		return this;
	}
	
	public String getCubicInterpolationMode()
	{
		return this.cubicInterpolationMode;
	}
	
	public LineOptions setCubicInterpolationMode(final String cubicInterpolationMode)
	{
		this.cubicInterpolationMode = cubicInterpolationMode;
		return this;
	}
	
	public Number getTension()
	{
		return this.tension;
	}
	
	public LineOptions setTension(final Number tension)
	{
		this.tension = tension;
		return this;
	}
	
	public Object getStepped()
	{
		return this.stepped;
	}
	
	public LineOptions setStepped(final Object stepped)
	{
		this.stepped = stepped;
		return this;
	}
	
	public Boolean getShowLine()
	{
		return this.showLine;
	}
	
	public LineOptions setShowLine(final Boolean showLine)
	{
		this.showLine = showLine;
		return this;
	}
	
	public Object getFill()
	{
		return this.fill;
	}
	
	public LineOptions setFill(final Object fill)
	{
		this.fill = fill;
		return this;
	}
	
	public Object getSpanGaps()
	{
		return this.spanGaps;
	}
	
	public LineOptions setSpanGaps(final Object spanGaps)
	{
		this.spanGaps = spanGaps;
		return this;
	}
	
	public LineElements getElements()
	{
		return this.elements;
	}
	
	public LineOptions setElements(final LineElements elements)
	{
		this.elements = elements;
		return this;
	}
}
