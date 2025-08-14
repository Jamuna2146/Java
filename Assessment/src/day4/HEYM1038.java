package day4;
import java.util.Scanner;

public class HEYM1038 {
	
	public class Solution {


	    static int gcd(int a, int b) {
	        if (b == 0) return a;
	        return gcd(b, a % b);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int G = sc.nextInt(); 
	        int M = sc.nextInt(); 
	        int T = sc.nextInt(); 

	        int gokulScore = 0;
	        int minorScore = 0;

	        boolean gokulTurn = true;

	        while (T > 0) {
	            if (gokulTurn) {
	                int gcdVal = gcd(G, T);
	                gokulScore += gcdVal;
	                T -= gcdVal;
	            } else {
	                int gcdVal = gcd(M, T);
	                minorScore += gcdVal;
	                T -= gcdVal;
	            }
	            gokulTurn = !gokulTurn;
	        }

	        if (gokulScore > minorScore) {
	            System.out.println("Winner: Gokul");
	        } else if (minorScore > gokulScore) {
	            System.out.println("Winner: Minor");
	        } else {
	            System.out.println("It's a draw!");
	        }
	    }
	}


}
