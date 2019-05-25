package day27_arrays05;
import java.util.*;
public class BinaraySearch {
	public static void main(String[] args) {
		int[] nums = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(nums, 7));//2
		int a = Arrays.binarySearch(nums, 10);
		System.out.println(a);//3
		System.out.println(Arrays.binarySearch(nums, 5));//-2
		
		int[] nums2 = {40,6,17,10,55};
		Arrays.sort(nums2);
		System.out.println(Arrays.binarySearch(nums2,nums[4]));
	}
}
