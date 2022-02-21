public class Prg01 
	{
	public static void main(String[] args)
		{
			try
			{
			System.out.println(5/0);	//throws ArithmeticException
			}
			catch(ArithmeticException a)
			{
				System.out.println(a);
			System.out.println("End of program");
			}
		}

	}
