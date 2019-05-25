package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int
		int i = (int)3.4;
		System.out.println(i);
		
		double price = 230.50;
		int dollar = (int)price;
		
		int count = 42354;
		byte byteCount = (byte)count;
		System.out.println(byteCount);
		
		long longValue = 345645L;
		int intValue = (int)longValue;
		
		System.out.println("Int value: " + intValue);
		
		int result = (int)(500.4/2.0);
		System.out.println(result);
		
		byte b = 123;
		int ia = b;
		System.out.println( ia);
		
		
	}
}
