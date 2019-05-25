package day09_stringequals_conditionals;
import java.util.*;
public class Canada {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("What is the capital of Canada?");
		String capital = keyboard.nextLine();
		
		/*if(capital == "Ottawa") {
		System.out.println("Correct");
		}else {
			System.out.println(false);
		}*/
		
		if(capital.equalsIgnoreCase("Ottawa")) {
			System.out.println("Correct");
			}else {
				System.out.println(false);
			}
		
		
	}
	
}
