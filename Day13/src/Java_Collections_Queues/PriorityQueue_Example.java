package Java_Collections_Queues;
import java.util.*;
public class PriorityQueue_Example
{
	public static void main(String[] args)
	{
		Queue<Student> s=new PriorityQueue<Student>();
		//Adding Student details
		Student s1=new Student(101," Rajesh ",100);
		Student s2=new Student(102," Parthasarati ",204);
		Student s3=new Student(103," Manorama ",323);
		Student s4=new Student(104," Chitra ",312);
		Student s5=new Student(104," Preksha ",529);	
		//Adding elements to queue
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		//Traversing queue elements
		for(Student p:s)
		{
			System.out.println("Student details: "+p.id+" "+p.name+" "+p.rank);
		}
		System.out.println();
		//removing 1 Student details
		System.out.println("After removing 1 Student: ");
		s.remove();
		for(Student p:s)
		{
		System.out.println("Student details: "+p.id+" "+p.name+" "+p.rank);
		}
		int contains=102;  // to check if id is present
		System.out.println(contains);	
	}
}	