package day55_abstraction;

public class Mammal extends Animal{

	public Mammal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
	System.out.println("meeeeeeow");	
		
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is eating");
		
	}

	@Override
	public void feedWithAMilk() {
		
		
	}

	
	
}