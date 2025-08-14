package day7;
import java.lang.*;
public class Stringmethods {

	public static void main(String[] args) {
		
		String str1 = "hello"; //type1 literals
		String str2 = new String("world"); //type2 using new keyword
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.contains("ll"));
		System.out.println(str2.startsWith("h"));
		System.out.println(str2.endsWith("d"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.concat(str2));
		
		
		

	}

}
