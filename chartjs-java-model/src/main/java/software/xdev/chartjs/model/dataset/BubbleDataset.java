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
package software.xdev.chartjs.model.dataset;

import java.util.List;

import software.xdev.chartjs.model.datapoint.BubbleDataPoint;
import software.xdev.chartjs.model.enums.PointStyle;
import software.xdev.chartjs.model.objects.OptionalArray;


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
	private final List<Integer> hoverRadius = new OptionalArray<>();
        
        private  PointStyle pointStyle;
	
	@Override
	protected String defaultType()
	{
		return "bubble";
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
	
	public List<Integer> getHoverRadius()
	{
		return this.hoverRadius;
	}

        public PointStyle getPointStyle()
        {
          return pointStyle;
        }

        public BubbleDataset setPointStyle(final PointStyle pointStyle)
        {
          this.pointStyle = pointStyle;
          return this;
        }
}
