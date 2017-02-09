import javax.swing.JOptionPane;

public class Stars 
{
	public static void main(String[] args) 
	{
		String Stars;
			   
		int s;
		
		Stars=JOptionPane.showInputDialog("Enter your value");
		
		s = Integer.parseInt (Stars);

			for(int i = 1; i <= s; i++) 
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print("*");
				}
				System.out.println(" ");
			}
		System.exit (0);
	}
}
