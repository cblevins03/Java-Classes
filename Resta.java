// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Resta
{
	public static void main ( String args[] )
	{
		String pizza,
			   sand,
			   drink,
			   pep,
			   che,
			   eve,
			   str,
			   hac,
			   coke,
			   drp,
			   pepsi;

		Double pi,
			sa,
			d,
			p=0.0,
			c=0.0,
			e=0.0,
			s=0.0,
			h=0.0,
			co=0.0,
			dr=0.0,
			pe=0.0,
			t=0.0,
			ta=0.0,
			sub=0.0;

		pizza=JOptionPane.showInputDialog("Would you like pizza?  1 for yes or 2 for no");
		pi = Double.parseDouble (pizza);

		if (pi == 1)
		{
			pep=JOptionPane.showInputDialog("How many Pepperoni pizzas would you like?");
			che=JOptionPane.showInputDialog("How many Cheese pizzas would you like?");
			eve=JOptionPane.showInputDialog("How many Everything pizzas would you like?");
			p = Double.parseDouble(pep);
			c = Double.parseDouble(che);
			e = Double.parseDouble(eve);

			t = (p*10) + (c*8) + (e*12);
		}
		
		
		sand=JOptionPane.showInputDialog("Would you like a sandwich?  1 for yes or 2 for no");
		sa = Double.parseDouble(pizza);

		if (sa == 1)
		{
			str=JOptionPane.showInputDialog("How many Stromboli sandwiches would you like?");
			hac=JOptionPane.showInputDialog("How many Ham and Cheese sandwiches would you like?");
			s = Double.parseDouble(str);
			h = Double.parseDouble(hac);

			t = t + ((s*7) + (h*6));
		}
		
		drink=JOptionPane.showInputDialog("Would you like a drink?  1 for yes or 2 for no");
		d = Double.parseDouble(drink);

		if (d == 1)
		{
			coke=JOptionPane.showInputDialog("How many Cokes would you like?");
			drp=JOptionPane.showInputDialog("How many Dr. Peppers would you like?");
			pepsi=JOptionPane.showInputDialog("How many Pepsis would you like?");
			co = Double.parseDouble(coke);
			dr = Double.parseDouble(drp);
			pe = Double.parseDouble(pepsi);


			t = t + ((co*1) + (d*1) + (pe*1));

			sub = t;
			
			ta = t * .06;

			t = t + ta;
		}
			JOptionPane.showMessageDialog
				(null, "Pepperoni " + p + "\nCheese " + c + "\nEverything " + e + "\nStromboli " + s + "\nHam and Cheese " 
				+ h + "\nCoke " + co + "\nDr. Pepper " + dr + "\nPepsi " + pe + "\nSub Total " + sub + "\nTotal " + t);
	System.exit (0);
	}
}