// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Sales
{
	public static void main ( String args[] )
	{
		String sales;

		Double s;

		sales=JOptionPane.showInputDialog("Enter your sales");

		s = Double.parseDouble (sales);
		
		if(s <= 50000)
		{
			 s=1000;
		}	
		else
		{
			if(s <= 100000)
			{
				s = ((50000-s) * .5) + 2000;
			}
			else
			{
				s = ((100000-s) * .1) + 4000;
			}
		}
			JOptionPane.showMessageDialog
				(null, s);
	System.exit (0);
	}
}