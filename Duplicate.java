import java.util.Arrays;
import javax.swing.JOptionPane;

public class Duplicate 
{
	public static void main(String[] args) 
	{

		String in;
		
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++)
		{
			in=JOptionPane.showInputDialog("Enter a number from 1 to 10");
			numbers[i]=Integer.parseInt (in);
		}
		
		if (numbers[0] == numbers[1])
		{
			System.out.println("The numbers for place 1 and 2 are duplicates");
			
			if (numbers[0] == numbers[2])
			{
				System.out.println("The numbers for place 1 and 3 are duplicates");

				if (numbers[0] == numbers[3])
				{
					System.out.println("The numbers for place 1 and 4 are duplicates");

					if (numbers[0] == numbers[4])
					{
						System.out.println("The numbers for place 1 and 5 are duplicates");

						if (numbers[1] == numbers[2])
						{
							System.out.println("The numbers for place 2 and 3 are duplicates");

							if (numbers[1] == numbers[3])
							{
								System.out.println("The numbers for place 2 and 4 are duplicates");

								if (numbers[1] == numbers[4])
								{
									System.out.println("The numbers for place 2 and 5 are duplicates");

									if (numbers[2] == numbers[3])
									{
										System.out.println("The numbers for place 3 and 4 are duplicates");

										if (numbers[2] == numbers[4])
										{
											System.out.println("The numbers for place 3 and 5 are duplicates");

											if (numbers[3] == numbers[4])
											{
												System.out.println("The numbers for place 4 and 5 are duplicates");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		for (int a = 0; a < numbers.length; a++)
		{
			System.out.println(numbers[a]);
		}
		
		System.exit(0);
	}	
}
