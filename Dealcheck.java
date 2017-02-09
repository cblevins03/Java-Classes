import javax.swing.*;

public class Dealcheck 
{
	public static void main(String[] args) 
	{
		int temp=0;
		
		int[] deck = new int[51];

		for (int i=0;i <= deck.length; i++)
		{
			temp = (int)(1 + Math.random() * 52);

			for (int j=0; j <= deck.length; j++)
			{
				if (temp != deck[j])
				{
				}
				else
				{
					temp = (int)(1 + Math.random() * 52);
				}
			}
		
			deck[i] = temp;
		}

		JOptionPane.showMessageDialog(null, deck);
		
		System.exit(0);
		}
}