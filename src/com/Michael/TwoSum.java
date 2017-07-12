package com.Michael;

public class TwoSum {
    public   int[] findTwoSum(int[] list, int sum) {
         
    	int[] intArray = new int[2];
    	
    	
        for (int i=0; i <list.length; i++){
        	
        	for (int j=0;j <list.length; j++) {
        	  
        	
        	  if ((list[i] + list[j] == sum)&&(i!=j)){
        		    intArray[0] =list[i];
        		    intArray[1] =list[j];
        		    return intArray;
        	  }
        	} 
        }
    	return null;
    }

    public static void main(String[] args) {
    	
    	TwoSum twoSum = new TwoSum();
    	
        int[] indices = twoSum.findTwoSum(new int[] { 1,6, 3, 5, 7, 9 }, 12);
        
        
        System.out.println(indices[0] + " " + indices[1]);
    }
    
    
    
    public class Pairs{
    	
    	int first;
    	int second;
    	
    	Pairs(int one, int two){
    		
    		first = one;
    		second = two;
    		
    	}
    	
    	
    }
    
    
}
