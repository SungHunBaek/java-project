package day32_methods04;

public class MethodsWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: " + i);
		System.out.println(giveMeYourName());
		String myName = giveMeYourName();
		System.out.println("MyName is: " + myName);
	}
	public static int giveMe10$() {
		System.out.println("Returning 10 from method ");
		return 10;
	}
	
	public static String giveMeYourName() {
		String name = "Sung Hun";
		return name;
	}
	
	
	
}
