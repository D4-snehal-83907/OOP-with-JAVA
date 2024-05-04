import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

//HELPER CLASS
class RollnoCompartor implements Comparator<Student>
{
		@Override
		public int compare(Student o1, Student o2) 
		{
			return o1.rollno -o2.rollno;
		}
}

class Student
{
	int rollno;
	String name;
	double marks;
	String course;
	
	public Student()
	{
		
	}
	public Student(int rollno,String name,double marks,String course) 
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		this.course=course;
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString()
	{
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
	
}
public class Main
{
			
	public static void main(String[] args) 
	{
		int rollno=0;
		String name="";
		double marks=0;
		String course="";
		int counter=0;
		int choice = 0;

		Scanner se=new Scanner(System.in);
		
		ArrayList<Student> s1=new ArrayList<>();

	
	do {
		System.out.println("0.Exit");
		System.out.println("1.Add Student");
		System.out.println("2.Display all students sorted on rollno");
		System.out.println("3.Display all students sorted on name");
		System.out.println("4.Display all students sorted on marks in desc order");
		System.out.println("5.Display all students sorted on course");
		choice=se.nextInt();
		switch(choice) 
		{
		case 1:
			
			if(counter<10) 
			{
				System.out.println("Enter Student's Roll No");
				rollno=se.nextInt();
				
				System.out.println("Enter Student's Name");
				name=se.next();
				
				System.out.println("Enter Student's Marks");
				marks=se.nextDouble();
				
				System.out.println("Enter Student's Course Name");
				course=se.next();
				s1.add(new Student(rollno,name,marks,course));
			    counter++;
			}
			else 
			{
				System.out.println("Student List is full You have added 10 Students");
			}
			break;
			
		case 2:
			RollnoCompartor rc=new RollnoCompartor();
     	
			Collections.sort(s1,rc);
			for (Student element : s1)
				System.out.println(element);
			
			break;	
		
		default:
			System.out.println("invalid choice");
			
		}
		System.out.println("thank you");
	}while(choice!=0);
	
	
	}
}
	
			
	


		
	
	

	
	

	
