public class String_Concatenation
{

	public static void main(String[] args)
	{
		String s="Ramalingappa B S "+" is a full stack java developer";	//We use "+" operator to concatenate
		System.out.println(s);
		String s1=20+30+" addition is "+30+40;		//We can also add no's but after string literal it treats all as concatenation
		System.out.println(s1);					//by using concat() method	
		String s2="hello";
		String s3="world";
		String s4=s2.concat(s3);
		System.out.println("By concat() method "+s4);
	}
}