package com.sunbeam.exceptions;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter String -");
			String string = sc.nextLine();
			
			
			int length = string.length();	
			
			
			
			if (length>80) {
				throw new ExceptionLineTooLong("The string is too long");
				
				
			}else {
				System.out.println("string length is - "+length);
				
			}
		}
		catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
			
		
		}
		
		

	}


