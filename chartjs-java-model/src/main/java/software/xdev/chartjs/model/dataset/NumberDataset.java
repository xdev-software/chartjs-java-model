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
import java.util.Collection;


public interface NumberDataset<S extends Dataset<?, Number>>
{
	S self();
	
	default S setData(final Number... data)
	{
		this.self().clearData();
		if(data != null)
		{
			Arrays.stream(data).forEach(this::addData);
		}
		return this.self();
	}
	
	/**
	 * Add the data point to this {@code Dataset}
	 *
	 * @see Dataset#setData(Collection)
	 */
	default S addData(final Number data)
	{
		this.self().addData(data);
		return this.self();
	}
}
