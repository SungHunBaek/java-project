package day60_polymorphism02;



public class abc {

	public static void main(String[] args) {

		Boolean[] bool = new Boolean[2];

		bool[0] = new Boolean(Boolean.parseBoolean("true"));

		bool[1] = Boolean.valueOf(null);

		System.out.println(bool[0] + "   " + bool[1]);

		}
}
