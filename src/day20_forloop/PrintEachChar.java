package day20_forloop;

public class PrintEachChar {
	public static void main(String[] args) {
		String word = "amazon";
		// using for loop, print each char one by one
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		}
		System.out.println("");
		// using for loop, print only consonants
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (!(letter == 'a'||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u')) {
				System.out.print(letter + ",");
			}
			
		}
		System.out.println("");
		// using for loop, print only only vowel (a,e,o,i,u)
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (letter == 'a'||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u') {
				System.out.print(letter + ",");
			}
			
		}
	}
}
