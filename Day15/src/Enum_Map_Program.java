import java.util.*;
public class Enum_Map_Program
{
	 	//Create an enum  
	   public enum Months 
	   {  
	   January, February, March, April, May, June, July, August, September, October, November, December  
	   };  
	   public static void main(String[] args)
	   {  
	   //create and populate enum map  
	   Map<Months, String> map = new EnumMap<Months, String>
	   (Months.class);  
	   map.put(Months.January, "1");  
	   map.put(Months.February, "2");  
	   map.put(Months.March, "3");  
	   map.put(Months.April, "4");  
	   map.put(Months.May,"5");
	   map.put(Months.June,"6");
	   map.put(Months.July, "7");
	   map.put(Months.August, "8");
	   map.put(Months.September,"9");
	   map.put(Months.October, "10");
	   map.put(Months.November, "11");
	   map.put(Months.December, "12"); 
	   // Print the map  
	   for(Map.Entry m:map.entrySet())
	   {    
	       System.out.println(m.getKey()+" "+m.getValue());  
	      }
	   System.out.println("Size of enum:"+map.size());
	   System.out.println("After Removing:"+map.remove(3));
	   }  
}  
