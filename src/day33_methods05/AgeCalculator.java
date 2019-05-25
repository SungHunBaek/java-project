package day33_methods05;

public class AgeCalculator {
	public static void main(String[] args) {
		int age = calculateAge(2000);
		System.out.println("You are "+age+" years old");
		
		int age2 = calculateAge(1975);
		System.out.println("You are "+age2+" years old");
		
		int age3 = calculateAge(1993);
		System.out.println("You are "+age3+" years old");
		
		System.out.println(calculateAge(2001));
	}
	
	public static int calculateAge(int year){
		int age = 2019-year;
		if(age >= 1 && age <=14) {
			System.out.println("Child");
		}else if(age >= 15 && age <=25) {
			System.out.println("Youth");
		}else if(age >25 && age <65) {
			System.out.println("Adult");
		}else if(age>=65){
			System.out.println("Senior");
		}else {
			System.out.println("Invalid age");
		}
		return age;
	}
}
