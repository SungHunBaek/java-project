package day17_stringpool_whileloop;

import java.util.Scanner;

public class BuildARoute {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("start");
    String start = scan.next();
    System.out.println("end");
    String end = scan.next();
    
    
    if (start.equals("A")){
      if (end.equals("A")){
        System.out.println("A found");
      }else if (end.equals("B")){
        System.out.println("right: B found");
      }else if (end.equals("C")) {
    	  System.out.println("right > down: C found");
      }else if (end.equals("D")){
    	  System.out.println("right > down > left: D found");
      }
    }

    if (start.equals("B")){
      if (end.equals("B")){
        System.out.println("B found");
      }else if (end.equals("C")){
        System.out.println("down: C found");
      }else if (end.equals("D")) {
    	  System.out.println("down > left: D found");
      }else {
    	  System.out.println("down > left > up: A found");
      }
     }
    

    if (start.equals("C")){
      if (end.equals("C")){
        System.out.println("C found");
      }else if (end.equals("D")){
        System.out.println("left: D found");
      }else if (end.equals("A")) {
    	  System.out.println("left > up: A found");
      }else {
    	  System.out.println("left > up > right: B found");
      }
    }

    if (start.equals("D")){
      if (end.equals("D")){
        System.out.println("D found");
      }else if (end.equals("A")){
        System.out.println("up: A found");
      }else if (end.equals("B")) {
    	  System.out.println("up > right: B found");
      }else {
    	  System.out.println("up > right > down: C found");
      }
    }
    
    
    
  }
}
