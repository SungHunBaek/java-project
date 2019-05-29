package day52_inheritance05;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 610;
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_MAX_PASSENAGER;
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";
	}
	
	
	public FinalVariables() {
		MODEL_3_MAX_SPEED = 180;
	}
	
	{
		MODEL_X_MAX_PASSENAGER = 7;
	}
	
	public static void main(String[] args) {
		final int MAX_PASSENGERS_COUNT = 5;
		//MAX_PASSENGERS_COUNT = 10;
		final double PI = 3.14159;
		//PI = 5.54323;
		System.out.println(MAX_PASSENGERS_COUNT);
		final int SSN;
		SSN = 314569843;
		//SSN++; is not possible.
		FinalVariables finalVars = new FinalVariables();
		System.out.println("Max range for roadster: " + finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Maximum speed of model 3: " + finalVars.MODEL_3_MAX_SPEED);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("Company name: " + finalVars.COMPANY_NAME);
		System.out.println("Admin user name: " + finalVars.ADMIN_USERNAME );
	}
}
