package replit;

public class MAXLENGTHARRAY {
	public static void main(String[] args) {
		String[] words = {"A","BB","CCC","DDDD","BBBBSD"};
	String biggest = "";
		
		for (int a = 1; a <= words.length-1; a++){
		  if (words[a].length() > words[a-1].length()){
		    biggest = words[a];
		  }
		  
		}
		System.out.println(biggest);
	}
	
}
