package com.app.geometry;
import java.util.Scanner;
import java.lang.Math;
public class Point2D {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	Scanner sc=new Scanner(System.in);
	
	public Point2D() {
	
	}

	public Point2D(double x1,double y1,double x2,double y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	public double getX1() {
		return x1;
	}


	public void setX1(double x1) {
		this.x1 = x1;
	}


	public double getY1() {
		return y1;
	}


	public void setY1(double y1) {
		this.y1 = y1;
	}


	public double getX2() {
		return x2;
	}


	public void setX2(double x2) {
		this.x2 = x2;
	}


	public double getY2() {
		return y2;
	}


	public void setY2(double y2) {
		this.y2 = y2;
	}


	public void acceptCooridnate() {
		System.out.println("Enter x and y co-ordinates for point 1:");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		
		System.out.println("Enter x and y co-ordinates for point 2:");
		x2=sc.nextDouble();
		y2=sc.nextDouble();	
	}
	
	public boolean isEqual() {
		boolean result=false;
		if(x1==x2 && y1==y2) {
			result =true;
		}
		else{
			result=false;
		}
		
		return result;
		}
	
	public double calculateDistance() {
		double result=0;
		if(isEqual()){
			System.out.println("Both points are located same point");
		}
		else {
			result=Math.sqrt((Math.pow((x1-x2),2)-(Math.pow((y1-y2),2))));
		}
		return result;
	}
		
	
	}

