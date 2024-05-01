package com.ruby.java.ch10.collection;
//실습 대상
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01_arraylist {
	public static void main(String[] args) {
		Object arr[] = new Object[10];								// 배열의 Object클래스로 생성, Object클래스는 모든 클래스의 root, 참조 변수 arr은 자식클래스(String, Integer)등 사용 가능 - .을 찍어서 사용가능한 객체 확인
		String s = "java";
		Integer i1 = 123;
		arr[0] = s;
		arr[1] = i1;
//		int len = arr[0].length();//Object에 length()가 없다			// arr[0]의 타입은: Object, Object에는 length()메서드가 없기 때문에 오류
		int len = ((String) arr[0]).length();
		
//		------------------------------------------------------------------------------------------------------------------------------------

		ArrayList lst = new ArrayList();//모든 타입의 객체들을 저장할 수 있다 그러나 비추다! - 이유는?			//	<타입>을 지정하지 않는 경우? > Object 타입의 객체를 생성, lst->["java"][123][][]
		String s2 = "java";
		Integer i2 = 123;
		lst.add(s2);												//
		lst.add(i2);
//		lst.get(1).;						// length()가 없음
		
		//. 다음에 나타나는 메소드를 확인
//		int len = (lst.get(0)).length();//Object에 length()가 없다		//	lst->["java"][123][][], lst.get(0) -> String 타입
		int len2 = ((String)lst.get(0)).length();					// 타입캐스팅으로 타입을 변경

		System.out.println("len2 = " + len2);

		ArrayList<String> list = new ArrayList<>();//String 객체로 제한 > 바람직한 형태이다 			// ArrayList<String> 선언시= new 생성연산자 뒤의 ArrayList<생략가능> 
		
		//list.add(i2);									// i2 = 123, i2는 정수타입 void add(int index, E element) - E(타입매개변수)가 <String>이므로 오류 
		list.add("서울");		list.add("북경");		list.add("상해");
		list.add("서울");		list.add("도쿄");		list.add("뉴욕");
		
//		------------------------------------------------------------------------------------------------------------------------------------
		
		int len_string = list.get(0).length(); //list는 string 객체이다 그 차이는(원인은?)
		
		for (String element : list) { //배열이 아닌 ArrayList에도 확장형 for 사용 가능하다 
			System.out.print(" " + element);
		}
		System.out.println();
		
		list.add("런던");		list.add("로마");		list.add("방콕");
		list.add("북경");		list.add("도쿄");		list.add("서울");
		System.out.println("1 : " + list.toString()); //이 메소드는 ArrayList의 함수			// to
		//list.toString();//to.선택하여 나타나는 함수 리스트 확인
		System.out.println("list.size() = " + list.size());
		
		list.add(1, "LA");//인덱스 1 위치에 LA 추가			// "북경" 인덱스 2이상 전부 한칸씩 +1 이동
		print(2, list);

		// int indexOf(Object o) / int lastIndexOf(Object o)
		System.out.println("3 : " + list.indexOf("서울"));
		System.out.println("4 : " + list.lastIndexOf("서울"));

		// boolean remove(Object o)
		list.remove("LA");//우측 객체가 좌로 이동하는 효과
		//list.remove(Object) 선택할 때 // Object o = "LA"; 으로 비유될 수 있다 

		Object obj2 = "LA";//obj2는 Object의 하위클래스 객체를 모두 가질 수 있다 
		print(5, list);

		// E remove(int index)
		list.remove(2);
		print(6, list);

		// boolean contains(Object o)
		System.out.println("7 : " + list.contains("LA"));//boolean contains(Object o)를 사용한다 
		
		// Object[] toArray() *** 중요
		Object obj[] = list.toArray();//list를 배열로 변경 - Object[] toArray()
		System.out.println("8 : " + obj);//obj는 참조 변수이고 이를 toString()으로 변환
		System.out.println("8 : " + Arrays.toString(obj));//배열의 원소들을 스트링으로 변화
		// <T> T[] toArray(T[] a) - 해석할 수 있어야 한다 
		String cities[] = new String[5];
		//cities = list.toArray();//list를 배열로 변경 - 배열의 크기를 list 크기로 자동 조정
		cities = list.toArray(cities);//toArray([T[] a)의 return type은 T[]
		//toArray()의 return type은 Object[] 교재 475 하단설명 
		//list.toArray();//확인
		System.out.println("9 : " + Arrays.toString(cities));

		// void clear()
		list.clear();
		print(10, list);//print(list.toString()) 동일

		// boolean isEmpty()
		System.out.println("11: " + list.isEmpty());

		list.add("파리");
		list.add("방콕");
		list.add("LA");

		// Arrays 클래스의 static <T> List<T> asList(T... a) *** 중요
		List<String> list2 = Arrays.asList("서울", "뉴욕", "상해");//asList()는 배열을 입력받아 리스트를 만든다 	// 리스트를 배열로
		print(12, list2);

		// boolean addAll(Collection<? extends E> c) - ?는 wild card 사용 *** 중요
		list.addAll(list2);
		print(13, list);

		// boolean containsAll(Collection<?> c)
		System.out.println("14: " + list.containsAll(list2));

		// boolean retainAll(Collection<?> c)
		list.retainAll(list2);
		print(15, list);

		// boolean removeAll(Collection<?> c)
		list.removeAll(list2);
		print(16, list);
	}

	static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);//스트링으로 타입 변환후 toString() 호출하여 실행
		//System.out.println(n + " : " + list.toString());//동일한 효과
	}
}