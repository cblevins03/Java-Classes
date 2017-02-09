// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Gradea
{
	public static void main ( String args[] )
	{
	String grade;
	
	double g,
		   s=0,
		   a=0;

	int[] grades = new int [8];
	
	for (int i = 0; i < grades.length; i++)
	{

		grade = JOptionPane.showInputDialog("Enter a grade");

		grades[i] = Integer.parseInt (grade);
	
		s = grades[i] + s;
		
	}
	
	s = s / grades.length;

	if (s < 60)
	{
		System.out.println(+ s + " F");
	}
	else if (s < 70)
	{
		System.out.println(+ s + " D");
	}
	else if (s < 80)
	{
		System.out.println(+ s + " C");
	}
	else if (s < 90)
	{
		System.out.println(+ s + " B");
	}
	else
	{
		System.out.println(+ s + " A");
	}

	System.exit (0);
	}
}