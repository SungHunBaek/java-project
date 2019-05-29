package day52_inheritance05;

public class FinalMethods {
	public void method1() {
		System.out.println("Final method 1");
	}
}

class Sub extends FinalMethods {
	public void method1() {
		System.out.println("Overrided method 1");
	}
}

