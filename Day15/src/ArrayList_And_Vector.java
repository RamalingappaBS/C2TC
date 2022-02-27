//Array List Program Maintains Insertion order, Faster then Vector because its is Non-Synchronized.
import java.util.*;
public class ArrayList_And_Vector 
{
	 public static void main(String args[])
	 {    	     
		  List<String> ArrLis=new ArrayList<String>();		//Creating Array List   
		  System.out.println("Employee details: ");
		  ArrLis.add("Vikas");    							//Adding object in Array List
		  ArrLis.add("Diya");    							//Array List increases its size by 50% of Array Size
		  ArrLis.add("Mansi");    
		  ArrLis.add("Avanthika");
		  /*
		   ArrayList uses the Iterator interface to traverse the elements.
		   */ 
		  // Traversing elements using Iterator  
		  Iterator itr=ArrLis.iterator(); 
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }   
		  System.out.println();
		  /*
		   * Vector Program also Maintains Insertion Order, Slower than Array List because its Synchronized
		   */		  
		  Vector<String> v=new Vector<String>();				//Creating vector
		  														//Method of Collection 
		  														//Vector increases its size by doubling array size
		  System.out.println("Branches in company");
		  v.add("Human Resource"); 
		  v.addElement("Financial Department");					//Method of Vector  
		  v.addElement("Marketing");
		  /* Vector can use iterator interface or enumeration interface to traverse elements
		  *traversing elements using Enumeration
		  */  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements())
		  {  
		   System.out.println(e.nextElement());  
		  }  
	 }    
}    
