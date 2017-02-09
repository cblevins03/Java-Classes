import javax.swing.*;

public class Troll 
{
	public static void main(String[] args) 
	{
		int Roll = 0,
			Roll1 = 0,
			Roll2 = 0,
			Roll3 = 0,
			Roll4 = 0,
			Roll5 = 0,
			Roll6 = 0;

		for (int x = 1; x <= 10; x++)
		{
			Roll = (int)(1 + Math.random() * 6);

			if (Roll == 1)
			{
				Roll1++;
			}
			
			if(Roll == 2)
			{
				Roll2++;
			}

			if (Roll == 3)
			{
				Roll3++;
			}
			
			if (Roll == 4)
			{
				Roll4++;
			}
			
			if (Roll == 5)
			{
				Roll5++;
			}
			
			if (Roll == 6)
			{
				Roll6++;
			}
			
			
		}

		System.out.println(Roll1);
		System.out.println(Roll2);
		System.out.println(Roll3);
		System.out.println(Roll4);
		System.out.println(Roll5);
		System.out.println(Roll6);
	}
}
