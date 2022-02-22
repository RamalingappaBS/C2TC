//Java Program to illustrate how to Declare, Instantiate, Initialize  
public class Singledimensional_Array
{
	public static void main(String args[])
	{  
		int a[]=new int[6];			//Declaration and Instantiation  
		int b[]= {21,64,89};		//Declaration, Instantiation, Initialization
		a[0]=10;					//Initialization  
		a[1]=20;  
		a[2]=90;  
		a[3]=30;  
		a[4]=70;
		a[5]=60;
		for(int i=0;i<a.length;i++)		//Length is the property of array  
		{
			System.out.println(a[i]);
		}
	}
}  
