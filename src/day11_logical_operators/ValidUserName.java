package day11_logical_operators;
import java.util.*;
public class ValidUserName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username:");
		String username = scan.next();
		System.out.println("Enter password:");
		String password = scan.next();
		
		String validUserName = "cyberteck@mail.com";
		String validPassword = "WoodenSpoon123";
		
		if (username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
			System.out.println("Login Successful, Welcome!");
		} else if(!username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) {
			System.out.println("Invalid Username and Invalid password");
		}else if(username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) {
			System.out.println("Invalid password");
		}else if(!username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}
		
		
	}
}
