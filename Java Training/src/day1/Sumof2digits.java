package day1;

import java.util.Scanner;

public class Sumof2digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		if(num>9) {
			int temp = num%10;
			sum += temp;
			num = num/10;
			sum +=num;
		}
		System.out.println(sum);
		
		sc.close();

	}

}
