package day23_arrays_and_loops;
import java.util.*;
public class ConcatWordSkipWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word ="";
		String newword = "";
		for (int i = 1; i < 7; i++) {
		System.out.println("Word #"+i);
		word = scan.next();
		if(word.equalsIgnoreCase("java")) {
			continue;
		}
		newword += ", "+ word; 
		
		}
		System.out.println(newword.substring(2,newword.length()));
	}
}
