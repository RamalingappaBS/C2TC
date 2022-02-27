package Java_LinkedList;

//Linked list program using add(), add at specific position, creating another linked list and adding elements to linkedlist1, addAll(), addFirst(), addLast(), pop(),size()
import java.util.*;
public class LinkedList_Program01 
{
	public static void main(String[] args)
	{
	LinkedList<String> l=new LinkedList<String>();	//Creating object Linked list
	System.out.println();
													//To check if Linked list is empty or not
	boolean b=l.isEmpty();
	System.out.println("Is Linked list empty: "+b);
	System.out.println("Initial stage of Linked list: "+l);
	System.out.println();
													//Adding elements to Linked list
													//l.add()
	l.add("Rama");
	l.add("Krishna");
	l.add("Baba");
	l.add("Vikas");
	l.add("Sanjay");
	l.add("Shivu");
	l.add("Anitha");
	System.out.println("After adding elements to linked list: "+l);
	int size=l.size();
	System.out.println("The size of linked list: "+size);
	System.out.println();
	
									//To add elements at specific position
	System.out.println("Before adding chris at position 2: "+l+" = "+l.get(2));
	l.add(2,"Chethan");
	System.out.println("After adding chris at position 2: "+l+"= "+l.get(2));
	System.out.println();
	
									//Creating second Linked List
	System.out.println("Second linked list: ");
	LinkedList<String> l2=new LinkedList<String>();
	System.out.println();
	System.out.println("Is linked list empty: "+b);
	System.out.println("Initial stage of second linked list: "+l2);
	System.out.println();
	
	//Adding elements to second linked list
	l2.add("Pranisha");
	l2.add("Spoorty");
	System.out.println("After adding elements to second linked list: "+l2);
	System.out.println();
	
	//Adding linked list2 elements to linked list1 elements
	System.out.println("Linked list elements in 1 and 2: ");
	System.out.println("Linked list1 elements: "+l+" size: "+l.size());
	System.out.println("Linked list2 elements: "+l2+ " size: "+l2.size());
	l.addAll(l2);	
	
	//Adding elements from l2 to l
	System.out.println("After adding elements from linkedlist2 to linkedlist1: "+l+l.size());
	System.out.println();
	
	//Adding element at first position
	System.out.println("Adding element at first position");
	l.addFirst("Sweety");
	System.out.println("After adding: "+l);
	String name=l.peek();
	System.out.println("Element at top: "+name);
	l.pop();
	System.out.println("After popping: "+l);
	System.out.println();
	
	//Adding element at Last position
	System.out.println("Adding element at Last position: ");
	System.out.println("Before adding: "+l);
	l.addLast("Smitha");
	System.out.println("After adding: "+l);
	}
}
