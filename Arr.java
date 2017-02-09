// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Arr
{
	public static void main ( String args[] )
	{
	String in;
	
	int n,
		s=0,
		c=0,
		sum=0;

	int[] numbers = new int[5];
	
	for (int i = 0; i < numbers.length; i++)
	{
	
	in = JOptionPane.showInputDialog("Enter a value");

	numbers[i] = Integer.parseInt (in);

	s = numbers[i] * numbers[i];

	c = numbers[i] * numbers[i] * numbers[i];

	System.out.println(numbers[i] + " " + s + " " + c);
	
	}

	System.exit (0);
	}
}