class Employee
{
	int id;
	String name;
	static String Company="Google";
 Employee(int i, String n)
 {
	 id=i;
	 name=n;
 }
 static void change()			//Declaring method as static
 {
	 Company="Capgemini";
 }
  void display()
 {
	 System.out.println("Id: "+id+" Name: "+name+" Company: "+Company);
 }
}
public class Static_Method 
{
	public static void main(String[] args) 
	{
		Employee.change();					//Calling changed method 
		Employee s1 = new Employee(01,"Ramalingappa B S");  
	    Employee s2 = new Employee(02,"Shivu Kumar K");
	    s1.display();  
	    s2.display();  
	}
}