package EmployeePaySlip;

import java.util.Scanner;

public class SalariedEmployee extends Employee{

	private double fixSal;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Weekly sal : ");
		fixSal = sc.nextDouble();
		
	}
	@Override
	public String toString() {
		
		return " ** Salarid Employee ** \n"
				+ "Name : "+this.getfName()+" "+this.getlName()+"\n"
				+"Salary : "+this.calSalary();
	}

	@Override
	public double calSalary() {
		
		return fixSal;
	}

}
