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

/**
 * Display formats are used to configure how different time units are formed into strings for the axis tick marks. See
 * <a href="http://momentjs.com/docs/#/displaying/format/">moment.js</a> for the allowable format strings.
 */
public class DisplayFormats
{
	protected String millisecond;
	protected String second;
	protected String minute;
	protected String hour;
	protected String day;
	protected String week;
	protected String month;
	protected String quarter;
	protected String year;
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setMillisecond(String)
	 */
	public String getMillisecond()
	{
		return this.millisecond;
	}
	
	/**
	 * Default: 'SSS [ms]'
	 *
	 * @param millisecond a {@code String} or {@code null}
	 */
	public DisplayFormats setMillisecond(final String millisecond)
	{
		this.millisecond = millisecond;
		return this;
	}
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setSecond(String)
	 */
	public String getSecond()
	{
		return this.second;
	}
	
	/**
	 * Default: 'h:mm:ss a'
	 *
	 * @param second a {@code String} or {@code null}
	 */
	public DisplayFormats setSecond(final String second)
	{
		this.second = second;
		return this;
	}
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setMinute(String)
	 */
	public String getMinute()
	{
		return this.minute;
	}
	
	/**
	 * Default: 'h:mm:ss a'
	 *
	 * @param minute a {@code String} or {@code null}
	 */
	public DisplayFormats setMinute(final String minute)
	{
		this.minute = minute;
		return this;
	}
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setHour(String)
	 */
	public String getHour()
	{
		return this.hour;
	}
	
	/**
	 * Default: 'MMM D, hA'
	 *
	 * @param hour a {@code String} or {@code null}
	 */
	public DisplayFormats setHour(final String hour)
	{
		this.hour = hour;
		return this;
	}
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setDay(String)
	 */
	public String getDay()
	{
		return this.day;
	}
	
	/**
	 * Default: 'll'
	 *
	 * @param day a {@code String} or {@code null}
	 */
	public DisplayFormats setDay(final String day)
	{
		this.day = day;
		return this;
	}
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setWeek(String)
	 */
	public String getWeek()
	{
		return this.week;
	}
	
	/**
	 * Default: 'll'
	 *
	 * @param week a {@code String} or {@code null}
	 */
	public DisplayFormats setWeek(final String week)
	{
		this.week = week;
		return this;
	}
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setMonth(String)
	 */
	public String getMonth()
	{
		return this.month;
	}
	
	/**
	 * Default: 'MMM YYYY'
	 *
	 * @param month a {@code String} or {@code null}
	 */
	public DisplayFormats setMonth(final String month)
	{
		this.month = month;
		return this;
	}
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setQuarter(String)
	 */
	public String getQuarter()
	{
		return this.quarter;
	}
	
	/**
	 * Default: '[Q]Q - YYYY'
	 *
	 * @param quarter a {@code String} or {@code null}
	 */
	public DisplayFormats setQuarter(final String quarter)
	{
		this.quarter = quarter;
		return this;
	}
	
	/**
	 * @return a {@link String} or {@code null} if not set
	 * @see #setYear(String)
	 */
	public String getYear()
	{
		return this.year;
	}
	
	/**
	 * Default: 'YYYY'
	 *
	 * @param year a {@code String} or {@code null}
	 */
	public DisplayFormats setYear(final String year)
	{
		this.year = year;
		return this;
	}
}
