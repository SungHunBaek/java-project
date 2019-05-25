package day24_arrays;

public class ArrayOfChars {
	public static void main(String[] args) {
		char[] values = {'a','b','c'};
		for(char a:values) {
			System.out.println(a);
		}
		String str = "Wooden spoon";
		char [] chars = str.toCharArray();
		for(char c: chars) {
			System.out.print(c);
		}
		System.out.println();
		str="";
		for(int i = chars.length-1; i>=0; i--) {
			
			System.out.print(chars[i]);
		}
		System.out.println();
		for(char c: chars) {
			if(c=='o') {
				System.out.print("*");
			}else {
				System.out.print(c);
			}
		}
	}
}
