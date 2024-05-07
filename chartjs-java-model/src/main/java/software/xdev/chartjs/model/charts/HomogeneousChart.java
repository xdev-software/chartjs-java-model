package software.xdev.chartjs.model.charts;

import software.xdev.chartjs.model.data.HomogeneousData;
import software.xdev.chartjs.model.options.Options;


public abstract class HomogeneousChart<T, O extends Options<O, ?>, D extends HomogeneousData<D, ?>>
	extends AbstractChart<T, O, D>
{
	protected HomogeneousChart()
	{
	}
	
	protected HomogeneousChart(final D data)
	{
		super(data);
	}
	
	protected HomogeneousChart(final D data, final O options)
	{
		super(data, options);
	}
}
