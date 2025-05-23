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

import software.xdev.chartjs.model.data.BubbleData;
import software.xdev.chartjs.model.data.HomogeneousData;
import software.xdev.chartjs.model.options.BubbleOptions;
import software.xdev.chartjs.model.options.Options;


public class BubbleChart extends HomogeneousChart<BubbleChart, BubbleOptions, BubbleData>
{
	public BubbleChart()
	{
	}
	
	public BubbleChart(final BubbleData data)
	{
		super(data);
	}
	
	public BubbleChart(final BubbleData data, final BubbleOptions options)
	{
		super(data, options);
	}
	
	/**
	 * Static factory, constructs an {@link HomogeneousData} implementation appropriate for a {@link BubbleChart}.
	 *
	 * @return a new {@link BubbleData} instance
	 */
	public static BubbleData data()
	{
		return new BubbleData();
	}
	
	/**
	 * Static factory, constructs an {@link Options} implementation appropriate for a {@link BubbleChart}.
	 *
	 * @return a new {@link BubbleOptions} instance
	 */
	public static BubbleOptions options()
	{
		return new BubbleOptions();
	}
	
	@Override
	public String getType()
	{
		return "bubble";
	}
}
