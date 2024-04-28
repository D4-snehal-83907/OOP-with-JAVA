package EmployeePaySlip;

import java.util.Scanner;

public abstract class Employee {
	
	private String fName ;
	private String lName;
	
	
	
	public Employee(String fName, String lName) {
		
		this.fName = fName;
		this.lName = lName;
	}

	public Employee() {
	}


	@Override
	public abstract String toString() ;
		

	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public  abstract double calSalary();
	
	
	public void accept(Scanner sc) {
		System.out.println("Enter First Name : ");
		fName = sc.next();
		System.out.println("Enter Last Name");
		lName=sc.next();
		}

}
