package day15_string_manipulation;

public class indexOf2 {
	public static void main(String[] args) {
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("First dash: " + firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("Second dash: " + secondDash);
		secondDash++;
		
		int thirdDash = list.indexOf("-", secondDash);
		System.out.println("Third dash: "+ thirdDash);
		
		//find the last dash.
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: "+ lastDash);
		
	}
}
