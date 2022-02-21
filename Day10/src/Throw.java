public class Throw
{
 //function to check if person is eligible to marriage or not !!  
	    public static void validate(int age)
	    {  
	        if(age<22) 
	        {         
	            throw new ArithmeticException("Person is not eligible for marriage");   
	            //throw Arithmetic exception if not marriage to vote  
	        }  
	        else 
	        {  
	            System.out.println("Person is eligible for marriage !!");  
	        }  
	    }  
	      
	    public static void main(String args[])
	    {  
	        validate(23);  
	        validate(25);
	        System.out.println("Parents are Happy !!!!!!");    
	  }    
}    
