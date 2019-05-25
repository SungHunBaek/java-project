package day14_string_methods;

public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good morning";
				
			if(str1.equals("Good Morning")) {
				System.out.println("Match");
			} else {
				System.out.println("Not match");
			}
			
			if(str1.equalsIgnoreCase("good morning")) {
				System.out.println("Match");
			} else {
				System.out.println("Not match");
			}
			
			//convert to all uppercase and print
			
			System.out.println(str1.toUpperCase());
			System.out.println(str1);
			str1 = str1.toUpperCase();
			System.out.println("After assignment: " + str1);
	
			//combine the above methods together:
			//convert to all lowercase first then check if it equals ("good morning")
			if(str1.toLowerCase().equals("good morning")) {
				System.out.println("Chained method: match");
			}else {
				System.out.println("Chained method: do not match");
			}
			
			//Find out how many characters in the string
			
			String myName ="William";
			
			System.out.println(myName.length());
			
			int length = myName.length();
			System.out.println("My name's length: "+length);
			
			
			//usernames must be exactly 8 characters.
			String userName = "ROBINSON";
			
			if (userName.length() == 8){
			System.out.println(" valid user name ");
			}else {
				System.out.println(" not valid user name ");
			}
			
			//password must be at leaest 6 characters
			String passWord = "nicebsh93";
			
			if (passWord.length() >= 6) {
				System.out.println(" valid ");
			}else {
				System.out.println(" not valid ");
			}
			
			
			int passwordLength = passWord.length();
			if(passwordLength < 6) {
				System.out.println("invalid password. too short");
			}else {
				System.out.println("valid password");
			}
			
			
			
	}
}
