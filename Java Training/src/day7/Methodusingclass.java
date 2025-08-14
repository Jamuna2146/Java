package day7;
//method call using class and with arguments...
public class Methodusingclass 
{
	public int add(int a, int b) 
	{
		int sum = a +b;
		return sum;
	}

	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		
		Methodusingclass obj = new Methodusingclass();
		
		int result = obj.add(num1, num2);
		System.out.println(result);
	

	}

}
