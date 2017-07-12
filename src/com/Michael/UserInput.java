package com.Michael;

public class UserInput {
    
     

    //public static class TextInput {}

    public static void main(String[] args) {
       
    	UserInput userInput = new UserInput();
    	userInput.writeTextPad(5);
    	
    }
    
    public void writeTextPad(int val){
    	
    	TextInput input = new TextInput(val);
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
 
    
    public class TextInput  {
    	
    	
    	char[] chacArray;
    	int m =0;
    	int max =0; 
    	char newArray[];
    	
    	public TextInput(int length){   		
    		chacArray = new char[length];
    		max = length;
    	}
    	
    	
    	public void add(char c){
    		chacArray[m]= c;
    		m++;
    		
    	}
    	
    	public String getValue(){
    		newArray = new char[m];
    		int j=0;
    		int i=0;
    		for (i=0; i<= m;i++){
    			char temp = chacArray[i];
    			if (Character.isDigit(temp)){
    				newArray[j]= temp;
    				j++;
    			} 
    		}
    		   
    		return new String(newArray);
    	}
    	
    }
}