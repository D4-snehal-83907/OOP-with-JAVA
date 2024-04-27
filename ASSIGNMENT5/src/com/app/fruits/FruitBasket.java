package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basket size: ");
		int n = sc.nextInt(); 
		Fruits[] fruitList = new Fruits[n];
		int counter = 0;
		boolean flag;
		String name, color;
		double weight;
		
		
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("0.Exit"+'\n'+"1.Add mango"+'\n'+
					"2.Add Orange"+'\n'+
					"3.Add Apple"+'\n'+
					"4.Display names of fruits in basket"+'\n'+
					"5.Display information of fruit basket"+'\n'+
					"6.Mark fruit as Stale"+'\n'+
					"7.Display All stale fruit taste"+'\n'+
					"8.Mark all sour fruits"+'\n');
			
			
			
			
			
			System.out.println("Enter your choice: ");
			int choice =sc.nextInt();
		
			
			
			switch(choice) {
			case 0:
				
				break;
            case 1:
            	if(counter<n) {
            		System.out.println("----------ADD MANGO----------");
            		System.out.println("Enter name: ");
            		name = sc.next();
            		System.out.println("Enter color: ");
            		color = sc.next();
            		System.out.println("Enter weight: ");
            		weight = sc.nextDouble();
            	    fruitList[counter]=new Mango(name,weight,color);
            	    counter++;
            	}else {
            		System.out.println("Fruit basket is full");
            	}
				
				break;
            case 2:
            	if(counter<n) {
            		System.out.println("----------ADD ORANGE----------");
            		System.out.println("Enter name: ");
            		name = sc.next();
            		System.out.println("Enter color: ");
            		color = sc.next();
            		System.out.println("Enter weight: ");
            		weight = sc.nextDouble();
            	    fruitList[counter]=new Orange(name,weight,color);
            	    counter++;
            	}else {
            		System.out.println("Fruit basket is full");
            	}
				break;
            case 3:
            	if(counter<n) {
            		System.out.println("----------ADD APPLE----------");
            		System.out.println("Enter name: ");
            		name = sc.next();
            		System.out.println("Enter color: ");
            		color = sc.next();
            		System.out.println("Enter weight: ");
            		weight = sc.nextDouble();
            	    fruitList[counter]=new Apple(name,weight,color);
            	    counter++;
            	}else {
            		System.out.println("Fruit basket is full");
            	}
				
				break;
            case 4:
            	//name display
            	flag = false;
            	for(Fruits farr:fruitList) {
            		if(farr!=null) {
            			
            			
            			flag = true;
            			System.out.println("Fruit name:"+farr.getName());
            			
            		}
            		
            	}
            	if(flag == false){
        			System.out.println("Your basket is empty...ADD FRUITS....");
        		}
            	
            	break;
            	
            case 5:
            	flag = false;
            	for(Fruits farr:fruitList) {
            		if(farr==null) {
            			break;
            		}
            		if(farr.isFresh()==true) {
            			flag = true;
            			System.out.println(farr.toString()+"taste: "+farr.taste());
            		}
            		
            	}
            	if(flag == false){
        			System.out.println("Your basket is empty...ADD FRUITS....");
        		}
            	
            	
            	break;
            	
            case 6:
                System.out.println("Enter fruit number(index):");
            	flag=false;
                int no = sc.nextInt();
            	
            	for(int i=0;i<counter;i++) {
            		
            		if(i==no) {
            			fruitList[i].setFresh(false);
            			System.out.println("successfully added changes");
            			flag=true;
            			break;
            		}
            	}
            	if(flag==false) {
            		System.out.println("incorrect index");
            	}
            	
            	break;
            	
            case 7:
            	flag = false;
            	for(Fruits farr:fruitList) {
            		if(farr == null) {
            			break;
            		}
            		if(farr.isFresh()==false) {
            			flag = true;
            			System.out.println("Fruit taste:"+farr.taste());
            		}
            		
            	}
            	if(flag == false){
        			System.out.println("No stale fruit in your basket");
        		}
            	
            	break;
            	
            	
            	
            	
            case 8:
            	flag = false;
            	for(Fruits farr:fruitList) {
            		if(farr==null) {
            			break;
            		}
            		if(farr.taste()=="sour") {
            			
            			farr.setFresh(false);
            			flag = true;
            			
            		}
                }
            	if(flag == false) {
            		System.out.println("No sour fruits are there in your fruit basket...");
            	}else {
            		System.out.println("Fruits made stale successully");
            	}
            	
            	break;
			}
			
			if(choice == 0) break;
			
		}

	}

}