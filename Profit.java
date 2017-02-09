// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Profit
{
	public static void main ( String args[] )
	{
		String hrwage,
			   hrwork,
			   name;
		int wage,
			work,
			profit;
		
		name=JOptionPane.showInputDialog("Enter your name");
		hrwage=JOptionPane.showInputDialog("Enter your hourly wage");
		hrwork=JOptionPane.showInputDialog("Enter how many hours you work");

		wage = Integer.parseInt (hrwage);
		work = Integer.parseInt (hrwork);

		profit = wage * work;

		JOptionPane.showMessageDialog
			(null, "Name: " + name + "\nTotal Check: " + profit + "");

		System.exit (0);
	}
}