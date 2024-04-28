package com.app.fruits;

public class Apple extends Fruits{
	
	
	public Apple() {}
	public Apple(String name, double weight, String color) {
		
		super(color,weight,name);
	}

	@override
	public String taste() {
		return "Sweet n Sour";
	}
	
	@override
	public String toString() {
		return "Apple [color=" + this.getColor() + ", weight=" + this.getWeight() + ", name=" + this.getName() + ", isFresh=" + (this.isFresh()?"Fresh":"stale") + "]";
	}

}