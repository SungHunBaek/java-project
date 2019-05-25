package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby";
		String noSpace = sentence.replace(" ","");
		System.out.println(noSpace);
		System.out.println(sentence.replace(",", "!!!"));
		
		
		
		
		
		
		String mixed = "&^@#j$a-v|a@#$";
		
		// clean up mixed
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");
		mixed = mixed.replace("|", "");
		mixed = mixed.replace("$", "").replace("-", "").replace("|","");
		
		System.out.println(mixed);
		
		mixed = mixed.replace("a", "");
		
	String result = "About 115,000,000 results (0.11 seconds)";
		
		//using string methods(replace, substring) get number of results
		
		//115,000,000	
		result = result.replace("About ", "");//115,000,000 results (0.11 seconds)
		//result = result.replace(" results (0.66 seconds)", ""); might break whn number changes
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		
	}
}
