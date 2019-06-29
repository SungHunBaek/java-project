package day55_abstraction;


public class Cat extends Animal{
	public Cat(String name) {
		super(name);
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