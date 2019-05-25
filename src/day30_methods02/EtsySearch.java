package day30_methods02;

import java.util.ResourceBundle.Control;

public class EtsySearch {
	public static void main(String[] args) {
		navigateEtsy();
		searchForWoodenSpoon();
		printResult();
		study("Java arrays",1);
		study("agile",2);
		study("API topics",3);
		sleep(5);
	}
	public static void navigateEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
	}
	public static void searchForWoodenSpoon() {
		System.out.println("Type 'Wooden Spoon' into search field");
		System.out.println("Click on 'Search' button");
	}
	public static void printResult() {
		System.out.println("\"wooden spoon\" (14,720 Results)");
	}

	public static void study(String topic,int i) {
		System.out.println("Student is studying " + topic.substring(i,4));
	}
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours.");
	}

}
