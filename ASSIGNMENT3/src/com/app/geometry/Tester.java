package com.app.geometry;

public class Tester {

	public static void main(String[] args) {
		Point2D p= new Point2D();
		p.acceptCooridnate();
		System.out.println("Distance between two points is:"+p.calculateDistance());
	}

}
