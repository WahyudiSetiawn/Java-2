import java.util.*;
public class T1Q1
{
	public static void main(String args[])
	{
		Scanner key = new Scanner (System.in);

		System.out.print("Please input the amount of survey: ");
		int survey = key.nextInt();

		double paid = ((survey/5)*70.00)+((survey%5)*10.00);

		System.out.println("Paid: "+paid);

	}
}