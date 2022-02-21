public class Prg02 
{
	public static void main(String[] args)
	{
		int a=10;
		for(int i=2;i>=0;i--)
		{
			try
			{
			System.out.println(a/i); 		// throws arithmetic exception when a/0
			}
			catch(ArithmeticException c)	//handles exception 
			{
				System.out.println(c);
				System.out.println("It is an arithmetic exception program");
			}
		}
	}
}