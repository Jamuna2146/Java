package day3;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("paris "+" london "+" Rome "+" italy "+
		" Netherlands " + " Germany "+" Arab");
		String country = sc.nextLine();
		
		switch(country) {
		case "paris":
		{
			System.out.println("city of love");
		}
		break;
		case "london":
		{
			System.out.println("city of literature ");
		}
		break;
		case "Rome":
		{
			System.out.println("City of sports");
		}
		break;
		case "italy":
		{
			System.out.println("city of foods");
		}
		break;
		case "Netherlands":
		{
			System.out.println("city of tulips");
		}
		break;
		case "Germany":
		{
			System.out.println("city of cars");
		}
		break;
		case "Arab":
		{
			System.out.println("city of expensive");
		}
		break;
		
		}
sc.close();
	}

}
