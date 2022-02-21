package day3;
//Multilevel - friendship inheriting from bestfriendship and Lover inheriting from bestfriend
	 class friendship
	{  			
		void school()
		{
			System.out.println("Only frindship :-");
		}  
	}  
	class bestfriendship extends friendship
	{		
		void college()
		{
			System.out.println("Best frineds for ever!!!!");
		}  
	}  
	class lover extends bestfriendship
	{  
		void marriage()
		{
			System.out.println("I can not leave without you !!!!");
		}  
	}  
public	class Multilevel_Inheritance
	{  
	public static void main(String args[])
		{  
			lover p=new lover();  
			p.school();  
			p.college();  
			p.marriage();  
		}
	}  