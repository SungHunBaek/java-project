package day54_InheritanceReview;

public class practices {
	public practices(int a, double d, boolean b) {
		System.out.println("number is: "+ a);
		System.out.println("gpa is : " + d);
		System.out.println("passed: " + b);
	}
	public static void main(String[] args) {
		practices obj = new practices(1,2,true);
	}
	
}


class child extends practices{
	public child() {
		super(200,6.0,true);
	}
}