package day12_switch_ternary;

public class ORLogicWithSwitch {
	public static void main(String[] args) {
	char grade = 'F';
	
	switch (grade) {
	
	case 'A':
	case 'B':
	case 'C':
		System.out.println("PASS");
		break;
	case 'D':
	case 'F':
		System.out.println("FAIL");
		break;
		default:
			System.out.println("Invalid Grade");
	}
	
	
	}
}
