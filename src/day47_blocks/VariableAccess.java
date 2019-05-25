package day47_blocks;

public class VariableAccess {
		
	int myInstanceVariable = 40;
	static int myStaticVariable = 55;
	
	
	public static void main(String[] args) {
		System.out.println(myStaticVariable);
		VariableAccess v = new VariableAccess();	
		System.out.println(v.myInstanceVariable);
		System.out.println(v.myStaticVariable);
		System.out.println(VariableAccess.myStaticVariable);
		
		
		
		
	}
}
