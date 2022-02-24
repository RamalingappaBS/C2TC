public class String_Program 
{
	public static void main(String[] args)
	{
	String c="Java";
	System.out.println("Java String is an object that represents sequence of characters= "+c);
	
	char[] p={'C','o','g','n','i','z','a','n','t'};
	String c1= new String(p);	//Creating object String and converting characters to String
	System.out.println(p);
	
	String c2=new String("Capgemini");	//Another way to create string object using new keyword
	System.out.println(c2);
	}
}