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

import software.xdev.chartjs.model.data.HomogeneousData;
import software.xdev.chartjs.model.data.ScatterData;
import software.xdev.chartjs.model.options.LineOptions;
import software.xdev.chartjs.model.options.Options;


public class ScatterChart extends HomogeneousChart<ScatterChart, LineOptions, ScatterData>
{
	
	public ScatterChart()
	{
	}
	
	public ScatterChart(final ScatterData data)
	{
		super(data);
	}
	
	public ScatterChart(final ScatterData data, final LineOptions options)
	{
		super(data, options);
	}
	
	/**
	 * Static factory, constructs an {@link HomogeneousData} implementation appropriate for a {@link ScatterChart}.
	 *
	 * @return a new {@link ScatterData} instance
	 */
	public static ScatterData data()
	{
		return new ScatterData();
	}
	
	/**
	 * Static factory, constructs an {@link Options} implementation appropriate for a {@link ScatterChart}.
	 *
	 * @return a new {@link LineOptions} instance
	 */
	public static LineOptions options()
	{
		return new LineOptions();
	}
	
	@Override
	public String getType()
	{
		return "scatter";
	}
}
