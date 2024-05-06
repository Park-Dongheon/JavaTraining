package chapter10;

import java.util.HashMap;

public class Test06 {

	public static void main(String[] args) {
		
		String word[] = {"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
		String meaning[] = {"꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};
		
		// String 타입의 키와 String 타입의 밸류(값)를 저장할 수 있는 HashMap을 생성
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// dic.put() 메서드는 HashMap에 데이터를 저장, 인자값으로 전달한 word[i]는 키값, meaning[i]는 밸류로 저장 
		for (int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]);
		}
		
		System.out.println(dic);										// dic을 출력 -> dic.toString() 메서드가 호출되어 반환한 문자열을 출력
		System.out.println(dic.size());									// 4, dic.size() 메서드는 HashMap에 저장된 데이터의 수를 반환
		
		System.out.println(dic.keySet());								// [HEAVEN, BUMBLEBEE, WONDER, ALTHOUGH], keySet() 메서드는 HashMap의 키값들만 추출하여 컬렉션 형태로 반환
		System.out.println(dic.values());								// [천국, 꿀벌과에 속하는 호박벌, 호기심이 들다, 그럼에도 불구하고], values() 메서드는 밸류만 추출하여 컬렉션 형태로 반환
		
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));			// get() 메서드는 HashMap에 저장된 데이터를 추출하는 메서드, 키값을 인자로 전달
		dic.replace("HEAVEN", "아주 행복한 감정");							// replace() 메서드는 첫 번째 인자의 키값에 해당하는 밸류("천국")를 -> 두 번째 인자의 내용("아주 행복한 감정")으로 변경
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.put("HEAVEN", "이상적인 세상");									// put() 메서드는 HashMap에 데이터를 추가하는 메서드, 기존에 동일한 키의 데이터가 있었다면 새로운 값으로 대치
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		
		System.out.println(dic.containsKey("BUMBLEBEE"));				// true, containsKey() 메서드는 인자로 전달한 키가 있는지 판단
		System.out.println(dic.containsValue("자장가"));					// false, containsValue() 메서드는 인자로 전달한 밸류가 있는지 판단
		
		dic.remove("HEAVEN");											// remove() 메서드는 인자로 전달한 키에 해당하는 데이터를 찾아 삭제
		System.out.println(dic.containsKey("HEAVEN"));					// false
		
		dic.clear();													// clear() 메서드는 HashMap에 저장된 데이터를 모두 삭제
		System.out.println(dic.isEmpty());								// true
		System.out.println(dic.size());									// 0
	}

}
