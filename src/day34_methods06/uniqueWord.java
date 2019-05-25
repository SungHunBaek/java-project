package day34_methods06;

public class uniqueWord {
	public static void main(String[] args) {
		String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};
		
		printUniqueWords(words);
	}
	
	public static void printUniqueWords(String[] words){
	    //WRITE YOUR CODE HERE
	      	String temp = "";
	      	boolean unique;
	      	for (int i = 0; i < words.length; i++) {
				unique = true;
				temp = words[i];
				for (int j = 0; j < words.length; j++) {
					if(j==i) {
						continue;
					}
					else if (temp.equals(words[j])){
						unique = false;
						break;
					}
					
				}if (unique == true) {
					System.out.println(temp);
				}
			}
		   
	    
	  }
	
}
