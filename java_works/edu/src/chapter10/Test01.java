package chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("서울");		list.add("북경");		list.add("상해");
		list.add("서울");		list.add("도쿄");		list.add("뉴욕");
//		
//		// ArrayList의 get() 메서드는 인자로 전달한 인덱스에 해당하는 데이터를 제네릭으로 선언한타입으로 변환, list는 String으로 선언했으므로 i 번지의 데이터를 String으로 반환
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
		list.add("런던");		list.add("로마");		list.add("방콕");
		list.add("북경");		list.add("도쿄");		list.add("서울");
//		
//		// 배얄의 크기가 원래 10이었지만 11번째 데이터를 추가해도 문제없이 실행되는 것을 확인, 저장할 공간이 부족하면 자동으로 크기가 확장되기 때문
//		// ArrayList 클래스에는 toString() 메서드가 오버라이딩되어 있슴, ArrayList의 toString() 메서드는 ArrayList에 저장된 모든 데이터를 문자열로 반환, 참조변수 list가 가리키는 ArrayList에 저장된 데이터를 모두 출력
		System.out.println("1 : " + list.toString());
		
		// void add(int index, E element), list의 1번 인덱스에 "LA"를 삽입
		list.add(1, "LA");	print(2, list);
		
		// int indexOf(Object o) / int lastIndexOf(Object o), indexOf() 메서드는 앞에서 검색을 시작 -> 처음 검색된 데이터의 인덱스를 반환, lastIndexOf() 메서드는 끝에서부터 앞으로 검색 -> 처음 검색된 데이터의 인덱스를 반환  
		System.out.println("3 : " + list.indexOf("서울"));
		System.out.println("4 : " + list.lastIndexOf("서울"));
		
		// boolean remove(Object o), remove() 메서드는 인자로 전달한 데이터를 삭제, 삭제 후 오른쪽의 데이터가 왼쪽으로 이동(index 1 "LA" 삭제 -> index 1 "북경"...)
		list.remove("LA");	print(5, list);
		
		// E remove(int index), remove() 메서드에 전달한 인자는 삭제할 데이터의 인덱스, 전달한 인덱스의 데이터를 삭제한 후 오른쪽 데이터들을 왼쪽으로 이동
		list.remove("2");	print(6, list);
		
		// boolean contains(Object o), contains() 메서드는 인자로 전달한 데이터가 list에 포함되어 있는지 판단
		System.out.println("7 : " + list.contains("LA"));
		
		// Object[] toArray(), toArray() 메서드는 ArrayList의 데이터들을 가진 Object 타입의 배열을 생성하여 변환
		Object obj[] = list.toArray();
		System.out.println("8 : " + list.contains(obj));
		
		// <T> T[] toArray(T[] a), 객체를 일반 배열로 변환할 때 toArray() 메서드를 이용하면 Object 타입의 배열로 반환, Object 타입이 아니라 원하는 타입의 배열이 필요할 때는 인자값으로 특정 타입의 배열을 전달
		// toArray(cities)는 cities가 String 타입이므로 list의 데이터들을 String 타입으로 변환하여 배열에 저장, 배열의 크기보다 ArrayList 크기가 클 때 자동으로 배열의 크기가 변경되므로 new String[0]으로 배열 생성
		String cities[] = new String[0];
		cities = list.toArray(cities);
		System.out.println("9 : " + Arrays.toString(cities));
		
		// clear() 메서드는 ArrayList의 모든 데이터를 삭제
		// void clear()
		list.clear();	print(10, list);
		
		// isEmpty() 메서드는 배열이 비었는지를 판단
		// boolean isEmpty()
		System.out.println("11 : " + list.isEmpty());
		
		// 비어 있는 list에 다시 데이터를 추가
		list.add("파리");
		list.add("방콕");
		list.add("LA");
		
		// Arrays 클래스의 static<T> List<T> asList(T...a), 
		// java.util 패키지의 Arrays는 배열 처리에 관련된 다양한 메서드를 포함하고 있는 클래스, Arrays의 asList() 메서드는 인자로 전달한 데이터를 가지는 List 객체를 생성하여 반환, asList() 메서드의 인자 개수는 원하는 개수만큼 지정할 수 있슴
		// asList(T...a)는 T 타입의 인자값을 고정된 개수가 아니라 동적인 개수로 받을 수 있음을 의미
		List<String> list2 = Arrays.asList("서울", "뉴욕", "상해");
		print(12, list2);
		
		// boolean addAll(Collection<? Extends E> C), addAll() 메서드에 인자값으로 컬렉션을 전달하면 현재 컬렉션과 하나로 통합, list.addAll(list2)는 list에 list2의 데이터들을 추가
		list.addAll(list2);		print(13, list);
		
		// boolean containsAll(Collection<?> c), list에 list2의 내용이 포함되어 있는지 판단
		System.out.println("14 : " + list.containsAll(list2));
		
		// boolean retainAll(Collection<?> c), list에 list2의 데이터들만 남겨두고 나머지 데이터는 모두 삭제
		list.retainAll(list2);		print(15, list);
		
		// boolean removeAll(Collection<?> c), list에서 list2의 모든 내용을 삭제
		list.removeAll(list2);		print(16, list);	
	}
	
	
	// List의 데이터를 출력하기 위해 다음처럼 선언한 사용자 정의 메서드, 매개변수로 전달받은 n 값과 list의 데이터를 출력
	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}

}
