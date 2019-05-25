package day31_methods03;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void main(String[] args) {
		countWords("Java is fun");
		countWords("This is methods with strings");
		googleSearchResults("About 29,700,000 results (0.60 seconds)");
	}
	
	public static void countWords(String sentence) {
		String[] splitSentence = sentence.split(" ");
		
		System.out.println("Words in this sentence " + Arrays.toString(splitSentence));
		System.out.println("Number of words: " + splitSentence.length);
	}
	public static void googleSearchResults(String result){
		String[] search = result.split(" ");
		System.out.println("Rresults count: " + search[1]);
		System.out.println("Time in seconds: " + search[3].substring(1,search[3].length()));
	}
}
