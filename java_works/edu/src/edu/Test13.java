package edu;

public class Test13 {
	public static void main(String[] args) {
		int f = 12; // 00000000/00000000/00000000/00001100
		int g = (~f); //two's complement, ~(tilte)
		System.out.println(g);
	}
}
