import java.util.Scanner;
public class Addtion_of_two_no2 
{
	 public static void main(String[] args) 
	 {
	        int num1, num2, sum;
	        Scanner ob = new Scanner(System.in);
	        
	        System.out.println("Enter First Number: ");
	        num1 = ob.nextInt();
	        
	        System.out.println("Enter Second Number: ");
	        num2 = ob.nextInt();
	        
	        ob.close();
	        sum = num1 + num2;
	        System.out.println("Sum of these numbers: "+sum);
	    }
}