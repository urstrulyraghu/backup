package com.accolite.miniau;

import java.util.Scanner;
import java.util.Stack;

public class Phone {

	private Stack<String> calls = new Stack<String>();
	
	public void dial(String number) {
		calls.push(number);
		System.out.println("Calling " + number + "\n");
		
	}
	
	public void callHistory() {
		if(calls.empty()) {
			System.out.println("Calls history is empty");
			return;
		}
		System.out.println("Last Call was made to : " + calls.peek() + "\n");
	}
	
	public void dialHistory() {
		if(calls.empty()) {
			System.out.println("Calls history is empty");
			return;
		}
		System.out.println(calls);
	}
	
	public void deleteCallHistory() {
		calls.pop();
	}
	
	public void deleteDialHistory() {
		calls.clear();
	}
	
	public void userInterface() {
		int opt = 0;
		String number = new String();
		Scanner s = new Scanner(System.in);
		
		do {
		System.out.println("Please Select your option:\n 1.Make a Call\n 2.Call History\n 3.Dial History\n 4.Clear Call History\n 5.Clear Dial History\n 6.Exit");
		int ch = s.nextInt();
		
		switch(ch){
			case 1 : System.out.println("Enter the number\n");
					s.nextLine();
					 number = s.nextLine();
					 dial(number);
				break;
			
			case 2 : callHistory();
				break;
			
			case 3 : dialHistory();
				break;
			
			case 4 : deleteCallHistory();
				break;
			
			case 5 : deleteDialHistory();
				break;
			
			default : System.out.println("Invalid choice:\n");
				break;
		}
	}while(opt != 6);
		
		s.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.userInterface();
	}

}
