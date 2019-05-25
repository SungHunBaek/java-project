package day36_wrapperclasses_arrayslistintro;

public class WrapperClasses {
	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = new Integer(20);
		System.out.println(n1);
		System.out.println(n2);
		
		double d1 = 44.5;
		Double d2 = new Double(123.1);
		System.out.println(d2);
		System.out.println(d1);
		
		Integer num1 = Integer.valueOf(1234);
		Integer num2 = Integer.valueOf("567");
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("false");
		
		System.out.println(num1);
        System.out.println(num2);
        System.out.println(bool1);
        System.out.println(bool2);
	}
}
