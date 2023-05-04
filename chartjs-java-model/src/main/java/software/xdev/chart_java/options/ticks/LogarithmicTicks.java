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
package software.xdev.chart_java.options.ticks;

public class LogarithmicTicks extends Ticks<LogarithmicTicks>
{
	protected String min;
	protected String max;
	
	/**
	 * @see #setMin(String)
	 */
	public String getMin()
	{
		return this.min;
	}
	
	/**
	 * The minimum item to display. Must be a value in the labels array.
	 *
	 * @param min a {@link String} or {@code null}
	 * @return this {@link LogarithmicTicks} instance for chaining
	 */
	public LogarithmicTicks setMin(final String min)
	{
		this.min = min;
		return this;
	}
	
	/**
	 * @see #setMax(String)
	 */
	public String getMax()
	{
		return this.max;
	}
	
	/**
	 * The maximum item to display. Must be a value in the labels array
	 *
	 * @param max a {@link String} or {@code null}
	 * @return this {@link LogarithmicTicks} instance for chaining
	 */
	public LogarithmicTicks setMax(final String max)
	{
		this.max = max;
		return this;
	}
}
