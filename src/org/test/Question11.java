package org.test;

import java.util.LinkedList;

public class Question11 {
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
		   
		   //1st index
		  
			   System.out.println(li.get(0));
			  
		   System.out.println("*******");
		   //alternate values
		   for(int i=0; i<=li.size()-1;i=i+2) {
			   System.out.println(li.get(i));
		   }
		   System.out.println("&&&&&");
		   //for loop
		   for(int i=0; i<=li.size()-1; i++) {
			   System.out.println(li.get(i));
		   }
		   
		   System.out.println("&&&&&");
		   //for Enhance
		   for(Integer integer1 :li) {
		   System.out.println(integer1);
		   }
}
}