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
package software.xdev.chartjs.model.options.scale.radial;

import software.xdev.chartjs.model.options.scale.CoreScaleOptions;
import software.xdev.chartjs.model.options.scale.GridLineConfiguration;


/**
 * @see <a href="https://www.chartjs.org/docs/latest/axes/radial/linear.html#linear-radial-axis-specific-options">ChartJS Docs</a>
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.3/src/types/index.d.ts#L3470">ChartJS Source</a>
 */
public class RadialLinearScaleOptions extends CoreScaleOptions<RadialLinearScaleOptions, RadialTickOptions>
{
	protected Boolean animate;
	protected Number startAngle;
	protected AngleLines angleLines;
	protected Boolean beginAtZero;
	protected PointLabels pointLabels;
	protected GridLineConfiguration grid;
	
	public RadialLinearScaleOptions()
	{
		super("radialLinear");
	}
	
	public Boolean getAnimate()
	{
		return this.animate;
	}
	
	public RadialLinearScaleOptions setAnimate(final Boolean animate)
	{
		this.animate = animate;
		return this.self();
	}
	
	public Number getStartAngle()
	{
		return this.startAngle;
	}
	
	public RadialLinearScaleOptions setStartAngle(final Number startAngle)
	{
		this.startAngle = startAngle;
		return this.self();
	}
	
	public AngleLines getAngleLines()
	{
		return this.angleLines;
	}
	
	public RadialLinearScaleOptions setAngleLines(final AngleLines angleLines)
	{
		this.angleLines = angleLines;
		return this.self();
	}
	
	public Boolean getBeginAtZero()
	{
		return this.beginAtZero;
	}
	
	public RadialLinearScaleOptions setBeginAtZero(final Boolean beginAtZero)
	{
		this.beginAtZero = beginAtZero;
		return this.self();
	}
	
	public PointLabels getPointLabels()
	{
		return this.pointLabels;
	}
	
	public RadialLinearScaleOptions setPointLabels(final PointLabels pointLabels)
	{
		this.pointLabels = pointLabels;
		return this.self();
	}
	
	public GridLineConfiguration getGrid()
	{
		return this.grid;
	}
	
	public RadialLinearScaleOptions setGrid(final GridLineConfiguration grid)
	{
		this.grid = grid;
		return this.self();
	}
}
