// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Mamin
{
	public static void main ( String args[] )
	{
	String in;
	
	int n,
		a=0,
		m=0;

	int[] numbers = new int[5];
	
	for (int i = 0; i < numbers.length; i++)
	{
	
	in = JOptionPane.showInputDialog("Enter a value");

	numbers[i] = Integer.parseInt (in);

	
	}


	a = Math.max(numbers[0], Math.max(numbers[1], Math.max(numbers[2], Math.max(numbers[3],numbers[4]))));
	
	m = Math.min(numbers[0], Math.max(numbers[1], Math.max(numbers[2], Math.max(numbers[3], numbers[4]))));

	JOptionPane.showMessageDialog(null, "The maximum of your numbers is " + a + ", and the minimum is " + m);

	System.exit (0);
	}
}