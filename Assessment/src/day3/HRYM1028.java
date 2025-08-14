package day3;
import java.io.*;
import java.util.*;
public class HRYM1028 {
	
	    public static void main(String args[]){

	        Scanner sc = new Scanner(System.in);
	        
	        int x = sc.nextInt();       
	        int y = sc.nextInt();      
	        double s = sc.nextDouble(); 
	        double r = sc.nextDouble(); 
	        double l = sc.nextDouble(); 
	    if (s > r || 2 * s < r) {
	        System.out.println("Invalid Input");
	        return;
	    }
	    double totalCost = x * s + y * r;
	    if (totalCost >= l) {
	        System.out.println("Monthly Pass");
	    }else {
	        System.out.println("Solo Trail + Roundabout Ride");
	    }
	    }
	}

