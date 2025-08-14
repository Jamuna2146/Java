package day3;
import java.io.*;
import java.util.*;

public class HRYM1034 {
	public static void main(String args[]) {
	
	        Scanner sc = new Scanner(System.in);
	        String rollNumber = sc.next(); 

	        boolean isLucky = true;
	        
	        for (int i = 0; i < rollNumber.length(); i++) {
	            char c = rollNumber.charAt(i);
	            if (c != '4' && c != '7') {
	                isLucky = false;
	                break;
	            }
	        }

	        System.out.println(isLucky ? "YES" : "NO");
sc.close();
	    }
	}


