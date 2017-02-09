import javax.swing.JOptionPane;

public class Ch6_3 
{
	public static void main(String[] args) 
	{
		String jo,
				ko;
		
		int j=0,
			k=0,
			s;

		jo=JOptionPane.showInputDialog("Enter a number.");
		ko=JOptionPane.showInputDialog("Enter another number.");

		j=Integer.parseInt (jo);
		k=Integer.parseInt (ko);

		s = add(j,k);

		JOptionPane.showMessageDialog(null, "The sum of " + j + " and " + k + " is " + s);



	}
	
	static int add (int a, int b)
	{

		a = a + b;

		return a;
	}

}
