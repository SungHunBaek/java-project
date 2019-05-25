package day19_loops;
import java.util.*;
public class Transaction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("what is your current balance?");
		double balance = scan.nextDouble();
		double transaction = 0;
		
		while (balance >  0) {
			System.out.println("Enter amount");
			transaction = scan.nextDouble();
			balance = balance - transaction;
			System.out.println("remaining balance (" + balance+")");
		}System.out.println("out of balance");
	}
}
