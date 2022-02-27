package Java_Collections_Queues;

//Queue program using methods add(), remove(),poll(), element(), peek(), size()
import java.util.*;
public class Queue_Example
{

	public static void main(String[] args) 
	{
		//Queue is an interface which cannot be created so we created Linked list as its instance and assigned it to queue
		Queue<String> q= new LinkedList<String>();	
		System.out.println("Created queue which follows FIFO order: "+q);
		System.out.println();
		
		//Adding elements to queue using add()
		q.add("Swamy");
		q.add("Ramesh");
		q.add("Jaythirtha");
		q.add("Krishna");
		q.add("Somashekar");
		//q.add(3,"Deepak");	//cannot add value using index
		System.out.println("Elements in queue are: "+q+" size= "+q.size());
		System.out.println();
		
		//To remove element from queue using remove()
		System.out.println("removed first element: "+q.remove());
		System.out.println("elements are: "+q);
		System.out.println();
		
		//To return head of the queue using element()
		System.out.println("head of queue is: "+q.element());
		System.out.println();
		
		/*To remove element using poll() , it is similar to remove() method 
		 * Only difference is it returns null when queue is empty */
		
		System.out.println("Removing first element from :"+q.poll()); 	//Cannot provide index value
		System.out.println("Removing another element: "+q.poll());
		System.out.println("Removing element: "+q.poll()+","+q.poll());
		System.out.println("Elements are: "+q);
																		//Returns null when queue is empty
		System.out.println("Remove element: "+q.poll());  				//Cannot use remove() , throws exception
		
		q.add("Ganga");
		q.add("Smritha");
		q.add("Preksha");
		q.add(null);													//Can add null values also
		System.out.println("added new element: "+q);
		System.out.println();
		
						//To return head of queue using peek() which is similar to element() method
		System.out.println("head of queue: "+q.peek());
		
						//Displaying elements again
		System.out.println("Element in Queue are: "+q);
	}
}
