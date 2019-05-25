package day27_arrays05;
import java.util.*;
public class CanvasCourses {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
			String url = "https://learn.cybertekschool.com/courses/149";
			
			String[] split = url.split("/");
			String lastValue = split[split.length-1];
	 		int a = Integer.parseInt(lastValue);

			switch (a) {
			case 149 : System.out.println("SDLC"); break;
			case 144 : System.out.println("Team activity"); break;

			case 143 : System.out.println("Welcome Kit"); break;
			case 152 : System.out.println("QA Testing"); break;

			case 204 : System.out.println("Mentoring sessions"); break;
			case 147 : System.out.println("Java programming"); break;
			}
			
	}
}
