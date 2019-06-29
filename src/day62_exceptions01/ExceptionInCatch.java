package day62_exceptions01;

public class ExceptionInCatch {
	public static void main(String[] args) {
		String str = "10j"; //A
	try {
			int n = Integer.parseInt(str);//B
			System.out.println(n);//C
		}catch (NumberFormatException e ) {
			System.out.println(str.charAt(55));//D
			System.out.println("Hello from the catch block");
		}finally {
			System.out.println("Hello from the finally block");
		}
	System.out.println("Hello world");
	}
}
