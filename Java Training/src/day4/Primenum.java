package day4;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		if(num==0 || num==1) {
			System.out.println("Not a Prime");
		}
		else {
			for(int i = 2; i<=num; i++) {
				if(num%i==0) {
					count = count+1;
				}
			}
			
			if(count==1) {
				System.out.println("it is prime");
			}
			else {
				System.out.println("it is not prime");
			}
		}
		sc.close();

	}

}
