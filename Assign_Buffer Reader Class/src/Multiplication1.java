import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication1
{
	    public static void main(String[] args) throws NumberFormatException, IOException 
	    {
	        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));	
	        System.out.println("Enter number for its tables");
	        int num = Integer.parseInt(ob.readLine());
	        int i = 1;
	        while(i <= 20)
	        {
	            System.out.printf("%d * %d = %d \n", num, i, num * i);
	            i++;
	        }
	    }
}