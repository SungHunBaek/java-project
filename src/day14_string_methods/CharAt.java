package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		
		
		//check if first letter is J
		
		String word2 = "Java";
		
		if(word2.charAt(0) == 'J') {
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
		
		String word3 = "civic";
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		System.out.println(first);
		System.out.println(last);
		String word4 = "Automation";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last char of " + word4 + " is " + lastChar);
	}
}
