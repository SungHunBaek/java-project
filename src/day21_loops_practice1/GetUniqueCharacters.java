package day21_loops_practice1;
import java.util.*;
public class GetUniqueCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word");
		String word = scan.next();
		String unique = "";
		
		for(int i = 0; i < word.length();i++) {
			//read the letter and assign
			char letter = word.charAt(i);
			
			if(!unique.contains(""+letter)) {
				unique += letter;
			}
		}System.out.println(unique);
		
		
		
		
		
		/*for(int i = 0; i < word.length(); i++) {
			System.out.print(i);
			System.out.println(word.charAt(i));
			
		}
		*/
	
	
	
	
	
	}
}
