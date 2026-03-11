package software.xdev.chartjs.model.xydataset;

import software.xdev.chartjs.model.charts.HomogeneousChart;
import software.xdev.chartjs.model.charts.LineChart;
import software.xdev.chartjs.model.data.HomogeneousData;
import software.xdev.chartjs.model.data.LineData;
import software.xdev.chartjs.model.options.LineOptions;
import software.xdev.chartjs.model.options.Options;

public class XYLineChart extends HomogeneousChart<XYLineChart, LineOptions, XYLineData>
{
    public XYLineChart()
    {
    }

    public XYLineChart(final XYLineData data)
    {
        super(data);
    }

    public XYLineChart(final XYLineData data, final LineOptions options)
    {
        super(data, options);
    }

    /**
     * Static factory, constructs an {@link HomogeneousData} implementation appropriate for a {@link LineChart}.
     *
     * @return a new {@link LineData} instance
     */
    public static LineData data()
    {
        return new LineData();
    }

    /**
     * Static factory, constructs an {@link Options} implementation appropriate for a {@link LineChart}.
     *
     * @return a new {@link LineOptions} instance
     */
    public static LineOptions options()
    {
        return new LineOptions();
    }

    @Override
    public String getType()
    {
        return "line";
    }
}
