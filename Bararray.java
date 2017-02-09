import javax.swing.*;

public class Bararray 
{
	public static void main(String[] args) 
	{
		int[] stars = new int[5];

		for (int i = 0; i <= 4; i++)
		{
			stars[i] = (int)(2 + Math.random() * 8);
		}
		
		while (stars[0] > 0)
		{
			System.out.print("*");

			stars[0]= stars[0] - 1;
		}

		System.out.println(" ");

		while (stars[1] > 0)
		{
			System.out.print("*");

			stars[1]= stars[1] - 1;
		}

		System.out.println(" ");

		while (stars[2] > 0)
		{
			System.out.print("*");

			stars[2]= stars[2] - 1;
		}

		System.out.println(" ");

		while (stars[3] > 0)
		{
			System.out.print("*");

			stars[3]= stars[3] - 1;
		}

		System.out.println(" ");

		while (stars[4] > 0)
		{
			System.out.print("*");

			stars[4]= stars[4] - 1;
		}

		System.out.println(" ");

		System.exit(0);
	}
}