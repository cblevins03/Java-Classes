// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Add
{
	public static void main ( String args[] )
	{
		String num1,
			   num2;
		int number1,
			number2,
			sum,
			diff,
			pro,
			quo;
		
		num1=JOptionPane.showInputDialog("Enter your first number");
		num2=JOptionPane.showInputDialog("Enter your second number");

		number1 = Integer.parseInt (num1);
		number2 = Integer.parseInt (num2);

		sum = number1 + number2;
		diff = number1 - number2;
		pro = number1 * number2;
		quo = number1 / number2;

		JOptionPane.showMessageDialog
			(null, "The sum is " + sum + "\nThe Difference is " + diff + "\nThe Product is " + pro + "\nThe Quotient is " + quo + "");

		System.exit (0);
	}
}