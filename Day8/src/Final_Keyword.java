//final keyword program which is being used for class, method, variable
	final class Programmer
	{
		final void NumberOfRanking()
		{
			System.out.println("Rank in Prgramming");
		}
	}

//class SoftwareTester extends Programmer 
// if i declare super class as final it cannot be inherited 		
//{
//	void NumberOfRanking() // if i declare method as final it cannot override
//	{			
//	}
//}
public class Final_Keyword
{
public static void main(String[] args)
	{
	final int a=21;
		//	a++;// cannot be changed after declaring variable as final
	Programmer s=new Programmer();
	s.NumberOfRanking();
	System.out.println(a);
	}
}