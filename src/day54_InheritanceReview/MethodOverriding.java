package day54_InheritanceReview;

class superclass{
	public void original() {
	System.out.println("cybertek");	
	}
	public static void method() {
		
	}
	public static int method2 (int a){
		return a;
	}
	protected void method1() {
		
	}
}
public class MethodOverriding extends superclass{
	public void original() {
		System.out.println("batch 11");	
	}
	public static void main(String[] args) {
		new MethodOverriding().original();
		new superclass().original();
	}
}
