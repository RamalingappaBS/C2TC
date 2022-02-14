import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Sorting_of_Strings
{
	   public static void main(String args[]) throws IOException 
	   {
		  BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));		
	      System.out.println("Enter any Strings  ");
	      String str = ob.readLine();
	      char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
	   }
}