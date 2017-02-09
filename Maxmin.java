import javax.swing.JOptionPane;

public class Maxmin 
{
	public static void main(String[] args) 
	{
		String j1,
			   k2,
			   l3,
			   m4,
			   n5,
			   o6,
			   p7,
			   q8,
			   r9,
			   s10;
		
		int a,
			b,
			j,
			k,
			l,
			m,
			n,
			o,
			p,
			q,
			r,
			s;

		j1=JOptionPane.showInputDialog("Enter a number.");
		k2=JOptionPane.showInputDialog("Enter another number.");
		l3=JOptionPane.showInputDialog("Enter even another number.");
		m4=JOptionPane.showInputDialog("Enter even another number.");
		n5=JOptionPane.showInputDialog("Enter even another number.");
		o6=JOptionPane.showInputDialog("Enter even another number.");
		p7=JOptionPane.showInputDialog("Enter even another number.");
		q8=JOptionPane.showInputDialog("Enter even another number.");
		r9=JOptionPane.showInputDialog("Enter even another number.");
		s10=JOptionPane.showInputDialog("Enter even another number.");


		j=Integer.parseInt (j1);
		k=Integer.parseInt (k2);
		l=Integer.parseInt (l3);
		m=Integer.parseInt (m4);
		n=Integer.parseInt (n5);
		o=Integer.parseInt (o6);
		p=Integer.parseInt (p7);
		q=Integer.parseInt (q8);
		r=Integer.parseInt (r9);
		s=Integer.parseInt (s10);

		a = Math.max(j, Math.max(k, Math.max(l, Math.max(m, Math.max(n, Math.max(o, Math.max(p, Math.max(q, Math.max(r,s)))))))));

		b = Math.min(j, Math.min(k, Math.min(l, Math.min(m, Math.min(n, Math.min(o, Math.min(p, Math.min(q, Math.min(r,s)))))))));

		JOptionPane.showMessageDialog(null, "The maximum of these numbers is " + a );
		JOptionPane.showMessageDialog(null, "The minimum of these numbers is " + b );
	}
}
