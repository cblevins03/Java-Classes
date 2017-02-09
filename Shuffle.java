import javax.swing.*;
public class  Shuffle
{
	private int j=0;
	private int h=0;
	int[] p1 = new int[13];
	int[] p2 = new int[13];
	int[] p3 = new int[13];
	int[] p4 = new int[13];

	public void createhands()
		
	int[] deck = new int[51];

	for (int i=0;i <= deck.length; i++)
	{
		deck[i] = j + 1;
	}

	for (int i=0; i < deck.length; i++) 
	{
      int index = (int)(1 + Math.random() * deck.length);
      
	  int temp = deck[i];
      
	  deck[i] = deck[index];
      
	  deck[index] = temp;
	}
	
	for (int i=0; i <= 12; i++)
	{
		p1[i] = deck[h];

		h++;

		p2[i] = deck[h];

		h++;

		p3[i] = deck[h];

		h++;

		p4[i] = deck[h];

		h++;
	}

	public void display()
	{
		JOptionPane.showMessageDialog(null,"Player 1: " + p1[] + "\nPlayer 2: " + p2[] + "\nPlayer 3: " + p3[] + "\nPlayer 4: " + p4[]);
	}
}
