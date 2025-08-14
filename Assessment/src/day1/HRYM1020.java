package day1;

import java.util.*;

public class HRYM1020 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int totstds = sc.nextInt();
	        int desgrps = sc.nextInt();
	        
	        int stds = totstds/desgrps;
	        int left = totstds%desgrps;
	        
	        System.out.println("The number of students in each team is " + stds +" and left out is "+ left);
	        sc.close();
	    }
	}

