package com.Michael;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TrainComposition {
	
	List train = new ArrayList();
	
	 
	
    public void attachWagonFromLeft(int wagonId) {
        train.add(0, String.valueOf(wagonId) );
     }

    public void attachWagonFromRight(int wagonId) {
    	 
    	//ListIterator last = train.listIterator();
    	train.add(train.size(), String.valueOf(wagonId) );
    	 
    	
    	 
    }

    public String detachWagonFromLeft() {
        ListIterator key = train.listIterator();
        int myKey=0;
        while(key.hasPrevious())
        	myKey= key.previousIndex(); 
        
    	   return (String)train.get(myKey);
    }

    public String detachWagonFromRight() {
    	
    	return (String)train.get(train.size()-1);
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        tree.attachWagonFromLeft(45);
        tree.attachWagonFromLeft(34);
        tree.attachWagonFromLeft(47);
        tree.attachWagonFromLeft(56);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
