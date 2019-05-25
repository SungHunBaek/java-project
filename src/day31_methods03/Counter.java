package day31_methods03;

public class Counter {
	public static void main(String[] args) {
		countUp(5);
		countDown(4);
		drive("Audi", 60);
		drive("red mazda", 68);
	}
	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Invalid input");
		}
		for (int i = 1; i <= num; i++) {
			System.out.println(i + " ");
		}
	}
	public static void countDown(int num) {
		if (num < 1) {
			System.out.println("Invalid input");
		}
		for (int n = num; n >= 1; n--) {
			System.out.println(n + " ");
		}
		
	}
	
	public static void drive(String car, int speed) {
		System.out.println(car+" is  driving "+ speed + " mph");
	}
	
	
}
	