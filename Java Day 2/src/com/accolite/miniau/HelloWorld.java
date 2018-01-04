package com.accolite.miniau;

public class HelloWorld {
	
	public int getLength(String s) {
		int i = 0;
		
		try{
			while(s.charAt(i) != '\0') {
				i++;
			}
		}
		finally {
			return i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world\n");
		HelloWorld h = new HelloWorld();
		int k = h.getLength(new String("Raghu"));
		System.out.println(k);
	}

}
