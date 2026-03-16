package software.xdev.chartjs.model.xydataset;

import java.util.Arrays;
import java.util.Collection;

import software.xdev.chartjs.model.datapoint.XYDataPoint;
import software.xdev.chartjs.model.dataset.Dataset;

public interface XYDataSet<S extends Dataset<?, XYDataPoint>> {
    S self();

    default S setData(final XYDataPoint... data) {
        this.self()
                .clearData();
        if (data != null) {
            Arrays.stream(data)
                    .forEach(this::addData);
        }
        return this.self();
    }

    /**
     * Add the data point to this {@code Dataset}
     *
     * @see Dataset#setData(Collection)
     */
    default S addData(final XYDataPoint data) {
        this.self()
                .addData(data);
        return this.self();
    }
}
