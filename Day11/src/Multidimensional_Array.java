//Java Program  using multidimensional array
public class Multidimensional_Array 
{
	public static void main(String args[])
	{  	
		int arr[][]={{4,2,3},{9,7,5},{6,1,8}};  //Declaring and initializing 2D array  
		for(int i=0;i<3;i++)	//row
		{  
			for(int j=0;j<3;j++)	//column
			{  
				System.out.print(arr[i][j]+" ");  
			}  
			System.out.println();  
		}  
	}
}