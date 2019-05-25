package day26_arrays04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String words = "java, kava, html, selenium";
		String[] wordsArray = words.split(",");
	
		System.out.println("Count: "+wordsArray.length);
		System.out.println(Arrays.toString(wordsArray));
		for(String a : wordsArray) {
			System.out.print(a);
		}
		System.out.println();
		String diceResult = "1 - 20 of 1,461 positions";
		//using split method, print 1,461
		String[] diceArray = diceResult.split(" ");
		System.out.println("Search result total: " + diceArray[4]);
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());
		
		String sentence = "I felt happy because I saw the others were happy and because "
				+ "I knew I should feel happy, but I wasn¡¯t really happy.";
		
		
		
		String[] allWords = sentence.split(" "); 
		String[] ISplit = sentence.split("I");		
		String[] happySplit = sentence.split("happy");
		System.out.println(happySplit[2]);
		for(String w : allWords) {
			System.out.println(w);
		}
		for(String w: happySplit) {
			System.out.println(w);
		}
		for(String w: ISplit) {
			System.out.println(w);
		}
		
		
		String word = "java";
		char[] charsArray = word.toCharArray();
		
		for (char a : charsArray) {
			System.out.println(a);
		}
		
	}
}
