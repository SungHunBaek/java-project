package day26_arrays04;
import java.util.Scanner;

import day14_string_methods.CharAt;

public class PrintLetter {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char start = scan.next().charAt(0);
    char end = scan.next().charAt(0);
    
    
    int a = start;
    int b = end;
    
    char c = (char)a;
    char d = (char)b;
   
    while (c <= d) {
    	System.out.println(c);
    	c++;
    }

    

  }
}