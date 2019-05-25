package day28_multid_arrays;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String[][] pizzas = {
				{"pineapple","pepperoni"}, //0
				{"anchovies", "mushroom", "olives"}, //1
				{"4 cheese"}, //2
				{"chicken", "tomatoes", "japalenios","onions"},//3
				{"green peppers", "zuccini","brocolli", "spinach","shrimp"}//4				
		         };
		
		//System.out.println(Arrays.toString(pizzas[0]));
		for(String[] pizza : pizzas) {
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("##### FOR LOOP #####");
		for(int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length + "-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		int[][] students = {
							{4,5,6},
							{12,54,76},
							{23,55,12,55,3}
							};
		for(int[] group: students) {
			for(int studentID : group) {
				System.out.print(studentID + ", ");
			}
			System.out.println();
		}
		
		int biggest = 0;
		int[][] nums = {{10,20},{20,30,40,50},{100,200,400},{555,333,111,444,666,78}};
		for (int i = 0; i<nums.length;i++) {
			for (int j = 0; j < nums[i].length;j++) {
				System.out.print(nums[i][j] + " ");
				if(nums[i][j] > biggest){
			           biggest = nums[i][j];
			         }
			}
			System.out.println();
		}
		System.out.println(biggest);
		
		
		
	    int [][] multiplicationTable = new int[10][10];
	    
	    //TODO: type your code below
	    for(int i = 0; i< multiplicationTable.length; i++){
	      for (int j = 0; j< multiplicationTable[i].length-1; j++){
	        multiplicationTable[i][j] = (j+1)*(i+1); 
	        if(multiplicationTable[i][j] == multiplicationTable[i][j+1]);
	        System.out.println("no");
	      }
	    }
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
		
		
		
	}
}
