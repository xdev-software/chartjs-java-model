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

import software.xdev.chartjs.model.options.plugins.zoom.Zoom;


public class Plugins
{
	protected Title title;
	protected Title subtitle;
	protected Legend legend;
	protected Tooltip tooltip;
	protected Zoom zoom;
	
	/**
	 * @see #setTitle(Title)
	 */
	public Title getTitle()
	{
		return this.title;
	}
	
	/**
	 * The title configuration is passed into the options.title namespace. The global options for the chart title is
	 * defined in Chart.defaults.global.title.
	 */
	public Plugins setTitle(final Title title)
	{
		this.title = title;
		return this;
	}
	
	/**
	 * @see #setSubtitle(Title)
	 */
	public Title getSubtitle()
	{
		return this.subtitle;
	}
	
	/**
	 * The subtitle configuration is passed into the options.subtitle namespace. The global options for the chart
	 * subtitle is defined in Chart.defaults.global.subtitle.
	 */
	public Plugins setSubtitle(Title subtitle)
	{
		this.subtitle = subtitle;
		return this;
	}
	
	/**
	 * @see #setLegend(Legend)
	 */
	public Legend getLegend()
	{
		return this.legend;
	}
	
	/**
	 * The legend configuration is passed into the options.legend namespace. The global options for the chart legend is
	 * defined in Chart.defaults.global.legend.
	 */
	public Plugins setLegend(final Legend legend)
	{
		this.legend = legend;
		return this;
	}
	
	/**
	 * @see #setTooltip(Tooltip)
	 */
	public Tooltip getTooltip()
	{
		return this.tooltip;
	}
	
	/**
	 * The tooltip label configuration is nested below the tooltip configuration using the callbacks key. The tooltip
	 * has the following callbacks for providing text. For all functions, 'this' will be the tooltip object created
	 * from
	 * the Chart.Tooltip constructor.
	 * <p>
	 * All functions are called with the same arguments: a tooltip item and the data object passed to the chart. All
	 * functions must return either a string or an array of strings. Arrays of strings are treated as multiple lines of
	 * text.
	 */
	public Plugins setTooltip(final Tooltip tooltip)
	{
		this.tooltip = tooltip;
		return this;
	}
	
	/**
	 * @see #setZoom(Zoom)
	 */
	public Zoom getZoom()
	{
		return this.zoom;
	}
	
	/**
	 * A zoom and pan plugin for Chart.js. Panning can be done via the mouse or with a finger. Zooming is done via the
	 * mouse wheel or via a pinch gesture.
	 * <p>
	 * Note: Requires the {@link Zoom} plugin installed.
	 * </p>
	 */
	public Plugins setZoom(final Zoom zoom)
	{
		this.zoom = zoom;
		return this;
	}
}
