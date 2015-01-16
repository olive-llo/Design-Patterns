package objets_de_base;

public class Coord3D
{
	private double x;
	private double y;
	private double z;
	
	public Coord3D()
	{
		x = 0.0;
		y = 0.0;
		z = 0.0;
	}

	
	public Coord3D(double x, double y, double z)
	{
		this();
		this.x = x;
		this.y = y;
		this.z = z;
	}


	@Override
	public String toString()
	{
		return "Coord3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}


	public double getX()
	{
		return x;
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


	public double getZ()
	{
		return z;
	}

	public void setZ(double z)
	{
		this.z = z;
	}
}
