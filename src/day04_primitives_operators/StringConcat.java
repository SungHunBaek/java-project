package day04_primitives_operators;

public class StringConcat {
	public static void main(String[] args) {
		//string variable called firstName
		String firstName;
		firstName = "Sung Hun";
		//My name is
		System.out.println("My name is " + firstName);
	
		//city variable and assign city where you are from
		String city;
		city = "Seoul";
		//Print: I was born in
		System.out.println("I was born in " + city);

		//Create a var: job and assign SDET to it
		String job;
		job = "SDET";
		//Create a var: company and assign any company
		String company;
		company = "Apple";
		//Print: I work as <SDET> in <company>
		System.out.println("I work as <" + job + "> in <" + company + ">");

		//create int variable zipcode and assign zip code of your home
		int zipcode = 20187;
		//Print: I live in <22031> zipcode
		System.out.println("I live in " + zipcode + " zipcode");

		String city1 = "Tashkent";
		String city2 = "Kyiv";
		String city3 = "Moscow";
		
		System.out.println("From " + city1 + " to " + city2 + " is $500");
		System.out.println("From " + city3 + " to " + city1 + " is $550");
		System.out.println("I have been to " + city1 + ", " + city3 + ", " + city2 + ".");
		
		String app = "Slack and " + "Skype";
		System.out.println("We use " + app + " for messaging with Classmates");
		
		
		
		
		
		
		
		
	}
}
