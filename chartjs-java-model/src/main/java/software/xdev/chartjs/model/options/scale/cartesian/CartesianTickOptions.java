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

import software.xdev.chartjs.model.options.scale.TickOptions;


/**
 * Common tick options to all cartesian axes
 *
 * @see <a href="https://www.chartjs.org/docs/latest/axes/cartesian/#common-tick-options-to-all-axes">ChartJS docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3090">ChartJS source</a>
 */
public class CartesianTickOptions<T extends CartesianTickOptions<T>> extends TickOptions<T>
{
	protected String align;
	protected String crossAlign;
	protected Number sampleSize;
	protected Boolean autoSkip;
	protected Number autoSkipPadding;
	protected Boolean includeBounds;
	protected Number labelOffset;
	protected Number maxRotation;
	protected Number minRotation;
	protected Boolean mirror;
	// padding is already present in parent
	protected Number maxTicksLimit;
	
	public String getAlign()
	{
		return this.align;
	}
	
	public T setAlign(final String align)
	{
		this.align = align;
		return this.self();
	}
	
	public String getCrossAlign()
	{
		return this.crossAlign;
	}
	
	public T setCrossAlign(final String crossAlign)
	{
		this.crossAlign = crossAlign;
		return this.self();
	}
	
	public Number getSampleSize()
	{
		return this.sampleSize;
	}
	
	public T setSampleSize(final Number sampleSize)
	{
		this.sampleSize = sampleSize;
		return this.self();
	}
	
	public Boolean getAutoSkip()
	{
		return this.autoSkip;
	}
	
	public T setAutoSkip(final Boolean autoSkip)
	{
		this.autoSkip = autoSkip;
		return this.self();
	}
	
	public Number getAutoSkipPadding()
	{
		return this.autoSkipPadding;
	}
	
	public T setAutoSkipPadding(final Number autoSkipPadding)
	{
		this.autoSkipPadding = autoSkipPadding;
		return this.self();
	}
	
	public Boolean getIncludeBounds()
	{
		return this.includeBounds;
	}
	
	public T setIncludeBounds(final Boolean includeBounds)
	{
		this.includeBounds = includeBounds;
		return this.self();
	}
	
	public Number getLabelOffset()
	{
		return this.labelOffset;
	}
	
	public T setLabelOffset(final Number labelOffset)
	{
		this.labelOffset = labelOffset;
		return this.self();
	}
	
	public Number getMaxRotation()
	{
		return this.maxRotation;
	}
	
	public T setMaxRotation(final Number maxRotation)
	{
		this.maxRotation = maxRotation;
		return this.self();
	}
	
	public Number getMinRotation()
	{
		return this.minRotation;
	}
	
	public T setMinRotation(final Number minRotation)
	{
		this.minRotation = minRotation;
		return this.self();
	}
	
	public Boolean getMirror()
	{
		return this.mirror;
	}
	
	public T setMirror(final Boolean mirror)
	{
		this.mirror = mirror;
		return this.self();
	}
	
	public Number getMaxTicksLimit()
	{
		return this.maxTicksLimit;
	}
	
	public T setMaxTicksLimit(final Number maxTicksLimit)
	{
		this.maxTicksLimit = maxTicksLimit;
		return this.self();
	}
}
