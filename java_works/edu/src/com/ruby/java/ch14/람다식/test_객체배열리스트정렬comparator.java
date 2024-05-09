package com.ruby.java.ch14.람다식;
/*
 * 		Comparator<Student2> compSno = new Comparator<Student2>(){
			@Override
			public int compare(Student2 s1, Student2 s2) {

			}
		};
 */
import java.util.ArrayList;
/*
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
	String sno;
	String sname;
	
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class test_객체배열리스트정렬comparator {
	

	
	static void sortStudents() {
	}
	static void showStudents(String str, Student[] sArray) {
		System.out.println(str);
		for(Student s : sArray) {
			System.out.print(s.sno + " ");
		}
	}
	

	
	public static void main(String[] args) {
        Student[] sArray = new Student[5];
        
        // Student 객체 생성 및 배열에 할당
        sArray[0] = new Student("121", "Alice");
        sArray[1] = new Student("33", "Bob");
        sArray[2] = new Student("9", "Charlie");
        sArray[3] = new Student("2", "John");
        sArray[4] = new Student("39", "Bobby");
        
        // ArrayList로 변환
        ArrayList<Student> sList = new ArrayList<>();
        for (Student student : sArray) {
            sList.add(student);
        }
        
        Comparator<Student> compSno = new Comparator<Student>(){
        	
			public int compareTo(String sno) {
				int sno1 = Integer.parseInt(sno, sno1);
				int sno2 = Integer.parseInt(sno);
				return sno1 - sno2;
			}
		};

        
        showStudents("sno 정렬전", sArray);
        //문제1: Arrays.sort()를 사용한 sArray 정렬 - sno 사용, (익명클래스 사용)
        Arrays.sort(sArray, compSno);
        showStudents("sno 정렬후", sArray);
        
        
        
//        showStudents("sname 정렬전", sArray);
//        //문제2: Arrays.sort()를 사용한 sArray 정렬 - sname 사용, (익명 객체 사용)
//        showStudents("sname 정렬후", sArray);
//        
//        
//        
//        
//        showStudents("sno 정렬전", sList);
//        //문제3: Collections.sort()를 사용한 sList 정렬 - sno 사용, (람다식 사용)
//        showStudents("sno 정렬후", sList);
//        
//        
//        
//        showStudents("sname 정렬전", sList);
//        //문제4: Collections.sort()를 사용한 sList 정렬 - sname 사용
//        showStudents("sname 정렬후", sList);
//        
//        
//        
//        showStudents("sno 정렬전", sArray);
//        //문제5: sortStudents()를 사용한 sArray 정렬 - sno 사용
//        showStudents("sname 정렬후", sArray);
	}

}

