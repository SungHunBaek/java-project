package day06_operators2;
import java.util.*;
public class MinutesToHours {
	final static int MINUTES = 3695;
	
	public static void main(String[] args) {
		
		int month = MINUTES / 43200;
		int days = (MINUTES / 1440) % 30;
		int hours = (MINUTES / 60) % 24;
		int	minutes = MINUTES % 60;
			System.out.println(MINUTES + " minutes in month days hours and minutes is " + month + 
					" month " + days + " days " + hours + " hours " + minutes + " minutes");
		
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter price in cents:");
    int itemPrice = scan.nextInt();
    int quarters = (100-itemPrice)/25;
    int dimes = ((100 -itemPrice) - (quarters * 25)) / 10;
    int nickels = ((100 -itemPrice) - (quarters * 25) - (dimes * 10))/ 5;
    
    if(itemPrice < 25 || itemPrice > 100){
      System.out.println("Invalid price!");
      
    }else if (itemPrice % 5 != 0){
      System.out.println("Invalid price!");
    }else {
    	System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and "
    		      + nickels + " nickels.");
    }
    
  }
}