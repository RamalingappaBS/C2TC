import java.io.*;
public class HelloWorld1 
{
	public static void main(String[] args) throws IOException 
	{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Your Input Please:"); 
        String a = br.readLine();
        System.out.println(a); 
	}
}
