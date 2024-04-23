import java.util.*;
public class ASSIGN1 {

	public static void main(String[] args) {
		double num1=0;
		double num2=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1-");
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();}
		System.out.println("Enter num2-");
		if(sc.hasNextDouble());
		num2=sc.nextDouble();
		}
        avg (num1,num2);
}  
	
        private static void avg(double num1,double num2)
        {
        	double avg=(num1+num2)/2;
        	System.out.println("average"+avg);
}
}