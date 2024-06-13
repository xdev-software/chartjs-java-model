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
package software.xdev.chartjs.model.options.scale;

import software.xdev.chartjs.model.javascript.JavaScriptFunction;


/**
 * Common options to all axes
 * @see <a href="https://www.chartjs.org/docs/latest/axes/#common-options-to-all-axes">ChartJS Docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L1159">ChartJS source</a>
 */
public abstract class AbstractCoreScaleOptions<S extends AbstractCoreScaleOptions<S, T>,
	T extends AbstractTickOptions<?>>
{
	protected String type;
	
	protected Object display;
	protected Boolean alignToPixels;
	protected String backgroundColor;
	protected Boolean reverse;
	protected Boolean clip;
	protected Number weight;
	protected Object min;
	protected Object max;
	protected Object stacked;
	protected Object suggestedMax;
	protected Object suggestedMin;
	
	protected T ticks;
	
	protected JavaScriptFunction beforeUpdate;
	protected JavaScriptFunction beforeSetDimensions;
	protected JavaScriptFunction afterSetDimensions;
	protected JavaScriptFunction beforeDataLimits;
	protected JavaScriptFunction afterDataLimits;
	protected JavaScriptFunction beforeBuildTicks;
	protected JavaScriptFunction afterBuildTicks;
	protected JavaScriptFunction beforeTickToLabelConversion;
	protected JavaScriptFunction afterTickToLabelConversion;
	protected JavaScriptFunction beforeCalculateLabelRotation;
	protected JavaScriptFunction afterCalculateLabelRotation;
	protected JavaScriptFunction beforeFit;
	protected JavaScriptFunction afterFit;
	protected JavaScriptFunction afterUpdate;
	
	protected AbstractCoreScaleOptions(final String type)
	{
		this.type = type;
	}
	
	@SuppressWarnings("unchecked")
	protected S self()
	{
		return (S)this;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public S setType(final String type)
	{
		this.type = type;
		return this.self();
	}
	
	public Object getDisplay()
	{
		return this.display;
	}
	
	public S setDisplay(final Object display)
	{
		this.display = display;
		return this.self();
	}
	
	public Boolean getAlignToPixels()
	{
		return this.alignToPixels;
	}
	
	public S setAlignToPixels(final Boolean alignToPixels)
	{
		this.alignToPixels = alignToPixels;
		return this.self();
	}
	
	public String getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	public S setBackgroundColor(final String backgroundColor)
	{
		this.backgroundColor = backgroundColor;
		return this.self();
	}
	
	public Boolean getReverse()
	{
		return this.reverse;
	}
	
	public S setReverse(final Boolean reverse)
	{
		this.reverse = reverse;
		return this.self();
	}
	
	public Boolean getClip()
	{
		return this.clip;
	}
	
	public S setClip(final Boolean clip)
	{
		this.clip = clip;
		return this.self();
	}
	
	public Number getWeight()
	{
		return this.weight;
	}
	
	public S setWeight(final Number weight)
	{
		this.weight = weight;
		return this.self();
	}
	
	public Object getMin()
	{
		return this.min;
	}
	
	public S setMin(final Number min)
	{
		this.min = min;
		return this.self();
	}
	
	public Object getMax()
	{
		return this.max;
	}
	
	public S setMax(final Number max)
	{
		this.max = max;
		return this.self();
	}
	
	public Object getStacked()
	{
		return this.stacked;
	}
	
	public S setStacked(final Object stacked)
	{
		this.stacked = stacked;
		return this.self();
	}
	
	public Object getSuggestedMax()
	{
		return this.suggestedMax;
	}
	
	public S setSuggestedMax(final Number suggestedMax)
	{
		this.suggestedMax = suggestedMax;
		return this.self();
	}
	
	public Object getSuggestedMin()
	{
		return this.suggestedMin;
	}
	
	public S setSuggestedMin(final Number suggestedMin)
	{
		this.suggestedMin = suggestedMin;
		return this.self();
	}
	
	public T getTicks()
	{
		return this.ticks;
	}
	
	public S setTicks(final T ticks)
	{
		this.ticks = ticks;
		return this.self();
	}
	
	public JavaScriptFunction getBeforeUpdate()
	{
		return this.beforeUpdate;
	}
	
	public S setBeforeUpdate(final JavaScriptFunction beforeUpdate)
	{
		this.beforeUpdate = beforeUpdate;
		return this.self();
	}
	
	public JavaScriptFunction getBeforeSetDimensions()
	{
		return this.beforeSetDimensions;
	}
	
	public S setBeforeSetDimensions(final JavaScriptFunction beforeSetDimensions)
	{
		this.beforeSetDimensions = beforeSetDimensions;
		return this.self();
	}
	
	public JavaScriptFunction getAfterSetDimensions()
	{
		return this.afterSetDimensions;
	}
	
	public S setAfterSetDimensions(final JavaScriptFunction afterSetDimensions)
	{
		this.afterSetDimensions = afterSetDimensions;
		return this.self();
	}
	
	public JavaScriptFunction getBeforeDataLimits()
	{
		return this.beforeDataLimits;
	}
	
	public S setBeforeDataLimits(final JavaScriptFunction beforeDataLimits)
	{
		this.beforeDataLimits = beforeDataLimits;
		return this.self();
	}
	
	public JavaScriptFunction getAfterDataLimits()
	{
		return this.afterDataLimits;
	}
	
	public S setAfterDataLimits(final JavaScriptFunction afterDataLimits)
	{
		this.afterDataLimits = afterDataLimits;
		return this.self();
	}
	
	public JavaScriptFunction getBeforeBuildTicks()
	{
		return this.beforeBuildTicks;
	}
	
	public S setBeforeBuildTicks(final JavaScriptFunction beforeBuildTicks)
	{
		this.beforeBuildTicks = beforeBuildTicks;
		return this.self();
	}
	
	public JavaScriptFunction getAfterBuildTicks()
	{
		return this.afterBuildTicks;
	}
	
	public S setAfterBuildTicks(final JavaScriptFunction afterBuildTicks)
	{
		this.afterBuildTicks = afterBuildTicks;
		return this.self();
	}
	
	public JavaScriptFunction getBeforeTickToLabelConversion()
	{
		return this.beforeTickToLabelConversion;
	}
	
	public S setBeforeTickToLabelConversion(final JavaScriptFunction beforeTickToLabelConversion)
	{
		this.beforeTickToLabelConversion = beforeTickToLabelConversion;
		return this.self();
	}
	
	public JavaScriptFunction getAfterTickToLabelConversion()
	{
		return this.afterTickToLabelConversion;
	}
	
	public S setAfterTickToLabelConversion(final JavaScriptFunction afterTickToLabelConversion)
	{
		this.afterTickToLabelConversion = afterTickToLabelConversion;
		return this.self();
	}
	
	public JavaScriptFunction getBeforeCalculateLabelRotation()
	{
		return this.beforeCalculateLabelRotation;
	}
	
	public S setBeforeCalculateLabelRotation(final JavaScriptFunction beforeCalculateLabelRotation)
	{
		this.beforeCalculateLabelRotation = beforeCalculateLabelRotation;
		return this.self();
	}
	
	public JavaScriptFunction getAfterCalculateLabelRotation()
	{
		return this.afterCalculateLabelRotation;
	}
	
	public S setAfterCalculateLabelRotation(final JavaScriptFunction afterCalculateLabelRotation)
	{
		this.afterCalculateLabelRotation = afterCalculateLabelRotation;
		return this.self();
	}
	
	public JavaScriptFunction getBeforeFit()
	{
		return this.beforeFit;
	}
	
	public S setBeforeFit(final JavaScriptFunction beforeFit)
	{
		this.beforeFit = beforeFit;
		return this.self();
	}
	
	public JavaScriptFunction getAfterFit()
	{
		return this.afterFit;
	}
	
	public S setAfterFit(final JavaScriptFunction afterFit)
	{
		this.afterFit = afterFit;
		return this.self();
	}
	
	public JavaScriptFunction getAfterUpdate()
	{
		return this.afterUpdate;
	}
	
	public S setAfterUpdate(final JavaScriptFunction afterUpdate)
	{
		this.afterUpdate = afterUpdate;
		return this.self();
	}
}
