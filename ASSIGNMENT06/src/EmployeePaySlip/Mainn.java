package EmployeePaySlip;

import java.util.Scanner;

public class Mainn {

	public static void menu() {
		System.out.println("\n ............ CHOOSE ............. ");
		System.out.println("  1 : Salarid Employee ");
		System.out.println("  2 : Hourly Employee ");
		System.out.println("  3 : Commition Employee ");
		System.out.println("  4 : Base Sal. Commission Employee ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println(" Enter Employee Count : ");
		int n = sc.nextInt();
		int ctr = 0;
		Employee e = null ;
		
		Employee []empArray = new Employee[n];
		do {
			menu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("==== Salaried Employee ====");
				e = new SalariedEmployee();
				
				break;
			case 2:
				System.out.println("==== Hourly Employee ====");
				e = new HourlyEmployee();
				

				break;
			case 3:
				System.out.println("==== Commission Employee ====");
				e = new CommisionEmployee();

				break;
			case 4:
				System.out.println("==== Base Sal. Comm. Employee ====");
				e = new BaseSalCommEmployee();

				break;

			default:
				System.out.println(" Invalid Choice ... !");
				break;
			}
			if(e != null) {
				e.accept(sc);
				empArray[ctr] = e;
				e= null;
				ctr++;

			}
		} while (ctr < n);
		
		for(Employee e1 : empArray) {
			System.out.println("  "+e1+"\n");
		}

	}

}
