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
package software.xdev.chartjs.model.color;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

import com.fasterxml.jackson.annotation.JsonValue;


@SuppressWarnings("checkstyle:MagicNumber")
public class HSLAColor
{
	protected static final Random RANDOMIZER = new SecureRandom();
	
	protected final double hue;
	protected final double saturationPercent;
	protected final double lightnessPercent;
	protected final double alpha;

	public HSLAColor(
		final double hue,
		final double saturationPercent,
		final double lightnessPercent,
		final double alpha)
	{
		if(!HSLAColor.isPercentWithinBounds(saturationPercent)
			|| !HSLAColor.isPercentWithinBounds(lightnessPercent)
			|| !HSLAColor.isAlphaWithinBounds(alpha))
		{
			throw new IllegalArgumentException("at least one argument is not within bounds");
		}
		this.hue = hue;
		this.saturationPercent = saturationPercent;
		this.lightnessPercent = lightnessPercent;
		this.alpha = alpha;
	}

	public HSLAColor(final double hue, final double saturationPercent, final double lightnessPercent)
	{
		this(hue, saturationPercent, lightnessPercent, 1);
	}
	
	public HSLAColor(final HSLAColor color, final double alpha)
	{
		if(color == null)
		{
			throw new IllegalArgumentException("Color argument may not be null");
		}
		if(!HSLAColor.isAlphaWithinBounds(alpha))
		{
			throw new IllegalArgumentException("alpha double argument is not within allowed bounds: "
				+ "allowed values are between 0 and 1 (inclusive), but value passed is " + alpha);
		}
		this.hue = color.getHue();
		this.saturationPercent = color.getSaturationPercent();
		this.lightnessPercent = color.getLightnessPercent();
		this.alpha = alpha;
	}
	
	public static HSLAColor random()
	{
		final double hue = RANDOMIZER.nextDouble() * 360.0;
		final double saturationPercent = RANDOMIZER.nextDouble() * 100.0;
		final double lightnessPercent = RANDOMIZER.nextDouble() * 100.0;
		final double alpha = RANDOMIZER.nextDouble();
		return new HSLAColor(hue, saturationPercent, lightnessPercent, alpha);
	}
	
	public static boolean isPercentWithinBounds(final double percent)
	{
		return Double.compare(0.0d, percent) <= 0 && Double.compare(100.0d, percent) >= 0;
	}
	
	public static boolean isAlphaWithinBounds(final double alpha)
	{
		return Double.compare(0.0d, alpha) <= 0 && Double.compare(1.0d, alpha) >= 0;
	}
	
	public double getHue()
	{
		return this.hue;
	}
	
	public double getSaturationPercent()
	{
		return this.saturationPercent;
	}
	
	public double getLightnessPercent()
	{
		return this.lightnessPercent;
	}
	
	public double getAlpha()
	{
		return this.alpha;
	}
	
	/**
	 * @return serialized version of this {@code Color}, as used for JSON.
	 */
	@JsonValue
	public String hsla()
	{
		return "hsla("
			+ String.format(Locale.US, "%.3f", this.getHue()) + ","
			+ String.format(Locale.US, "%.3f", this.getSaturationPercent()) + "%,"
			+ String.format(Locale.US, "%.3f", this.getLightnessPercent()) + "%,"
			+ String.format(Locale.US, "%.3f", this.getAlpha())
			+ ")";
	}
	
	@Override
	public String toString()
	{
		return this.hsla();
	}
	
	@Override
	public boolean equals(final Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(!(o instanceof HSLAColor))
		{
			return false;
		}
		final HSLAColor color = (HSLAColor)o;
		return Double.compare(this.getHue(), color.getHue()) == 0
			&& Double.compare(this.getSaturationPercent(), color.getSaturationPercent()) == 0
			&& Double.compare(this.getLightnessPercent(), color.getLightnessPercent()) == 0
			&& Double.compare(this.getAlpha(), color.getAlpha()) == 0;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.getHue(), this.getSaturationPercent(), this.getLightnessPercent(), this.getAlpha());
	}
}
