package day12_switch_ternary;
import java.util.*;
public class TipCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Split: ");
		String split = scan.nextLine();
		String People = "&";
		
		System.out.println("Number of people: ");
		int numberOfPeople = scan.nextInt();
		
		System.out.println("Check amount:");
		double check = scan.nextDouble();
		double tip = 0;
		System.out.println("Service Quality: ");
		String ServiceQuality = scan.next();
		if (ServiceQuality.equalsIgnoreCase("poor")){
			tip = 5;
		}else if (ServiceQuality.equalsIgnoreCase("fair")) {
			tip = 10;
		}else if (ServiceQuality.equalsIgnoreCase("good")) {
			tip = 15;
		}else if (ServiceQuality.equalsIgnoreCase("great")) {
			tip = 20;
		}else if (ServiceQuality.equalsIgnoreCase("Excellent")) {
			tip = 25;
		}	
		
		System.out.println(tip);
		
		double totalTip = check * (tip/100);
		double totalPay = check + totalTip;
		double totalPerPerson = totalPay / numberOfPeople;
		double tipPerPerson = totalTip / numberOfPeople;

		switch(numberOfPeople) {
		case 1:
			People = "&";
			break;
		case 2:
			People = "&&";
			break;
		case 3:
			People = "&&&";
			break;
		case 4:
			People = "&&&&";
			break;
		case 5:
			People = "&&&&&";
			break;
		case 6:
			People = "&&&&&&";
			break;
		case 7:
			People = "&&&&&&&";
			break;
		case 8:
			People = "&&&&&&&&";
			break;
		case 9:
			People = "&&&&&&&&&";
			break;
		case 10:
			People = "&&&&&&&&&&";
			break;
		}
	
		if (split.equalsIgnoreCase("yes")) {
			System.out.println("split");
			System.out.println(People);
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total Tip: " + totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
		} else if(split.equalsIgnoreCase("no")) {
			System.out.println("No split");
			System.out.println(People);
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total Tip: " + totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
		}
		scan.close();
	}
}
