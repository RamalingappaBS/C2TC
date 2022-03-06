//Lambda expression work with only functional interface which consist of 1 interface method
//Single method interface
interface StringFunction
{
	public String beforeformatting(String str);	//Only 1 method in interface is known as functional interface
}
public class Lambda_Expression_In_Method
{
					//To use lambda expression in method, it should have parameter with single method interface as its type
	public static void printFormatted(String str, StringFunction sf)
	{
					//calling interface method will run lambda expression
		String result= sf.beforeformatting(str);
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		StringFunction question = (q)-> q + "?";	//Single parameter lambda
		StringFunction exclaimatary= (e)-> e + "!";
					//Calling method and passing parameters
		printFormatted("How are you my Dear friend ", question);
		printFormatted("Are you alright now", exclaimatary);
	}
}