import javax.swing.*;

public class Contguess 
{
	public static void main(String[] args) 
	{
		int f,
			g,
			r=0;

		f = (int)(1 + Math.random() * 1000000);

		g = (int)(1 + Math.random() * 1000000);

		while (f != g)
		{
			r++;

			g = (int)(1 + Math.random() * 1000000);
		}

		JOptionPane.showMessageDialog(null, "The computer finally matched the number " + f + ".  It took " + r + " guesses.");
	}
}
