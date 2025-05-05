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

import java.util.ArrayList;
import java.util.List;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.4/src/types/index.d.ts#L401">ChartJS Source</a>
 */
public class RadarDataset extends PointDataset<RadarDataset, Number> implements NumberDataset<RadarDataset>
{
	protected String xAxisID;
	protected String yAxisID;
	protected Object spanGaps;
	protected Boolean showLine;
	
	private final List<Integer> hitRadius = new ArrayList<>();
	
	@Override
	protected String defaultType()
	{
		return "radar";
	}
	
	public String getXAxisID()
	{
		return this.xAxisID;
	}
	
	public RadarDataset setXAxisID(final String xAxisID)
	{
		this.xAxisID = xAxisID;
		return this;
	}
	
	public String getYAxisID()
	{
		return this.yAxisID;
	}
	
	public RadarDataset setYAxisID(final String yAxisID)
	{
		this.yAxisID = yAxisID;
		return this;
	}
	
	public Object getSpanGaps()
	{
		return this.spanGaps;
	}
	
	public RadarDataset setSpanGaps(final Object spanGaps)
	{
		this.spanGaps = spanGaps;
		return this;
	}
	
	public Boolean getShowLine()
	{
		return this.showLine;
	}
	
	public RadarDataset setShowLine(final Boolean showLine)
	{
		this.showLine = showLine;
		return this;
	}
	
	public List<Integer> getHitRadius()
	{
		return this.hitRadius;
	}
	
	public RadarDataset addHitRadius(final Integer hitRadius)
	{
		this.hitRadius.add(hitRadius);
		return this;
	}
	
	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	public RadarDataset setHitRadius(final List<Integer> hitRadius)
	{
		this.hitRadius.clear();
		if(hitRadius != null)
		{
			this.hitRadius.addAll(hitRadius);
		}
		return this;
	}
}
