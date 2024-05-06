package chapter10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test05 {

	public static void main(String[] args) {
		// 데이터가 없는 빈 LinkedList를 생성한 후 add() 메서드로 데이터를 추가
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("서울");
		list.add("북경");
		list.add("상해");
		
		// list.size()는 list에 저장된 데이터의 개수를 반환하는 메서드, 저장된 데이터 개수만큼 반복 실행하면서 get() 메서드로 데이터를 추출
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}
		
		list.add(1, "LA");			print(1, list);				// list.add(1, "LA") 명령문은 인덱스 1에 해당하는 위치에 "LA"를 추가
		list.addFirst("런던");		print(2, list);				// list.addFirst() 메서드는 가장 첫 노드로 추가
		list.addLast("서울");			print(3, list);				// list.addLast() 메서드는 가장 마지막 노드로 추가
		
		list.offer("파리");			print(4, list);				// add(), addFirst(), addLast() 메서드와 동일하게 동작
		list.offerFirst("로마");		print(5, list);				// add() 메서드는 데이터를 추가할 때 문제가 발생하면 프로그램에서 오류가 발생
		list.offerLast("베른");		print(6, list);				// offer() 메서드는 데이터가 올바르게 추가되면 true, 그렇지 않으면 false 반환
		
		System.out.println("7 : " + list.peek());				// peek() 메서드는 데이터를 추출, 첫 번째 데이터를 추출
		System.out.println("8 : " + list.peekFirst());			// peekFirst() 메서드는 첫 번쨰 데이터를 추출
		System.out.println("9 : " + list.peekLast());			// peekLast() 메서드는 마지막 데이터를 추출
		
		list.poll();				print(10, list);			// poll() 메서드는 peek() 메서드처럼 데이터를 추출
		list.pollFirst();			print(11, list);			// peek() 메서드는 추출하는 데이터를 삭제하지 않지만, poll() 메서드는 추출하는 데이터를 리스트에서 삭제
		list.pollLast();			print(12, list);
		
		list.push("제주");			print(13, list);			// push() 메서드는 첫 번째 위치에 데이터를 추가
		System.out.println("14 : " + list.pop());				// pop() 메서드는 첫 번째 위치에 데이터를 추출
		
		System.out.println("15 : " + list.get(3));				// get() 메서드는 저장된 데이터를 추출
		System.out.println("16 : " + list.getFirst());			// getFirst() 메서드는 가장 처음에 위치한 데이터를 추출
		System.out.println("17 : " + list.getLast());			// getLast() 메서드는 가자 마지막에 위치한 데이터를 추출
		
		System.out.println("18 : " + list.indexOf("서울"));		// indexOf() 데이터가 위치한 인덱스를 찾는 메서드, 리스트의 앞에서부터 검색
		System.out.println("19 : " + list.lastIndexOf("서울"));	// LastIndexOf() 메서드는 뒤에서부터 검색
		
		list.removeFirst();			print(20, list);			// removeFirst() 메서드는 첫 번째 데이터를 삭제
		list.removeLast();			print(21, list);			// removeLast() 메서드는 마지막 데이터를 삭제
		list.remove(3);				print(22, list);			// remove(3) 메서드는 3번 인덱스에 위치한 데이터를 삭제
		list.remove("LA");			print(23, list);			// remove("LA")는 "LA" 데이터를 찾아서 삭제
		
		List<String> list2 = Arrays.asList("북경", "상해");		// Arrays.asList() 메서드는 인자로 전달한 값들을 가진 List 객체를 생성하여 반환
		list.addAll(list2);										// addAll(list2) 메서드는 인자로 전달한 list2의 모든 내용을 list에 추가
		
		Object obj[] = list.toArray();							// toArray() 메서드는 List 객체를 Object 타입의 일반 배열로 변환하여 반환
		System.out.println("24 : " + Arrays.toString(obj));
		
		String cities[] = new String[0];						// toArray() 메서드의 인자로 특정 타입의 배열을 전달하면 해당 타입의 배열로 List를 변환하여 반환
		cities = list.toArray(cities);
		System.out.println("25 : " + Arrays.toString(cities));
		
		list.removeAll(list2);		print(26, list);			// list에서 인자로 전달한 list2의 내용을 모두 삭제
	}
	
	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}

}
