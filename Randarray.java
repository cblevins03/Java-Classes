import javax.swing.*;

public class Randarray 
{
	public static void main(String[] args) 
	{
		int Roll = 0;

		int[] rolls = new int[10];

		for (int x = 1; x <= 1000; x++)
		{
			Roll = (int)(1 + Math.random() * 10);

			if (Roll == 1)
			{
				rolls[0]++;
			}
			
			if(Roll == 2)
			{
				rolls[1]++;
			}

			if (Roll == 3)
			{
				rolls[2]++;
			}
			
			if (Roll == 4)
			{
				rolls[3]++;
			}
			
			if (Roll == 5)
			{
				rolls[4]++;
			}
			
			if (Roll == 6)
			{
				rolls[5]++;
			}

			if (Roll == 7)
			{
				rolls[6]++;
			}

			if (Roll == 8)
			{
				rolls[7]++;
			}

			if (Roll == 9)
			{
				rolls[8]++;
			}

			if (Roll == 10)
			{
				rolls[9]++;
			}
			
			
		}

		System.out.println("1: " + rolls[0]);
		System.out.println("2: " + rolls[1]);
		System.out.println("3: " + rolls[2]);
		System.out.println("4: " + rolls[3]);
		System.out.println("5: " + rolls[4]);
		System.out.println("6: " + rolls[5]);
		System.out.println("7: " + rolls[6]);
		System.out.println("8: " + rolls[7]);
		System.out.println("9: " + rolls[8]);
		System.out.println("10: " + rolls[9]);
	}
}
