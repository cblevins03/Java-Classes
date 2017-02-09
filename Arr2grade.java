import javax.swing.*;

public class Arr2grade 
{
	public static void main(String[] args) 
	{
		
		Double t=0.0,
			   h=0.0,
			   l=0.0,
			   a=0.0,
			   b=0.0,
			   c=0.0,
			   d=0.0,
			   f=0.0,
			   o=0.0;
		
		Double [] [] students = 
		{
			{87.0, 96.0, 70.0},
			{68.0, 87.0, 90.0},
			{94.0, 100.0, 90.0},
			{100.0, 81.0, 82.0},
			{83.0, 65.0, 85.0},
			{78.0, 87.0, 65.0},
			{85.0, 75.0, 83.0},
			{91.0, 94.0, 100.0},
			{76.0, 72.0, 84.0},
			{87.0, 93.0, 73.0}
		};

			for(int i = 0; i < students.length; i++) 
			{
				for(int j = 0; j < 3; j++)
				{
					t = t + students[i][j];
				}
				
				t = t/3;

				System.out.println("Student " + (i+1) + " Average: " + t);
				
				t = 0.0;
			}

			h = students[0][0];
			
			for(int i = 0; i < students.length; i++) 
			{
				for(int j = 0; j < 3; j++)
				{
					if (h > students[i][j])
					{
					}
					else
					{
						h = students[i][j];
					}
				}
			}

		System.out.println("Highest: " + h);

		l = students[0][0];
			
			for(int i = 0; i < students.length; i++) 
			{
				for(int j = 0; j < 3; j++)
				{
					if (l < students[i][j])
					{
					}
					else
					{
						l = students[i][j];
					}
				}
			}

		System.out.println("Lowest: " + l);

		for(int i = 0; i < students.length; i++) 
			{
				for(int j = 0; j < 3; j++)
				{
					if (59.0 <= students[i][j])
					{
						f++;

						if (69.0 <= students[i][j])
						{
							d++;

							if (79.0 <= students[i][j])
							{
								c++;

								if (89.0 <= students[i][j])
								{
									b++;

									if (99.0 <= students[i][j])
									{
										a++;

										if (100.0 <= students[i][j])
										{
											o++;
										}
									}
								}
							}
						}
					}
				}
			}
		System.out.print("50-59: ");
		
		for (int i = 1; i <= f; i++)
		{
			System.out.print("*");
		}

		System.out.println(" ");

		System.out.print("60-69: ");
		
		for (int i = 1; i <= d; i++)
		{
			System.out.print("*");
		}

		System.out.println(" ");

		System.out.print("70-79: ");
		
		for (int i = 1; i <= c; i++)
		{
			System.out.print("*");
		}

		System.out.println(" ");

		System.out.print("80-89: ");
		
		for (int i = 1; i <= b; i++)
		{
			System.out.print("*");
		}

		System.out.println(" ");

		System.out.print("90-99: ");
		
		for (int i = 1; i <= a; i++)
		{
			System.out.print("*");
		}

		System.out.println(" ");

		System.out.print("100: ");
		
		for (int i = 1; i <= o; i++)
		{
			System.out.print("*");
		}

		
		System.exit (0);
	}
}
