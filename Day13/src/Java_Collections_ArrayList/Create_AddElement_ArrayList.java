package Java_Collections_ArrayList;

//Creating ArrayList and adding elements to an ArrayList
import java.util.*;
public class Create_AddElement_ArrayList
{
	public static void main(String[] args) 
	{
		List<String> alist= new ArrayList<String>();	//Creating ArrayList that accepts string elements		
		alist.add("Rama");								//Adds element at the end of list
		alist.add("Abhishek");
		alist.add("Pavan");
		alist.add("Shivu");
		alist.add("Kavitha");
		alist.add("Mansi");
		alist.add("Vikas");
		System.out.println("Array list elements: "+ alist);
		alist.add(3,"Deepak");   					//adds element Deepak at 3rd position
		System.out.println("After adding at 3rd position: "+alist);	
	}
}
