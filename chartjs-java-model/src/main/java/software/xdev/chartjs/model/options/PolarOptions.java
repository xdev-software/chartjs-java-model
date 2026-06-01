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

import software.xdev.chartjs.model.options.animation.PolarAnimation;
import software.xdev.chartjs.model.options.elements.ArcElements;
import software.xdev.chartjs.model.options.scale.radial.RadialLinearScaleOptions;


public class PolarOptions extends Options<PolarOptions, PolarAnimation>
{
	/**
	 * @see #setScale(RadialLinearScaleOptions scale)
	 */
	protected RadialLinearScaleOptions scale;
	
	protected ArcElements elements;
	
	/**
	 * Static factory, constructs a Scale implementation appropriate for a {@link PolarOptions} instance.
	 *
	 * @return a new {@link RadialLinearScaleOptions} instance
	 */
	public static RadialLinearScaleOptions scales()
	{
		return new RadialLinearScaleOptions();
	}
	
	/**
	 * @see #setScale(RadialLinearScaleOptions)
	 */
	public RadialLinearScaleOptions getScale()
	{
		return this.scale;
	}
	
	/**
	 * Options for the one scale used on the chart. Use this to style the ticks, labels, and grid.
	 */
	public PolarOptions setScale(final RadialLinearScaleOptions scale)
	{
		this.scale = scale;
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
	public PolarOptions setElements(final ArcElements elements)
	{
		this.elements = elements;
		return this;
	}
}
