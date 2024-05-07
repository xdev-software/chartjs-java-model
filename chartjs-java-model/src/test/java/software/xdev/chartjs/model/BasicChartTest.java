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

import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import software.xdev.chartjs.model.charts.BarChart;
import software.xdev.chartjs.model.charts.BubbleChart;
import software.xdev.chartjs.model.charts.Chart;
import software.xdev.chartjs.model.charts.DoughnutChart;
import software.xdev.chartjs.model.charts.LineChart;
import software.xdev.chartjs.model.charts.MixedChart;
import software.xdev.chartjs.model.charts.PieChart;
import software.xdev.chartjs.model.charts.PolarChart;
import software.xdev.chartjs.model.charts.RadarChart;
import software.xdev.chartjs.model.charts.ScatterChart;
import software.xdev.chartjs.model.data.AbstractData;
import software.xdev.chartjs.model.data.BarData;
import software.xdev.chartjs.model.data.BubbleData;
import software.xdev.chartjs.model.data.DoughnutData;
import software.xdev.chartjs.model.data.HomogeneousData;
import software.xdev.chartjs.model.data.LineData;
import software.xdev.chartjs.model.data.MixedData;
import software.xdev.chartjs.model.data.PieData;
import software.xdev.chartjs.model.data.PolarData;
import software.xdev.chartjs.model.data.RadarData;
import software.xdev.chartjs.model.data.ScatterData;
import software.xdev.chartjs.model.datapoint.BubbleDataPoint;
import software.xdev.chartjs.model.datapoint.ScatterDataPoint;
import software.xdev.chartjs.model.dataset.BarDataset;
import software.xdev.chartjs.model.dataset.BubbleDataset;
import software.xdev.chartjs.model.dataset.Dataset;
import software.xdev.chartjs.model.dataset.DoughnutDataset;
import software.xdev.chartjs.model.dataset.LineDataset;
import software.xdev.chartjs.model.dataset.PieDataset;
import software.xdev.chartjs.model.dataset.PolarDataset;
import software.xdev.chartjs.model.dataset.RadarDataset;
import software.xdev.chartjs.model.dataset.ScatterDataset;
import software.xdev.chartjs.model.options.BarOptions;
import software.xdev.chartjs.model.options.BubbleOptions;
import software.xdev.chartjs.model.options.DoughnutOptions;
import software.xdev.chartjs.model.options.LineOptions;
import software.xdev.chartjs.model.options.Options;
import software.xdev.chartjs.model.options.PieOptions;
import software.xdev.chartjs.model.options.PolarOptions;
import software.xdev.chartjs.model.options.RadarOptions;


@SuppressWarnings("java:S2699") // Done in custom method
class BasicChartTest extends AbstractChartTest
{
	@ParameterizedTest(name = "Check if basic {0} is displayed correctly")
	@MethodSource
	<O extends Options<?, ?>, D extends AbstractData<?, ?>> void basicTest(
		final String chartName,
		final Chart<?, O, D> chart,
		final O options,
		final D data)
	{
		options.setAnimation(false);
		
		chart.setOptions(options);
		chart.setData(data);
		
		this.createScreenshotAndCompare(
			chart,
			this.getWebContainer(),
			"Basic");
	}
	
	static Stream<Arguments> basicTest()
	{
		final Map<String, BigDecimal> defaultData = IntStream.rangeClosed(0, 3)
			.boxed()
			.collect(Collectors.toMap(String::valueOf, BigDecimal::valueOf));
		
		return Stream.of(
			new ArgumentDTO<>(
				BarChart::new,
				BarOptions::new,
				createData(defaultData, BarData::new, BarDataset::new)),
			new ArgumentDTO<>(
				BubbleChart::new,
				BubbleOptions::new,
				createData(defaultData, BubbleData::new, BubbleDataset::new, entry -> new BubbleDataPoint(
					entry.getValue(),
					entry.getValue(),
					entry.getValue().multiply(BigDecimal.TEN)))),
			new ArgumentDTO<>(
				DoughnutChart::new,
				DoughnutOptions::new,
				createData(defaultData, DoughnutData::new, DoughnutDataset::new)),
			new ArgumentDTO<>(
				LineChart::new,
				LineOptions::new,
				createData(defaultData, LineData::new, LineDataset::new)),
			new ArgumentDTO<>(
				PieChart::new,
				PieOptions::new,
				createData(defaultData, PieData::new, PieDataset::new)),
			new ArgumentDTO<>(
				PolarChart::new,
				PolarOptions::new,
				createData(defaultData, PolarData::new, PolarDataset::new)),
			new ArgumentDTO<>(
				RadarChart::new,
				RadarOptions::new,
				createData(defaultData, RadarData::new, RadarDataset::new)),
			new ArgumentDTO<>(
				ScatterChart::new,
				LineOptions::new,
				createData(
					defaultData,
					ScatterData::new,
					ScatterDataset::new,
					entry -> new ScatterDataPoint(entry.getValue(), entry.getValue()))),
			new ArgumentDTO<>(
				MixedChart::new,
				LineOptions::new,
				() -> new MixedData()
					.addLabels("A", "B", "C")
					.addDataset(new BarDataset()
						.withDefaultType()
						.setLabel("Dataset1")
						.setData(1, 3, 2))
					.addDataset(new LineDataset()
						.withDefaultType()
						.setLabel("Dataset2")
						.setData(1, 2, 3))
			)
		).map(dto ->
			Arguments.of(
				dto.chartSupplier().get().getClass().getSimpleName(),
				dto.chartSupplier().get(),
				dto.optionsSupplier().get(),
				dto.dataSupplier().get()));
	}
	
	private static <D extends HomogeneousData<D, S>, S extends Dataset<S, BigDecimal>> Supplier<D> createData(
		final Map<String, BigDecimal> defaultDataMap,
		final Supplier<D> dataSupplier,
		final Supplier<S> dataSetSupplier)
	{
		return createData(defaultDataMap, dataSupplier, dataSetSupplier, Map.Entry::getValue);
	}
	
	private static <D extends HomogeneousData<D, S>, S extends Dataset<S, O>, O> Supplier<D> createData(
		final Map<String, BigDecimal> defaultDataMap,
		final Supplier<D> dataSupplier,
		final Supplier<S> dataSetSupplier,
		final Function<Map.Entry<String, BigDecimal>, O> addDataFunc)
	{
		return () -> {
			final S dataset = dataSetSupplier.get();
			final D data = dataSupplier.get().addDataset(dataset);
			for(final Map.Entry<String, BigDecimal> entry : defaultDataMap.entrySet())
			{
				data.addLabel(entry.getKey());
				dataset.addData(addDataFunc.apply(entry));
			}
			return data;
		};
	}
	
	public static class ArgumentDTO<O extends Options<?, ?>, D extends AbstractData<?, ?>>
	{
		private final Supplier<Chart<?, O, D>> chartSupplier;
		private final Supplier<O> optionsSupplier;
		private final Supplier<D> dataSupplier;
		
		public ArgumentDTO(
			final Supplier<Chart<?, O, D>> chartSupplier,
			final Supplier<O> optionsSupplier,
			final Supplier<D> dataSupplier)
		{
			this.chartSupplier = chartSupplier;
			this.optionsSupplier = optionsSupplier;
			this.dataSupplier = dataSupplier;
		}
		
		public Supplier<Chart<?, O, D>> chartSupplier()
		{
			return this.chartSupplier;
		}
		
		public Supplier<O> optionsSupplier()
		{
			return this.optionsSupplier;
		}
		
		public Supplier<D> dataSupplier()
		{
			return this.dataSupplier;
		}
	}
}
