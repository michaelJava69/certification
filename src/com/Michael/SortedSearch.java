package com.Michael;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {

                   //List michael = new ArrayList();
                   //michael.add(sortedArray);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv                                                                                                             
    	int j =0;  
    	for (int i=0; i<sortedArray.length; i++ ){
    		     
    		  if (sortedArray[i]< lessThan)
    			   j++;
    	  }
    	return j;
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}