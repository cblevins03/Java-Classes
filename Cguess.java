import javax.swing.*;

public class Cguess 
{
	public static void main(String[] args) 
	{
		
		int g,
			f,
			t=0;

		f = (int)(1 + Math.random() * 1000);

		g = (int)(1 + Math.random() * 1000);

			
		while (g != f)
		{
			g = (int)(1 + Math.random() * 1000);

			t++;

		}
		
		JOptionPane.showMessageDialog(null, "The number was " + f + "\nIt took " + t + " tries.");		
	
		System.exit(0);
	}
}
