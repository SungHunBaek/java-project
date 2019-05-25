package day12_switch_ternary;
import java.util.*;
public class CalculatorV02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Get numbers
		System.out.println("Enter first number:");
		double num1 = input.nextDouble();
		//Get operator
		System.out.println("Select Operator: +, - , *, /, %");
		String operator = input.next();
		
		System.out.println("Enter second number:");
		double num2 = input.nextDouble();
			
		double result = 0.0;//assign 0.0 to prevent compile errors. due to not having any value
		//perform calculation and display result
		switch(operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
			
			default: System.out.println("Invalid operator selected: " + operator);
		}
		
	
				
		System.out.println("Result: " + result );
	}
}