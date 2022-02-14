class x{
	String name = "Ramalingappa";
}

public class Inheritancedemo extends x 
{
	String Lname = "B S";

	public static void main(String[] args) 
	{
		Inheritancedemo id = new Inheritancedemo();
		System.out.println("Student name is:" +id.name + id.Lname);
	}

}