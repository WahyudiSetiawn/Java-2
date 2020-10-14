import java.util.*;

public class T1Q3Main
{
	public static void main(String args[])
	{
		Scanner key = new Scanner(System.in);

		Point p = new Point();
		Circle c1 = new Circle();
		System.out.print("Input Point(x): ");
		p.setX(key.nextDouble());
		System.out.print("Input Point(y): ");
		p.setY(key.nextDouble());
		//dividing line (garis pemisah)
		System.out.println("");
		System.out.print("Input Circle(x): ");
		c1.centre.setX(key.nextDouble());
		System.out.print("Input Circle(y): ");
		c1.centre.setY(key.nextDouble());
		System.out.print("Input Circle(r): ");
		c1.setRadius(key.nextDouble());

		double x = p.getX() - c1.centre.getX();
		double y = p.getY() - c1.centre.getY();
		double d = Math.sqrt(Math.pow(x,2) - Math.pow(y,2));

		if (d < c1.radius)
		{
			System.out.println("Inside the circle");
		}

		else if (d == c1.radius)
		{
			System.out.println("On the circle");
		}

		else
		{
			System.out.println("Outside the circle");
		}
	}
}



