import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LeapYear1
{
   public static void main(String[] args) throws IOException
   {
      int year;
      System.out.println("Enter an Year :");
      BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));		
      year = Integer.parseInt(sc.readLine());

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Mentioned year is a leap year");
      else
         System.out.println("This year is not a leap year");
   }
}