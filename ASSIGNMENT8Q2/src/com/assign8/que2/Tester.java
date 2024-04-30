package com.assign8.que2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Circle c1 = new Circle();
			System.out.println(" Enter Diameter length : ");
			c1.setMyDiameter(sc.nextDouble());
			
			System.out.println(" Diameter Is Non negative : "+c1.getMyDiameter());
			
		}catch(CannotNegative e){
			
			e.printStackTrace();
			
		}finally {
			
			sc.close();
		}

		System.out.println("Code Executed Successfully ...");
	}

}