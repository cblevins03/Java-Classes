// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Try
{
	public static void main ( String args[] )
	{
		String sales;

		Double s;

		sales=JOptionPane.showInputDialog("Enter your sales");

		s = Double.parseDouble (sales);
		
		if(s <= 5000)
		{
			s = (s * .1) + 1000;
		}	
		else
		{
			if(s <= 250000)
			{
				s = (s * .15) + 2000;
			}
			else
			{
				s = (s * .2) + 3000;
			}
		}
			JOptionPane.showMessageDialog
				(null, "I hope this \n works");
	System.exit (0);
	}
}