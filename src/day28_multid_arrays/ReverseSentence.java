package day28_multid_arrays;

 
import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[] args) {
		String sentence = "you are very interesting person.";
		String [] a = sentence.split(" ");
		
		System.out.println(Arrays.toString(a));
		
		
		
		for(int i = a.length-1; i>=0; i--) {	
			System.out.println(a[i]);
		}
		int i,j;
		int n= 5;
		 int m =5;
		   for (i = 1; i <= n; i++) 
	        { 
	            for (j = 1; j <= m; j++) 
	            { 
	                if (i == 1 || i == n ||  
	                    j == 1 || j == m)             
	                    System.out.print("*");             
	                else
	                    System.out.print(" ");             
	            } 
	            System.out.println(); 
	        } 
	       
	    
		
		
		
		
	}
}
