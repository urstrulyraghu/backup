package com.accolite.miniau;

public class Template<T extends Number> {

	T[] nums;
	public Template(T[] o) {
		// TODO Auto-generated constructor stub
		nums = o;
	}
	
	public double average() {
		double sum = 0.0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,5};
		Template<Integer> t = new Template<Integer>(arr);
		System.out.println(t.average());
	}

}
