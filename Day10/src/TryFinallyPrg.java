public class TryFinallyPrg 
{
	public static void main(String args[])
    {   
    try 
    	{    
    		System.out.println("Inside the try block");        
            int x=25/0;   //throws divide by zero exception 
            System.out.println(x);    
    	}    
    //cannot handle Arithmetic type exception and only accept Null pointer exception.
    
    catch(NullPointerException e)
    	{  
    		System.out.println(e);  
    	}   
    		//executes regardless of exception occurred or not   
    
    finally
    	{  
    		System.out.println("finally block is always executed");  
    	}    
    	System.out.println("rest of the code");    
    }    
}