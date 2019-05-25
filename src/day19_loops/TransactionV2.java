package day19_loops;
import java.util.*;
public class TransactionV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int track = 0;
		double transaction = 0;
		System.out.println("Enter balance");
		double balance = scan.nextDouble();
		
			while (balance > 0) {
			track ++;
			System.out.println("What is transaction #"+track+" amount?");
			transaction = scan.nextDouble();
			if (transaction>balance) {
				System.out.println("your balance is about to be negative due to this transaction.5");
			}
			balance -= transaction;
			System.out.println("Current balance:" + balance); 
			}
			
			System.out.println("You have insufficient funds for any more trasactions, your balance is " + balance);
			System.out.println("transaction total account:" + track);
		
	}
}
