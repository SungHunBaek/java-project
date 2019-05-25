package day36_wrapperclasses_arrayslistintro;
import java.util.ArrayList;
public class ArrayListIntro {
	public static void main(String[] args) {
		String[] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray	= new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
	// assign values into arraylist
	names.add("Maria");
	names.add("Roman");
	names.add("Vlad");
	names.add("Natalia");
	
	nums.add(122);
	nums.add(123124);
	//read from array list
	System.out.println(names.get(0));
	System.out.println(names.get(1));
	System.out.println(names.get(2));
	System.out.println(names.get(3));
	
	System.out.println(nums.get(0));
	System.out.println(nums.get(1));

	System.out.println("Names Count: " + names.size());
	System.out.println("nums Count: " + nums.size());
	
	}
}
