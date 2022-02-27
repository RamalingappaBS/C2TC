import java.util.*;
public class Iterator_With_Generics 
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<>();	//Created Array List using Generics
		System.out.println("TOP IT-Companies are India");
		a.add("Capgemini");							//Adding elements to Array List.
		a.add("LTI");
		a.add("TCS");
		a.add("Infosys");
		a.add("Wipro");
		Iterator<String> it=a.iterator();
		while(it.hasNext())
		{
			String str= it.next();
			System.out.println(str);
		}
	}
}