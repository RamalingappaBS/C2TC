package Java_Collections_ArrayList;
import java.util.*;
public class Change_RemoveElement
{
	public static void main(String[] args) 
	{
		List<String> alist= new ArrayList<String>();	//Creating ArrayList that accepts string elements
														//Change an element in ArrayList
		alist.add("Rama");								//Adds element at the end of list
		alist.add("Abhishek");
		alist.add("Pavan");
		alist.add("Shivu");
		alist.add("Kavitha");
		alist.add("Mansi");
		alist.add("Vikas");
		alist.set(1,"Krishna"); 						//Can change element using set method by providing index value
		System.out.println("Array list elements after changing: "+ alist);
														//To remove elements from ArrayList
		alist.remove("Pavan"); 							//Removing miles
		System.out.println("After removing miles : "+alist);
		alist.remove(1); 								// Removing element at 1 index
		System.out.println("After removing from 1st index: "+alist);
	}
}