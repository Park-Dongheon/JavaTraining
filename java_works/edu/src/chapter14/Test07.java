package chapter14;

// String 타입 인자를 받아 String 타입으로 반환하는 추상 메서드 modify()가 선언된 함수형 인터페이스 StringFunc 선언
interface StringFunc {
	// String을 반환하는 메서드
	String modify(String s);
}

public class Test07 {
	
	// test() 메서드 선언부, 첫 번재 매개변수 타입: 함수형 인터페이스 StringFunc, 구현한 람다식을 전달, test() 메서드는 람다식을 실행한 후 반환된 값을 다시 반환
	static String test(StringFunc sf, String s) {
		// 매개변수로 전달받은 modify() 메서드를 호출하면서, test() 메서드의 두 번째 매개변수로 받은 s값을 전달
		return sf.modify(s);
	}

	public static void main(String[] args) {
		
		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		
		// 람다식의 매개변수 s를 선언, StringFunc의 modify() 메서드 호출 시 전달받은 인자값을 매개변수 (s)에 저장
		StringFunc sf1 = (s) -> {
			// 람다식의 본문
			String result = "";
			char c;
			for(int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if(c == ',')
					result += " ";
				else
					result += c;
			}
			return result;
		};
		
		// test() 메서드를 호출, 첫 번째 인자는 람다식 sf1, 두 번째 인자는 문자열 str을 전달
		String s1 = test(sf1, str);
		System.out.println(s1);
		
		// String s2 = test() 명령문, test() 메서드의 인자값으로 "test(람다식.str)"을 전달하고 있는 형식,
		// 첫 번째 인자로 전달하는 람다식은 콤마(,)를 기준으로 s 문자열을 나눈 후 String[] 배열 word에 저장
		// word 배열에 저장된 단어 개수만큼 반복문 실행, max 변수에 가장 긴 문자열이 저장
		// 가장 긴 문자열이 저장된 배열의 인덱스를 index 변수에 저장해서 반복문 완료 후 해당 인덱스에 저장된 문자열, word 배열 중 길이가 가장 긴 단어
		String s2 = test((s) -> {
			int max = 0;
			int index = 0;
			String[] word = s.split(",");
			for(int i = 0; i < word.length; i++) {
				if(max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];
		},str);
		System.out.println(s2);
		
	}

}
