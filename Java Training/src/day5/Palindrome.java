package day5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rev =0;
		int ognum= num;
		
		while(ognum>0) {
			
			int temp = ognum%10;
			rev = rev*10+temp;
			ognum = ognum/10;
		}
		
		if(rev==num) {
			System.out.println("This is Palindrome");
		}
		else {
			System.out.println("This is not a Palindrome");
		}
	sc.close();
	
	}

}
