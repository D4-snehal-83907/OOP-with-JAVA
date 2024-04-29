package com.cricket;

import java.util.Scanner;

public class Test {
	public static void menu() {
		System.out.println(" ................. CHOOSE ................ \n");
		System.out.println(" 1 : Total runs by all players ");
		System.out.println(" 2 : Wicket Taken by all Players ");
		System.out.println(" 3 : Total Matches Played by each player ");
		System.out.println(" 4 : Player Info ");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Player[] plArray = new Player[11];
		Player p = null;
		System.out.println(" ***** Enter Info of All Players : **** \n");
		for (int i = 0; i < 11; i++) {

			System.out.println("	** Player No : " + (i+1) + " **\n");
			p = new Cricketer();
			p.accepet(sc);
			plArray[i] = p;
		}
		int choice = 0;
		do {
			menu();
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println(" Thanks You .... !");
				break;
			case 1:
				int sum =0 ;
				for( Player play : plArray) {
					
					Cricketer c1 = (Cricketer) play;
					sum += c1.getRuns();		
				}
				System.out.println(" ---------------------------------------- ");
				System.out.println(" Total runs by all players is : "+sum);
				System.out.println(" ---------------------------------------- ");
				
				break;
			case 2:
				int sumWick=0;
				for( Player play : plArray) {
					
					Cricketer c1 = (Cricketer) play;
					c1.getRuns();	
					System.out.println(" ***  PlayerId : "+ c1.getId()+"   Wicket Taken : "+c1.getwickets());
					
					sumWick += c1.getwickets();
				}
				System.out.println(" ---------------------------------------- ");
				System.out.println(" Total Wickets by all players : "+ sumWick);
				System.out.println(" ---------------------------------------- ");

				break;
			case 3:
				
				int mat=0;
				for( Player play : plArray) {
					System.out.println(" ***   PlayerId : "+ play.getId()+"   Match Played :"
					+ " "+play.getMatchPlayed());
 
					
					mat += play.getMatchPlayed();
				}
				System.out.println(" ---------------------------------------- ");
				System.out.println(" Total Wickets by all players : "+ mat);
				System.out.println(" ---------------------------------------- ");

				break;
			case 4:
				
				for( Player pl : plArray) {
					
					System.out.println( pl.toString()+"\n");
					}

				break;
			default:
				System.out.println(" Invalid Choice ..... ! ");
				break;
			}

		} while (choice != 0);

	}
	

}
