package day24_arrays;

import java.util.Arrays;

public class CarShop {
    public static void main(String[] args) {
    	String aab = "abc";
    	System.out.println(aab.charAt(1));
        // BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
        // 1. Step: Create an array of strings, and store these cars inside that array.
        String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla", "Ford" };
        // 2. Step: Print car names that starts with M
        for (String c : cars) {
            if (!c.startsWith("M")) {
                continue;
            }
            System.out.println(c);
        }
        System.out.println("******************");
        // 3. Step: Print all cars that have letter "r" somewhere in the name.
        // Please make your search case insensitive
        for (String make : cars) {
            if (make.toLowerCase().contains("r")) {
                System.out.println(make);
            }
        }System.out.println("******************");
        for (String a: cars) {
        	if(a.toLowerCase().contains("a")) {
        		System.out.println(a);
        	}
        }System.out.println("******************");
        for (String six: cars) {
        	if(six.length()>5) {
        		System.out.println(six);
        	}
        }
        System.out.println("******************");
        for (int i = 0; i<cars.length;i++) {
        	String car = cars[i];
        	if(cars[i].length() > 5) {
        		System.out.println(car);
        	}
        }System.out.println("******************");
        	String temp = cars[0];
        	cars[0] = cars[cars.length-1];
        	cars[cars.length-1] = temp; 
        	Arrays.sort(cars);
        	System.out.println(Arrays.toString(cars));
        	System.out.println("Position: "+Arrays.binarySearch(cars, "Ford"));
        	int num = Arrays.binarySearch(cars, "Ford");
        	System.out.println("Position: "+Arrays.binarySearch(cars, num+1, cars.length-1,"Ford"));
    }
}
