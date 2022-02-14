abstract class abstractdemo
{  
        void Rama() 
        {
		System.out.println("Human");
		}
        
        abstract void cm();
}  

class human extends abstractdemo
{
	void cm() 
	{
		System.out.println("Being");
	}
	public static void main(String args[])
	{  
	human ob = new human();  
    ob.Rama();
    ob.cm();
}  
}  