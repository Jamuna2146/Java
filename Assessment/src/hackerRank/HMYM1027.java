package hackerRank;
import java.util.Scanner;
public class HMYM1027 {
	

	    static double convertToHours(double time) {
	        int hours = (int) time;
	        double minutes = (time - hours) * 100;
	        return hours + (minutes / 60);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int x = sc.nextInt();      
	        int y = sc.nextInt();      
	        double ti = sc.nextDouble(); 
	        double tj = sc.nextDouble(); 

	        double timeStart = convertToHours(ti);
	        double timeCurrent = convertToHours(tj);

	        if (timeCurrent >= timeStart) {
	            System.out.println("Invalid Input");
	            return;
	        }

	        double availableTime = timeStart - timeCurrent;
	        double neededTime = (double) x / y;

	        if (neededTime <= availableTime) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    
	}


}
