import java.swing.*;
public class Mathc 
{
	private String name;
	private String midterm;
	private String finale;
	private String homework;
	private String g;
	private double m;
	private double f;
	private double t;
	private double h;
	private double mf;
	private double ff;
	private double hf;
	private double pf;
	

	name = JOptionPane.showInputDialog("Enter the student's name");
	
	public void setMidterm()
	{
		midterm = JOptionPane.showInputDialog("Enter Midterm grade");
		m = Double.parseDouble (midterm);

		mf = m * .3;
	}

	public double getMidterm()
	{
		return m;
	}

	public void setFinalExam()
	{
		finale = JOptionPane.showInputDialog("Enter Final Exam grade");
		f = Double.parseDouble (finale);

		ff = f * .3;
	}

	public double getFinalExam()
	{
		return f;
	}

	public void setHomework()
	{
		homework = JOptionPane.showInputDialog("Enter homework grade");
		h = Double.parseDouble (homework);

		hf = h * .4;
	}

	public double getHomework()
	{
		return h;
	}

	pf = mf + ff + hf;

	if (pf < 60)
	{
		g = " F");
	}
	else if (pf < 70)
	{
		g = " D");
	}
	else if (pf < 80)
	{
		g = " C");
	}
	else if (pf < 90)
	{
		g = " B");
	}
	else
	{
		g = " A");
	}
	
	public void display()
	{
		JOptionPane.showMessageDialog(null,"English\n\n" + "Midterm: " + m + "\n" + "Final Exam: " + f + "\n" + "Homework: " + h + "\n" + "Final Grade: " + pf + "%" + g);
	}
}