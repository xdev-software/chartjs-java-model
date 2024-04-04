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

import software.xdev.chartjs.model.color.Color;
import software.xdev.chartjs.model.enums.FontStyle;
import software.xdev.chartjs.model.enums.TitlePosition;


public class Zoom
{
	protected PanOptions pan;
	protected LimitOptions limits;
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
		return limits;
	}

	public Zoom setLimits(LimitOptions limits)
	{
		this.limits = limits;
		return this;
	}

	public ZoomOptions getZoom()
	{
		return zoom;
	}

	public Zoom setZoom(ZoomOptions zoom)
	{
		this.zoom = zoom;
		return this;
	}
}
