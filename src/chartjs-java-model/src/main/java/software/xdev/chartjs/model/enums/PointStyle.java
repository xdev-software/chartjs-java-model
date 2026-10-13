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
package software.xdev.chartjs.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import software.xdev.chartjs.model.EnumNameToCamelCase;


/**
 * @apiNote Only contains the (string) constants. Other valid values are e.g. <code>false</code>, an image element or a
 * canvas element.
 * @see <a href="https://github.com/chartjs/Chart.js/blob/v4.4.4/src/types/index.d.ts#L1968">ChartJS Source</a>
 */
public enum PointStyle
{
	CIRCLE,
	CROSS,
	CROSS_ROT,
	DASH,
	LINE,
	RECT,
	RECT_ROUNDED,
	RECT_ROT,
	STAR,
	TRIANGLE;
	
	@JsonValue
	@Override
	public String toString()
	{
		return EnumNameToCamelCase.getName(this);
	}
}
