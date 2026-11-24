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
package software.xdev.chartjs.model.objects;

import java.util.ArrayList;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.annotation.JsonSerialize;
import tools.jackson.databind.ser.std.StdSerializer;


/**
 * {@link ArrayList} subclass with special serialization behavior: if only one item is contained, the item will be
 * serialized as a single value.
 */
@JsonSerialize(using = OptionalArray.Serializer.class)
public class OptionalArray<E> extends ArrayList<E>
{
	public static class Serializer<T> extends StdSerializer<OptionalArray<T>>
	{
		public Serializer()
		{
			super(OptionalArray.class);
		}
		
		@Override
		public boolean isEmpty(final SerializationContext ctxt, final OptionalArray<T> value)
		{
			return value == null || value.isEmpty();
		}
		
		@Override
		public void serialize(
			final OptionalArray<T> value,
			final JsonGenerator gen,
			final SerializationContext provider)
		{
			if(value != null && !value.isEmpty())
			{
				if(value.size() == 1)
				{
					gen.writePOJO(value.get(0));
				}
				else
				{
					gen.writeStartArray();
					for(final T t : value)
					{
						gen.writePOJO(t);
					}
					gen.writeEndArray();
				}
			}
		}
	}
}
