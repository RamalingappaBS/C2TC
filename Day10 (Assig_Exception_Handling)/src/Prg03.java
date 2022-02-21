//There is no exception at runtime so we can throw exception to check at compile time
public class Prg03 
{
	static void canVote(int age)
	{
		if(age<16)
			throw new ArithmeticException(age +" you are not eligible for work due to child labour act");
		else
			System.out.println( age + " you can work and earn money");	//executes rest of code
	}
	public static void main(String[] args)
	{
		canVote(10);	
		canVote(20);
	}
}
