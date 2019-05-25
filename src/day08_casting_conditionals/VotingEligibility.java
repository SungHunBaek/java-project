package day08_casting_conditionals;
import java.util.*;
public class VotingEligibility {
	public static void main(String[] args) {
		/*	Program to tell if you are eligible for vote
		 * 	votingAge = 18
		 *	yourAge = take from scanner
		 *if you are eligible to vote:
		 *	you are eligible to vote.
		 *	you have been eligible for 3 years
		 *else you are not eligible to vote
		 *	you still have 3 more years to go.	
		 */
		
		int votingAge = 18;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int yourAge = scan.nextInt();
		if (yourAge >= votingAge) {
			int Howlong = yourAge - votingAge;
			System.out.println("You are eligible to vote, and you have been eligible for "
					+ Howlong + " years");
		}else {
			int Howlong = votingAge - yourAge;
			System.out.println("You are not eligible to vote, and you have " + Howlong + " more years to go");
		}
		
		
		
	}
}
