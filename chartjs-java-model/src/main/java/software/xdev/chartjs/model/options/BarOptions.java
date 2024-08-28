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

import software.xdev.chartjs.model.options.animation.DefaultAnimation;
import software.xdev.chartjs.model.options.elements.BarElements;


public class BarOptions extends Options<BarOptions, DefaultAnimation>
{
	protected BarElements elements;
	
	/**
	 * @return {@link BarElements} instance, or {@code null} if not set
	 */
	public BarElements getElements()
	{
		return this.elements;
	}
	
	public BarOptions setElements(final BarElements elements)
	{
		this.elements = elements;
		return this;
	}
}
