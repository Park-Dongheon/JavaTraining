package com.ruby.java.test1;

import java.util.Scanner;

public class CylinderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Cylinder cy = new Cylinder();
		

//		System.out.println("반지름을 입력하세요: " + cy.radius);
		
		while(true) {	
			System.out.print("반지름을 입력하세요[0:exit]: ");
			cy.radius = sc.nextInt();
			if(cy.radius == 0) {
				break;
			}
			System.out.print("높이를 입력하세요: ");
			cy.height = sc.nextInt();
			
			System.out.println("원기둥의 부피: " + (int)cy.getVolume());
			System.out.println("원기둥의 겉넓이: " + (int)cy.getArea());
		}

	}

}
