// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Randsum
{
	public static void main ( String args[] )
	{
	String in;
	
	int t=0;

	int[] numbers = new int[5];
	
	for (int i = 0; i < numbers.length; i++)
	{

	numbers[i] = (int)(1 + Math.random() * 1000);
	
	t = numbers[i] + t;

	}

	System.out.println(numbers[0] + "\n" + numbers[1] + "\n" + numbers[2] + "\n" + numbers[3] + "\n" + numbers[4] + "\nTotal: " + t);

	System.exit (0);
	}
}