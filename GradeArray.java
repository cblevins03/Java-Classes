// Author - Carson Blevins

import javax.swing.*;

public class GradeArray
{
	public static void main ( String args[] )
	{
	String grade;
	
	double g,
		   s=0,
		   a=0,
		   o=0,
		   j=0;

	int[] grades = new int [5];
	
	for (int i = 0; i < grades.length; i++)
	{

		grade = JOptionPane.showInputDialog("Enter a grade");

		grades[i] = Integer.parseInt (grade);
	
		s = grades[i] + s;
		
	}
	
	s = s / grades.length;

	if (s < 60)
	{
		o = (+ s + " F");
	}
	else if (s < 70)
	{
		o = (+ s + " D");
	}
	else if (s < 80)
	{
		o = (+ s + " C");
	}
	else if (s < 90)
	{
		o = (+ s + " B");
	}
	else
	{
		o = (+ s + " A");
	}

	String output = "Scores";

	for (j = 1; j < grades.length; j++)
	{
		output += "\n" + grades[j];
	}

	JTextArea outputArea = new JTextArea();
	outputArea.setText( output );
	

	System.exit (0);
	}
}