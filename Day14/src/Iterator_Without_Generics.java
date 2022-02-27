//Iterated array list without using Generics
import java.util.*;
public class Iterator_Without_Generics
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		a.add("Priya Singh");
		a.add("Anitha Bhat");
		a.add("Jenifer Lawrence");		
	 									//Adding integer value to string Array List
		//a.add(new Integer(8));		//Gives exception because we did not use Generics
		Iterator it=a.iterator();		//Instantiation and using iterator constructor
		while(it.hasNext())
		{
			String str=(String)it.next();
			System.out.println(str);
		}
	}
}