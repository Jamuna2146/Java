package hackerRank;
import java.util.Scanner;

public class HRYM1029 {
	
	public class SpaceBeltChecker {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        boolean allEngaged = true;

	        for (int i = 0; i < 3; i++) {
	            String status = sc.nextLine().trim();
	            if (!status.equals("engaged") && !status.equals("disengaged")) {
	                System.out.println("Invalid Input");
	                return;
	            }
	            if (status.equals("disengaged")) {
	                allEngaged = false;
	            }
	        }

	        if (allEngaged) {
	            System.out.println("Initiating Warp Drive!");
	        } else {
	            System.out.println("Hold On! Some Belts are Adrift.");
	        }
	    }
	}


}
