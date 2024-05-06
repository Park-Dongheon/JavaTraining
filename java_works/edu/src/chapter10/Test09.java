package chapter10;

import java.util.Map;
import java.util.TreeMap;

public class Test09 {

	public static void main(String[] args) {
		// 키와 밸류를 String으로 데이터를 저장하는 TreeMap을 생성
		TreeMap<String, String> users = new TreeMap<String, String>();
		
		// TreeMap에 데이터를 저장할 때는 루트 데이터의 키값부터 비교하기 시작, 비교하는 데이터의 키값보다 작으면 왼쪽, 그렇지 않으면 오른쪽을 선택하면서 저장할 위치를 결정
		users.put("20080319", "김푸름");
		users.put("20070620", "김하늘");
		users.put("20050817", "오정임");
		users.put("20120728", "김유빈");
		users.put("20120924", "김용빈");
		
		System.out.println(users);							// sysout(users.toString()); 명령문과 같음, TreeMap의 toString() 메서드 저장된 데이터의 키와 밸뷰를 문자열로 반환
		
		Map.Entry<String, String> entry = null;
		
		entry = users.firstEntry();							// firstEntry() 메서드는 TreeMap에서 가장 작은 키값을 갖는 Entry를 반환, 반환 타입은 Map.Entry<K, V>
		print("입사일자가 가장 빠른 사람 ", entry);
		
		entry = users.lastEntry();							// lastEntry() 메서드는 TreeMap에서 가장 큰 키값을 갖는 Entry를 반환
		print("입사일자가 가장 늦은 사람 ", entry);
		
		entry = users.lowerEntry("20121231");				// lowerEntry() 메서드는 인자로 전달한 키값 바로 이전의 키값을 가진 Entry를 찾아서 반환
		print("2012년도에 가장 늦게 입사한 사람 ", entry);

		entry = users.higherEntry("20120101");				// higherEntry() 메서드는 인자로 전달한 키값 바로 다음의 키값을 가진 Entry를 찾아서 반환
		print("2012년도에 가장 빠르게 입사한 사람 ", entry);
		
		while(!users.isEmpty()) {							// 저장된 Entry가 있을 때만 반복 실행
			entry = users.pollFirstEntry();					// pollFirstEntry() 메서드는 Map의 Entry 중 가장 작은 키값을 가진 Entry를 추출한 후 삭제
			print("퇴직한 사람", entry);
			System.out.println("남아있는 직원 수 : " + users.size());
		}
	}
	
	public static void print(String s, Map.Entry<String, String> entry) {				// Map.Entry<String, String>은 Map에 저장된 하나의 데이터 정보를 가진 객체
		System.out.println(s + " : " + entry.getKey() + " / " + entry.getValue());		// Map.Entry의 getKey() 메서드는 키값을, getValue() 메서드는 밸류를 반환
	}

}
