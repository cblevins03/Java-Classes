// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Quiz2
{
	public static void main ( String args[] )
	{
		String grade;
	
		Double g,
			   s,
			   a;

		Double [] grades = new Double [4];
		
		for (int i = 0; i < grades.length; i++)
		{
	
			grade = JOptionPane.showInputDialog("Enter a grade");

			grades[i] = Double.parseDouble(grade);
		
		}

		s = average(grades);

		a = score(s);
	
	}

	static Double average (Double[])
	{
		a = (a + b + c + d + e)/5;

		return a;
	}


	static Double score (Double a)
	{
	if (a < 60)

		System.out.println( a + " F");
	
	else if (a < 63)
	
		System.out.println( a + " D-");
	
	else if (a < 67)
	
		System.out.println( a + " D");
	
	else if (a < 70)
	
		System.out.println( a + " D+");
	
	else if (a < 73)
	
		System.out.println( a + " C-");
	
	else if (a < 77)
	
		System.out.println( a + " C");
	
	else if (a < 80)
	
		System.out.println( a + " C+");
	
	else if (a < 83)
	
		System.out.println( a + " B-");
	
	else if (a < 87)
	
		System.out.println( a + " B");
	
	else if (a < 90)
	
		System.out.println( a + " B+");
	
	else if (a < 93)
	
		System.out.println( a + " A-");
	
	else if (a < 99)
	
		System.out.println( a + " A");
	
	else
	
		System.out.println( a + " A+");
	}
}