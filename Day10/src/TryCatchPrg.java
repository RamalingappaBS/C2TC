//Few Exception that occur during program of unchecked 
//(ArithmeticException, NullPointerException, NumberFormatException, ArrayOutofIndexException using try/catch block

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TryCatchPrg
{
	public static void main(String[] args) throws Exception
	{		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		int a=50/0;	//ArithmeticException
		}
		catch (ArithmeticException e)
		{
		System.out.println(e);
		}
		
		try
		{
		String str=null; // NullPointerException
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
			
		}
		
		try
		{
		String str1="xyz";
		int i=Integer.parseInt(str1); //NumberFormatException
		}
		catch(NumberFormatException f)
		{
			System.out.println(f);
		}
		System.out.println("try block that specifies where we should place exception");
		System.out.println("It must be followed by catch or finally block ");
		System.out.println("catch block is used to handle exception ");	
	}
}