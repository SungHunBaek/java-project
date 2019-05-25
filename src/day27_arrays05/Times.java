package day27_arrays05;

public class Times {
	
	public static void main(String[] args) {
		
		int[] time1 = new int [2];
		int[] time2 = new int [2];

		time1[0] = 10;
		time1[1] = 15;
		
		time2[0] = 16;
		time2[1] = 10;
		
		
		if(time1[0] < 0|| time1[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time1[1] < 0|| time1[1] > 59) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time2[0] < 0|| time2[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		if(time2[1] < 0|| time2[1] > 59) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		if(time1[0]> time2[0]) {
		System.out.println("time1 is greater than time 2");
		}else if (time1[0]< time2[0]) {
			System.out.println("time 2 is greater than time 1");
		}else if (time1[0]==time2[0]) {
			if(time1[1]>time2[1]) {
				System.out.println("time 1 is greather than time 2");
			}else if (time1[1]<time2[1]) {
				System.out.println("time 2 is greather than time 1");
			}else {
				System.out.println("Same Time");
			}
		}
		
		
	}
}
