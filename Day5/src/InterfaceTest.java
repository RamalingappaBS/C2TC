interface area
{
	final static float pi=3.14f;
	float compute(float x, float y);
}

class rectangle implements area
{
	public float compute(float x, float y)
	{
		return (x*y);
	}
}

class circle implements area
{
	public float compute(float x, float y)
	{
		return (x*x*pi);
	}
}

public class InterfaceTest
{
	public static void main(String[] args)
	{
		rectangle rect=new rectangle();
		circle cir=new circle();
		area a;
		a=rect;
		System.out.println("Area of circle= " + a.compute(10, 30));
		a=cir;
	System.out.println("Area of Circle= " + a.compute(25, 40));
	}
}