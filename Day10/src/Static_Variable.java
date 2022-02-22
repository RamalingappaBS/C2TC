//Program to illustrate static variable
  class Technoserve
{
	int uid;
	String name;
	static String institute="Techno Serve India ltd.";
	Technoserve(int id, String name)
	{
		uid=id;
		this.name=name;
	}
	 void display()
	{
		System.out.println("Uid: "+uid+", Name "+name+" ,Institute :"+institute);
	}
}
public class Static_Variable
{
	public static void main(String[] args) 
	{
		Technoserve t1=new Technoserve(01,"Ramalingappa B S");
		Technoserve t2=new Technoserve(02,"Shivakumar K");
		t1.display();
		t2.display();
	}
}