package day3;
//Hierarchical program- mother and daddy inherited from son class
class son
	{  
		void joy()
		{
			System.out.println("I'm your Son, Pappa !");
			}  
		}  
class daddy extends son
	{  
		void job()
		{
			System.out.println("I'm your Daddy !!");
		}  
	}  
class mother extends son
	{  
		void homeswife()
		{
			System.out.println("I'm your Mother!!!");
		}  
	}  
class Hierarchical_Inheritance
	{  
		public static void main(String args[])
		{  
		mother a = new mother();  
		a.joy();  
		a.homeswife();
		}
	}