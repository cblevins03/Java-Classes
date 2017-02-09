import javax.swing.*;
public class  Changeo
{
	private Double t;
	private Double c;
	private Double r;
	private Double p;
	private Double n;
	private Double d;
	private Double q;
	private int d;

	public void setTotal(Double a)
	{
		t = a;
	}

	public void setChange(Double a)
	{
		c = a;
	}

	public Double calculate();
		
		r = c - t;

		while (r <= 1.00)
		{
			r = r - 1;
			
			d++;
		}

		q = r / .25;

		r = r % .25;

		d = r / .10;

		r = r % .10;

		n = r / .05;

		r = r % .05;

		p = r / .01;

		t = d + q + d + n + p;
	}

	public void display()
	{
		JOptionPane.showMessageDialog(null,"The total change will be " +t);
	}
}