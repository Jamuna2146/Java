package day4;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 20;
		int count = 0;
		while(num>0) {
			System.out.println(num);
			count= count+1;
			num--;		//reversing the numbers
		}
		
		sc.close();
		
		
		
	}

}
