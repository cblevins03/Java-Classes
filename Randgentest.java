import javax.swing.*;

public class Randgentest 
{
	public static void main(String[] args) 
	{
		int Roll = 0;

		int[] stars = new int[5];

		for (int i = 0; i <= stars.length; i++)
		{
			stars[i] = (int)(2 + Math.random() * 8);
		
			System.out.println(stars[4]);
		}
		
		System.exit(0);
	}
}