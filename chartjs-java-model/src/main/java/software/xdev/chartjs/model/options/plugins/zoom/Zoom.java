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
package software.xdev.chartjs.model.options.plugins.zoom;

import software.xdev.chartjs.model.options.plugins.zoom.limits.LimitOptions;
import software.xdev.chartjs.model.options.plugins.zoom.pan.PanOptions;
import software.xdev.chartjs.model.options.plugins.zoom.zoom.ZoomOptions;


/**
 * <a href="https://www.chartjs.org/chartjs-plugin-zoom/latest/guide/options.html">ChartJS docs</a>
 */
public class Zoom
{
	protected PanOptions pan;
	protected LimitOptions limits;
	@SuppressWarnings("java:S1700")
	protected ZoomOptions zoom;
	
	public PanOptions getPan()
	{
		return this.pan;
	}
	
	public Zoom setPan(final PanOptions pan)
	{
		this.pan = pan;
		return this;
	}
	
	public LimitOptions getLimits()
	{
		return this.limits;
	}
	
	public Zoom setLimits(final LimitOptions limits)
	{
		this.limits = limits;
		return this;
	}
	
	public ZoomOptions getZoom()
	{
		return this.zoom;
	}
	
	public Zoom setZoom(final ZoomOptions zoom)
	{
		this.zoom = zoom;
		return this;
	}
}
