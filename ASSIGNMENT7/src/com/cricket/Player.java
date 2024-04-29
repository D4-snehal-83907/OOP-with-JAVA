package com.cricket;

import java.util.Scanner;

public abstract class Player {
	
	private int id;
	private String name;
	private int age;
	private int matchPlayed;
	private static int genId = 1 ;
	
	
	public Player(String name, int age, int matchPlayed) {
		
		this.name = name;
		this.age = age;
		this.matchPlayed = matchPlayed;
		this.id = genId++;
	}
	
	public Player() {
		this.id = genId++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatchPlayed() {
		return matchPlayed;
	}

	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	
	@Override
	public abstract String toString();
	
	public abstract void accepet(Scanner sc) ;

}
