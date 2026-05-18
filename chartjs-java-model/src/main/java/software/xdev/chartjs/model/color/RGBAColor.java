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


/**
 * Immutable RGBa color model.
 */
@SuppressWarnings("checkstyle:MagicNumber") // RGB Numbers
public class RGBAColor
{
	protected static final Random RANDOMIZER = new SecureRandom();
	
	public static final RGBAColor TRANSPARENT = new RGBAColor(0, 0, 0, 0);
	public static final RGBAColor BLACK = new RGBAColor(0, 0, 0);
	public static final RGBAColor WHITE = new RGBAColor(255, 255, 255);
	public static final RGBAColor RED = new RGBAColor(255, 0, 0);
	public static final RGBAColor LIME = new RGBAColor(0, 255, 0);
	public static final RGBAColor BLUE = new RGBAColor(0, 0, 255);
	public static final RGBAColor YELLOW = new RGBAColor(255, 255, 0);
	public static final RGBAColor CYAN = new RGBAColor(0, 255, 255);
	public static final RGBAColor MAGENTA = new RGBAColor(255, 0, 255);
	public static final RGBAColor SILVER = new RGBAColor(192, 192, 192);
	public static final RGBAColor GRAY = new RGBAColor(128, 128, 128);
	public static final RGBAColor MAROON = new RGBAColor(128, 0, 0);
	public static final RGBAColor OLIVE = new RGBAColor(128, 128, 0);
	public static final RGBAColor GREEN = new RGBAColor(0, 128, 0);
	public static final RGBAColor PURPLE = new RGBAColor(128, 0, 128);
	public static final RGBAColor TEAL = new RGBAColor(0, 128, 128);
	public static final RGBAColor NAVY = new RGBAColor(0, 0, 128);
	public static final RGBAColor DARK_RED = new RGBAColor(139, 0, 0);
	public static final RGBAColor BROWN = new RGBAColor(165, 42, 42);
	public static final RGBAColor CRIMSON = new RGBAColor(220, 20, 60);
	public static final RGBAColor DARK_SALMON = new RGBAColor(233, 150, 122);
	public static final RGBAColor SALMON = new RGBAColor(250, 128, 114);
	public static final RGBAColor LIGHT_SALMON = new RGBAColor(255, 160, 122);
	public static final RGBAColor ORANGE_RED = new RGBAColor(255, 69, 0);
	public static final RGBAColor DARK_ORANGE = new RGBAColor(255, 140, 0);
	public static final RGBAColor ORANGE = new RGBAColor(255, 165, 0);
	public static final RGBAColor GOLD = new RGBAColor(255, 215, 0);
	public static final RGBAColor DARK_KHAKI = new RGBAColor(189, 183, 107);
	public static final RGBAColor KHAKI = new RGBAColor(240, 230, 140);
	public static final RGBAColor YELLOW_GREEN = new RGBAColor(154, 205, 50);
	public static final RGBAColor DARK_OLIVE_GREEN = new RGBAColor(85, 107, 47);
	public static final RGBAColor GREEN_YELLOW = new RGBAColor(173, 255, 47);
	public static final RGBAColor DARK_GREEN = new RGBAColor(0, 100, 0);
	public static final RGBAColor DARK_CYAN = new RGBAColor(0, 139, 139);
	public static final RGBAColor LIGHT_CYAN = new RGBAColor(224, 255, 255);
	public static final RGBAColor AQUA = new RGBAColor(0, 255, 255);
	public static final RGBAColor DARK_TURQUOISE = new RGBAColor(0, 206, 209);
	public static final RGBAColor TURQUOISE = new RGBAColor(64, 224, 208);
	public static final RGBAColor MEDIUM_TURQUOISE = new RGBAColor(72, 209, 204);
	public static final RGBAColor PALE_TURQUOISE = new RGBAColor(175, 238, 238);
	public static final RGBAColor AQUA_MARINE = new RGBAColor(127, 255, 212);
	public static final RGBAColor LIGHT_BLUE = new RGBAColor(173, 216, 230);
	public static final RGBAColor SKY_BLUE = new RGBAColor(135, 206, 235);
	public static final RGBAColor LIGHT_SKY_BLUE = new RGBAColor(135, 206, 250);
	public static final RGBAColor MIDNIGHT_BLUE = new RGBAColor(25, 25, 112);
	public static final RGBAColor DARK_BLUE = new RGBAColor(0, 0, 139);
	public static final RGBAColor MEDIUM_BLUE = new RGBAColor(0, 0, 205);
	public static final RGBAColor BLUE_VIOLET = new RGBAColor(138, 43, 226);
	public static final RGBAColor VIOLET = new RGBAColor(238, 130, 238);
	public static final RGBAColor DEEP_PINK = new RGBAColor(255, 20, 147);
	public static final RGBAColor HOT_PINK = new RGBAColor(255, 105, 180);
	public static final RGBAColor LIGHT_PINK = new RGBAColor(255, 182, 193);
	public static final RGBAColor PINK = new RGBAColor(255, 192, 203);
	public static final RGBAColor LIGHT_YELLOW = new RGBAColor(255, 255, 224);
	public static final RGBAColor CHOCOLATE = new RGBAColor(210, 105, 30);
	public static final RGBAColor TAN = new RGBAColor(210, 180, 140);
	public static final RGBAColor LINEN = new RGBAColor(250, 240, 230);
	public static final RGBAColor LAVENDER = new RGBAColor(230, 230, 250);
	public static final RGBAColor AZURE = new RGBAColor(240, 255, 255);
	public static final RGBAColor DIM_GRAY = new RGBAColor(105, 105, 105);
	public static final RGBAColor DARK_GRAY = new RGBAColor(169, 169, 169);
	public static final RGBAColor LIGHT_GRAY = new RGBAColor(211, 211, 211);
	
