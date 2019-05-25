package day29_methods01;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {
		String[][] countriesArray = {
				{"USA","Washington DC"},
				{"Canada", 	"Ottawa"},
				{"Mexico","Mexico city"},
				{"Brasil","Brasilia"},
				{"Peru", "Lima"},
				{"Argentina", "Boanes Aeros"},
				{"Bolivia","La Paz"},
				{"Macedonia","Scopia"},
				{"Kazakhstann","Nursultan"}};
	
	System.out.println(Arrays.deepToString(countriesArray[0]));
	System.out.println(countriesArray[0][0] + "|" + countriesArray[0][1]);
	System.out.println(countriesArray[8][0] + "|" + countriesArray[8][1]);
	
	for (int i = 0; i < countriesArray.length;i++) {
		System.out.print(countriesArray[i][0]+"|"+countriesArray[i][1] + "   ");
	}
	System.out.println("");
	for (String[] country:countriesArray) {
		System.out.print(country[0]+"|"+country[1] + "   ");
	}
	//declare cities array and size needs to match countries array size
	//String cities[] = new String[9] ;
	String cities[] = new String[countriesArray.length] ;
	System.out.println(Arrays.toString(cities));
	
	for(int i = 0; i <countriesArray.length; i++) {
		cities[i] = countriesArray[i][1];
	}
	System.out.println(Arrays.toString(cities));
	
	//Look for Bolivia in the countriesArray and test if capital city is "La Paz".
	
	for (int i = 0; i < countriesArray.length; i++) {
		if (countriesArray[i][0].equalsIgnoreCase("bolivia")) {
			if(countriesArray[i][1].equalsIgnoreCase("la paz")) {
				System.out.println("Bolivia test successed");
			}else {
				System.out.println("Bolivia test failed");
			}
			break;//exit the loop
		}
	}
	
	
	
	
	
	}
}
