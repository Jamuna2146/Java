package day2;

public class Swapusingop {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 21;
		
		System.out.println(" Before swapping: a = "+a + " b = "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping: a = "+a  + " b = "+b);

	}

}
