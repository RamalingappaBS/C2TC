package day3;
public class Single_Inheritance 
	{  
		void one()
		{
			System.out.println("Only single");
		}  
	}  
class Double_Inheritance extends Single_Inheritance
	{  
		void two()
		{
			System.out.println("Two more ");
		}  
	}  
	class Single_Inheritacne
	{  
	public static void main(String args[])
		{  
		Double_Inheritance i = new Double_Inheritance();  
		i.one();  
		i.two();  
		}
	}  
