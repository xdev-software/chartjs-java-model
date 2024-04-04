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

import java.math.BigDecimal;

import software.xdev.chartjs.model.options.ticks.TimeTicks;


public class TimeScale extends Scale<TimeTicks, TimeScale>
{
	/**
	 * Default {@code "time"}
	 *
	 * @see #setType(String type)
	 */
	protected String type = "time";

    protected Time time;

    protected ScaleAdapters adapters;

	/**
	 * @see #setType(String type)
	 */
	public String getType()
	{
		return this.type;
	}

	/**
	 * As defined in Scales. Could be {@code "time"} or {@code "timeseries"}.
	 */
	public TimeScale setType(final String type)
	{
		this.type = type;
		return this;
	}

	/**
	 * @see #setTime(Time)
	 */
    public Time getTime() {
        return time;
    }

	/**
	 * As defined in Time.
	 */
    public TimeScale setTime(Time time) {
        this.time = time;
		return this;
    }

	/**
	 * @see #setAdapters(ScaleAdapters)
	 */
    public ScaleAdapters getAdapters() {
        return adapters;
    }

	/**
	 * Options for adapter for external date library if that adapter needs or supports options.
	 */
    public TimeScale setAdapters(ScaleAdapters adapters) {
        this.adapters = adapters;
		return this;
    }
}
