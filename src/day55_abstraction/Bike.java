package day55_abstraction;

public class Bike extends Vehicle{
	
	public Bike(int wheel, double price) {
		super(wheel, price, "Bicycle", "a person");
		// TODO Auto-generated constructor stub
	}

	public void move() {
		System.out.println("Cycling...");
	}
}
