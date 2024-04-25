package tester;
import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_points;
		int x,y;
		System.out.println("Enter number of points to plot: ");
		total_points = sc.nextInt();
		
		Point2D []points = new Point2D[total_points];

		for(int i=0; i<points.length; i++) {
			points[i]=new Point2D();
		System.out.println("Enter Co-ordinates for Point "+i);
		System.out.println("Enter X: ");
		points[i].setX(sc.nextInt());
		System.out.println("Enter Y: ");
		points[i].setY(sc.nextInt());
		}
		int choice;
		
		do {
			System.out.println("1.Display details of a specific point:");
			System.out.println("2.Display x, y co-ordinates of all points:");
			System.out.println("3.indices for the points , validate the indices:");
			System.out.println("4.Exit.");
			
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Details of sepcific point: ");
				int point_i=sc.nextInt();
				if(point_i<points.length) {
					System.out.println(points[point_i].getDetails());
				}
				else {
					System.out.println("Invalid index, please retry!!!");

				}
				
				break;
			case 2:
				for(int i=0;i<points.length;i++) {
					System.out.println("Co-ordinates of point "+(i+1));
					System.out.println(points[i].getDetails());
				}
				break;
			case 3:
				if(points.length>1) {
					System.out.println("Enter index for start point and End point: ");
					System.out.println("Enter index for point 1: ");
					int point1=sc.nextInt();
					System.out.println("Enter index for point 2: ");
					int point2=sc.nextInt();
					
					if(point1<total_points && point2<total_points) {
						if(points[point1].isEqual(points[point2])) {
							System.out.println("Points are equal.");
						}
						else {
							System.out.println(points[point1].calculateDistance(points[point2]));
						}
					}
					else {
						System.out.println("Points does not exists.");
					}
				}
				else {
					System.out.println("Only one point exist.");
				}
				
				break;
			case 4:
				System.out.println("Thank you...See you again..");
				break;
			}
			
		}while(choice!=4);
	
		sc.close();
	}

}