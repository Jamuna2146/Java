package day4;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		
		while(original>0) { 
			int temp = original%10; 
			sum += temp*temp*temp; 
			original = original/10;
		}
		System.out.println(sum);
		if(sum==num) {
			System.out.println("This is Amstrong Number");
		}
		else {
			System.out.println("This is not a Amstrong number");
		}
sc.close();
	}

}
