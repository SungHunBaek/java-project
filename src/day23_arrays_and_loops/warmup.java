package day23_arrays_and_loops;
import java.util.*;
public class warmup {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("number:");
		int prime = scan.nextInt();
		int x = 0;
		for(int i=2; i < prime; i++) {
			
			x = prime % i;
			if (x == 0) {
				System.out.println("it is not prime number");
				return;
			}
		}
		System.out.println("it is prime number");
	}
	
}
