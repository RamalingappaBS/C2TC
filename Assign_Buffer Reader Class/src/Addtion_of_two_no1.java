import java.io.*;
public class Addtion_of_two_no1
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        
        System.out.println("Enter First numbers:");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter Second numbers:");
        int num2 = Integer.parseInt(br.readLine());
	    int sum = num1 + num2;

	    System.out.println("Sum of these numbers: "+sum);
	   }
}