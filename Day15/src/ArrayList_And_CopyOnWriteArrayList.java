import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;   
public class ArrayList_And_CopyOnWriteArrayList 
{
	public static void main(String[] args)
	{
    CopyOnWriteArrayList<String> S = new CopyOnWriteArrayList();     	//Create an Array List
    System.out.println("Initial size of All Countries: " + S.size());
    S.add("America");						      						//Add elements to the array list
    S.add("France");
    S.add("England");
    S.add("India");
    S.add("China");
    S.add("Korea");
    S.add("Nepal & Bhuthan");
    S.add("Japan");
    S.add("Jermany");
    S.add(2, "Russia");
    System.out.println("Size of Arraylist after Addition of all countries : " + S.size());
    															//Display the array list
    System.out.println("Contents of Array list (All countries are) " + S);
    S.remove("China"); 										//Array List iterator supports removal of element during iteration
    S.remove(2);											//Remove elements from the array list
    System.out.println("Size of Array list after Deletions of Some countries: " + S.size());
    System.out.println("Contents of Arraylist are (Selected) : " + S);
    try
    {
       Iterator<String> iterator = S.iterator();
       //CopyOnWriteArrayList.remove() throws unsupported exception if elements are added removed during iteration
       while(iterator.hasNext()) 
       {
          iterator.remove();
       }
    }
    catch(Exception e)
    {
       System.out.println("Method not supported:" +e);
    }
    System.out.println("Total Number of countries after deleted: " + S.size());
	}
}