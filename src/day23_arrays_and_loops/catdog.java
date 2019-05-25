package day23_arrays_and_loops;

public class catdog {
	public static void main(String[] args) {
		
		int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = "catdog";
	for (int i = 0; i < word.length()-2; i++){
	      if (word.substring(i,i+3).equals("cat")){
	        countOfCats++;
	      }else if (word.substring(i,i+3).equals("dog")){
	        countOfDogs++;
	      }
	    }
	    if(countOfDogs == countOfCats){
	      System.out.println("true");
	    }else{
	      System.out.println("false");
	    }
	    
	    System.out.println(countOfDogs);
	}
}
