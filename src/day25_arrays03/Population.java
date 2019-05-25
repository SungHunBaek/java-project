package day25_arrays03;
import java.util.*;
public class Population {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] population = new int[5];
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[4] = 8907;
		population[3] = 4455;
		 
		System.out.println("city 0 population: "+ population[0]);
		System.out.println("city 1 population: "+ population[1]);
		System.out.println("city 2 population: "+ population[2]);
		System.out.println("city 3 population: "+ population[3]);
		System.out.println("city 4 population: "+ population[4]);
		
		String[] cities = {"Miami","London","Tokyo","Rome","New york"};
		
		System.out.println("Population of " + cities[0]+ " is "+population[0]);
		System.out.println("Population of " + cities[1]+ " is "+population[1]);
		System.out.println("Population of " + cities[2]+ " is "+population[2]);
		System.out.println("Population of " + cities[3]+ " is "+population[3]);
		System.out.println("Population of " + cities[4]+ " is "+population[4]);
		
	    for (int i = 0; i<=population.length-2;i++){
	        if(population[i]==population[i+1]){
	          System.out.println(i);
	        }
	      }
	}
}
