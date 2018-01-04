package com.accolite.miniau;

public class lambda {
	public static void main(String[] args) {
		MyNumber myNum;
		myNum = (n)->{
			for(int i = 2; i * i < n; i++) {
				if ( n % i == 0) {
					return false;
				}
			}
			return true;
		};
		System.out.println(myNum.checkPrime(14));
	}
}
