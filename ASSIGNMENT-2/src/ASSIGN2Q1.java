import java.util.Scanner;
public class ASSIGN2Q1{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
     System.out.println("Enter account number:");
     int accountNumber=scanner.nextInt();
     
     System.out.println("Enter pending balance at the beggining of the month:");
     int beginningBalance=scanner.nextInt();
     
     System.out.println("Enter total items charged this month:");
     int totalCharges=scanner.nextInt();
     
     System.out.println("Enter total credits applied this month:");
     int totalCredits=scanner.nextInt();
     
     System.out.println("Enter allowed credit limit:");
     int creditLimit=scanner.nextInt();
   
	//calculate
     int newBalance=beginningBalance +totalCharges -totalCredits;
     System.out.println("New balance:"+newBalance);
     //check if new balance exceeds credit limit
     if(newBalance>creditLimit) {
    	 System.out.println("credit limit exceeded");
     }else {
    	 System.out.println("credit limit not exceeded");
     }
	}

}
