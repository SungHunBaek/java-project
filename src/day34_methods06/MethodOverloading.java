package day34_methods06;

public class MethodOverloading {
	public static void main(String[] args) {
		add(10,20);
		long l1=1234;
		long l2 = 123445;
		add(l1,l2);
		add(234.2,2355);
	}
	public static void add(int num1,int num2) {
		int result = num1+num2;
		System.out.println(result);
	}
	public static void add(double num1, double num2) {
		double result = num1+num2;
		System.out.println(result);
	}
	public static void add(long num1, long num2) {
		long result = num1+num2;
		System.out.println(result);
	}
	public static void add(String str1, String str2) {
		String result = str1 + str2;
		System.out.println(result);
	}
}
