// Author - Carson Blevins

import javax.swing.*;

public class GradesObject
{
	public static void main ( String args[] )
	{
		String a1;

		int a;
		a1 = JOptionPane.showInputDialog("Which class would you like to enter grades for?\nEnter 1 for English\nEnter 2 for Math\nEnter 3 for Programming");
		a = Double.parseDouble (a1);
		
		if (a == 1)
		{
			English x = new English();

			x.setMidterm();
			x.setFinalExam();
			x.setTermPaper();
			x.setHomework();
			x.display();
		}
		else if (a == 2)
		{
			Mathc x = new Mathc();

			x.setMidterm();
			x.setFinalExam();
			x.setHomework();
			x.display();
		}
		else
		{
			Programming x = new Programming();

			x.setMidterm();
			x.setFinalExam();
			x.setHomework();
			x.display();
		}

		System.exit(0);
	}
}