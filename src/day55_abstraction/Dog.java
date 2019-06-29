package day55_abstraction;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	@Override
	public void speak() {
		
	System.out.println("Woof woof");
	
	}

	public void eat() {
		
		System.out.println("Dog is eating");
		
		}
	
}