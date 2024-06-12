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
package software.xdev.chartjs.model.options.ticks;


public class LinearTicks extends Ticks<LinearTicks>
{
	protected Boolean beginAtZero;
	protected Number min;
	protected Number max;
	protected Number maxTicksLimit;
	protected Number fixedStepSize;
	protected Number stepSize;
	protected Number suggestedMax;
	protected Number suggestedMin;
	
	public Boolean getBeginAtZero()
	{
		return this.beginAtZero;
	}
	
	/**
	 * <p>
	 * if true, scale will inclulde 0 if it is not already included.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public LinearTicks setBeginAtZero(final Boolean beginAtZero)
	{
		this.beginAtZero = beginAtZero;
		return this;
	}
	
	/**
	 * @see #setMin(Number)
	 */
	public Number getMin()
	{
		return this.min;
	}
	
	/**
	 * <p>
	 * User defined minimum number for the scale, overrides minimum value from data.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public LinearTicks setMin(final Number min)
	{
		this.min = min;
		return this;
	}
	
	/**
	 * @see #setMax(Number)
	 */
	public Number getMax()
	{
		return this.max;
	}
	
	/**
	 * <p>
	 * User defined maximum number for the scale, overrides maximum value from data.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public LinearTicks setMax(final Number max)
	{
		this.max = max;
		return this;
	}
	
	/**
	 * @see #setMaxTicksLimit(Number)
	 */
	public Number getMaxTicksLimit()
	{
		return this.maxTicksLimit;
	}
	
	/**
	 * <p>
	 * Maximum number of ticks and gridlines to show. If not defined, it will limit to 11 ticks but will show all
	 * gridlines.
	 * </p>
	 *
	 * <p>
	 * Default {@code 11}
	 * </p>
	 */
	public LinearTicks setMaxTicksLimit(final Number maxTicksLimit)
	{
		this.maxTicksLimit = maxTicksLimit;
		return this;
	}
	
	/**
	 * @see #setFixedStepSize(Number)
	 */
	public Number getFixedStepSize()
	{
		return this.fixedStepSize;
	}
	
	/**
	 * <p>
	 * User defined fixed step size for the scale. If set, the scale ticks will be enumerated by multiple of stepSize,
	 * having one tick per increment. If not set, the ticks are labeled automatically using the nice numbers algorithm.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public LinearTicks setFixedStepSize(final Number fixedStepSize)
	{
		this.fixedStepSize = fixedStepSize;
		return this;
	}
	
	/**
	 * @see #setStepSize(Number)
	 */
	public Number getStepSize()
	{
		return this.stepSize;
	}
	
	/**
	 * <p>
	 * if defined, it can be used along with the min and the max to give a custom number of steps. See the example
	 * below.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public LinearTicks setStepSize(final Number stepSize)
	{
		this.stepSize = stepSize;
		return this;
	}
	
	/**
	 * @see #setSuggestedMax(Number)
	 */
	public Number getSuggestedMax()
	{
		return this.suggestedMax;
	}
	
	/**
	 * <p>
	 * User defined maximum number for the scale, overrides maximum value except for if it is lower than the maximum
	 * value.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public LinearTicks setSuggestedMax(final Number suggestedMax)
	{
		this.suggestedMax = suggestedMax;
		return this;
	}
	
	/**
	 * @see #setSuggestedMin(Number)
	 */
	public Number getSuggestedMin()
	{
		return this.suggestedMin;
	}
	
	/**
	 * <p>
	 * User defined minimum number for the scale, overrides minimum value except for if it is higher than the minimum
	 * value.
	 * </p>
	 *
	 * <p>
	 * Default {@code -}
	 * </p>
	 */
	public LinearTicks setSuggestedMin(final Number suggestedMin)
	{
		this.suggestedMin = suggestedMin;
		return this;
	}
}
