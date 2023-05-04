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
package software.xdev.chart_java.charts;

import software.xdev.chart_java.data.Data;
import software.xdev.chart_java.data.DoughnutData;
import software.xdev.chart_java.options.DoughnutOptions;
import software.xdev.chart_java.options.Options;


public class DoughnutChart extends AbstractChart<DoughnutChart, DoughnutOptions, DoughnutData>
{
	public DoughnutChart()
	{
	}
	
	public DoughnutChart(final DoughnutData data)
	{
		super(data);
	}
	
	public DoughnutChart(final DoughnutData data, final DoughnutOptions options)
	{
		super(data, options);
	}
	
	/**
	 * Static factory, constructs an {@link Data} implementation appropriate for a {@link DoughnutChart}.
	 *
	 * @return a new {@link DoughnutData} instance
	 */
	public static DoughnutData data()
	{
		return new DoughnutData();
	}
	
	/**
	 * Static factory, constructs an {@link Options} implementation appropriate for a {@link DoughnutChart}.
	 *
	 * @return a new {@link DoughnutOptions} instance
	 */
	public static DoughnutOptions options()
	{
		return new DoughnutOptions();
	}
	
	@Override
	public String getType()
	{
		return "doughnut";
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * {@code DoughnutChart} is drawable if at least one dataset has at least one data point.
	 * </p>
	 */
	@Override
	public boolean isDrawable()
	{
		return this.getData() != null && !this.getData().getDatasets().isEmpty();
	}
}
