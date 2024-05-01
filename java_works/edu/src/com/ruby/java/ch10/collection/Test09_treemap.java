package com.ruby.java.ch10.collection;

import java.util.Map;
import java.util.TreeMap;

public class Test09_treemap {

	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<String, String>();			// <key, value>

		users.put("20080319", "김푸름");
		users.put("20070620", "김하늘");
		users.put("20050817", "오정임");
		users.put("20120728", "김유빈");
		users.put("20120924", "김용빈");

		System.out.println(users);

		Map.Entry<String, String> entry = null;								// Entry 클래스 <key, value>

		entry = users.firstEntry();											// 이진트리의 정렬된 결과에서 가장 작은값, inorder traversal()
		print("입사일자가 가장 빠른 사람 ", entry);

		entry = users.lastEntry();
		print("입사일자가 가장 늦은 사람", entry);

		entry = users.lowerEntry("20121231");
		print("2012년도에 가장 늦게 입사한 사람", entry);

		entry = users.higherEntry("20120101");
		print("2012년도에 가장 빠르게 입사한 사람", entry);

		while (!users.isEmpty()) {
			entry = users.pollFirstEntry();
			print("퇴직한 사람", entry);
			System.out.println("남아있는 직원 수 : " + users.size());
		}
	}

	public static void print(String s, Map.Entry<String, String> entry) {
		System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());
	}
}