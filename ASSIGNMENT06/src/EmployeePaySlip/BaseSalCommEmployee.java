package EmployeePaySlip;

import java.util.Scanner;

public class BaseSalCommEmployee extends Employee {
	
	private float commPercentage;
	private float sales;
	private float baseSal;
	
	@Override
	public String toString() {
		return " *** Base Sal Comm Employee *** \n"
				+ "Name : "+this.getfName()+" "+this.getlName()+"\n"
				+"Salary : "+this.calSalary();
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
//		System.out.println("\n ------ Base Sal Comma Employee ---- ");
		System.out.println("Enter Base Sal. :");
		sales = sc.nextFloat();
		System.out.println("Enter Commition percentage :");
		commPercentage = sc.nextFloat();
		System.out.println("Enter Total Sales In RS. :");
		sales = sc.nextFloat();
	}
	
	@Override
	public double calSalary() {
		return (sales*(commPercentage/100)+baseSal);
		
	}

}
