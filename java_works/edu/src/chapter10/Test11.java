package chapter10;

import java.util.HashSet;
import java.util.Iterator;

class User {

	String ssn;					// 주민번호
	String name;				// 이름
	
	User(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return ssn + " : "  + name;
	}
	
	@Override
	public int hashCode() {								// Object의 hashCode() 메서드를 오버라이딩, ssn 값을 int 타임으로 변환하여 반환
		return Integer.parseInt(ssn);
	}
	
	@Override
	public boolean equals(Object obj) {					// Object의 equals() 메서드를 오버라이딩
		boolean result = false;							// 반환값 저장하기 위해 result 변수 선언, false 초깃값 지정
		User u = (User) obj;							// 상위 메서드를 오버라이딩할 때는 선언부를 변경x -> 모든 매개변수를 Object 타입으로 받음,
														// Object 타입 -> User 타입, 원래 타입으로 변경
		if(this.ssn.equals(u.ssn)) {					// 현재 객체의 ssn 변숫값과 매개변수로 전달받은 ssn 변숫값이 같은지 비교
			result = true;								// 같으면 result 변수에 true 저장
		}
		return result;
	}
	
}

public class Test11 {

	public static void main(String[] args) {
		User u1 = new User("123", "김푸름");				// 두 User 객체의 hashCode 값은 같음 -> equals() 메서드 실행
		User u2 = new User("123", "김푸름");
		
		// new로 생성된 User 객체 u1, u2의 해시코드값이 다르게 부여, 데이터는 같지만 다른 객체로 처리
		HashSet<User> users = new HashSet<User>();
		
		users.add(u1);
		users.add(u2);
		
		Iterator<User> iter = users.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
