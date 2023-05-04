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
package software.xdev.chart_java.dataset;

import java.util.Arrays;
import java.util.List;

import software.xdev.chart_java.color.Color;
import software.xdev.chart_java.objects.OptionalArray;


public abstract class BackgroundBorderHoverDataset<T extends BackgroundBorderHoverDataset<T, O>, O>
	extends Dataset<T, O>
{
	protected final List<Color> backgroundColor = new OptionalArray<>();
	
	protected final List<Color> borderColor = new OptionalArray<>();
	
	protected final List<Integer> borderWidth = new OptionalArray<>();
	
	protected final List<Color> hoverBackgroundColor = new OptionalArray<>();
	
	protected final List<Color> hoverBorderColor = new OptionalArray<>();
	
	protected final List<Integer> hoverBorderWidth = new OptionalArray<>();
	
	public List<Color> getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	public T addBackgroundColor(final Color backgroundColor)
	{
		if(backgroundColor != null)
		{
			this.backgroundColor.add(backgroundColor);
		}
		return this.self();
	}
	
	public T addBackgroundColors(final Color... backgroundColors)
	{
		if(backgroundColors != null)
		{
			this.backgroundColor.addAll(Arrays.asList(backgroundColors));
		}
		return this.self();
	}
	
	public T setBackgroundColor(final Color backgroundColor)
	{
		this.backgroundColor.clear();
		this.addBackgroundColor(backgroundColor);
		return this.self();
	}
	
	public T setBackgroundColor(final List<Color> backgroundColor)
	{
		this.backgroundColor.clear();
		if(backgroundColor != null)
		{
			this.backgroundColor.addAll(backgroundColor);
		}
		return this.self();
	}
	
	public List<Color> getBorderColor()
	{
		return this.borderColor;
	}
	
	public T addBorderColor(final Color borderColor)
	{
		if(borderColor != null)
		{
			this.borderColor.add(borderColor);
		}
		return this.self();
	}
	
	public T addBorderColors(final Color... borderColors)
	{
		if(borderColors != null)
		{
			this.borderColor.addAll(Arrays.asList(borderColors));
		}
		return this.self();
	}
	
	public T setBorderColor(final Color borderColor)
	{
		this.borderColor.clear();
		this.addBorderColor(borderColor);
		return this.self();
	}
	
	public T setBorderColor(final List<Color> borderColor)
	{
		this.borderColor.clear();
		if(borderColor != null)
		{
			this.borderColor.addAll(borderColor);
		}
		return this.self();
	}
	
	public List<Integer> getBorderWidth()
	{
		return this.borderWidth;
	}
	
	public T addBorderWidth(final Integer borderWidth)
	{
		if(borderWidth != null)
		{
			this.borderWidth.add(borderWidth);
		}
		return this.self();
	}
	
	public T setBorderWidth(final Integer borderWidth)
	{
		this.borderWidth.clear();
		this.addBorderWidth(borderWidth);
		return this.self();
	}
	
	public T setBorderWidth(final List<Integer> borderWidth)
	{
		this.borderWidth.clear();
		if(borderWidth != null)
		{
			this.borderWidth.addAll(borderWidth);
		}
		return this.self();
	}
	
	public List<Color> getHoverBackgroundColor()
	{
		return this.hoverBackgroundColor;
	}
	
	public T addHoverBackgroundColor(final Color hoverBackgroundColor)
	{
		if(hoverBackgroundColor != null)
		{
			this.hoverBackgroundColor.add(hoverBackgroundColor);
		}
		return this.self();
	}
	
	public T setHoverBackgroundColor(final Color hoverBackgroundColor)
	{
		this.hoverBackgroundColor.clear();
		this.addHoverBackgroundColor(hoverBackgroundColor);
		return this.self();
	}
	
	public T setHoverBackgroundColor(final List<Color> hoverBackgroundColor)
	{
		this.hoverBackgroundColor.clear();
		if(hoverBackgroundColor != null)
		{
			this.hoverBackgroundColor.addAll(hoverBackgroundColor);
		}
		return this.self();
	}
	
	public List<Color> getHoverBorderColor()
	{
		return this.hoverBorderColor;
	}
	
	public T addHoverBorderColor(final Color hoverBorderColor)
	{
		if(hoverBorderColor != null)
		{
			this.hoverBorderColor.add(hoverBorderColor);
		}
		return this.self();
	}
	
	public T setHoverBorderColor(final Color hoverBorderColor)
	{
		this.hoverBorderColor.clear();
		this.addHoverBorderColor(hoverBorderColor);
		return this.self();
	}
	
	public T setHoverBorderColor(final List<Color> hoverBorderColor)
	{
		this.hoverBorderColor.clear();
		if(hoverBorderColor != null)
		{
			this.hoverBorderColor.addAll(hoverBorderColor);
		}
		return this.self();
	}
	

	public List<Integer> getHoverBorderWidth()
	{
		return this.hoverBorderWidth;
	}
	
	public T addHoverBorderWidth(final Integer hoverBorderWidth)
	{
		if(hoverBorderWidth != null)
		{
			this.hoverBorderWidth.add(hoverBorderWidth);
		}
		return this.self();
	}
	
	public T setHoverBorderWidth(final Integer hoverBorderWidth)
	{
		this.hoverBorderWidth.clear();
		this.addHoverBorderWidth(hoverBorderWidth);
		return this.self();
	}
	
	public T setHoverBorderWidth(final List<Integer> hoverBorderWidth)
	{
		this.hoverBorderWidth.clear();
		if(hoverBorderWidth != null)
		{
			this.hoverBorderWidth.addAll(hoverBorderWidth);
		}
		return this.self();
	}
}
