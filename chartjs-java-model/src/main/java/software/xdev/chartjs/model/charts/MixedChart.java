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

import software.xdev.chartjs.model.data.MixedData;
import software.xdev.chartjs.model.options.Options;


/**
 * Allows creation of <a href="https://www.chartjs.org/docs/latest/charts/mixed.html">mixed chart types</a>
 */
public class MixedChart extends AbstractChart<MixedChart, Options<?, ?>, MixedData>
{
	protected String type;
	
	public MixedChart setType(final String type)
	{
		this.type = type;
		return this.self();
	}
	
	@Override
	public String getType()
	{
		return this.type;
	}
}
