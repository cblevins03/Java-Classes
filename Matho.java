import javax.swing.*;
public class  Matho
{
	private int ad;
	private int sub;
	private int mul;
	private int div;
	private int lar;
	private int sma;

	public void setAdd(int a, int b)
	{
		ad = a + b;
	}
	
	public int getAdd()
	{
		return ad;
	}

	public void setSubtract(int a, int b)
	{
		sub = a - b;
	}

	public int getSubtract()
	{
		return sub;
	}

	public void setMultiply(int a, int b)
	{
		mul = a * b;
	}

	public int getMultiply()
	{
		return mul;
	}

	public void setDivide(int a, int b)
	{
		div = a / b;
	}

	public int getDivide()
	{
		return div;
	}

	public void setLargest(int a, int b)
	{
		if (a > b)
		{
			lar = a;
		}
		else
		{
			lar = b;
		}
	}

	public int getLargest()
	{
		return lar;
	}

	public void setSmallest(int a, int b)
	{
		if (a < b)
		{
			sma = a;
		}
		else
		{
			sma = b;
		}
	}

	public int getSmallest()
	{
		return sma;
	}

	public void display()
	{
		JOptionPane.showMessageDialog(null,"Math\n\n" + "Add: " + ad + "\n" + "Subtract: " + sub + "\n" + "Multiply: " + mul + "\n"
		+ "Divide: " + div + "\n" + "Largest: " + lar + "\n" + "Smallest: " + sma);
	}
}
