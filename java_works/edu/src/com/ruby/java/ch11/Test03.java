package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args){
		FileInputStream fi = null;
		try {
//			FileInputStream fi = new FileInputStream("a.txt");
			fi = new FileInputStream("a.txt");
			int c = fi.read();
			System.out.println((char) c);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			fi.close();								// fi는 try의 지역변수
		}
		
//		try(FileInputStream fi = new FileInputStream("a.txt")) {
//			int c = fi.read();
//			System.out.println((char) c);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
}
