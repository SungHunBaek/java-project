package day19_loops;

public class PrintLetters {
	public static void main(String[] args) {
		String word = "Amazon";
		
		int idx = 0;
		while (idx != word.length()) { 
		System.out.println(word.charAt(idx));
		idx++;
		}
		System.out.println("done ");
		
		int idx1 = word.length()-1;
		while (idx1 >= 0) { 
		System.out.println(word.charAt(idx1));
		idx1--;
		}
		System.out.println("done ");
		
		
	}
}
