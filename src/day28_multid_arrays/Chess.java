package day28_multid_arrays;
import java.util.*;

public class Chess {
  public static void main(String[] args) {
    String[][] chessBoard = new String[8][8];
    //WRITE YOUR CODE HERE
    char characters = 'a';
    for(int i = 0; i<= chessBoard.length-1;i++){
      
      for(int j= 0; j<= chessBoard.length-1; j++){
        int bordNumber = i + 1;
        chessBoard[i][j] = Integer.toString(bordNumber) + Character.toString(characters);
        characters++;
      }
    }
    //DO NOT CHANGE
    System.out.println(Arrays.deepToString(chessBoard));
  }
}
