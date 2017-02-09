import javax.swing.*;

public class Roll 
{
	public static void main(String[] args) 
	{
		int Roll = 0;

		for (int x = 1; x <= 10; x++)
		{
			Roll = (int)(1 + Math.random() * 6);

			System.out.println(Roll);
		}
	}
}
