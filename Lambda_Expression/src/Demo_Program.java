//Using a Lambda expression in the ArrayList's forEach() method to print every item in list
import java.util.ArrayList;
interface Add
{
	int add(int b, int c);
}
public class Demo_Program 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);	
							//Lambda expression
							//Syntax: (parameter1, parameter2) ->{ block of code}		
		a.forEach( (n) ->{ System.out.println(n); } );
		System.out.println("Lambda expression is a block of code, which takes parameters and return values");		
		 					// Multiple parameters in lambda expression  
        Add add1=(b,c)->(b+c);  
        System.out.println(add1.add(60,80));  
	}
}