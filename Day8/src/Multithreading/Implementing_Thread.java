package Multithreading;

public class Implementing_Thread
{

	public static void main(String[] args)
	{ 
		ThreadClass th= new ThreadClass(); // created object for thread class 
		Thread thread_runnable= new Thread(th);
		thread_runnable.start();
	}
}
