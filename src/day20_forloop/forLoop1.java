package day20_forloop;

public class forLoop1 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println("Love java");
		}
		for (int i = 5; i <=15; i ++) {
			System.out.println(i);
		}
		for (int num = 20; num >= 10; num--) {
			System.out.println(num);
		}
		for(int j = 1; j <= 100; j++) {
			if (j%2 !=0) {
				System.out.print(j +" ");
			}
		}
		int sumOfOdds = 0;
		int sumOfEven = 0;
		for (int num =1 ; num <=100; num++) {
			if (num % 2 == 0) {
				sumOfEven = sumOfEven + num;
			}else {
				sumOfOdds += num;
			}
		}
		System.out.println("\n" + sumOfEven + " " + sumOfOdds);
	}
}
