package day15_string_manipulation.copy;

public class Contains {
	public static void main(String[] args) {
		String email = "nicebsh93@gmail.com";
		System.out.println(email.contains("@"));
		
		String list ="potatoes, apples, tomatoes, eggs, milk, break, cereal, meat";
		//check if apples is in the shopping list
		
		if(list.contains("apples")) {
			System.out.println("apples are there!");
		}else {
			System.out.println("lets add apples now!");
		}
		
		boolean hasEgges = list.contains("eggs");
		System.out.println("Contains egg: " + hasEgges);
		
		boolean hasCucumbers = list.toLowerCase().contains("Cucumbers");
		System.out.println("Contains cucumbers:" + hasCucumbers);
	
		System.out.println(list.lastIndexOf(email));
		String name = "William";
		if (name.contains("a") || name.contains("e")) {
			System.out.println("a or e is there");
		}else {
			System.out.println("both of them are not there");
		}
		String etsy = "Wooden spoon | Etsy";
		String str = " | ";
		System.out.println(etsy.contains(str));
		
		
		
		
	}
}
