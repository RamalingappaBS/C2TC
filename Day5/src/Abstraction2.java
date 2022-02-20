
//scenario in which abstract abstract class can be used

 abstract class Company	//parent class Books
{
    //can have abstract methods
    public abstract int NoOfEmployees();
    public abstract String Department();
    
    public  int total()	//common property to all class
    {
    	return 500;
    	
    }
    
}

  class HumanResource extends Company
{
    public int NoOfEmployees()
    {
        return 4;
    }
    public String Department()
    {
        return "Ramalingappa B S";
    }
}
    class Purchase extends Company	//hierachical inheritance
    {
        public int NoOfEmployees()
        {
            return 6;
        }
        public String Department()
        {
            return "Gold, Platinum and Diamonds";
        }
    }
public class Abstraction2
{

	public static void main(String[] args)
	{
		Company m;
		m= new Purchase();
		System.out.println("No of Company: "+ m.NoOfEmployees());
		System.out.println("Items of Purchase: "+ m.Department());
		System.out.println("Toal is "+ m.total());
		

	}

}