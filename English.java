import java.swing.*;
public class English 
{
	private String name;
	private String midterm;
	private String finale;
	private String term;
	private String homework;
	private String g;
	private double m;
	private double f;
	private double t;
	private double h;
	private double mf;
	private double ff;
	private double tf;
	private double hf;
	private double pf;
	

	name = JOptionPane.showInputDialog("Enter the student's name");
	
	public void setMidterm()
	{
		midterm = JOptionPane.showInputDialog("Enter Midterm grade");
		m = Double.parseDouble (midterm);

		mf = m * .25;
	}

	public double getMidterm()
	{
		return m;
	}

	public void setFinalExam()
	{
		finale = JOptionPane.showInputDialog("Enter Final Exam grade");
		f = Double.parseDouble (finale);

		ff = f * .25;
	}

	public double getFinalExam()
	{
		return f;
	}
	
	public void setTermPaper()
	{
		term = JOptionPane.showInputDialog("Enter Term Paper grade");
		t = Double.parseDouble (term);

		tf = t * .3;
	}

	public double getTermPaper()
	{
		return t;
	}

	public void setHomework()
	{
		homework = JOptionPane.showInputDialog("Enter homework grade");
		h = Double.parseDouble (homework);

		hf = h * .2;
	}

	public double getHomework()
	{
		return h;
	}

	pf = mf + ff + tf + hf;

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
		JOptionPane.showMessageDialog(null,"English\n\n" + "Midterm: " + m + "\n" + "Final Exam: " + f + "\n" + "Term Paper: " + t + "\n"
		+ "Homework: " + h + "\n" + "Final Grade: " + pf + "%" + g);
	}
}
