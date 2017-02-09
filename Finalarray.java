// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Finalarray
{
	public static void main ( String args[] )
	{
	String in;
	
	int a=0,
		b=0,
		c=0,
		d=0,
		e=0,
		f=0,
		sum=0;

	int[] numbers = new int[3];

	int[] mintomax = new int[3];
	
	for (int i = 0; i < numbers.length; i++)
	{
	in = JOptionPane.showInputDialog("Enter a value");

	numbers[i] = Integer.parseInt(in);
	}

	mintomax[0] = Math.min(numbers[0], Math.min(numbers[1], numbers[2]));

	mintomax[2] = Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
	
	a = numbers[0];

	b = numbers[1];

	c = numbers[2];

	d = mintomax[0];

	e = mintomax[2];

	if (a != d && a != e)
		{
			mintomax[1] = a;
		}
	
	if (b != d && b != e)
		{
			mintomax[1] = b;
		}
	
	if (c != d && c != e)
		{
			mintomax[1] = c;
		}

	f = mintomax[1];

	JOptionPane.showMessageDialog(null, d + ", " + f + ", " + e);
	
	System.exit (0);
	}
}