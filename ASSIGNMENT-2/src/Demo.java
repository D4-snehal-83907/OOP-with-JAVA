


import java.util.Scanner;
public class Demo1
{
                    private double new_bal;
                    Demo1()
                    {

                    }
                    Demo1(double new_bal)
                    {
                                        this.new_bal = new_bal;
                    }
                    void credit_limit(int b, int t, int tc, int cl)
                    {
                                        int new_bal=b +t -tc;
                                        System.out.println("New balance:"+newBalance);
     //check if new balance exceeds credit limit
                                        if(new_bal>creditLimit) 
                                        {
    	                                        System.out.println("credit limit exceeded");
                                        }
                                        else 
                                        {
    	                                        System.out.println("credit limit not exceeded");
                                        }
                    }


}
public class Demo
{

	public static void main(String[] args) 
                    {
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
                                        Demo1 dd = new Demo1();
                                        dd.credit_limit(beginningBalance,totalCharges,totalCredits,creditLimit)

   
     
	}

}
