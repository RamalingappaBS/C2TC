package package1;
import package1.accessmodifier1;
public class accessmodifier extends accessmodifier1
{
	private int id = 5;
	public static void main(String args[]) 
	{
		accessmodifier1 a = new accessmodifier1();//default
		accessmodifier1 b = new accessmodifier1();//public
		accessmodifier c = new accessmodifier();//private
		accessmodifier v = new accessmodifier();//protected

		System.out.println(a.name);
		System.out.println(a.city);	
		System.out.println(b.name);
		System.out.println(v.city);	
		System.out.println(c.id);	

	}
}
