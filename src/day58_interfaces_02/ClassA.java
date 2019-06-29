package day58_interfaces_02;

public class ClassA implements Cloneable{
	public Object clone() {
		System.out.println("Cloning");
		return null;
	}
}
