package com.accolite.miniau;

public class Swap {

	public void swap(Integer a, Integer b) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = new Integer(2);
		Integer b = new Integer(3);
		System.out.println("before swap " + a + " " + b + "\n");
		Swap s = new Swap();
		s.swap(a, b);
		System.out.println("after swap " + a + " " + b + "\n");
	}

}
