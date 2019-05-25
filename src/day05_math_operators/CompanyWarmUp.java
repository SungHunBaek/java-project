package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args){
		String companyName = "Facebook";
		String address = "Silicon Valley, CA";
		int numberOfEmployees = 10000;
		long revenue = 423643634653452L;
		boolean isTechCompany = true;
	
		System.out.println("Company name is " + companyName);
		System.out.println("Address of Facebook is " + address);
		System.out.println("Number of Facebook's employee is " + numberOfEmployees);
		System.out.println("Annual revenue of Facebook is " + revenue);
		System.out.println("Is Facebook tech company? The answer is = " + isTechCompany);
		
		String aboutCompany = "Company " + companyName + " is located in " + address + "\n and " 
		+ numberOfEmployees +" work for it.";
		System.out.println(aboutCompany); 
	}
	
}
