package day18_while_dowhile_loops;
import java.util.*;
public class Party {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter guest name:");
		String name = scan.next();
		System.out.println("Do you want to enter new guest name:");
		String more = scan.next();
		
		String guestList = name;
		while (more.equalsIgnoreCase("yes")) {

			System.out.println("Please enter guest name:");
			 name = scan.next();
			System.out.println("Do you want to enter new guest name:");
			 more = scan.next();	
			 
			 guestList = guestList +", " + name ;
		}
			System.out.println("Guest's list: " + guestList);

	}
}
