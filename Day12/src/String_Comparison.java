public class String_Comparison 
{
	public static void main(String[] args) 
	{
		String s="Hello";
		System.out.println("printing 1st string: "+s);
		String s1=new String("World");
		System.out.println("printing 2nd string: "+s1);
		char[] ch= {'h','e','l','l','o'};
		String s2=new String(ch);
		System.out.println("printing 3rd string: "+s2);
		String s3="Hello";
		System.out.println("printing 4th string: "+s3);
		String s5="Hello";
		System.out.println("printing 4th string: "+s5);
		String s4="HELLO";
		System.out.println("printing 5th string: "+s4);
		System.out.println();
		//by using equals()
		System.out.println("by using equals() method: "+ s.equals(s4));
		System.out.println("by using equals() method: "+ s.equalsIgnoreCase(s3));	//Ignores the case and compares
		System.out.println("by using equals() method: "+ s.equals(s2));
		//by using == operator
		if(s3==s5)				//compares references not values
			System.out.println("string is same "+s);
		else
			System.out.println("string is not same");
		//By using compareto() method
		System.out.println("by using compareTo() method: "+s3.compareTo(s5));	//Returns 0 if its equal
		System.out.println("by using compareTo() method: "+s.compareTo(s1));	//Return negative value if s<s1
		System.out.println("by using compareTo() method: "+s5.compareTo(s4));	//Returns positive value if s4>s5
		}
}