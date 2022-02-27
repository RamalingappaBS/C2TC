package Java_Stack;

//Stack program with various operations: push(), pop(), peek(), empty(), search(), size(), set(), add(), remove()
import java.util.*;
public class Stack_Program 
{
	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<String>();		//create stack 
		boolean b=s.empty();						//empty() method
		System.out.println("is stack empty: "+b); 	//to check if stack is empty or not
		System.out.println();
		s.push("Praveen");								//push() method
		s.push("Janson");
		s.push("Monica");
		s.push("Bharath");								//top value=3
		System.out.println("After push operation: "+s);
		System.out.println();
		b=s.empty();
		System.out.println("is stack empty: "+b); 
		System.out.println();
		s.pop();										//pop() method
		System.out.println("after popping: "+s); 		//the element in top is removed
		System.out.println();
			//s.pop("mill")								//element in middle or bottom cannot be removed
		String name=s.peek();							//peek() method
		System.out.println("top element of stack is : "+name);
		System.out.println();
		int location=s.search("Monica"); //search() method and //to search location of Monica
		System.out.println("Monica is located at: "+location);
		System.out.println();
		System.out.println("is stack empty: "+b);
		System.out.println();
		int  a=s.size();								//To know size of stack
		System.out.println("the size of stack: "+a+s);
		System.out.println();
		s.set(1, "Roopa");
		System.out.println("after changing: "+s); 	
		System.out.println();
		s.remove(0);
		System.out.println("after delelting: "+s);
		System.out.println();
		s.add(1,"Bhaveesh");
		s.add(2,"Shreesh");
		s.add(3,"Harish");
		System.out.println("after adding element at 1: "+s);
		System.out.println();
		System.out.println("the size of stack is: "+a);
	}
}