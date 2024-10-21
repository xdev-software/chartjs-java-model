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
	protected Number tension;
	protected Object stepped;
	
	/**
	 * @see #setShowLine(Boolean)
	 */
	protected Boolean showLine;
	/**
	 * @see #setSpanGaps(Boolean)
	 */
	protected Boolean spanGaps;
	protected LineElements elements;
	
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
	
	/**
	 * @see #setShowLine(Boolean)
	 */
	public Boolean getShowLine()
	{
		return this.showLine;
	}
	
	/**
	 * <p>
	 * If false, the lines between points are not drawn
	 * </p>
	 *
	 * <p>
	 * Default {@code true}
	 * </p>
	 */
	public LineOptions setShowLine(final Boolean showLine)
	{
		this.showLine = showLine;
		return this;
	}
	
	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps()
	{
		return this.spanGaps;
	}
	
	/**
	 * <p>
	 * If true, NaN data does not break the line
	 * </p>
	 *
	 * <p>
	 * Default {@code false}
	 * </p>
	 */
	public LineOptions setSpanGaps(final Boolean spanGaps)
	{
		this.spanGaps = spanGaps;
		return this;
	}
	
	/**
	 * @return {@link LineElements} instance, or {@code null} if not set
	 */
	public LineElements getElements()
	{
		return this.elements;
	}
	
	/**
	 * @param elements an {@link LineElements} instance, or {@code null}
	 * @return this instance for method chaining
	 */
	public LineOptions setElements(final LineElements elements)
	{
		this.elements = elements;
		return this;
	}
}
