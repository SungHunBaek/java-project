package day23_arrays_and_loops;

public class Arrays1 {
	public static void main(String[] args) {
		int [] numbers = new int [3];
		
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("**************************");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			 
		}
		
		
		String [] names2 = {"Shaun", "Roman", "Vlad", "Burak", "MARIA"};

		for (int i=0; i<names2.length;i++){
		      System.out.println(names2[i].substring(0,1) + (names2[i].substring(names2[i].length()-1,names2[i].length())));
		    }
		System.out.println("number of items: " + names2.length);
		//String [] countries = {};
		//Array has fixed size.
		//countries[0] = "USA";
		//String name = null;
		String[] fruits = new String[] {"apple", "orange"};
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		
		
	}
}
