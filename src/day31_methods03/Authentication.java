package day31_methods03;
import java.util.*;
public class Authentication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID");
		String ID = scan.next();
		System.out.println("Enter Password");
		String password = scan.next();
		
		Login(ID, password);
  }

		
		
		
	
	
	public static void Login(String username, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";
		if(username.equals(validUsername)&&password.equals(validPassword)){
			System.out.println("Login Successful! Welcome to Okta");
		}else {
			System.out.println("Sign in failed!");
		}
	}
	
	
}
