import java.util.Arrays;
import javax.swing.JOptionPane;

public class Arr5 
{
	public static void main(String[] args) 
	{

		String in;
		
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++)
		{
			in=JOptionPane.showInputDialog("Enter a value");
			numbers[i]=Integer.parseInt (in);
		}
		
		Arrays.sort(numbers);

		for (int a = 0; a < numbers.length; a++)
		{
			System.out.println(numbers[a]);
		}
		
		System.exit(0);
	}	
}

