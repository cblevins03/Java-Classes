// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Steward
{
	public static void main ( String args[] )
	{
		String height,
			   weight;
		int h,
			w;
			
		height=JOptionPane.showInputDialog("Please enter height");
		weight=JOptionPane.showInputDialog("Please enter weight");

		h = Integer.parseInt (height);
		w = Integer.parseInt (weight);
		
		if(h <= 72)
		{
			if (w <= 150)
			{
				JOptionPane.showMessageDialog(null, "You can be a steward!!!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry, you cannot be a steward.");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, you cannot be a steward.");
		}

		System.exit (0);
	}
}