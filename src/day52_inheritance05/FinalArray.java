package day52_inheritance05;

import java.util.Arrays;

public class FinalArray {
	public static void main(String[] args) {
		final int[] TEAMS = {11,11};
		System.out.println("TEAM 1 : " +TEAMS[0]);
		System.out.println("TEAM 1 : " +TEAMS[1]);
		
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		
		System.out.println("TEAM 1 : " +TEAMS[0]);
		System.out.println("TEAM 1 : " +TEAMS[1]);
		
		//TEAMS = new int[] {10,10,10};
		int[] nums = new int[] {23,55,3434};
		System.out.println(Arrays.toString(nums));
		nums = new int[] {232432,236264,62,23,53,25235,1};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums = {23,55,66,11};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 34567;
		System.out.println(Arrays.toString(finalNums));
		
		//finalNums = new int[] {22,44,56,1123,245};
		
		final double[] PRICES = new double[3];

		PRICES[0] = 85.5;
		PRICES[1] = 99.9;
		PRICES[2] = 99.8;
		
		System.out.println(Arrays.toString(PRICES));
		PRICES[0] = 81.1;
		System.out.println(Arrays.toString(PRICES));
		
		
		
	}
}
