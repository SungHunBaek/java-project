package day19_loops;
import java.util.*;
public class GuessANumberV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int secretNumber = random.nextInt(101);
		int guessNumber = 0;
		int i = 1;
		do {
			
			System.out.println("Guess the number btw 1~100 try#"+i);
			guessNumber = scan.nextInt();
			i++;
			if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}else if(guessNumber < secretNumber){
				System.out.println("Your number is too small");
				
			}
		}while (guessNumber != secretNumber && i <= 5);
		if (i < 5) {
		System.out.println("Bingo, Congratulations, You won!");
		}else {
			System.out.println("You lost!");
		}
	}
}
