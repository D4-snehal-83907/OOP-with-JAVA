package com.cricket;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {

	private int wickets;
	private int totalRuns;
	
	public Cricketer(int noOfwickets,int totalRuns) {
	this.wickets = noOfwickets;
	this.totalRuns = totalRuns;
	
	}	
	
	public Cricketer(){}

	
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	
	

	@Override
	public int getwickets() {
		return wickets;
	}

	@Override
	public int getRuns() {
		
		return totalRuns;
	}

	@Override
	public String toString() {
		
		return "** Player Info ** \n"
				+ "Id : "+this.getId()+"\n"
				+ "Name : "+this.getName()+"\n"
				+ "Age : "+this.getAge()+"\n"
				+ "Mateches Played : "+this.getMatchPlayed()+"\n"
				+ "Wicket Taken : "+this.getwickets()+"\n"
				+ "Toal Runs : "+this.getRuns()+"\n";
	}

	@Override
	public void accepet(Scanner sc) {

		System.out.print(" Enter Name :");
		this.setName(sc.next()); 
		System.out.print(" Enter Age :");
		this.setAge(sc.nextInt());
		System.out.print(" Enter No . of matches played ");
		this.setMatchPlayed(sc.nextInt());
		
		
		System.out.print(" No of wicket taken : ");
		this.setWickets(sc.nextInt());
		
		
		System.out.print(" Total runs scored  : ");
		this.setTotalRuns(sc.nextInt());
		
		System.out.println();
		
		
		
		this.getwickets();
		
	}

}
