package Multithreading;

public class Extending_Thread 
{
	public static void main(String[] args)
	{
		Thread_Class2 th=new Thread_Class2(); //created object for class ThreadClass2
		Thread thread_extend= new Thread(th);
		thread_extend.start();
	}

}