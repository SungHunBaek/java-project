package day16_string_manipulation;

public class GetNumberFromString {
	public static void main(String[] args) {
		String sentence = "1tst#2bla#3foo";
		String db = "1tst#2bla#3foo[#4zzz]";
		int id = 4;
		
		int start = sentence.indexOf('[') +1;
		int end = sentence.indexOf(']');
		String codeCount = sentence.substring(start,end);
		
		
		
		System.out.println("Lines of code: "+ codeCount);
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
