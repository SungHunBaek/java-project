package day27_arrays05;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		int[] nums = {43,12,1,3,5};
	
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"zulu", "spanish","italian","english","polish","korean"};
		System.out.println(Arrays.toString(languages));
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		int[] nums2 = {345,665,3333,11,3,66};
		
		Arrays.sort(nums2);
		System.out.println(nums2[0] +","+ nums2[nums2.length-1]);
		
	}
}
