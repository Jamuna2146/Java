package day4;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of series:");
		int n = sc.nextInt();
		System.out.println("enter the first num:");
		int firstnum= sc.nextInt();
		System.out.println("enter the second num:");
		int secondnum = sc.nextInt();
		System.out.println("Fibonacci Series till " + n + " terms:");
		
		for(int i =1; i<=n;i++) {
			
			System.out.print(firstnum + " ");
			
			int nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
		}
		
		sc.close();
	}

}
