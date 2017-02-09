import javax.swing.JOptionPane;

public class Large5 
{
	public static void main(String[] args) 
	{
		String j1,
			   k2,
			   l3,
			   m4,
			   n5;
		
		int j,
			k,
			l,
			m,
			n,
			s=0;

		j1=JOptionPane.showInputDialog("Enter a number.");
		k2=JOptionPane.showInputDialog("Enter another number.");
		l3=JOptionPane.showInputDialog("Enter even another number.");
		m4=JOptionPane.showInputDialog("Enter even another number.");
		n5=JOptionPane.showInputDialog("Enter even another number.");


		j=Integer.parseInt (j1);
		k=Integer.parseInt (k2);
		l=Integer.parseInt (l3);
		m=Integer.parseInt (m4);
		n=Integer.parseInt (n5);

		s = large(j,k,l,m,n);

		JOptionPane.showMessageDialog(null, "The largest of " + j + ", " + k + ", "+ l +", "+ m +" and " + n + " is " + s);


	}
	
	static int large (int a, int b, int c, int d, int e)
	{
		a = Math.max(a, Math.max(b, Math.max(c, Math.max(d,e))));

		return a;
	}
}
