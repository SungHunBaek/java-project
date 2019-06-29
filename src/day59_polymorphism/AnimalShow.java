package day59_polymorphism;

public class AnimalShow {
	public static void main(String[] args) {
		Animal animal = new Animal();
		//Polymorphism: Reference animal, object tiger, cheetah, zebra
		Animal tiger = new Tiger();
		Animal zebra = new Zebra();
		Animal someAnimal = new Cheetah();
		
		animal.talk();
		tiger.talk();
		zebra.talk();
		someAnimal.talk();
		
		Animal[] animals = new Animal[3];
		animals[0] = new Tiger();
		animals[1] = new Zebra();
		animals[2] = new Cheetah();
		
		animals[0].talk();
		animals[1].talk();
		animals[2].talk();
	}

}
