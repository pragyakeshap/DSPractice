package com.java.capgem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindSum {

	public static void main(String[] args) {
		
		int[] A = {1, 2, 4, 7, 11, 15};
		System.out.println(findSum(A, 15));
	}
	
	public static boolean findSum(int[] A, int sum) {
		int len = A.length;
		List<Integer> ll =  new ArrayList<>();
	
		for(int i=0; i < len; i++) {
			ll.add(A[i]);
		}
		
		Iterator<Integer> iter = ll.iterator();
		while(iter.hasNext()) {
			Integer diff = sum - iter.next();
			if(ll.contains(diff)) {
				return true;
			}
		}
		return false;
	}

}
