package day28_multid_arrays;
import java.util.Arrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
 
		System.out.println("Data size: " + data.length);
	
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[data.length-1]);
		
		int counter = 0;
		for(String restaurent : data) {
			System.out.println("#" + counter + "=>" + restaurent);
			counter ++;
		}
		
		int countVA =0;
		for (String VA : data) {
			if(VA.contains(",VA,")) {
				System.out.println(VA);
				countVA++;
			}
		}
		
		System.out.println("########### Total restaurants in VA: "+ countVA);
		
		for(String res: data) {
			if(res.contains(",VA,")) {
				String[] resArr = res.split(",");
				System.out.println(resArr[2] + " - " + resArr[1]);
			}
		}
	}
}
