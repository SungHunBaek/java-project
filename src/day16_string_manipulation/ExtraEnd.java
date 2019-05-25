package day16_string_manipulation;
import java.util.*;
public class ExtraEnd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "java";
		String result = "";
		if(str.length()==2) {
			result = str+str+str;
		}else {
			result = str.substring(str.length()-2);
			result += result + result;
		}
	
	System.out.println(result);
		if (str.equalsIgnoreCase("java")) {
			
		}
		
	
	}
}
