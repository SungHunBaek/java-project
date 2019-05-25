package day13_ternary_strings_intro;
import java.util.*;
public class CarSelector {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.println("Which type of car are interested in? : ");
		System.out.println("1) American \n2) Japanese \n3) Germany \n4) Italian \n5) Korean");
		int carType = scan.nextInt();
		double averagePrice = 0;
		String carOptions = "";
		String country = "";
		
		switch(carType) {
		case 1:
			averagePrice = 33000;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			country = "American";
			break;
		case 2:
			averagePrice = 32000;
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			country = "Japanese";
			break;
		case 3:
			averagePrice = 55000;
			carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
			country = "German";
			break;
		case 4:
			averagePrice = 85000;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			country = "Italian";
			break;
		case 5:
			averagePrice = 25000;
			carOptions = "Kia, Hyundai, Daewoo";
			country = "Korean";
			break;
			default : 
			
			System.out.println("Car type not available");
			
					return; //stop execution, Don't run rest of code
		}
		
		
		System.out.println("You selected " + country + " car and your options are " + carOptions);
		System.out.println("Average price: " + averagePrice);
		
		
		
		
		
		
	}
}
