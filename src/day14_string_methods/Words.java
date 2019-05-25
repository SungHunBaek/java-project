package day14_string_methods;
import java.util.*;
public class Words {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Word1: ");
		String word1 = scan.next();
	
		System.out.println("Word2: ");
		String word2 = scan.next();
	
		if (word1.length() > word2.length()) {
			System.out.println("Word1Value is longer");		
		}else if (word1.length() < word2.length()) {
			System.out.println("Word2Value is longer");		
		}else {
			System.out.println("SAME LENGTH");
		}


	}
}
