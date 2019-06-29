package day55_abstraction;

public class Zoo {

	public static void main(String[] args) {
		
		//Animal animal = new Animal(); cannot instantiate the abstract
		
		Cat fluffy  = new Cat("Fluffy");
		fluffy.speak();
		
		Dog doggy = new Dog("Zico");
		doggy.speak();
		doggy.eat();
		
		
		
		
	}
	
	
}