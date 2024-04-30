package com.assign8.que2;
import java.lang.Math;

public class Point2D {
	
	float x;
	float y;
	
	
	public Point2D() {
		this.x=0;
		this.y=0;
	}
	
	
	public Point2D(float x, float y) {
		
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public String getDetails() {
		
		return "X : "+this.x+" , Y : "+this.y;
	}
	
	public boolean isEqual(Point2D p ) {
		
		if(this.x == p.x && this.y == p.y) {
			return true;
		}
			return false;
		
			
	}
	
	public double calculateDistance(Point2D p ) {
		
		
		 double xVal = Math.pow(( this.x - p.x), 2);
		 double yVal = Math.pow(( this.y - p.y), 2);
		
		double distance = Math.sqrt(xVal + yVal);
		
		return distance;
	}
	
	
	

}