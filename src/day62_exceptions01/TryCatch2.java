package day62_exceptions01;

public class TryCatch2 {
	public static void main(String[] args) {
		int[] nums = {22,33,44,55};
		try {
		System.out.println(nums[4]);
		}catch(Exception e) {	
		System.out.println("Wrong index");
		}
		System.out.println("Some code after array");
		
		try {
		int j = 100;
		int n = j/0; //can not devide number by 0.
		}catch(ArithmeticException e) {
		System.out.println("Cannot / by zero");
		e.printStackTrace();
		}
		System.out.println("AFTER TRY CATCH");
	}
}
