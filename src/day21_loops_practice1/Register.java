package day21_loops_practice1;
import java.util.*;
public class Register {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String items = "";
		double price = 0.0;
		double totalPrice = 0.0;
		int howMany =0;
		System.out.println("How many items are you purchasing today?");
		howMany = scan.nextInt();
		
		
		
		
		for (int i = 1; i <= howMany; i++) {
			System.out.println("What is item " + i +"?");
			String itemName = scan.next();
			items = items + itemName + ", ";
			System.out.println("How much is " + itemName + "?");
			price = scan.nextDouble();
			totalPrice += price;
		}
		System.out.println("Your items:" +items.substring(0,items.length()-2));
		System.out.println("Your total Price:" + totalPrice);
		
		
		
		
		
	}
}
