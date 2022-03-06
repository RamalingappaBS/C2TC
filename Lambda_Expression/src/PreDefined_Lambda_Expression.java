//Java has built in interface such as Consumer interface found in java.util package and is used in list
import java.util.ArrayList;
import java.util.function.Consumer;
public class PreDefined_Lambda_Expression 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(300);
		a.add(700);
		a.add(900);		
		a.add(1100);											//Java Pre-Defined functional interface Consumer
		Consumer<Integer> c=((m)-> {System.out.println(m);}); 	//Accepts single arguments and returns no result
		a.forEach(c);
	}
}