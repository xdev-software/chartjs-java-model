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

import software.xdev.chartjs.model.enums.BorderSkipped;
import software.xdev.chartjs.model.enums.PointStyle;
import software.xdev.chartjs.model.objects.OptionalArray;


/**
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.4/src/types/index.d.ts#L114">ChartJS Source</a>
 */
public class BarDataset extends BackgroundBorderHoverDataset<BarDataset, Number>
	implements NumberDataset<BarDataset>
{
	protected String xAxisID;
	protected String yAxisID;
	protected Number barPercentage;
	protected Number categoryPercentage;
	protected Object barThickness;
	protected Number maxBarThickness;
	protected Number minBarLength;
	protected PointStyle pointStyle;
	protected Boolean grouped;
	
	protected final List<BorderSkipped> borderSkipped = new OptionalArray<>();
	
	@Override
	protected String defaultType()
	{
		return "bar";
	}
	
	public String getXAxisID()
	{
		return this.xAxisID;
	}
	
	public BarDataset setXAxisID(final String xAxisID)
	{
		this.xAxisID = xAxisID;
		return this;
	}
	
	public String getYAxisID()
	{
		return this.yAxisID;
	}
	
	public BarDataset setYAxisID(final String yAxisID)
	{
		this.yAxisID = yAxisID;
		return this;
	}
	
	public Number getBarPercentage()
	{
		return this.barPercentage;
	}
	
	public BarDataset setBarPercentage(final Number barPercentage)
	{
		this.barPercentage = barPercentage;
		return this;
	}
	
	public Number getCategoryPercentage()
	{
		return this.categoryPercentage;
	}
	
	public BarDataset setCategoryPercentage(final Number categoryPercentage)
	{
		this.categoryPercentage = categoryPercentage;
		return this;
	}
	
	public Object getBarThickness()
	{
		return this.barThickness;
	}
	
	public BarDataset setBarThickness(final Object barThickness)
	{
		this.barThickness = barThickness;
		return this;
	}
	
	public Number getMaxBarThickness()
	{
		return this.maxBarThickness;
	}
	
	public BarDataset setMaxBarThickness(final Number maxBarThickness)
	{
		this.maxBarThickness = maxBarThickness;
		return this;
	}
	
	public Number getMinBarLength()
	{
		return this.minBarLength;
	}
	
	public BarDataset setMinBarLength(final Number minBarLength)
	{
		this.minBarLength = minBarLength;
		return this;
	}
	
	public PointStyle getPointStyle()
	{
		return this.pointStyle;
	}
	
	public BarDataset setPointStyle(final PointStyle pointStyle)
	{
		this.pointStyle = pointStyle;
		return this;
	}
	
	public Boolean getGrouped()
	{
		return this.grouped;
	}
	
	public BarDataset setGrouped(final Boolean grouped)
	{
		this.grouped = grouped;
		return this;
	}
	
	public List<BorderSkipped> getBorderSkipped()
	{
		return this.borderSkipped;
	}
	
	public BarDataset addBorderSkipped(final BorderSkipped borderSkipped)
	{
		this.borderSkipped.add(borderSkipped);
		return this;
	}
	
	public BarDataset setBorderSkipped(final List<BorderSkipped> borderSkipped)
	{
		this.borderSkipped.clear();
		if(borderSkipped != null)
		{
			this.borderSkipped.addAll(borderSkipped);
		}
		return this;
	}
}
