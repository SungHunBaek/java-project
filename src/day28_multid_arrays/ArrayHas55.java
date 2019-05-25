package day28_multid_arrays;
import java.util.*;
public class ArrayHas55 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO Type your code below:
		    
		    String answer = "";
		    for(int i = 0; i<nums.length-1;i++){
		      if(nums[i]==nums[i+1]){
		       
		        answer += "true";
		        
		      }else{
		       
		        answer += "false";
		        
		      }
		    }
		    if(answer.contains("true")) {
		    	  System.out.println("true");
				    	
		    }else {
		    	  System.out.println("fales");
				  
		    }
		  }
}
