// Author - Carson Blevins

import javax.swing.*;

public class Payroll
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
	
	public static void main ( String args[] )
	{
		
		x=1;
		
		String output = "Name\tHours Worked\tHourly Wage";

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
						
					output += "\n" + name + "\t" + hrwork + "\t" + hrwage;
						
					JTextArea outputArea = new JTextArea();
					outputArea.setText( output );
				}
				else
				{
				  over = work - 40;
				  profit = 40 * wage;
				  overwage = 1.5 * wage;
				  overwage = over * overwage;
				  profit = profit + overwage;
				  
				  output += "\n" + name + "\t" + hrwork + "\t" + hrwage;
						
				  JTextArea outputArea = new JTextArea();
				  outputArea.setText( output );
				}
				x++;
			}
	}	

		JOptionPane.showMessageDialog(null, outputArea, "Payroll", JOptionPane.INFORMATION.Message);

		System.exit (0);
	}
}