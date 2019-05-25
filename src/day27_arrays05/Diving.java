package day27_arrays05;
import java.util.*;
public class Diving {
	public static void main(String[] args) {
			    Scanner input = new Scanner(System.in);
			    float[] score = new float[7];
			    //WRITE YOUR CODE HERE
			    float highest = 0;
			    float lowest = 10;
			    double total = 0;
			    for(int i = 0; i < score.length; i++){
			      score[i] = input.nextFloat();
			    }
			    for(int i = 0; i < score.length; i++){
				      if(score[i] > highest) {
				    	  highest = score[i];
				      }
				    }
			    System.out.println(highest);
			    for(int i = 0; i < score.length; i++){
				      if(score[i] < lowest) {
				    	  lowest = score[i];
				      }
				    }
			    for(int i = 0; i < score.length; i++){
				      if(score[i] == lowest) {
				    	  score[i] = 0;
				      }
				    }
			    for(int i = 0; i < score.length; i++){
				      if(score[i] == highest) {
				    	  score[i] = 0;
				      }
				    }
			    for(int i = 0; i < score.length; i++){
			    	total += score[i];
			    }
			    
			    float difficulty = input.nextFloat();
			    total = total * difficulty * 0.6;
			    // FINAL OUTPUT
			  
			    System.out.println(Arrays.toString(score));
			    System.out.printf("Total: " + total);
			  }
	
}
