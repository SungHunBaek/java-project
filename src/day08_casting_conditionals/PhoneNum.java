package day08_casting_conditionals;
import java.util.*;

public class PhoneNum {
	public static void main (String[] args) {
		String phoneNumber;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Put area code");
		int areaCode = scan.nextInt();
		System.out.println("Put phone number");
		int localNumber = scan.nextInt();
		
		phoneNumber = "(" + areaCode + ")-" + localNumber;
		System.out.println("Calling number " + phoneNumber);
		
		
		
		
		
		
	}
}
