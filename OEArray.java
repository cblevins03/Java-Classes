// Author - Carson Blevins

import javax.swing.*;

public class OEArray
{
	public static void main ( String args[] )
	{
	String number;
	
	int o,
		e;

	int[] value = new int [10];
	
	for (int i = 0; i < value.length; i++)
	{
		number = JOptionPane.showInputDialog("Enter a number");

		value[i] = Integer.parseInt (number);	
	}
	
	String output = "Number\tODD or EVEN";

	for (i = 1; i < value.length; i++)
	{
		output += "\n" + value[i] + "\t" + oddeven(value[i]);
	}

	JTextArea outputArea = new JTextArea();
	outputArea.setText( output );

	JOptionPane.showMessageDialog(null, outputArea, "Odd or Even", JOptionPane.INFORMATION.Message);
	
	System.exit (0);
	}

	static void oddeven (Double a, String b, c)
	{
		b = "Even";
		c = "Odd";

		if (a % 2 == 0)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}