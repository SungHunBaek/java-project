package day51_inheritance04;

public class Exercise {
	public int perform(int minutes) {
		System.out.println("Doing general exercise");
		return minutes*4;
	}
/**	class Running extends Exercise{
		public int perform(int minutes) {
			System.out.println("Running");
			return minutes*10;
		}
	}
	class Swimming extends Exercise{
		public int perform(int minutes) {
			System.out.println("Running");
			return minutes*10;
		}
	}
**/
}
