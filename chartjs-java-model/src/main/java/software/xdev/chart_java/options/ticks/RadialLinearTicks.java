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
package software.xdev.chart_java.options.ticks;

import java.math.BigDecimal;

import software.xdev.chart_java.color.Color;


public class RadialLinearTicks extends Ticks<RadialLinearTicks>
{
	
	/**
	 * Default {@code 'rgba(255, 255, 255, 0.75)'}
	 *
	 * @see #setBackdropColor(Color backdropColor)
	 */
	protected Color backdropColor;
	
	/**
	 * Default {@code 2}
	 *
	 * @see #setBackdropPaddingX(BigDecimal backdropPaddingX)
	 */
	protected BigDecimal backdropPaddingX;
	
	/**
	 * Default {@code 2}
	 *
	 * @see #setBackdropPaddingY(BigDecimal backdropPaddingY)
	 */
	protected BigDecimal backdropPaddingY;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setBeginAtZero(Boolean beginAtZero)
	 */
	protected Boolean beginAtZero;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setMin(BigDecimal min)
	 */
	protected BigDecimal min;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setMax(BigDecimal max)
	 */
	protected BigDecimal max;
	
	/**
	 * Default {@code 11}
	 *
	 * @see #setMaxTicksLimit(BigDecimal maxTicksLimit)
	 */
	protected BigDecimal maxTicksLimit;
	
	/**
	 * Default {@code true}
	 *
	 * @see #setShowLabelBackdrop(Boolean showLabelBackdrop)
	 */
	protected Boolean showLabelBackdrop;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setStepSize(BigDecimal fixedStepSize)
	 */
	protected BigDecimal fixedStepSize;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setStepSize(BigDecimal stepSize)
	 */
	protected BigDecimal stepSize;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setSuggestedMax(BigDecimal suggestedMax)
	 */
	protected BigDecimal suggestedMax;
	
	/**
	 * Default {@code -}
	 *
	 * @see #setSuggestedMin(BigDecimal suggestedMin)
	 */
	protected BigDecimal suggestedMin;
	
	/**
	 * @see #setBackdropColor(Color backdropColor)
	 */
	public Color getBackdropColor()
	{
		return this.backdropColor;
	}
	
	/**
	 * Color of label backdrops
	 */
	public RadialLinearTicks setBackdropColor(final Color backdropColor)
	{
		this.backdropColor = backdropColor;
		return this;
	}
	
	/**
	 * @see #setBackdropPaddingX(BigDecimal backdropPaddingX)
	 */
	public BigDecimal getBackdropPaddingX()
	{
		return this.backdropPaddingX;
	}
	
	/**
	 * Horizontal padding of label backdrop
	 */
	public RadialLinearTicks setBackdropPaddingX(final BigDecimal backdropPaddingX)
	{
		this.backdropPaddingX = backdropPaddingX;
		return this;
	}
	
	/**
	 * @see #setBackdropPaddingY(BigDecimal backdropPaddingY)
	 */
	public BigDecimal getBackdropPaddingY()
	{
		return this.backdropPaddingY;
	}
	
	/**
	 * Vertical padding of label backdrop
	 */
	public RadialLinearTicks setBackdropPaddingY(final BigDecimal backdropPaddingY)
	{
		this.backdropPaddingY = backdropPaddingY;
		return this;
	}
	
	/**
	 * @see #setBeginAtZero(Boolean beginAtZero)
	 */
	public Boolean getBeginAtZero()
	{
		return this.beginAtZero;
	}
	
	/**
	 * if true, scale will inclulde 0 if it is not already included.
	 */
	public RadialLinearTicks setBeginAtZero(final Boolean beginAtZero)
	{
		this.beginAtZero = beginAtZero;
		return this;
	}
	
	/**
	 * @see #setMin(BigDecimal min)
	 */
	public BigDecimal getMin()
	{
		return this.min;
	}
	
	/**
	 * User defined minimum number for the scale, overrides minimum value from data.
	 */
	public RadialLinearTicks setMin(final BigDecimal min)
	{
		this.min = min;
		return this;
	}
	
	/**
	 * @see #setMax(BigDecimal max)
	 */
	public BigDecimal getMax()
	{
		return this.max;
	}
	
	/**
	 * User defined maximum number for the scale, overrides maximum value from data.
	 */
	public RadialLinearTicks setMax(final BigDecimal max)
	{
		this.max = max;
		return this;
	}
	
	/**
	 * @see #setMaxTicksLimit(BigDecimal maxTicksLimit)
	 */
	public BigDecimal getMaxTicksLimit()
	{
		return this.maxTicksLimit;
	}
	
	/**
	 * Maximum number of ticks and gridlines to show. If not defined, it will limit to 11 ticks but will show all
	 * gridlines.
	 */
	public RadialLinearTicks setMaxTicksLimit(final BigDecimal maxTicksLimit)
	{
		this.maxTicksLimit = maxTicksLimit;
		return this;
	}
	
	/**
	 * @see #setShowLabelBackdrop(Boolean showLabelBackdrop)
	 */
	public Boolean getShowLabelBackdrop()
	{
		return this.showLabelBackdrop;
	}
	
	/**
	 * If true, draw a background behind the tick labels
	 */
	public RadialLinearTicks setShowLabelBackdrop(final Boolean showLabelBackdrop)
	{
		this.showLabelBackdrop = showLabelBackdrop;
		return this;
	}
	
	/**
	 * @see #setStepSize(BigDecimal fixedStepSize)
	 */
	public BigDecimal getFixedStepSize()
	{
		return this.fixedStepSize;
	}
	
	/**
	 * User defined fixed step size for the scale. If set, the scale ticks will be enumerated by multiple of stepSize,
	 * having one tick per increment. If not set, the ticks are labeled automatically using the nice numbers algorithm.
	 */
	public RadialLinearTicks setFixedStepSize(final BigDecimal fixedStepSize)
	{
		this.fixedStepSize = fixedStepSize;
		return this;
	}
	
	/**
	 * @see #setStepSize(BigDecimal stepSize)
	 */
	public BigDecimal getStepSize()
	{
		return this.stepSize;
	}
	
	/**
	 * if defined, it can be used along with the min and the max to give a custom number of steps. See the example
	 * below.
	 */
	public RadialLinearTicks setStepSize(final BigDecimal stepSize)
	{
		this.stepSize = stepSize;
		return this;
	}
	
	/**
	 * @see #setSuggestedMax(BigDecimal suggestedMax)
	 */
	public BigDecimal getSuggestedMax()
	{
		return this.suggestedMax;
	}
	
	/**
	 * User defined maximum number for the scale, overrides maximum value except for if it is lower than the maximum
	 * value.
	 */
	public RadialLinearTicks setSuggestedMax(final BigDecimal suggestedMax)
	{
		this.suggestedMax = suggestedMax;
		return this;
	}
	
	/**
	 * @see #setSuggestedMin(BigDecimal suggestedMin)
	 */
	public BigDecimal getSuggestedMin()
	{
		return this.suggestedMin;
	}
	
	/**
	 * User defined minimum number for the scale, overrides minimum value except for if it is higher than the minimum
	 * value.
	 */
	public RadialLinearTicks setSuggestedMin(final BigDecimal suggestedMin)
	{
		this.suggestedMin = suggestedMin;
		return this;
	}
}
