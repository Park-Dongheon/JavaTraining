package com.ruby.java.test1;

public class Cylinder {
	
	int radius;
	int height;
	
//	void setData(int r, int h) {
//		radius = r;
//		height = h;
//	}
	
	double getVolume() {
		return Math.PI * radius * radius * height;
	}
	
	double getArea() {
		return Math.PI * radius * radius * 2 + (2 * Math.PI * radius) * height;
	}
	
}
