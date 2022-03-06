abstract class abstractdemo
{  
        void Rama() 
        {
		System.out.println("Mahathma");
		}
        
        abstract void cm();
}  

class human extends abstractdemo
{
	void Krishna() 
	{
		System.out.println("Gandhi");
	}
	public static void main(String args[])
	{  
	human ob = new human();  
    ob.Rama();
    ob.Krishna();
}  
}  