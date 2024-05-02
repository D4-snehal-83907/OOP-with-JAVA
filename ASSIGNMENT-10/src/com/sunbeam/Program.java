package com.sunbeam;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
          Student[] arr = {
				new Student(4,"sarthak",70),
				new Student(2,"dhamma",80),
				new Student(5, "harshu",75),
				new Student(1,"snehal", 90),
				new Student(3, "nidhi",65) };
	
       
  		
  		Arrays.sort(arr);
  	
  		for (Student Student : arr)
  			System.out.println(Student);

	}
	
	
	
}

