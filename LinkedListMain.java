package source;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
/*	class already present so commented out
class Student
{
	int roll;
	String name;
	int clas;
	Student(int r,String n,int c)
	{
		this.roll=r;
		this.name=n;
		this.clas=c;
		}
	void set(int r,String n,int c)
	{
		this.roll=r;
		this.name=n;
		this.clas=c;
		}
	@Override
	public String toString()
	{
		return("Roll: "+this.roll+" ,Name: "+this.name+" ,Class: "+this.clas); 
	}
} */

public class LinkedListMain {

	public static void main(String[] args) {
		char ch=0;
		int roll,clas,in,val;
		String name;
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> students = new LinkedList<Student>();
		while(ch!='9')
		{
		System.out.println("\nEnter the operations you want to perform");
		System.out.println("\n1.Add element to the Linkedlist");
		System.out.println("\n2.Add element to the Linkedlist at an index ");
		System.out.println("\n3.Remove all elements of Linkedlist");
		System.out.println("\n4.Remove first elements of Linkedlist");
		System.out.println("\n5.Remove last elements of Linkedlist");
		System.out.println("\n6.Remove an element (Provide Index)");
		System.out.println("\n7.Show the number of elements present in the Linkedlist");
		System.out.println("\n8.Show the contents of Linkedlist");
		System.out.println("\n9.Exit");
		ch=sc.nextLine().trim().charAt(0);
		switch(ch)
		{
		case '1':
			System.out.println("Enter the element to be added ");
			System.out.println("Enter the Roll No: ");
			roll=Integer.parseInt(sc.nextLine());
			System.out.println("roll no is "+roll);
			System.out.println("Enter the Name: ");
			name=sc.nextLine();
			System.out.println("Enter the Class: ");
			clas=Integer.parseInt(sc.nextLine());
			students.add(new Student(roll,name,clas));
			break;
			
		case '2':
			System.out.println("Enter index element should be added at ");
			in=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the element to be added ");
			System.out.println("Enter the Roll No: ");
			roll=Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Name: ");
			name=sc.nextLine();
			System.out.println("Enter the Class: ");
			clas=Integer.parseInt(sc.nextLine());
			students.add(in,new Student(roll,name,clas));
			break;
			
		case '3':
			students.clear();
			System.out.println("All Elements removed ");
			break;
			
		case '4' :
			System.out.println("Removing first element "+students.removeFirst());
			break;
			
		case '5' :
			System.out.println("Removing Last element "+students.removeLast());
			break;
			
		case '6':
			System.out.println("Enter index of element you want to delete ");
			in=Integer.parseInt(sc.nextLine());
			System.out.println("Element removed "+students.remove(in));
			break;
			
		case '7':
			System.out.println("No of elements present "+students.size());
			break;
		
		case '8':
			System.out.println("Showing the contents of Linkedlist ");
			/*for(Student si:students)
			{
				System.out.println(si);
			} */
			Iterator ir=students.iterator();
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
			break; 
			
		case '9':
			System.out.println("Exiting.....!!");
			break;
			
		default:
			System.out.println("Please enter correct option ");
		}
	  }
	}

}
