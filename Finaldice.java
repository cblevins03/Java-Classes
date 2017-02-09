// Author - Carson Blevins

import javax.swing.*;

public class Finaldice 
{
	public static void main(String[] args) 
	{
		String guess,
			   play;
		
		int r,
			g,
			f=0,
			w=0,
			p=0;

		while (p==0)
		{
			r = (int)(1 + Math.random() * 8);

			guess=JOptionPane.showInputDialog("Your guess");

			g=Integer.parseInt(guess);

		
			while (r != g)
			{
			
				JOptionPane.showMessageDialog(null, "Sorry.  Try again.");
			
				f++;

				guess=JOptionPane.showInputDialog("Guess again");

				g=Integer.parseInt(guess);
			}
			
			JOptionPane.showMessageDialog(null, "Correct!  Good Job!");

			w++;

			play=JOptionPane.showInputDialog("Would you like to play again? \n 0 for Yes     1 for No");

			p=Integer.parseInt(play);
		}

			JOptionPane.showMessageDialog(null, "Thank you for playing!  You got " + w + " right out of " + f + " tries.");
	}
}
