
		import java.util.Scanner;

		public class ASSIGN2{
		    
		    
		    public static void main(String[] args) {
		    	int totalMiles;
		    	int costPerGallon;
		    	int AvgMiles;
		    	int parkingFees;
		    	int tollPerDay;
		    	int totalDrivingCost;
		    	int costPerDay;
		    	
		        Scanner sc = new Scanner(System.in);
		        
		       
		        System.out.print("Enter total miles driven per day: ");
		        totalMiles=sc.nextInt();
		    	System.out.println("------");
		    	
		      
		        
		        System.out.print("Enter cost per gallon of gasoline: ");
		        costPerGallon=sc.nextInt();
		    	System.out.println("------");
		    	
		       

		        System.out.print("Enter average miles per gallon: ");
		        AvgMiles=sc.nextInt();
		    	System.out.println("---------");
		    	
		    	totalDrivingCost=((totalMiles)/(AvgMiles)) * costPerGallon;
		        
		        System.out.print("Enter parking fees per day: ");
		        parkingFees=sc.nextInt();
		    	System.out.println("------------");
		        
		        System.out.print("Enter tolls per day: ");
		        tollPerDay=sc.nextInt();
		        
		        costPerDay=totalDrivingCost+parkingFees+tollPerDay;
		    	System.out.println("\n\n------------Cost per day of driving to work------------");
		    	System.out.println("                                     "+costPerDay);

		        
		}

	}


