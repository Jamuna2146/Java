package day5;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the Array number:");
		
		for (int i = 0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
		
	}
		System.out.println("The Arrays are:");
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		sc.close();
	}
}
