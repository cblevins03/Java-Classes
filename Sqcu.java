public class Sqcu
{
	public static void main ( String args[] )
	{
		int s=0,
			c=0,
			o=0;
			
		for(int x = 1; x <= 10; x++)
		{
			o = x;
			
			s = x * x;

			c = x * x * x;

			System.out.println(+ o + " " + s + " " + c + "");
		}
	}
}