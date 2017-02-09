import javax.swing.*;

public class Roulette 
{
	public static void main(String[] args) 
	{
		String guess;
		
		int a,
			b,
			g=0,
			p=1000;

		while (p != 0)
		{
			b = JOptionPane.showMessageDialog(null, "How much are you willing to risk?");
		
			g = JOptionPane.showMessageDialog(null, "What is your number?");
		
			a = (int)(1 + Math.random() * 36);

			if (g == a)
			{
				JOptionPane.showMessageDialog(null, "You won!!!");
				
				z = (b * 10) + p;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry, you lost this round.");
				
				z = p - b;
			
				JOptionPane.showMessageDialog(null, "Would you like to play again?  Enter 1 for yes and 2 for no.");

				
				if ()
				{
				}
			
			}
			

		}
		
		JOptionPane.showMessageDialog(null, "Thanks for playing");		
	
		System.exit(0);
	}
		
}
