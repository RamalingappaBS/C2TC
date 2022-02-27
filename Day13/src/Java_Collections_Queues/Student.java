package Java_Collections_Queues;
public class Student implements Comparable<Student> 
{
	int id;
	String name;
	int rank;
	public Student(int i, String n, int s )
	{
		id=i;
		name=n;
		rank=s;
	}
		//Using compareTo() method
	public  int compareTo(Student p)
	{
		if(id>p.id)
		{
			return 1;
		}
		else if(id<p.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}	
	}
}