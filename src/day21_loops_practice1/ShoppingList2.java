package day21_loops_practice1;
import java.util.*;
public class ShoppingList2 {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
				String shoppingListReport = "";
				String item = "";
				String countinue = "";
				double price = 0;
				int count = 1;
				double totalPrice = 0;
				
				for (int i = 1; i <= 10; ){
				  System.out.println("Enter item"+i+" and its price:");
				  item = scan.next();
				  price = scan.nextDouble();
				  System.out.println("Add one more item?");
				  countinue = scan.next();
				  
				  shoppingListReport += "Item" + i +": "+ item +" Price:" + price +", ";						  
					
				  if (countinue.equalsIgnoreCase("yes")) {
					  i++;
				  }else {
					  i += 10;
				  }
				  
				}System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
	  }
}	  
