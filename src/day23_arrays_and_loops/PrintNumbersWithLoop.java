package day23_arrays_and_loops;

public class PrintNumbersWithLoop {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				
				for (int j2 = 0; j2 <= 10; j2++) {
					System.out.print(j2);
					
				}
				System.out.print(j + ",");
			}
			System.out.println(i);
		}
	}
}
