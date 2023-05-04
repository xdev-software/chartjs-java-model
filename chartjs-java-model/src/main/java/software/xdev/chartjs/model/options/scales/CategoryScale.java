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
package software.xdev.chartjs.model.options.scales;

import software.xdev.chartjs.model.options.ticks.CategoryTicks;


/**
 * The category scale will be familiar to those who have used v1.0. Labels are drawn from one of the label arrays
 * included in the chart data. If only data.labels is defined, this will be used. If data.xLabels is defined and the
 * axis is horizontal, this will be used. Similarly, if data.yLabels is defined and the axis is vertical, this property
 * will be used. Using both xLabels and yLabels together can create a chart that uses strings for both the X and Y
 * axes.
 */
public class CategoryScale extends Scale<CategoryTicks, CategoryScale>
{
}
