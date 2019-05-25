package day27_arrays05;
import java.util.*;
public class ArraysEquals {
	public static void main(String[] args) {
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};
		
		System.out.println(Arrays.equals(nums1, nums2));
		if(Arrays.equals(nums1,nums2)) {
			System.out.println("they are exectly same values");
		}
		
		String [] strArr1 = {"One","Two", "Three"};
		String [] strArr2 = {"one","two", "three"};
		
		System.out.println(Arrays.equals(strArr1,strArr2));
		boolean match = Arrays.equals(strArr1,strArr2);
		System.out.println(match);
		
		
		}
}
