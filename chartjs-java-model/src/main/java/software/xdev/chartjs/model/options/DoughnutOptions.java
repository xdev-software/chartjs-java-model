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

import software.xdev.chartjs.model.options.animation.DoughnutAnimation;
import software.xdev.chartjs.model.options.elements.ArcElements;


public class DoughnutOptions extends Options<DoughnutOptions, DoughnutAnimation>
{
	/**
	 * Default {@code 50}
	 *
	 * @see #setCutout(Number cutout)
	 */
	protected Number cutout;
	
	/**
	 * Rotation in degrees. Default {@code 0}. {@code 0} is at the top.
	 *
	 * @see #setRotation(Number rotation)
	 */
	protected Number rotation;
	
	/**
	 * Circumference in degrees. Default {@code 360}.
	 *
	 * @see #setCircumference(Number circumference)
	 */
	protected Number circumference;
	
	protected ArcElements elements;
	
	/**
	 * @see #setCutout(Number cutoutPercentage)
	 */
	public Number getCutout()
	{
		return this.cutout;
	}
	
	/**
	 * The pixels as number of the chart that is cut out of the middle.
	 */
	public DoughnutOptions setCutout(final Number cutout)
	{
		this.cutout = cutout;
		return this;
	}
	
	/**
	 * @see #setRotation(Number rotation)
	 */
	public Number getRotation()
	{
		return this.rotation;
	}
	
	/**
	 * Starting angle to draw arcs from in degrees
	 */
	public DoughnutOptions setRotation(final Number rotation)
	{
		this.rotation = rotation;
		return this;
	}
	
	/**
	 * @see #setCircumference(Number circumference)
	 */
	public Number getCircumference()
	{
		return this.circumference;
	}
	
	/**
	 * Sweep to allow arcs to cover in degrees
	 */
	public DoughnutOptions setCircumference(final Number circumference)
	{
		this.circumference = circumference;
		return this;
	}
	
	/**
	 * @return {@link ArcElements} instance, or {@code null} if not set
	 */
	public ArcElements getElements()
	{
		return this.elements;
	}
	
	/**
	 * @param elements an {@link ArcElements} instance, or {@code null}
	 * @return this instance for method chaining
	 */
	public DoughnutOptions setElements(final ArcElements elements)
	{
		this.elements = elements;
		return this;
	}
}
