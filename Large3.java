import javax.swing.JOptionPane;

public class Large3 
{
	public static void main(String[] args) 
	{
		String jo,
			   ko,
			   lo;
		
		int j,
			k,
			l,
			s;

		jo=JOptionPane.showInputDialog("Enter a number.");
		ko=JOptionPane.showInputDialog("Enter another number.");
		lo=JOptionPane.showInputDialog("Enter even another number.");

		j=Integer.parseInt (jo);
		k=Integer.parseInt (ko);
		l=Integer.parseInt (lo);

		s = large(j,k,l);

		JOptionPane.showMessageDialog(null, "The largest of " + j + ", " + k + ", and " + l + " is " + s);


	}
	
	static int large (int a, int b, int c)
	{

		if (a>b && a>c)
		{
			return a;
		}
		else if (b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}
