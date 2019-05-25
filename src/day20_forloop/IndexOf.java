package day20_forloop;

public class IndexOf {
	public static void main(String[] args) {
		String word = "Amazon";
		char letter = 'm';
		int index = -1;
		System.out.println(word.indexOf(letter));
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
			if (word.charAt(i)==letter) {
				index = i;
				break;
			}
		}
		System.out.println("Index: " +index);
		
	}
}
