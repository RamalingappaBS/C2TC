import java.io.*;
public class Calculator1 {
	  public static void main(String[] args) throws IOException {

	    char operator;
	    int number1, number2, result;
	    
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));		
	    System.out.println("Choose an operator: +, -, *, or /");
		operator = ob.readLine().charAt(0);
		
	    System.out.println("Enter first number");
	    number1 = Integer.parseInt(ob.readLine());

	    System.out.println("Enter second number");
	    number2 = Integer.parseInt(ob.readLine());

	    switch (operator) 
	    {
	      case '+':
	      result = number1 + number2;
	      System.out.println(number1 + " + " + number2 + " = " + result);
	      break;
	      case '-':
	      result = number1 - number2;
	      System.out.println(number1 + " - " + number2 + " = " + result);
	      break;	      
	      case '*':
	      result = number1 * number2;
	      System.out.println(number1 + " * " + number2 + " = " + result);
	      break;
	      case '/':
	      result = number1 / number2;
	      System.out.println(number1 + " / " + number2 + " = " + result);
	      break;
	      	default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    ob.close();
	  }
}
