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
package software.xdev.chartjs.model;

import java.util.Locale;


public final class EnumNameToCamelCase
{
	private EnumNameToCamelCase()
	{
	}
	
	public static String getName(final Enum<?> e)
	{
		final StringBuilder sb = new StringBuilder(e.name().length());
		for(final String s : e.name().split("_"))
		{
			if(sb.length() == 0)
			{
				sb.append(s.toLowerCase(Locale.ENGLISH));
			}
			else
			{
				sb.append(s.substring(0, 1).toUpperCase(Locale.ENGLISH))
					.append(s.substring(1).toLowerCase(Locale.ENGLISH));
			}
		}
		return sb.toString();
	}
}
