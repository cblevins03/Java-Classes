// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Overprofit3
{
	public static void main ( String args[] )
	{
		String hrwage,
			   hrwork,
			   name;
		int x;

		Double wage,
			   work,
			   profit,
			   over,
			   overwage;

		x=1;

		while(x<=3)
		{
			name=JOptionPane.showInputDialog("Enter your name");
			hrwage=JOptionPane.showInputDialog("Enter your hourly wage");
			hrwork=JOptionPane.showInputDialog("Enter how many hours you work");

			wage = Double.parseDouble (hrwage);
			work = Double.parseDouble (hrwork);

			if (work <= 40)
			{
				  profit = wage * work;
					JOptionPane.showMessageDialog
				(null, "Name: " + name + "\nTotal Check: " + profit + "");
			}
			else
			{
			  over = work - 40;
			  profit = 40 * wage;
			  overwage = 1.5 * wage;
			  overwage = over * overwage;
			  profit = profit + overwage;
			  JOptionPane.showMessageDialog
			(null, "Name: " + name + "\nTotal Check: " + profit + "");
			}
			x++;
		}
		System.exit (0);
	}
}