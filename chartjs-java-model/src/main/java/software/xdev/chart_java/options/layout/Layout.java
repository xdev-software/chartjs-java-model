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
package software.xdev.chart_java.options.layout;

/**
 * Options to influence the layout of the chart in its canvas.
 */
public class Layout
{
	protected Object padding;
	
	public Object getPadding()
	{
		return this.padding;
	}
	
	public Layout()
	{
		
	}
	
	public Layout(final Integer padding)
	{
		this.padding = padding;
	}
	
	public Layout(final Padding padding)
	{
		this.padding = padding;
	}
	
	/**
	 * Using an {@link Integer} sets the padding globally for all sides of the chart (left, top, right, bottom).
	 *
	 * @param padding {@link Integer} or {@code null}
	 */
	public Layout setPadding(final Integer padding)
	{
		this.padding = padding;
		return this;
	}
	
	/**
	 * Using a {@link Padding} instance allows specifying 4 padding properties separately.
	 *
	 * @param padding {@link Padding} or [@code null}
	 */
	public Layout setPadding(final Padding padding)
	{
		this.padding = padding;
		return this;
	}
}
