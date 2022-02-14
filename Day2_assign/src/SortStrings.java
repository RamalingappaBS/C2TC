import java.util.Arrays;
import java.util.Scanner;
public class SortStrings 
{
	   public static void main(String args[]) 
	   { 
	      Scanner ob = new Scanner(System.in);
	      System.out.println("Enter a String In any Order: ");
	      
	      String str = ob.nextLine();
	      char charArray[] = str.toCharArray();
	      
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
	   }
}