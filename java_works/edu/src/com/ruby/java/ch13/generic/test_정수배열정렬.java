package com.ruby.java.ch13.generic;
import java.util.Random;
import java.util.Arrays;
/*
 * 정수 배열을 정렬후 출력
 * 실수 배열을 정렬후 출력
 * 스트링 배열을 정렬후 출력하는 코드 완성 
 */

public class test_정수배열정렬 {

	static void showData(String msg, Object[]data) {
		System.out.print(msg);
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");	
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int [] data = new int[20];
		double []doubleData = new double[20];
		String [] stringData = {"apple","grape","b;ueberry","banana"};
		
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt();
			doubleData[i] = rnd.nextDouble();
		}
			
		Integer [] IData = new Integer[20];
		for(int j = 0; j < IData.length; j++) {
			IData[j] = data[j];
		}
		
		Double [] DData = new Double[20];
		for(int j = 0; j < DData.length; j++) {
			DData[j] = doubleData[j];
		}
		
		Arrays.sort(data);
		showData("Integer: ", IData);
		Arrays.sort(doubleData);
		showData("Double: ", DData);
		Arrays.sort(stringData);
		showData("String: ", stringData);
		//출력 
	}
	
}