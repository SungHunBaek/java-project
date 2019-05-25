package day16_string_manipulation;
import java.security.acl.LastOwnerException;
import java.util.*;

public class url {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter url:");
		String url = scan.next();
		
		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		} else {
			System.out.println("invalid");
			return;
		} 
		

		int dotIntdex = url.length()-4;
		if(url.charAt(dotIntdex)== '.') {
			System.out.println(". is not there");
		}else {
			System.out.println(". might need");
		}
		
		String domain = url.substring(4,dotIntdex);
		System.out.println("Domain: " +domain);
		
		
		
		String extension = url.substring(dotIntdex+1,url.length());
		System.out.println("Extension: " +extension);
	
	
	
	
	}
}
