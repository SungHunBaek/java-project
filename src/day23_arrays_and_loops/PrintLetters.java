package day23_arrays_and_loops;

public class PrintLetters {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i%2 == 0) {
				for (char letter = 'z'; letter >= 'a'; letter--) {
				System.out.print(letter + " ");
				}
				System.out.println();
				System.out.println("***************************************************");
			}else{
				for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter + " ");
				}
				System.out.println();
				System.out.println("***************************************************");
			}	
		}
	}
}
