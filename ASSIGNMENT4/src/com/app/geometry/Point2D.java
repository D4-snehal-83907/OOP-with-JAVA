package com.app.geometry;
import java.util.Scanner;
public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {
		x=0;
		y=0;
	}
	public Point2D(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public String getDetails() {
		return "("+this.x+", "+this.y+")";
	}

	public boolean isEqual(Point2D p2) {
		if(this.x==p2.x && this.y==p2.y) {
			return true;
		}
		return false; 
	}
	public double calculateDistance(Point2D p2) {
		double distance = Math.pow((this.x-p2.x), 2) + Math.pow((this.y-p2.y), 2);
		distance = Math.sqrt(distance);
		return distance;
	}
}