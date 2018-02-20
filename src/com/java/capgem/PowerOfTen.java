package com.java.capgem;

public class PowerOfTen {

	public static void main(String[] args) {
		PowerOfTen t = new PowerOfTen();
		//System.out.println(t.isPowerOfTen(1000100000));
		System.out.println(t.isPowerOfTen2(1000042342));
	}

	public boolean isPowerOfTen(int data) {
		if (data == 1) {
			return true;
		}
		int rem = data % 10;
		while (rem == 0 && data > 10) {
			data = data / 10;
			return isPowerOfTen(data);
		}
		if (rem == 0) {
			return true;
		}

		return false;
	}

	public boolean isPowerOfTen2(int data) {
		Double pow = Math.abs(Math.log10(data));
		Double val = Math.pow(10, pow);
		if(val == data) {
			return true;
		}
		System.out.println(pow);
		return false;
	}

}
