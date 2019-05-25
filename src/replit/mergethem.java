package replit;

import java.util.Scanner;

public class mergethem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String one = scan.next();
		String two = scan.next();
		String mix = "";
		if(one.length() == two.length()) {
			for(int i = 0; i <= one.length()-1; i++) {
				mix += one.charAt(i)+""+two.charAt(i);
			}
		}else if (one.length()>two.length()){
			String temp = one.substring(0,two.length());
			for(int i = 0; i <= temp.length()-1; i++) {
				mix += temp.charAt(i)+""+two.charAt(i);
			}
			mix += one.substring(two.length(),one.length());
		}else if(two.length()>one.length()) {
			String temp = two.substring(0,one.length());
			for(int i = 0; i<= temp.length()-1; i++) {
				mix += one.charAt(i)+""+temp.charAt(i);
			}
			mix += two.substring(one.length(),two.length());
		}
		System.out.println(mix);
		String ss = "java";
		String str1 = uniqueChars(ss);
		System.out.println(str1);
	}	
	
	
	 public static String uniqueChars(String str) {
		    //TODO: write your below
		 	String temp = "";
		    for(int i = 0; i <= str.length()-1; i++){
		    	int count = 0;
		    	for(int j = 0; j < str.length();j++) {
		    		if (str.charAt(i) == str.charAt(j)) {
		    			count++;
		    		}
		    	}
		    	if(count==1) {
		    		temp += str.charAt(i)+"";
		    	}else if(count== 2&& !temp.contains(str.charAt(i)+" ")){
		    		temp += str.charAt(i)+"";
		    	}
		    }
		    return temp;
	 }
	
	
	
	
	
	
	
}
