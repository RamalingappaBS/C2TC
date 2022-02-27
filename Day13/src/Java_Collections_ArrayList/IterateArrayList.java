package Java_Collections_ArrayList;
import java.util.*;
public class IterateArrayList 
{
	public static void main(String[] args)
	{
		List<String> alist= new ArrayList<String>();	//Creating ArrayList that accepts string elements
		alist.add("Rama");								//Adds element at the end of list
		alist.add("Abhishek");
		alist.add("Pavan");
		alist.add("Khivu");
		alist.add("Kavitha");
		alist.add("Mansi");
		alist.add("Vikas");
		//iterating ArrayList
	     for(String str:alist)  
	     System.out.println(str); 
	    //size of ArrayList
	     System.out.println("size of ArrayList: "+alist.size());
	}
}