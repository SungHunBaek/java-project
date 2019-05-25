package replit;
import java.util.*;

public class CopyValueArray {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    int temp[]=new int[nums.length];
		    temp = Arrays.copyOf(nums, nums.length);
		    System.out.println(Arrays.toString(temp));
		    int a = 6;
		    for (int i = 0; i<= nums.length/2; i++){
		      nums[i] = nums[a];
		      a--;
		    }
		    int b = 3;
		    for (int i = 3; i<= 6; i++){
			      nums[i] = temp[b];
			      b--;
			    }
		    
		    //Do not change below statement:
		    System.out.println(Arrays.toString(nums));
		    
		  }
  
  
  
}