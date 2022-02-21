//try block followed by more then two catch blocks which contains differed exception
public class MultipleCatchPrg 
{  
	  public static void main(String[] args)
	  {
           try
           {    
                int a[]=new int[10];    
                a[10]=50/0;    
            }    
               catch(ArithmeticException e)  //should come before catch for Exception
                  { 
            	   System.out.println(e);
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
             System.out.println("at the time only one exception occurs and one catch block is executed");    
       }  
} 