package day36_wrapperclasses_arrayslistintro;

public class Boxing {
	public static void main(String[] args) {
		//Autoboxing = > primitive > object
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		//Unboxing => object => primitive
		Double d1 = new Double(123.4);
		double d2 = d1;
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		long l1 = new Long(600000000); //UNBOXING
		Long l2 = new Long (345673L); // NO BOXING
		
	}
}
