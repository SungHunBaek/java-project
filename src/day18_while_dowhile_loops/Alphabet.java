package day18_while_dowhile_loops;

public class Alphabet {
	public static void main(String[] args) {
		char letter = 'z';

		while(letter >= 'a'){
			
			System.out.print(letter+",");
			letter--;
		}
		System.out.println();
		char capitals = 'A';
		while(capitals <= 'Z') {
			System.out.print(capitals+" ");
			capitals++;
		}
		System.out.println();
		String letters = "";
		char myletter ='A';
		while(myletter <= 'Z') {
			letters = letters+myletter;
			System.out.println(letters);
			myletter++;
		}
		
		
		
	}
}
