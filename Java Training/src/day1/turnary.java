package day1;
import java.util.Scanner;

public class turnary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number:");
		int num = sc.nextInt();
		
		String str = (num%2==0)? "Even":"Odd";
		
		System.out.println(str);
		
		sc.close();

	}

}
