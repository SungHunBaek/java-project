package day13_ternary_strings_intro;

public class MoreTernary {
	public static void main(String[] args) {
		String quality = "bad";
		int rating = (quality.equals("good")) ? 100 : 0;
				System.out.println(rating);
				
				
		int PMHour = 6;
		//Rush hour during evening: 4~7;
		boolean rushHour = (PMHour <= 7 && PMHour >= 4) ? true : false;
		
		String result = rushHour == true ? "yes":"no";
				
		System.out.println(PMHour + " is rush hour? " + result);
	
		int AMHour = 2;// 6~9
		
		String amRushHour = AMHour >= 6 && AMHour <= 9 ?"yes": "no";
		System.out.println(AMHour + " is rush hour? - " + amRushHour);
	}
}
