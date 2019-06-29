package day62_exceptions01;

public class TryCatch {
	public static void main(String[] args) {
	try{String str = "Java";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(1));
	}catch(Exception e) {
		System.out.println("Exception happend in try block and print");
	}
	
	System.out.println("After try catch block.");
		
	}
}
