import java.util.Scanner;
public class ASSIGNQ2 {
    private static Object breake;
	public static void main(String[] args) {
		double total=0.0;
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("0.EXIT\n1.Poha  20/-\n2.misalpav  70/-\n3.Dosa   50/-\n4.tea  10/-\n5.samosa  15/-\n6.pavbhaji 75/-\n7.vadapav 10/-\n8.bhaji   25/-\n9.shabudnakhichdi   40/-\n10.patis   15/-\n11.Generate bill....\n\n");
			System.out.println("______________________________________________________");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("Thank you Visiting again......");
				break;
			case 1:
				total+=20;
			break;
			case 2:
				total+=70;
			break;
			case 3:
				total+=50;
			break;
			case 4:
				total+=10;
			break;
			case 5:
				total+=15;
			break;
			case 6:
				total+=75;
			break;
			case 7:
				total+=10;
			break;
			case 8:
				total+=25;
			break;
			case 9:
				total+=40;
			break;
			case 10:
				total+=15;
			break;
			case 11:
				System.out.println("Your Total Bill is:"+total+"RS");
			
			break;
			default:
				System.out.println("-------INVALID CHOICE-----");
			break;
			}
		}while(choice!=0);

	}

}
