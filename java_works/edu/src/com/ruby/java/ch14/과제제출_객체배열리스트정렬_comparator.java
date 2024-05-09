package com.ruby.java.ch14;
/*
 * 		Comparator<Student2> compSno = new Comparator<Student2>(){
			@Override
			public int compare(Student2 s1, Student2 s2) {

			}
		};
 */
/*
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String sno;
	String sname;
	
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	
	public String getSno() {
		return sno;
	}
	
	public String getSname() {
		return sname;
	}
	
	@Override
	public String toString() {
		return "S[sno: " + sno + " sname: " + sname + "] ";
	}

}

public class 과제제출_객체배열리스트정렬_comparator {

// -----------------------------------------------------------------------------------------------------------------------------------

	static void sortStudents() {
		System.out.println();
	}
	
// -----------------------------------------------------------------------------------------------------------------------------------
	
	static void showStudents(String str, Student[] students) {		// 정적 메서드를 정의, 메서드의 시그니처를 정의, 문자열(str)과 학생 배열(students)을 인자로 받아서 학생 정보를 출력
		
		System.out.print(str + " ");								// 문자열(str)을 출력
		for(Student s : students) {									// 학생 배열을 반복하면서 각 학생 정보를 s에 저장
			System.out.print(s.toString() + " ");					// 각 학생 객체의 toString() 메서드가 호출되어 학생 정보가 문자열로 변환하여 출력
		}
		System.out.println();
		
	}
	
// -----------------------------------------------------------------------------------------------------------------------------------
	

	static void showStudents(String str, List<Student> students) {	// 학생 객체의 리스트를 받음, 유연한 인터페이스를 제공, 리스트를 사용하면 배열보다 더 많은 기능을 활용할 수 있으며 크기를 동적으로 변경 가능
		
	    System.out.print(str + " ");
	    for (Student s : students) {
	        System.out.print(s.toString() + " ");
	    }
	    System.out.println();
	    
	}
	
// -----------------------------------------------------------------------------------------------------------------------------------	
	
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

        // -----------------------------------------------------------------------------------------------------------------------------------
        
        // 익명클래스를 사용한 Comparator 인터페이스를 구현, compSno1은 Comparator 인터페이스를 구현한 익명 클래스의 인스턴스, 
        Comparator<Student> compSno1 = new Comparator<Student>(){
        	
        	// compare() 메서드를 재정의하여 두 개의 학생 객체(s1과 s2)의 sno 필드를 기준으로 정렬
			@Override
			public int compare(Student s1, Student s2) {
				int sno1 = Integer.parseInt(s1.getSno());
				int sno2 = Integer.parseInt(s2.getSno());
				
				return Integer.compare(sno1, sno2);
			}
		};
		
		// -----------------------------------------------------------------------------------------------------------------------------------
		
		// 람다표현식을 사용한 Comparator 인터페이스를 구현, compSno2는 Comparator 인터페이스를 구현한 익명 클래스의 인스턴스
        Comparator<Student> compSno2 = (s1, s2) -> {
        	// 람다 표현식 내부에서는 두 개의 학생 객체(s1과 s2)의 sno 필드를 비교하여 정렬
			int sno1 = Integer.parseInt(s1.getSno());
			int sno2 = Integer.parseInt(s2.getSno());
			
			return Integer.compare(sno1, sno2);
        };
        
        // -----------------------------------------------------------------------------------------------------------------------------------
        
        //문제1: Arrays.sort()를 사용한 sArray 정렬 - sno 사용, (익명클래스 사용)--------------------------------------------------------------------------------------------------
		System.out.println("문제1: sno 기준 sArray정렬(Arrays.sort(), **익명 클래스 사용**)");
        showStudents("sno 정렬전", sArray);
        Arrays.sort(sArray, compSno1);								// Arrays.sort() 메서드에 익명클래스로 생성한 Comparator 객체를 전달하여 배열을 정렬
        showStudents("sno 정렬후", sArray);
        
        //문제2: Arrays.sort()를 사용한 sArray 정렬 - sname 사용, (익명 객체 사용)--------------------------------------------------------------------------------------------------
        System.out.println("문제2: sname 기준 sArray정렬(Arrays.sort(), **익명 객체 사용**)");
        showStudents("sname 정렬전", sArray);
        Arrays.sort(sArray, new Comparator<Student>() {				// Arrays.sort() 메서드에 익명클래스의 선언, 생성을 한번에 처리 익명 객체를 사용하여 String 타입의 sname을 오름차순 정렬 

			@Override
			public int compare(Student s1, Student s2) {
				return s1.sname.compareTo(s2.sname);				// compareTo() 메서드를 사용하여, 두 개의 익명 객체의 문자열 객체 타입 sname 인수를 비교하여 정렬
			}														// 비교객체 s1.name이 파라미터로 전달된 객체 s2.name 보다 작을경우 음수(-1)을 반환, 오름차순으로 정렬
			
        });
        showStudents("sname 정렬후", sArray);
        
        //문제3: Collections.sort()를 사용한 sList 정렬 - sno 사용, (람다식 사용)--------------------------------------------------------------------------------------------------
        System.out.println("문제3: sno 기준 sList정렬(Collections.sort(), **람다식 사용**)");
        showStudents("sno 정렬전", sList);
        Collections.sort(sList, compSno2);
        showStudents("sno 정렬후", sList);
        
        
        //문제4: Collections.sort()를 사용한 sList 정렬 - sname 사용--------------------------------------------------------------------------------------------------
        System.out.println("문제4: sname 기준 sList정렬(Collections.sort(), **람다식 사용**)");
        showStudents("sname 정렬전", sList);
        Collections.sort(sList, (s1, s2) -> {						// 람다 표현식, Comparator 인터페이스를 구현한 익명 클래스를 대체						
        	return s1.getSname().compareTo(s2.getSname());			// s1과 s2라는 두 개의 Student 객체를 비교, getSname() 메서드를 사용하여 학생의 이름을 가져와서 오름차순으로 정렬
        });
        showStudents("sname 정렬후", sList);
        
//        //문제5: sortStudents()를 사용한 sArray 정렬 - sno 사용--------------------------------------------------------------------------------------------------
//        showStudents("sno 정렬전", sArray);
//        showStudents("sname 정렬후", sArray);
	}

}
