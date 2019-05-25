package day18_while_dowhile_loops;
import java.util.*;
public class CarInsuranceQuote {
	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		String licence = scan.next();
		
		if (licence.equalsIgnoreCase("yes")) {
			System.out.println("Enter your zip code");
			String zipcode = scan.next();
			if(zipcode.equals("20910") || zipcode.equals("20740")) {
				premium = 60;
			}else if (zipcode.equals("22102") || zipcode.equals("22103")) {
				premium = 30;
			}else {
				premium = 50;
			}
			
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();
		if (vehicleOwnership.equalsIgnoreCase("owned")) {
			premium += 10;
		}else {
			premium += 20;
		}
		
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		if(vehicleUsage.equalsIgnoreCase("business")) {
			premium += 50;
		}else if (vehicleUsage.equalsIgnoreCase("pleasure")) {
			premium += 10;
		}else {
			premium += 20;System.out.println("Days Driven To Work And/Or School");
		daysDrivenToWorkOrSchool = scan.nextInt();
		premium = premium + (5*daysDrivenToWorkOrSchool);
		
		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool = scan.nextInt();
		premium = premium + milesToWorkOrSchool;
		}
			
		
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		if (age < 16 ) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else if (age >= 16 && age < 18) {
			premium = premium * 20;
		}else if (age >= 18 && age <= 21) {
			premium = premium * 6;
		}else if (age > 21 && age < 25) {
			premium = premium * 2;
		}
		
		System.out.println("How many years you've been driving?");
		int experience = scan.nextInt();
		
		if (experience == 0 || (experience-age) > 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else {
			premium = premium - (experience * 5);
		}
		
		System.out.println("Have you had any accidents in the last 5 years?");
		String accidentcheck = scan.next();
		
		if (accidentcheck.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium = premium + (accidentsAmount *(premium * 0.2));
		}
		
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();
		
		if (continuousInsurance.equalsIgnoreCase("no")) {
			premium = premium * 2;
		}
		scan.nextLine();
		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();
		
		if (education.equalsIgnoreCase("PHD") || education.equalsIgnoreCase("Bachelors") ||education.equalsIgnoreCase("MASTERS")) {
			premium = premium * 0.95;
		}else if (education.equalsIgnoreCase("doctors")) {
			premium = premium * 0.9;
		}else if(education.equalsIgnoreCase("Less than High School")){
			premium = premium * 1.05;
		}
		
		System.out.println(name +", here's your quote!");
		System.out.println("Start Your Policy Today For: $" + premium);
		System.out.println("Reference number: "+name.toUpperCase().substring(0,2) + ""+age +""+
		name.toUpperCase().substring(name.length()-2, name.length())+""+ zipcode+ education.toUpperCase().replaceAll(" ", ""));
		}else {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
	}
}
