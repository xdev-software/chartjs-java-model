package software.xdev.chartjs.model.options;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;


public enum IndexAxis
{
	X,
	Y;
	
	@JsonValue
	@Override
	public String toString()
	{
		return super.toString().toLowerCase(Locale.ENGLISH);
	}
}
