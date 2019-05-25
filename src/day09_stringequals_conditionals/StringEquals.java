package day09_stringequals_conditionals;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == "java");	
		System.out.println(str2 == "Java");
	
		//equals method. PREFFERED WAY
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("java"));
		System.out.println(str2.equals("Java"));
		
		//String month = "March";
		String month = new String("March");
		String month2 = new String("March");
		
		System.out.println(month == month2);
		// In the above line, Java is not doing values comparison. It is just checking if month 
		//and month2 are pointing to same location in memory.
		
		System.out.println(month.equals(month2));
		System.out.println(month.equals("March"));
		// In the above examples, by using equals method, java is checking if values are same.
		// which is proper way of comparing strings.
		
		
		
		
		
		
		
		
	}
}
