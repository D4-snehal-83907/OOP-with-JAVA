package EmployeePaySlip;

import java.util.Scanner;

public class CommisionEmployee extends Employee{
	
	private float commPercentage;
	private float sales;
	
	@Override
	public String toString() {
		return " ***  Commission Employee *** \n"
				+ "Name : "+this.getfName()+" "+this.getlName()+"\n"
				+"Salary : "+this.calSalary();
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
//		System.out.println("\n ------ Comm Employee ---- ");
		System.out.println("Enter Commition percentage :");
		commPercentage = sc.nextFloat();
		System.out.println("Enter Total Sales In RS. :");
		sales = sc.nextFloat();
	}
	
	@Override
	public double calSalary() {
		return sales * (commPercentage/100);
		
	}
	
	

}
