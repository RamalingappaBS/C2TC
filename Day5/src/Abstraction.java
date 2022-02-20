//write a java program using abstract class in java

//declaring class as abstract class
abstract class Vehicle
	{
		abstract int getTypeOfCars();  //abstract class can have abstract methods
	
		String VehicleName()	//can have non abstract methods
		{
			return "Tesla";
		}
		
	}
	//to give functionality to abstract method we use inheritance	
	class Audi extends Vehicle
		{
			int getTypeOfCars()
			{
				return 9;
			}
		}
	
	class BMW extends Vehicle
		{
			int getTypeOfCars()
			{
				return 8;
			}
		}

	public class Abstraction
	{

		public static void main(String[] args) 
		{
			Vehicle l;	//cannot instantiate Library object so  create objects of child class
			l= new Audi();
			l.VehicleName();
			System.out.println("No of  Vehicles are in  Audi:"+l.getTypeOfCars());
			l=new BMW();
			System.out.println("No of Vechile are in BMW: "+l.getTypeOfCars());

		}

	}