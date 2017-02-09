// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Finalgrade
{
	public static void main ( String args[] )
	{
		String mid,
			   fin,
			   paper;
		
		Double m,
			   f,
			   p,
			   h;

		String[] work = new String[5];
		
		Double[] homework = new Double[5];
		
		mid = JOptionPane.showInputDialog("Enter Midterm grade");
		m=Double.parseDouble(mid);
		
		fin = JOptionPane.showInputDialog("Enter Final Exam grade");
		f=Double.parseDouble(fin);
		
		paper = JOptionPane.showInputDialog("Enter Term Paper grade");
		p=Double.parseDouble(paper);
		
		for (int i=0; i < 5; i++)
		{
			work[i]=JOptionPane.showInputDialog("Enter Homework grade");
			homework[i]= Double.parseDouble(work[i]);
		}


		h = ((homework[0]+homework[1]+homework[2]+homework[3]+homework[4])/5.0) * .2;

		m = m * .25;
		
		f = f * .25;

	    p = p * .3;

	    h = h + m + f + p;
		
		score(h);
	}


	static void score (Double a)
	{
		if (a < 60)

			JOptionPane.showMessageDialog(null,  a + " F");
	
		else if (a < 63)
	
			JOptionPane.showMessageDialog(null,  a + " D-");
	
		else if (a < 67)
	
			JOptionPane.showMessageDialog(null,  a + " D");
	
		else if (a < 70)
	
			JOptionPane.showMessageDialog(null,  a + " D+");
	
		else if (a < 73)
	
			JOptionPane.showMessageDialog(null,  a + " C-");
	
		else if (a < 77)
	
			JOptionPane.showMessageDialog(null,  a + " C");
	
		else if (a < 80)
	
			JOptionPane.showMessageDialog(null,  a + " C+");
	
		else if (a < 83)
	
			JOptionPane.showMessageDialog(null,  a + " B-");
	
		else if (a < 87)
	
			JOptionPane.showMessageDialog(null,  a + " B");
	
		else if (a < 90)
			
			JOptionPane.showMessageDialog(null,  a + " B+");
	
		else if (a < 93)
	
			JOptionPane.showMessageDialog(null,  a + " A-");
	
		else if (a < 99)
	
			JOptionPane.showMessageDialog(null,  a + " A");
	
		else
	
			JOptionPane.showMessageDialog(null,  a + " A+");

		System.exit (0);
	}	
}