	protected final int r;
	protected final int g;
	protected final int b;
	protected final double alpha;
	
	/**
	 * Constructs a new Color instance
	 *
	 * @param r     value for Red color channel. Value between 0 and 255 (inclusive).
	 * @param g     value for Green color channel. Value between 0 and 255 (inclusive).
	 * @param b     value for Blue color channel. Value between 0 and 255 (inclusive).
	 * @param alpha value for alpha transparency. Value between 0 and 1 (inclusive), with 0 fully transparent and 1
	 *              fully opaque.
	 */
	public RGBAColor(final int r, final int g, final int b, final double alpha)
	{
		if(!RGBAColor.isChannelWithinBounds(r)
			|| !RGBAColor.isChannelWithinBounds(g)
			|| !RGBAColor.isChannelWithinBounds(b)
			|| !RGBAColor.isAlphaWithinBounds(alpha))
		{
			throw new IllegalArgumentException("at least one argument is not within bounds");
		}
		this.r = r;
		this.g = g;
		this.b = b;
		this.alpha = alpha;
	}
	
	/**
	 * Constructs a new Color instance with alpha set fully opaque
	 *
	 * @param r value for Red color channel. Value between 0 and 255 (inclusive).
	 * @param g value for Green color channel. Value between 0 and 255 (inclusive).
	 * @param b value for Blue color channel. Value between 0 and 255 (inclusive).
	 */
	public RGBAColor(final int r, final int g, final int b)
	{
		this(r, g, b, 1);
	}
	
	/**
	 * Constructs a new Color instance with the RGB values of the Color argument and the alpha transparency of the
	 * double argument.
	 */
	public RGBAColor(final RGBAColor color, final double alpha)
	{
		if(color == null)
		{
			throw new IllegalArgumentException("Color argument may not be null");
		}
		if(!RGBAColor.isAlphaWithinBounds(alpha))
		{
			throw new IllegalArgumentException("alpha double argument is not within allowed bounds: "
				+ "allowed values are between 0 and 1 (inclusive), but value passed is " + alpha);
		}
		this.r = color.getR();
		this.g = color.getG();
		this.b = color.getB();
		this.alpha = alpha;
	}
	
	/**
	 * Constructs and returns a new fully random Color instance.
	 *
	 * @return Color
	 */
	public static RGBAColor random()
	{
		final int r = RANDOMIZER.nextInt(256);
		final int g = RANDOMIZER.nextInt(256);
		final int b = RANDOMIZER.nextInt(256);
		final double a = RANDOMIZER.nextDouble();
		return new RGBAColor(r, g, b, a);
	}
	
	/**
	 * <p>
	 * Verify that argument is valid value for the R, G or B channel.
	 * </p>
	 *
	 * <p>
	 * Any integer between 0 and 255 (inclusive) is valid.
	 * </p>
	 *
	 * @return true if argument is valid R, G or B value
	 */
	public static boolean isChannelWithinBounds(final int channel)
	{
		return channel >= 0 && channel <= 255;
	}
	
	/**
	 * <p>
	 * Verify that argument is valid value for the alpha channel.
	 * </p>
	 *
	 * <p>
	 * Any double between 0.0d and 1.0d (inclusive) is valid.
	 * </p>
	 *
	 * @return true if argument is valid alpha value
	 */
	public static boolean isAlphaWithinBounds(final double alpha)
	{
		return Double.compare(0.0d, alpha) <= 0 && Double.compare(1.0d, alpha) >= 0;
	}
	
	/**
	 * @return red channel value, between 0 and 255 (inclusive)
	 */
	public int getR()
	{
		return this.r;
	}
	
	/**
	 * @return green channel value, between 0 and 255 (inclusive)
	 */
	public int getG()
	{
		return this.g;
	}
	
	/**
	 * @return blue channel value, between 0 and 255 (inclusive)
	 */
	public int getB()
	{
		return this.b;
	}
	
	/**
	 * @return alpha channel value, between 0.0d and 1.0d (inclusive)
	 */
	public double getAlpha()
	{
		return this.alpha;
	}
	
	/**
	 * @return serialized version of this {@code Color}, as used for JSON.
	 */
	@JsonValue
	public String rgba()
	{
		return "rgba("
			+ this.r + ","
			+ this.g + ","
			+ this.b + ","
			+ String.format(Locale.US, "%.3f", this.alpha)
			+ ")";
	}
	
	@Override
	public String toString()
	{
		return this.rgba();
	}
	
	@Override
	public boolean equals(final Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(!(o instanceof RGBAColor))
		{
			return false;
		}
		final RGBAColor color = (RGBAColor)o;
		return this.getR() == color.getR()
			&& this.getG() == color.getG()
			&& this.getB() == color.getB()
			&& Double.compare(this.getAlpha(), color.getAlpha()) == 0;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.getR(), this.getG(), this.getB(), this.getAlpha());
	}
}
