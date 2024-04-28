package EmployeePaySlip;

import java.util.Scanner;

public class HourlyEmployee extends Employee{

	private double workedHrs;
	private double ratePerHrs ;
	private double overTimeHrs;
	
	public HourlyEmployee() {
		this.overTimeHrs = 0;
	}
	
	
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
//		System.out.println("\n ------ Base Sal Comm Employee ---- ");
		System.out.println("Enter Number Of HRS worked :");
		workedHrs = sc.nextDouble();
		
		if(this.workedHrs > 40) {
			this.overTimeHrs = this.workedHrs - 40;
		}
		
		System.out.println("Enter Rate per hrs :");
		workedHrs = sc.nextDouble();
		
	}
	
	
	@Override
	public String toString() {
		
		return " *** Hourly Paid Employee *** \n"
				+ "Name : "+this.getfName()+" "+this.getlName()+"\n"
				+"Salary : "+this.calSalary();
	}
	
	@Override
	public double calSalary() {
		if(workedHrs <= 40 ) {
			return ratePerHrs * workedHrs;
		}else {
			return ((ratePerHrs * 40) + (overTimeHrs * ratePerHrs * 1.5));
		}
	}
	
	
	
}
