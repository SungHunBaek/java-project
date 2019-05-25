package day15_string_manipulation.copy;

import javax.print.DocFlavor.STRING;

public class StartEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("Ec")); //false
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		
		String name = "Mr. Jackson";
		
		if(name.startsWith("Mr.")) {
			System.out.println("MAN");
		}else if (name.startsWith("Mrs.")) {
			System.out.println("Married woman");
		}else if (name.startsWith("Ms.")){
			System.out.println("Woman");
		}else if (name.startsWith("Dr.")){
			System.out.println("Doctor man or woman");
		}else {
			System.out.println("idk");
		}
		
		
		
		
	}
}
