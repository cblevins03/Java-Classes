import javax.swing.*;

public class Guess 
{
	public static void main(String[] args) 
	{
		String guess;
		
		int g=0,
			f;

		f = (int)(1 + Math.random() * 1000);

		guess=JOptionPane.showInputDialog("Guess a number between 1 and 1000.");

		g=Integer.parseInt (guess);
			
		while (g != f)
		{
			if (f < g)
			{
				JOptionPane.showMessageDialog(null, "Lower");
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Higher");
			}
			
			guess=JOptionPane.showInputDialog("Guess again.");

			g=Integer.parseInt (guess);

		}
		
		JOptionPane.showMessageDialog(null, "You got it!!!! The number was " + f);		
	
		System.exit(0);
	}
}
