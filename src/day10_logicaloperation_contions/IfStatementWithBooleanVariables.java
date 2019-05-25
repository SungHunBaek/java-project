package day10_logicaloperation_contions;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = false;
		
		if (isBreakTime == true) {
			System.out.println("BREAK TILL 8:35PM");
		}else{
			System.out.println("Not Break Time yet.");
		}
		
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:35");
		}else {
			System.out.println("Not Break Time yet.");	
		}
		
		boolean classTime = false;
		if (classTime) {
			System.out.println("come back on time");
			System.out.println("stop talking");
			System.out.println("pay attention");
			System.out.println("code and have fun!");
		}else {
			System.out.println("take a walk and have some water.");
		}
		
		boolean qualified = false;
		if (qualified != true) {
			System.out.println("Sorry you are not qualified");
		}
		
		
		
		
		
		
	}
}
