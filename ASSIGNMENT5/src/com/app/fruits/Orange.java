package com.app.fruits;

public class Orange extends Fruits {
	
	
	public Orange() {}
	public Orange(String name, double weight, String color) {
		// TODO Auto-generated constructor stub
		super(color,weight,name);
	}

	@override
	public String taste() {
		return "Sour";
	}
	@override
	public String toString() {
		return "Orange [color=" + this.getColor() + ", weight=" + this.getWeight() + ", name=" + this.getName() + ", isFresh=" + (this.isFresh()?"Fresh":"stale") + "]";
	}

}