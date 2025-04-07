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
package software.xdev.chartjs.model.charts;

import software.xdev.chartjs.model.data.DoughnutData;
import software.xdev.chartjs.model.data.HomogeneousData;
import software.xdev.chartjs.model.options.DoughnutOptions;
import software.xdev.chartjs.model.options.Options;


public class DoughnutChart extends HomogeneousChart<DoughnutChart, DoughnutOptions, DoughnutData>
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
	 * Static factory, constructs an {@link HomogeneousData} implementation appropriate for a {@link DoughnutChart}.
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
}
