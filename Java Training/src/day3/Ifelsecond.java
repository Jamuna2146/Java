package day3;
import java.util.Scanner;

public class Ifelsecond {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int num= sc.nextInt();
			 
			if(num%3==0 && (num%5==0)) {
				System.out.println("Fizz Bizz");
			}
			else if(num%5==0) {
				System.out.println("Bizz");
			}
			else if (num%3==0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println("cannot satisfy by both 3 and 5");
			}
			
		}
		 
	}

}
