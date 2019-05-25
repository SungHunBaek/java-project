package day37_arraylist;

import java.util.ArrayList;

public class MyCities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		for (String city : cities) {
			System.out.print(city + " ");
		}
		
		System.out.println();
		for(int i = 0; i<cities.size();i++) {
			System.out.print(cities.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");
		System.out.println(cities.toString());
		
		cities.add(1,"Istanbul");
		cities.add(2, "Seoul");
		System.out.println(cities.toString());
		int idx = cities.indexOf("Sterling");
		   System.out.println("Sterling index: " + idx);
		   cities.set(idx, "Zagreb");
		   
		   System.out.println(cities);
		   
		   cities.clear();
		   boolean empty = cities.isEmpty();
		   System.out.println("empty: " +empty);
		   
		}
	
	}

