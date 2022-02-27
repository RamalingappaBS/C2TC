import java.util.*;
public class Iterator_And_ListIterator 
{
	public static void main(String[] args) 
	{
			//We can traverse elements of list in forward direction, used in list, set, queue
	      List<String> ArrLis = new ArrayList<String>();
	      System.out.println("Iterating elements using Iterator: ");
	      ArrLis.add("Amazon");
	      ArrLis.add("Flipkart");
	      ArrLis.add("Ebay");
	      ArrLis.add("Myntra");
	      ArrLis.add("King Burger");
	      Iterator i = ArrLis.iterator();
	      while (i.hasNext())
	      {
	         System.out.println(i.next());
	      }
	      System.out.println("--------------------------------------------");
	      			//We can travrse elements of list in both forward and backward direction, used in list collection only
	      ListIterator lt = ArrLis.listIterator();
	      System.out.println("Iterating the elements in forward direction using ListIterator: ");
	      while (lt.hasNext()) 
	      {
	         System.out.println(lt.next());
	      }
	      System.out.println("--------------------------------------------");
	      System.out.println("Iterating the elements in backward direction using ListIterator: ");
	      while (lt.hasPrevious())
	      {
	         System.out.println(lt.previous());
	      }
	}
}