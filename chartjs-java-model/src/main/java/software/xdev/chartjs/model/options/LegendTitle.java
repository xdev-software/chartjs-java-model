package software.xdev.chartjs.model.options;

import software.xdev.chartjs.model.color.Color;
import software.xdev.chartjs.model.options.layout.Padding;
import software.xdev.chartjs.model.options.scales.Font;


public class LegendTitle
{
	protected Color color;
	protected Boolean display;
	protected Font font;
	protected Padding padding;
	protected String text;
	
	/**
	 * @see #setColor(Color)
	 */
	public Color getColor()
	{
		return this.color;
	}
	
	/**
	 * Default <code>Chart.defaults.color</code>
	 * <p/>
	 * Color of text
	 */
	public LegendTitle setColor(final Color color)
	{
		this.color = color;
		return this;
	}
	
	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay()
	{
		return this.display;
	}
	
	/**
	 * Default <code>false</code>
	 * <p/>
	 * Is the legend title displayed?
	 */
	public LegendTitle setDisplay(final Boolean display)
	{
		this.display = display;
		return this;
	}
	
	/**
	 * @see #setFont(Font)
	 */
	public Font getFont()
	{
		return this.font;
	}
	
	/**
	 * Default <code>Chart.defaults.font</code>
	 */
	public LegendTitle setFont(final Font font)
	{
		this.font = font;
		return this;
	}
	
	/**
	 * @see #setPadding(Padding)
	 */
	public Padding getPadding()
	{
		return this.padding;
	}
	
	/**
	 * Padding around the title
	 */
	public LegendTitle setPadding(final Padding padding)
	{
		this.padding = padding;
		return this;
	}
	
	/**
	 * @see #setText(String)
	 */
	public String getText()
	{
		return this.text;
	}
	
	/**
	 * The string title
	 */
	public LegendTitle setText(final String text)
	{
		this.text = text;
		return this;
	}
}
