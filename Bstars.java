import javax.swing.JOptionPane;

public class Bstars 
{
	public static void main(String[] args) 
	{
		String Stars;
			   
		int s;
		
		Stars=JOptionPane.showInputDialog("Enter your value");
		
		s = Integer.parseInt (Stars);

			for(int i = 0; i <= s; s--) 
			{
				
				for(int j = 1; j <= s; j++)
				{
					System.out.print("*");
				}
			
				System.out.println(" ");
			}
		System.exit (0);
	}
}
