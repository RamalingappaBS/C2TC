package Thread_Programs;
public class Methods_Of_Thread 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread();	//creating thread
		System.out.println("Id of current Thread: "+t1.getId());  //returns ID of current thread
		
		System.out.println("Name of current Thread: "+t1.getName()); //returns name of current thread
		
		System.out.println("Priority of Thread: "+ t1.getPriority()); //by default returns priority 5(norm)
		
		System.out.println(" ");
		
		//System.out.println("id of thread after setting: "+t1.setId(2)); //set automatically at the time of creation cannot be set manually
		
		System.out.println("Name of Thread after setting: ");
			t1.setName("Java First Thread"); 	
			System.out.println("Thread name: "+ t1.getName());//set name of thread
			
			System.out.println(" ");
			
			System.out.println("priority of thread after setting :");
			t1.setPriority(6);		//can be set to min(1), max(10), normal(5)
			System.out.println("thread priority: "+ t1.getPriority());
	}

}