package day59_polymorphism;

import java.util.ArrayList;

public class Store {
	public static void main(String[] args) {
		HairSpray hp = new HairSpray();
		hp.catchFire();
		
		Flameable hairsp = new HairSpray();
		hairsp.catchFire();
		Flameable Propane = new PropaneTank();
		Propane.catchFire();
		
		Flameable item;
		item = new HairSpray();
		
		item = new PropaneTank();
		
		
		
	}
}
