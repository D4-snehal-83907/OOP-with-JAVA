
public class assign2q2 {
 
	public static double calculateDailyDrivingCost(double totalMiles, double costPerGallon, double avgMilesPerGallon, double parkingFees, double tolls) {
        double gasolineCost = (totalMiles / avgMilesPerGallon) * costPerGallon;
        double totalCost = gasolineCost + parkingFees + tolls;
        return totalCost;
    }
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
       
        System.out.print("Enter total miles driven per day: ");
        double totalMiles = scanner.nextDouble();
        
        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();
        
        System.out.print("Enter average miles per gallon: ");
        double avgMilesPerGallon = scanner.nextDouble();
        
        System.out.print("Enter parking fees per day: ");
        double parkingFees = scanner.nextDouble();
        
        System.out.print("Enter tolls per day: ");
        double tolls = scanner.nextDouble();
        
       
        double dailyCost = calculateDailyDrivingCost(totalMiles, costPerGallon, avgMilesPerGallon, parkingFees, tolls);
        
        
        System.out.println("\nYour daily driving cost is: $" + String.format("%.2f", dailyCost));
        
        scanner.close();
    }
}