package day52_inheritance05;
import java.awt.Color;
import java.util.*;
public class FinalList {
	public static void main(String[] args) {
		ArrayList<String> COLORS = new ArrayList<String>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("white");
		COLORS.add("blue");
		
		System.out.println(COLORS.toString());
		COLORS.add("Black");
		System.out.println(COLORS.toString());
		
		COLORS = new ArrayList<>();//new object
		System.out.println(COLORS.toString());
	}
}
