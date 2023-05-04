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
package software.xdev.chart_java.dataset;

import java.util.List;

import software.xdev.chart_java.color.Color;
import software.xdev.chart_java.datapoint.BubbleDataPoint;
import software.xdev.chart_java.objects.OptionalArray;


/**
 * <p>
 * A collection of data points for a bubble chart.
 * </p>
 *
 * <p>
 * For best results, ensure that each property is set with a list of equal length.
 * </p>
 */
public class BubbleDataset extends RoundDataset<BubbleDataset, BubbleDataPoint>
{
	
	/**
	 * @see #setHoverRadius(List)
	 */
	private final List<Integer> hoverRadius = new OptionalArray<>();
	
	/**
	 * <p>
	 * The fill color of the bubbles.
	 * </p>
	 *
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the backgroundColor at its corresponding index.
	 * </p>
	 */
	@Override
	public BubbleDataset setBackgroundColor(final List<Color> backgroundColor)
	{
		return super.setBackgroundColor(backgroundColor);
	}
	
	/**
	 * <p>
	 * The stroke color of the bubbles.
	 * </p>
	 *
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the borderColor at its corresponding index.
	 * </p>
	 */
	@Override
	public BubbleDataset setBorderColor(final List<Color> borderColor)
	{
		return super.setBorderColor(borderColor);
	}
	
	/**
	 * <p>
	 * The stroke width of bubble in pixels.
	 * </p>
	 *
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the borderWidth at the its corresponding index.
	 * </p>
	 */
	@Override
	public BubbleDataset setBorderWidth(final List<Integer> borderWidth)
	{
		return super.setBorderWidth(borderWidth);
	}
	
	/**
	 * <p>
	 * The fill color of the bubbles when hovered.
	 * </p>
	 *
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the hoverBackgroundColor at its corresponding index.
	 * </p>
	 */
	@Override
	public BubbleDataset setHoverBackgroundColor(final List<Color> hoverBackgroundColor)
	{
		return super.setHoverBackgroundColor(hoverBackgroundColor);
	}
	
	/**
	 * <p>
	 * The stroke color of the bubbles when hovered.
	 * </p>
	 *
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the hoverBorderColor at its corresponding index.
	 * </p>
	 */
	@Override
	public BubbleDataset setHoverBorderColor(final List<Color> hoverBorderColor)
	{
		return super.setHoverBorderColor(hoverBorderColor);
	}
	
	/**
	 * <p>
	 * The stroke width of the bubbles when hovered.
	 * </p>
	 *
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the hoverBorderWidth at its corresponding index.
	 * </p>
	 */
	@Override
	public BubbleDataset setHoverBorderWidth(final List<Integer> hoverBorderWidth)
	{
		return super.setHoverBorderWidth(hoverBorderWidth);
	}
	
	/**
	 * <p>
	 * Additional radius to add to data radius on hover.
	 * </p>
	 *
	 * <p>
	 * Each BubbleDataPoint in this BubbleDataset uses the hoverRadius at its corresponding index.
	 * </p>
	 */
	public BubbleDataset setHoverRadius(final List<Integer> hoverRadius)
	{
		this.hoverRadius.clear();
		if(hoverRadius != null)
		{
			this.hoverRadius.addAll(hoverRadius);
		}
		return this;
	}
	
	/**
	 * @see BubbleDataset#setHoverRadius(List)
	 */
	public BubbleDataset addHoverRadius(final Integer hoverRadius)
	{
		this.hoverRadius.add(hoverRadius);
		return this;
	}
}
