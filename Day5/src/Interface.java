
//Assignment program to create interface without using abstract keyword and implement in class 
interface Capgemini
{
	void c1();	//adds public and abstract keyword before void method
}
interface LTI
{
	void c2();
	
}
interface TCS
{
	void c3();
}


class Printable implements  Capgemini,LTI,TCS	//can implement interface method using implement keyword
{
	public void c1()
	{
		System.out.println("1- Interface in java is blueprint of class");
	}
	
	public void c2()
	{
		System.out.println("2- Interface is a mechanism to achieve abstraction");
	}
	
	public void c3()
	{
		System.out.println("3- Interface can support functionality of multiple inheritance");
	}
}
public class Interface {

	public static void main(String[] args)
	{
		Printable k=new Printable();	//created object of child class
		k.c1();
		k.c2();
		k.c3();

	}

}