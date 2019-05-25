package day26_arrays04;
import java.util.*;
public class EqualsJavaPython {
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    int java = 0;
		    int python = 0;
		    

		    for (int i = 0; i <= sentence.length()-6; i++){
		      String jav = sentence.substring(i,i+4);
		      if(sentence.substring(i,i+4).equalsIgnoreCase("java")) {
		    	  java++;
		      }else if(sentence.substring(i,i+6).equalsIgnoreCase("python")) {
		    	  python++;
		      }
		      
		    }
		    if(java == python) {
		    	System.out.println(true);
		    }else {
		    	System.out.println(false);
		    }
		    
		  }
}
