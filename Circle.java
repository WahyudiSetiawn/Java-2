public class Circle
{
	public Point centre = new Point();
	public double radius;

	public Circle(double radius, double x, double y)
	{
		this.radius = radius;
	}

	public Circle()
	{
		this.centre.setX(0);
		this.centre.setX(0);
		this.radius = 0;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public double getRadius()
	{
		return this.radius;
	}
}