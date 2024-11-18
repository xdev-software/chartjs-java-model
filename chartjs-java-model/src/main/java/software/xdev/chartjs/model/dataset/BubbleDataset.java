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
import software.xdev.chartjs.model.objects.OptionalArray;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.4/src/types/index.d.ts#L165">ChartJS Source</a>
 */
public class BubbleDataset extends BackgroundBorderHoverDataset<BubbleDataset, BubbleDataPoint>
{
	protected String xAxisID;
	protected String yAxisID;
	
	protected final List<Integer> hoverRadius = new OptionalArray<>();
	
	protected Object pointStyle;
	
	@Override
	protected String defaultType()
	{
		return "bubble";
	}
	
	public String getXAxisID()
	{
		return this.xAxisID;
	}
	
	public BubbleDataset setXAxisID(final String xAxisID)
	{
		this.xAxisID = xAxisID;
		return this;
	}
	
	public String getYAxisID()
	{
		return this.yAxisID;
	}
	
	public BubbleDataset setYAxisID(final String yAxisID)
	{
		this.yAxisID = yAxisID;
		return this;
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
	
	public Object getPointStyle()
	{
		return this.pointStyle;
	}
	
	public BubbleDataset setPointStyle(final Object pointStyle)
	{
		this.pointStyle = pointStyle;
		return this;
	}
}
