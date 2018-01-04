package com.accolite.miniau;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileRead {
	public static void main(String[] args) {
		int i ;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream("res.txt");
		}catch(FileNotFoundException e) {
			System.out.println();
		}
		try {
			do {
				 i = fin.read();
				 if(i != -1) {
					 fout.write(i);
				 }
			}while(i != -1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");
	}
}
