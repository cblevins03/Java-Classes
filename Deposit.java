// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Deposit
{
	public static void main ( String args[] )
	{
		String loan;
		Double l,
			t;
			
		loan=JOptionPane.showInputDialog("Please enter your loan amount");

		l = Double.parseDouble (loan);
		
		if(l >= 100001)
		{
			JOptionPane.showMessageDialog(null, "We do not except loans over $100000");
			
			System.exit (0);

		}
		
		if (l >= 50000)
		{
			l = 5000 + ((l - 50000) * .25);
			
			JOptionPane.showMessageDialog(null, "Your deposit is $" + l + "");
			
			System.exit (0);
		}
		
		if (l >= 25000)
		{
			l = 1250 + ((l - 25000) * .1);

			JOptionPane.showMessageDialog(null, "Your deposit is $" + l + "");
								
			System.exit (0);
		}
		
		if (l <= 24999)
		{
			l = l * .1;

			JOptionPane.showMessageDialog(null, "Your deposit is $" + l + "");
			
			System.exit (0);
		}
	}
}