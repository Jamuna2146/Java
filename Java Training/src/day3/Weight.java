package day3;
import java.util.Scanner;
public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int weight = sc.nextInt();
		
		if(weight<=100) {
			System.out.println("valid");
			if(weight%2==0) {
				System.out.println("Even....Yes");
				int half= weight/2 ;
				System.out.println(half + "" +half);
			}
			else {
				System.out.println("odd....No");
			}
		}
		else {
			System.out.println("invalid");
		}
sc.close();
	}

}
