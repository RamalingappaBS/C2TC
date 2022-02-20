package Thread_Programs;
class XYZ
{
	void X1()
	{
		System.out.println("class XYZ");
	}
}
class PQR extends XYZ
{
	void P2()
	{
		System.out.println("class PQR");
	}
}
class ABC extends PQR
{
	void A3()
	{
		System.out.println("class ABC");
	}
}
public class Without_Thread
{
	public static void main(String[] args)
	{
		ABC s=new ABC();
		s.X1();
		s.P2();
		s.A3();
	}
}