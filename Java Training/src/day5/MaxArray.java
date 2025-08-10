package day5;
import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
	
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = arr[0];
		
		System.out.println("Enter the Array:");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				
			}
		}
		System.out.println(max);
		
		sc.close();

	}

}
