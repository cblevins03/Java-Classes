// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Commission
{	
	public static void main ( String args[] )
	{	
		String sales,
		   n;

		Double x=1.0,
			   s;
		
		while (x <= 3)
		{
		
			n=JOptionPane.showInputDialog("Enter Name");
		
			sales=JOptionPane.showInputDialog("Enter your sales");

			s = Double.parseDouble (sales);
		
			if(s <= 50000)
			{
				s = s + 1000;
			}	
			else
			{
				if(s <= 100000)
				{
					s = ((s - 50000) * .075) + 3000;
				}
				else
				{
					s = ((s - 100000) * .1) + 7500;
				}
			}
			JOptionPane.showMessageDialog
				(null, n + ": " + s);
		
		}
	System.exit (0);
	}
}