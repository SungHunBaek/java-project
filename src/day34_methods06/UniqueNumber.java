package day34_methods06;
import java.util.*;

public class UniqueNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] nums = new int[size];
    for(int i=0; i < size; i++){
      nums[i] = scan.nextInt();
    }Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    printUniqueNumbers(nums);
  }
  
  public static void printUniqueNumbers(int[] nums){
    //WRITE YOUR CODE HERE
	  
    
    for(int i =0; i < nums.length-1;i++){
    	if(nums[i]!=nums[i+1]) {
    		System.out.println(nums[i]);
    	}else{
    		i++;
    	}
        	
        	
      }        	
    if(nums[nums.length-1]!=nums[nums.length-2]) {
		System.out.println(nums[nums.length-1]);
	}

    }
  }
