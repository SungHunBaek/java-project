package day23_arrays_and_loops;

public class CheckNumber {
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			if(i >=5 && i <= 10) {
				continue;	
			}	
			System.out.println("number "+ i);
		}		
	}
}
