package com.java.capgem;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   SortedSet<String> stSet = new TreeSet<>();
		   
		   stSet.add("E");
		   stSet.add("A");
		   stSet.add("c");
		   stSet.add("C");
		   
		   System.out.println(stSet.first());
		   System.out.println(stSet.last());
	}

}
