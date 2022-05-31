package org.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class SampleQuestions {
 public static void main(String[] args) {
	java.util.List<Integer> li = new LinkedList<>();
	li.add(0);
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4);
    li.add(5);
    li.add(6);
    li.add(7);
    li.add(8);
   li.add(9);
   
    //middle index
    Integer inter = li.get((li.size()-1)/2);
    System.out.println(inter);
    System.out.println("*********");
    //last fiver values in list
    for(int i=5;i<li.size();i++) {
    	System.out.println(li.get(i));
    }
    
}
}