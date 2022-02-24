//immutable string are unchangeable 
public class String_Immutable 
{
	public static void main(String[] args) 
	{
		String x=new String("Manipal");	// Values can't be changed
		x.concat("Hospital");			// This does not concatenate but 2 objects have been created, but x is a referenced object is still referring to "Manipal" so to refer we use.,
		System.out.println(x);		    // It prints the same which is earlier one.
		String y1=new String("Apollo");
		y1=x.concat("Center");			// Now, it is pointing to concatenated string
		System.out.println(y1);
	}
}