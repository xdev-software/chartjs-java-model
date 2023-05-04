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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class RadarDataset extends PointDataset<RadarDataset, BigDecimal> implements BigDecimalDataset<RadarDataset>
{
	private final List<Integer> hitRadius = new ArrayList<>();
	public List<Integer> getHitRadius()
	{
		return this.hitRadius;
	}
	
	public RadarDataset addHitRadius(final Integer hitRadius)
	{
		this.hitRadius.add(hitRadius);
		return this;
	}
	
	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	public RadarDataset setHitRadius(final List<Integer> hitRadius)
	{
		this.hitRadius.clear();
		if(hitRadius != null)
		{
			this.hitRadius.addAll(hitRadius);
		}
		return this;
	}
}
