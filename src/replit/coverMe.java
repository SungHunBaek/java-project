package replit;

public class coverMe {
	public static void main(String[] args) {
		String ss = "hello hello";
		String aa = "ello";
		String str1 = coverString(ss,aa);
		System.out.println(str1);
	}
	public static String coverString(String main, String coverME) {
		String temp = "";
		for(int i = 0; i < main.length()-1; i++) {
			if(main.substring(i,coverME.length()-1).equals(coverME)) {
		
			}
		}
	    
	    System.out.println(main + "" + coverME);
	    return temp;
	    }		
		  
}