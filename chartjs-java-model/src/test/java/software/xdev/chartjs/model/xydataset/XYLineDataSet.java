package software.xdev.chartjs.model.xydataset;

import software.xdev.chartjs.model.datapoint.XYDataPoint;
import software.xdev.chartjs.model.dataset.LineDatasetBase;

public class XYLineDataSet extends LineDatasetBase<XYLineDataSet, XYDataPoint> implements XYDataSet<XYLineDataSet> {
    @Override
    protected String defaultType() {
        return "line";
    }
}