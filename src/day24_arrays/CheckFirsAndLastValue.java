package day24_arrays;

import java.util.Arrays;
import java.util.*;
public class CheckFirsAndLastValue {
	public static void main(String[] args) {
		int[] numbers = {12,41,213,21,42,12};
		boolean equals = numbers[0] == numbers[numbers.length-1];
		System.out.println(equals);
		
		
		
		

		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    //WRITE YOUR CODE HERE
		    
		    int temp =nums[0];
		    for(int i = 0; i<nums.length-1;i++){
		        nums[i]=nums[i+1];
		    }
		    nums[nums.length-1] = temp;
		    System.out.print(Arrays.toString(nums));
		    

		  
	}
}
