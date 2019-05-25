package day26_arrays04;
import java.util.*;
public class GetSandwich {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
      int firstBread = str.indexOf("bread",0);
	     int secondBread = str.indexOf("bread",6);
	     int counter =0;
	     for (int i = 0; i < str.length()-4; i++) {
	    	 if(str.substring(i,i+5).equals("bread")) {
	    		counter++; 
	    	 }
	    	 
	     }
	     if (counter >=3){
	       System.out.println(str.substring(7,secondBread));
	     }
	     else if(counter==2) {
	     System.out.println(str.substring(5,secondBread));
	     }else {
	    	 System.out.println("nothing");
	     }
	}
}
