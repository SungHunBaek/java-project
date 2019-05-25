package day30_methods02;
import java.util.*;
public class MyNumbers {
	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
		showMe5Numbers();
		}
		doPusH10Ups();
		rangePrint();
	}
	public static void showMe5Numbers() {
		Random r = new Random();
		for(int i = 0; i <=5; i++) {
		System.out.print(r.nextInt(1001)+" ");
		}
		System.out.println("");
		}
	public static void doPusH10Ups() {
		for(int i = 1; i<=10;i++) {
			System.out.println("Push up - "+i);
		}
		System.out.println("Time to rest");
	}
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("First number: ");
		int a = scan.nextInt();
		System.out.println("Second number: ");
		int b = scan.nextInt();
		
		if(a>b) {
			do{System.out.print(a+ "   "); a--;}while(a>=b);
		}else if(a<b) {
			do{System.out.print(a+ "   "); a++;}while(a<=b);
		}
	}
	
	
	
	
	
}	

