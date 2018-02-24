package com.java.capgem;

public class IsLeapYear {

	public static void main(String[] args) {
		
		IsLeapYear y = new IsLeapYear();
		System.out.println(y.isLeapyear(1600));
		System.out.println(y.isLeapyear(2078));
		System.out.println(y.isLeapyear(1900));
		System.out.println(y.isLeapyear(1850));
		System.out.println(y.isLeapyear(2200));
		System.out.println(y.isLeapyear(2000));
	}

	public boolean isLeapyear(int y) {
		
		
		 if(y % 4==0) {
			 if(! (y % 400 ==0)) {
					return false;
			 }else {
				 return true;
			 }
			
		}
		
		return false;
	}
}
