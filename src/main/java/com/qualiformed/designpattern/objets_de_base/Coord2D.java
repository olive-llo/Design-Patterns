package objets_de_base;

public class Coord2D
{
	private double x;
	private double y;
	
	public Coord2D()
	{
		x = 0.0;
		y = 0.0;
	}

	
	public Coord2D(double x, double y)
	{
		this();
		this.x = x;
		this.y = y;
	}


	public double getX()
	{
		return x;
	}

	@Override
	public String toString()
	{
		return "Coord2D [x=" + x + ", y=" + y + "]";
	}


	public void setX(double x)
	{
		this.x = x;
	}

	public double getY()
	{
		return y;
	}

	public void setY(double y)
	{
		this.y = y;
	}
}
