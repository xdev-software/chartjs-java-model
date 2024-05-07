package software.xdev.chartjs.model.charts;

import software.xdev.chartjs.model.data.MixedData;
import software.xdev.chartjs.model.options.Options;


/**
 * Allows creation of <a href="https://www.chartjs.org/docs/latest/charts/mixed.html">mixed chart types</a>
 */
public class MixedChart extends AbstractChart<MixedChart, Options<?, ?>, MixedData>
{
	protected String type;
	
	public MixedChart setType(final String type)
	{
		this.type = type;
		return this.self();
	}
	
	@Override
	public String getType()
	{
		return this.type;
	}
	
	@Override
	public boolean isDrawable()
	{
		// Warning: Unchecked
		return true;
	}
}
