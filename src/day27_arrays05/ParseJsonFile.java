package day27_arrays05;
import java.util.Scanner;

public class ParseJsonFile {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
	
	  
	  String[] a = json.split("\"");
	  
	  System.out.println("First name: " +a[5]);
	  System.out.println("Last name: " + a[9]);
  }
}