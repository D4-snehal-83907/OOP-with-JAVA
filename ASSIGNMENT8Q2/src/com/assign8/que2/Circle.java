package com.assign8.que2;

import java.util.concurrent.CancellationException;

public class Circle {
	
	Point2D p;
	double myDiameter ;
	
	
	public Circle() {
		p = new Point2D(0,0);
		this.myDiameter = 100;
		
	}
	
	void setMyDiameter(double myDiameter) {
		if(myDiameter < 0)
			throw new CannotNegative("Diameter never be Negative.....!");
		this.myDiameter = myDiameter;
	}
	
	double getMyDiameter() {
		return myDiameter;
	}

}