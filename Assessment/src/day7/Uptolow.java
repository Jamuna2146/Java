package day7;
import java.util.*;
import java.lang.*;

public class Uptolow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String result = "";
		
		for(int i = 0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch>='a' && ch<='z') 
			{
				result += (char)(ch-32);
			}
			else
			{
				result += ch;
			}
		}
		System.out.println(result);
	}

}
