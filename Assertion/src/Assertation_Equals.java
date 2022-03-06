//Program to check if two primitives are equal
import static org.junit.Assert.*;  
import org.junit.Test;
class Calculation
{  
    public static int findMax(int arr[])
    {  
        int max=arr[0]; 					//Array of 0 instead of 0 
        for(int i=1;i<arr.length;i++)
        {  
            if(max<arr[i])  
            max=arr[i];  
	    }  
	    return max;  
    }  
}  
public class Assertation_Equals
{
	@Test  
    public void testFindMax()
	{  
        assertEquals(4,Calculation.findMax(new int[]{1,4,3,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-1,-3,-13,-4,-2,}));  
    }  
}