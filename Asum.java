// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Asum
{
	public static void main ( String args[] )
	{
	String in;
	
	double e=0,
		   s=0;

	Double[] numbers = new Double[10];
	
	for (int i = 0; i < numbers.length; i++)
	{
	
	in = JOptionPane.showInputDialog("Enter a value");

	numbers[i] = Double.parseDouble (in);

	s = s + numbers[i];
	
	}
	
	System.out.println("The sum of these values is " + s);

	e = s%2;

	if (e == 0)
	{
		System.out.println("The sum is even.");
	}
	else
	{
		System.out.println("The sum is odd.");
	}

	System.exit (0);
	}
}