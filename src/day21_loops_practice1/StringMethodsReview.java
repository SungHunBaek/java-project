package day21_loops_practice1;


public class StringMethodsReview {
	public static void main(String[] args) {
		String word = "javva";
		String unique = "";
		
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		if(!unique.contains(""+ch)) {
			unique += ch; //unique = unique+ch;
		}
		
		System.out.println("Unique:" + unique);
		
		String word2 = "bananas";
		String unique2 = "";
		
		int i = 0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2:" + ch2);
		
		
	}
}