package day32_methods04;

import java.util.*;

public class replitArray {
  //WRITE YOUR CODE HERE
  
  int[] a = {1,2,3,4,5};
  double[] b = {6,7,8,9};
  public double findMax (double MaxD){
	  double dmax = 0.0;
	  for (int i = 0; i< b.length; i++){
    	if(b[i]> b[i+1]) {
    		dmax = b[i];
    	}
    }
	  return dmax;
  }
  public int findMax(int MaxI) {
	  int imax = 0;
	  for (int i = 0; i< a.length; i++){
	    	if(a[i]> a[i+1]) {
	    		imax = a[i];
	    	} 
	  }
	  return imax;
  }
}
