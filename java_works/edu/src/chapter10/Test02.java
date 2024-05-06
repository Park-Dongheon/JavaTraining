package chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-".repeat(50));
		
		// iterator() 메서드는 컬렉션 객체를 Iterator 객체로 변환하여 반환, iterator() 메서드는 List와 Set에서 상속하고 있는 Collection 인터페이스에서 선언한 메서드, List．Set 계열의 모든 컬렉션에서 사용 가능
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {						// hasNext()는 현재 커서 다음에 데이터가 존재하는지 판단, 커서 다음에 데이터가 있다면 true, 없다면 false를 반환
			System.out.println(iter.next());		// next()는 커서 다음의 데이터를 반환하고 커서를 다음 데이터로 이동
		}
	}

}
