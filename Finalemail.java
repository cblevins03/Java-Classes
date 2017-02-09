// Author - Carson Blevins

import javax.swing.JOptionPane;

public class Finalemail
{
	public static void main ( String args[] )
	{
		String first,
			   last,
			   email;
		

		first=JOptionPane.showInputDialog("What is your first name?");
		last=JOptionPane.showInputDialog("What is your last name?");
		email=JOptionPane.showInputDialog("What is your email?");

		JOptionPane.showMessageDialog(null, "Welcome, " + first + last + " to our website! \n \n We will be sending an email to your email address: \n" + email);

		System.exit (0);
	}
}