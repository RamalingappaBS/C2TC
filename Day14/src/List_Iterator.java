/*Program to traverse list in both direction using .hasNext(), .next() for forward direction
 * .hasPrevious(), .previous() for backward direction
  Using ListIterator we can only traverse list*/

import java.util.*;
public class List_Iterator 
{
	public static void main(String a[])
	{
	   ListIterator<String> Lit = null;
	   ArrayList<String> names = new ArrayList<String>(); 
	    names.add("Bangalore");
	    names.add("Hydrabad");
	    names.add("Panjab");
	    names.add("Hariyana");
	    names.add("Kerala");
	    										//Obtaining list iterator
	    Lit=names.listIterator();
	    System.out.println("Traversing the list in forward direction:");
	    	while(Lit.hasNext())
	    {
	       System.out.println(Lit.next());  
	    }
	    System.out.println("\n Traversing the list in backward direction:");
	    	while(Lit.hasPrevious())
	    {
	       System.out.println(Lit.previous());
	    }
	}
}