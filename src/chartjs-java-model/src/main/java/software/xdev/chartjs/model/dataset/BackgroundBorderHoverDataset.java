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
package software.xdev.chartjs.model.dataset;

import java.util.Arrays;
import java.util.List;

import software.xdev.chartjs.model.objects.OptionalArray;


public abstract class BackgroundBorderHoverDataset<T extends BackgroundBorderHoverDataset<T, O>, O>
	extends Dataset<T, O>
{
	protected final List<Object> backgroundColor = new OptionalArray<>();
	protected final List<Object> borderColor = new OptionalArray<>();
	protected final List<Integer> borderWidth = new OptionalArray<>();
	protected final List<Object> hoverBackgroundColor = new OptionalArray<>();
	protected final List<Object> hoverBorderColor = new OptionalArray<>();
	protected final List<Integer> hoverBorderWidth = new OptionalArray<>();
	
	public List<Object> getBackgroundColor()
	{
		return this.backgroundColor;
	}
	
	public T addBackgroundColor(final Object backgroundColor)
	{
		if(backgroundColor != null)
		{
			this.backgroundColor.add(backgroundColor);
		}
		return this.self();
	}
	
	public T addBackgroundColors(final Object... backgroundColors)
	{
		if(backgroundColors != null)
		{
			this.backgroundColor.addAll(Arrays.asList(backgroundColors));
		}
		return this.self();
	}
	
	public T setBackgroundColor(final Object backgroundColor)
	{
		this.backgroundColor.clear();
		this.addBackgroundColor(backgroundColor);
		return this.self();
	}
	
	public T setBackgroundColor(final List<Object> backgroundColor)
	{
		this.backgroundColor.clear();
		if(backgroundColor != null)
		{
			this.backgroundColor.addAll(backgroundColor);
		}
		return this.self();
	}
	
	public List<Object> getBorderColor()
	{
		return this.borderColor;
	}
	
	public T addBorderColor(final Object borderColor)
	{
		if(borderColor != null)
		{
			this.borderColor.add(borderColor);
		}
		return this.self();
	}
	
	public T addBorderColors(final Object... borderColors)
	{
		if(borderColors != null)
		{
			this.borderColor.addAll(Arrays.asList(borderColors));
		}
		return this.self();
	}
	
	public T setBorderColor(final Object borderColor)
	{
		this.borderColor.clear();
		this.addBorderColor(borderColor);
		return this.self();
	}
	
	public T setBorderColor(final List<Object> borderColor)
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
	
	public List<Object> getHoverBackgroundColor()
	{
		return this.hoverBackgroundColor;
	}
	
	public T addHoverBackgroundColor(final Object hoverBackgroundColor)
	{
		if(hoverBackgroundColor != null)
		{
			this.hoverBackgroundColor.add(hoverBackgroundColor);
		}
		return this.self();
	}
	
	public T setHoverBackgroundColor(final Object hoverBackgroundColor)
	{
		this.hoverBackgroundColor.clear();
		this.addHoverBackgroundColor(hoverBackgroundColor);
		return this.self();
	}
	
	public T setHoverBackgroundColor(final List<Object> hoverBackgroundColor)
	{
		this.hoverBackgroundColor.clear();
		if(hoverBackgroundColor != null)
		{
			this.hoverBackgroundColor.addAll(hoverBackgroundColor);
		}
		return this.self();
	}
	
	public List<Object> getHoverBorderColor()
	{
		return this.hoverBorderColor;
	}
	
	public T addHoverBorderColor(final Object hoverBorderColor)
	{
		if(hoverBorderColor != null)
		{
			this.hoverBorderColor.add(hoverBorderColor);
		}
		return this.self();
	}
	
	public T setHoverBorderColor(final Object hoverBorderColor)
	{
		this.hoverBorderColor.clear();
		this.addHoverBorderColor(hoverBorderColor);
		return this.self();
	}
	
	public T setHoverBorderColor(final List<Object> hoverBorderColor)
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
