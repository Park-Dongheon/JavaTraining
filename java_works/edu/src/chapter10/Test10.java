package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10 {

	public static void main(String[] args) {
		
		lotto_generator(5);										// lotto_generator() 메서드를 호출하면서 인자값으로 5를 전달, static으로 선언했으므로 객체 생성 없이 사용 가능
		
	}
	
	public static void lotto_generator(int n) {					// 매개변수 n에는 5가 저장
		Random number = new Random();							// 1~45 사이의 랜덤한 숫자를 선택하기 위해 Random 클래스 생성
		HashSet<Integer> lotto = null;							// Integer 타입의 값을 저장하는 HashSet을 참조할 lotto 지역변수를 선언 후 null 값으로 초기화
		for (int i = 0; i < n; i++) {							// 반복문 안에서 HashSet 객체를 생성, 변수 n의 값은 5이므로 5개의 HashSet 객체를 생성
			
			lotto = new HashSet<Integer>();
			
			for (int j = 0; lotto.size() <= 6; j++) {			// 각 HashSet에 저장되는 숫자의 개수만큼 반복, 6개의 숫자가 저장되어야 하므로 lotto.size()가 6이 될 때까지 반복 실행
				lotto.add(number.nextInt(45) + 1);				// lotto.add() 메서드는 HashSet에 새로운 데이터를 추가, (number.nextInt(45) + 1)는 0~44사이의 정수에 +1 더한 1~45사이의 정수 중 임의의 수 하나를 선택하여 반환,
																// 반환한 값이 HashSet(lotto)에 이미 저장된 값이라면 저장하지 않음 -> Set 컬렉션은 중복된 값을 저장할 수 없음
			}
			
			List<Integer> L = new ArrayList<Integer>(lotto);	// HashSet인 lotto를 초깃값으로 갖는 새로운 ArrayList를 생성
			Collections.sort(L);								// Collections.sort() 메서드는 인자로 전달한 List의 값을 오름차순 정렬, List 계열만 인자로 받음
			System.out.println(L);
			
		}
		
	}

}
