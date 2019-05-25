package day23_arrays_and_loops;
import java.util.*;
public class BruteForce {
	public static void main(String[] args) {
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String userName = "";
		String password = "";
		int attempts = 5;
			Scanner scan = new Scanner(System.in);
		do {
			if(attempts == 0) {
				System.out.println("You have exceeded number of attempts!");
				System.out.println("This user has been deactivated for 30 minutes.");
				return;
			}
			attempts--;
			System.out.println("Please enter user name");
			userName = scan.next();
			if (!userName.equals(expectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: " + attempts);
				continue;
			}
			System.out.println("Please enter password");
			password = scan.next();
			if (!password.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: " + attempts);
				continue;
			}
			
			
		}while (!userName.equals(expectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login Successful!");
	
	
	
	}
}
