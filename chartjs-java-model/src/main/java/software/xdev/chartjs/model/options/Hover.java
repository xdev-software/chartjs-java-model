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
package software.xdev.chartjs.model.options;

import software.xdev.chartjs.model.enums.HoverMode;
import software.xdev.chartjs.model.javascript.JavaScriptFunction;


public class Hover
{
	protected HoverMode mode;
	protected JavaScriptFunction onHover;
	
	/**
	 * @see #setMode(HoverMode)
	 */
	public HoverMode getMode()
	{
		return this.mode;
	}
	
	/**
	 * <p>
	 * Default {@code single}
	 * </p>
	 *
	 * <p>
	 * Sets which elements hover. Acceptable options are 'single', 'label', 'x-axis', or 'dataset'.
	 * </p>
	 * <ul>
	 * <li>{@code single} highlights the closest element.
	 * <li>{@code label} highlights elements in all datasets at the same X value.
	 * <li>{@code x-axis} also highlights elements in all datasets at the same X
	 * value, but activates when hovering anywhere within the vertical slice of
	 * the x-axis representing that X value.
	 * <li>{@code dataset} highlights the closest dataset.
	 * </ul>
	 */
	public Hover setMode(final HoverMode mode)
	{
		this.mode = mode;
		return this;
	}
	
	/**
	 * @see #setOnHover(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnHover()
	{
		return this.onHover;
	}
	
	/**
	 * Default {@code null}<br>
	 * <p>
	 * Called when any of the events fire. Called in the context of the chart and passed an array of active elements
	 * (bars, points, etc)
	 */
	public Hover setOnHover(final JavaScriptFunction onHover)
	{
		this.onHover = onHover;
		return this;
	}
}
