package day18_while_dowhile_loops;
import java.util.*;
public class PincodeV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int secretPincode = 4321;
		int tried = 0;
		int pincode =0;
		while (pincode != 4321) {
			System.out.println("Enter pin");
			pincode = scan.nextInt();
			tried++;
			
			if(tried == 3 && pincode != secretPincode) {
				System.out.println("Card is blocked");
				return;
			}
			
		}
		System.out.println("Access granted.");
	}
}
