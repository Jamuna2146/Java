package hackerRank;
import java.util.Scanner;
public class HRYM1031 {
	

	public class RoadRoarer {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        float frontLeft = sc.nextFloat();
	        float rearLeft = sc.nextFloat();
	        float rearRight = sc.nextFloat();
	        float frontRight = sc.nextFloat();

	        System.out.print("Front-left : ");
	        printPressureStatus(frontLeft);

	        System.out.print("Rear-left : ");
	        printPressureStatus(rearLeft);

	        System.out.print("Rear-right : ");
	        printPressureStatus(rearRight);

	        System.out.print("Front-right : ");
	        printPressureStatus(frontRight);
	    }

	    static void printPressureStatus(float pressure) {
	        if (pressure < 33) {
	            System.out.println("Inflate");
	        } else if (pressure > 33) {
	            System.out.println("Deflate");
	        } else {
	            System.out.println("Untouched");
	        }
	    }
	}


}
