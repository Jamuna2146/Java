package day4;
import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start= sc.nextInt();
		int end= sc.nextInt();
		
		int evencount = 0;
		int oddcount = 0;
		
		for(int i = start; i<=end; i++ ) {
			if(i%2==0) {			//count for the even numbers
				evencount = evencount+1;
			}
			if(i%2!=0) {			//count for the odd numbers
				oddcount = oddcount+1;
			}
		}
		System.out.println("even count is:" + evencount);
		System.out.println("odd count is:" + oddcount);
		sc.close();

	}

}
