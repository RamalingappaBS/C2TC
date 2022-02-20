
//all methods must be implemented
interface Capgemini
{
	  int NoOfEmployees();
	   String HR();
}

//if we want to expand interface we can create new one
interface Location extends Capgemini	// interface extends interface
{
	 public abstract String location();
}

// to solve multiple inheritance 
//we can inherit child class from two interfaces
class  Google implements Capgemini, Location	//class implements interfaces
{
	public int NoOfEmployees()
	{
		return 2000;
	}
	
	public String HR()
	{
		return "BDE, Developer, Tester, Maintenance";
	}
	
	public String location()
	{
		return " Hydrabad, Mumbai and Bangalore";
	}
}
public class Interface2
{

	public static void main(String[] args)
	{
		Google l;
		l = new Google();
		System.out.println("No of Employees are :" +l.NoOfEmployees());
		System.out.println("Types of Department:" +l.HR());
		System.out.println("Location:" +l.location());
		

	}

}