
package com.sunbeam;

import java.util.Arrays;

public class program {

	public static void main(String[] args) {
		Product[] arr = {
				new Product(4,"kia","car",90),
				new Product(2,"Oneplus","mobile",10),
				new Product(5, "pant","cloth",50),
				new Product(1,"pen","stationary",15),
				new Product(3, "mango","fruit",250),
				new Product(9, "apple","fruit",260),
				new Product(6, "watermelon","fruit",90),
				new Product(9, "realme6","mobile",250),
				new Product(8, "lichi","fruit",70),
				new Product(11, "swift","car",250)
		};
	

		Arrays.sort(arr);

		for (Product product : arr)
			System.out.println(product);
		
		Comparable<Product> c1 = new Product(); 
	}
	
	
	

}
