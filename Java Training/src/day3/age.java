package day3;
import java.util.Scanner;
public class age {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int age =  sc.nextInt();
		 
		 if(age>=18) {
			 System.out.println("eligible for Vote");
			 if(age>=24) {
				 System.out.println("eligible for Vote");
			 }
		 }
		 else {
			 System.out.println("not eligible for vote");
		 }
sc.close();
	}

}
