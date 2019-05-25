package day12_switch_ternary;
import java.util.*;
public class DaySelector {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is today?");
		int day = scan.nextInt();
		
		
		switch(day) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Not a such day");
		}
		
		
	}
}
