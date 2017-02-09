// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Quiz1
{
	public static void main ( String args[] )
	{

	int i=0,
		n,
		s=0,
		e=0,
		d=0;

	int[] roll = new int[11];
	
	for (i = 0; i <= 36000; i++)
	{

		d = (int)(1 + Math.random() * 6);

		e = (int)(1 + Math.random() * 6);
	
		s = d + e;
		
		if (s == 2)
		{
			roll[0]++;
		}
		else if (s == 3)
		{
			roll[1]++;
		}
		else if (s == 4)
		{
			roll[2]++;
		}
		else if (s == 5)
		{
			roll[3]++;
		}
		else if (s == 6)
		{
			roll[4]++;
		}
		else if (s == 7)
		{
			roll[5]++;
		}
		else if (s == 8)
		{
			roll[6]++;
		}
		else if (s == 9)
		{
			roll[7]++;
		}
		else if (s == 10)
		{
			roll[8]++;
		}
		else if (s == 11)
		{
			roll[9]++;
		}
		else
		{
			roll[10]++;
		}
	}
		System.out.println(roll[0]);
		System.out.println(roll[1]);
		System.out.println(roll[2]);
		System.out.println(roll[3]);
		System.out.println(roll[4]);
		System.out.println(roll[5]);
		System.out.println(roll[6]);
		System.out.println(roll[7]);
		System.out.println(roll[8]);
		System.out.println(roll[9]);
		System.out.println(roll[10]);

	System.exit (0);
	}
}