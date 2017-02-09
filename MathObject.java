// Author - Carson Blevins

import javax.swing.*;

public class MathObject
{
	public static void main ( String args[] )
	{

		Matho x = new Matho();

		x.setAdd(20,5);
		x.setSubtract(20,5);
		x.setMultiply(20,5);
		x.setDivide(20,5);
		x.setLargest(20,5);
		x.setSmallest(20,5);
		x.display();

		System.exit(0);
	}
}