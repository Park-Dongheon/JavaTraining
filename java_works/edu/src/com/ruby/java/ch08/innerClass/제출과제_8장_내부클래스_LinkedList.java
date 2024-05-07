package com.ruby.java.ch08.innerClass;

import java.util.Scanner;

public class 제출과제_8장_내부클래스_LinkedList {

	private Node head;
	
	public 제출과제_8장_내부클래스_LinkedList() {
		head = null;
	}
	
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}
	
	public void add(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}
		else {
			Node next = head;
			while(next.link != null) {
				next = next.link;
			}
			
			next.link = newNode;
		}
	}
	
	public void insert(String data) {
		Node newNode = new Node(data);
		
		
	}
	
	public void delete(String data) {
		
		if(head == null) {
			return;
		}
		else {
			Node next = head;
			Node tmp = null;
			while(next != null) {
				if(next.data == data) {
					next.link = tmp;
					tmp.link = head;
					return;
				}
				tmp = next;
				next.link = head.link;
			}
		}
	}
	
	public void printList() {
		//printList() 결과는 A -> B -> C 등으로 출력한다
		if(head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		}
		else {
			System.out.println("등록된 데이터는 다음과 같습니다: ");
			Node next = head;
			while(next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
		System.out.println("-".repeat(30));
	}
	
	public static void main(String[] args) {
		제출과제_8장_내부클래스_LinkedList myList = new 제출과제_8장_내부클래스_LinkedList();
		myList.printList();

		Scanner sc = new Scanner(System.in);
		myList.add(sc.next());
		myList.add(sc.next());
		myList.add(sc.next());
		myList.printList();
		myList.delete("CSS");
		myList.printList();
		
		sc.close();
	}

}