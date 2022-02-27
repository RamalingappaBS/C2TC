//ArrayList and LinkedList both implements list and both are Non-Synchronized, and better for Storing and Accessing data
import java.util.*;
public class ArrayList_And_LinkedList
{
	public static void main(String args[])
	{    
										//ArrayList internally uses dynamic array to store elements
										//ArrayList act as list only because it implements list only
		  List<String> ArrLis=new ArrayList<String>();	 //Creating Array List 
		  System.out.println("Names: ");
		  ArrLis.add("Priyanka");						//adding object in Array List    
		  ArrLis.add("Bharatesh");    
		  ArrLis.add("Marry John");    
		  ArrLis.add("Mansi Philip"); 
		  System.out.println("Array List: "+ArrLis); 
		  											//If any element is removed from array all bits are shifted in memory
		  System.out.println("Size: "+ArrLis.size());
		  ArrLis.remove(0);
		  System.out.println("Array List: "+ArrLis);
		  System.out.println("Size: "+ArrLis.size());
		  System.out.println();
//Linked List is Faster than Array List and better for Manipulating data
		  								//Linked List internally uses doubly linked list to store elements
		  								//Linked List act as list and queue , because it implements list and dequeue interfaces
		  List<String> LinLis=new LinkedList<String>();		//Creating Linked List 
		  System.out.println("Names: ");
		  										// Linked List uses doubly linked list ,so no shifting of bits is required in memory
		  LinLis.add("Kajal");					//Adding object in Linked List    
		  LinLis.add("Sharuk");    
		  LinLis.add("Suddep");    
		  LinLis.add("Darshan"); 
		  LinLis.add("Salman");
		  System.out.println("Linked List: "+LinLis); 
		  System.out.println("Size: "+LinLis.size());
		  LinLis.remove(0);
		  System.out.println("Linked List: "+LinLis);
		  System.out.println("size: "+LinLis.size());
		  System.out.println();		     
		 }    
}