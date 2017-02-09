import javax.swing.*;

public class Flip 
{
	public static void main(String[] args) 
	{
		String guess;
		
		int f,
			g,
			r = 0,
			w = 0;

		for (int x = 1; x <= 5; x++)
		{
			guess=JOptionPane.showInputDialog("Enter 1 for Heads or 2 for Tails?");

			g=Integer.parseInt (guess);
			
			f = (int)(1 + Math.random() * 2);

			if (g == f)
			{
				System.out.println("You guessed correctly!");
				
				r++;
			}
			else
			{
				System.out.println("Sorry, you guessed wrong.");
				
				w++;
			}
			
		}

		System.out.println("You guessed " + r + " right");
		System.out.println("You guessed " + w + " wrong");
	}
}
