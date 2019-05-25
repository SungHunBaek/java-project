package day15_string_manipulation;

public class Emoji_Shortcuts {
	public static void main(String[] args) {
		String emoji1 = ":)";
		
		
		if (emoji1.length() != 2) {
			System.out.println("invalid emoji");
			return;
		}
		
		char first = emoji1.charAt(0);
		char second = emoji1.charAt(1);
		
		if (first ==  ':') {
			if(second == ')'){
				System.out.println("smile");				
			}else if (second == '(')
				System.out.println("sad");
		}else if (first == ';') {
			if (second == ')') {
				System.out.println("wink");
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
}
