import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class Demo_Junit 
{
	int a=25;
	int b=47;
	int c=a*b;	
	@Test
	void Display()
	{
		System.out.println("Hello, Welcome to Junit");
		System.out.println("Multiplication: "+c);
	}
	@Disabled
	@Test
	void display1()
	{
		System.out.println("Thank you !");
	}
}