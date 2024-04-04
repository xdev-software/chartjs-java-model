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
package software.xdev.chartjs.model.options.ticks;

public class TimeTicks extends Ticks<TimeTicks>
{
	/**
	 * Default {@code "auto"}
	 *
	 * @see #setSource(String type)
	 */
	protected String source;
	
	/**
	 * @see #setSource(String)
	 */
	public String getSource()
	{
		return this.source;
	}
	
	/**
	 * How ticks are generated, possible values are: 'auto' - generates "optimal" ticks based on scale size and time
	 * options; 'data' - generates ticks from data (including labels from data {x|y} objects); 'labels' - generates
	 * ticks from user given labels ONLY
	 */
	public TimeTicks setSource(final String source)
	{
		this.source = source;
		return this;
	}
}
