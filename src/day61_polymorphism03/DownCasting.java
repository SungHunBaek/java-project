package day61_polymorphism03;
import day60_polymorphism02.*;
public class DownCasting {
	public static void main(String[] args) {
		
	
	IPad ipad = (IPad)appDev;
	
	AppleDevice dev2 = new Mac();
	dev2.use();
	
	Mac mac = (Mac)dev2;
	mac.code();
	
	((Mac)dev2).code();
	}
}
