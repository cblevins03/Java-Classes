// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Mpg
{
	public static void main ( String args[] )
	{
		String gal,
			   mile;
		int g,
			m,
			mpg=0,
			t=0;
		
		

		for(int x = 1; x <= 3; x++)
		{
			gal=JOptionPane.showInputDialog("How many gallons are in your tank?");
			mile=JOptionPane.showInputDialog("How many miles have you traveled?");

			g = Integer.parseInt (gal);
			m = Integer.parseInt (mile);
			
			mpg = m/g;

			t = t + mpg;

		}
		t = t/3;

		JOptionPane.showMessageDialog(null, t);

		System.exit (0);
	}
}