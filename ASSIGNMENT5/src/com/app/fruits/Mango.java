
package com.app.fruits;

public class Mango extends Fruits{

	public Mango() {}
	
	public Mango(String name, double weight, String color) {
		// TODO Auto-generated constructor stub
		super(color,weight,name);
	}

	@override
	public String taste() {
		return "Sweet";
	}
	@override
	public String toString() {
		return "Mango [color=" + this.getColor() + ", weight=" + this.getWeight() + ", name=" + this.getName() + ", isFresh=" + (this.isFresh()?"Fresh":"stale") + "]";
	}
}