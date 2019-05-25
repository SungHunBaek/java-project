package day22_loopspractice2;
import java.util.*;
public class month {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int month=0;
		do {
			System.out.println("Enter month:");
			month = scan.nextInt();
		}while (month <= 12 && month >=1);
		System.out.println("Invalid: "+month);
		
		
		
		
		
		
		
	}
}
