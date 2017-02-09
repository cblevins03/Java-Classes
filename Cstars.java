import javax.swing.JOptionPane;

public class Cstars 
{
	public static void main(String[] args) 
	{
		String Stars;
			   
		int s;
		
		Stars=JOptionPane.showInputDialog("Enter your value");
		
		s = Integer.parseInt (Stars);
			
			for(int i = 1; i <= s; i++) 
			{
				for(int j = 1; j <= s-i; j++)
				{
					System.out.print(" ");
				}
					for(int k = 1; k < i; k++)
					{
						System.out.print("*");
					}
					
				System.out.println("*");
			}
		System.exit (0);
	}
}