package hackerRank;

import java.io.*;
import java.util.*;

public class HRYM1019 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int twodigi = sc.nextInt();
	        int sum = 0;
	        
	        if(twodigi>9){
	            int temp = twodigi%10;
	            sum = sum+temp;
	            twodigi=twodigi/10;
	            sum += twodigi;
	        }
	        System.out.println(sum);
	    }
	}


