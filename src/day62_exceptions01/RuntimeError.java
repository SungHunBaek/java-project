package day62_exceptions01;

public class RuntimeError {
	static int i = 0;
	public static void main(String[] args) {
		//Below line will create StackOverFlowError. Stack gets full
		//due to calling it too much time.
		go();
	}
	public static void go() {
		System.out.println(i + "Going");
		i++;
		go();
		
	}
}
