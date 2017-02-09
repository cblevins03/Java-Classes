public class Sum
{
	public static void main ( String args[] )
	{
		int t=0;
			
		for(int x = 1; x >= 1000; x += 3)
		{
			t = t + x;
		}
		System.out.print(t);
	}
}