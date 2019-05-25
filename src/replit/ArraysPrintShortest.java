package replit;
import java.util.*;

public class ArraysPrintShortest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String [] a = str.split(", ");
    String c = "";
    String [] b = new String [a.length];
    
    for(int i = 0; i <= a.length-2; i++){
        if (a[i].length() > a[i+1].length()){
        	b[i] = a[i+1];
        }
     }
      
    
    
    int i = 7;
    System.out.println(i/2);
    
    System.out.print(Arrays.toString(b));
  }
}
