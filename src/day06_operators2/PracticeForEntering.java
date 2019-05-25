package day06_operators2;

import java.util.Scanner;
public class PracticeForEntering {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Add 2 numbers together");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The answer is " + sum);
		
	}
}
