package day08_casting_conditionals;
import java.util.*;
class IfElseWithScanner {
	public static void main(String[] args) {
		//PassingPercentage = 65;
		//yourScorePercentage = take from scanner;
		//check if you passed or failed
		
		int PassingPercentage = 65;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Put your score here: ");
		int yourScorePercentage = scan.nextInt();
		if (yourScorePercentage >= PassingPercentage) {
			System.out.println("Congratulation, you passed");
		}else {
			System.out.println("You failed, try it again");
		}
		
		
		
		
		
		
		
	}
}
