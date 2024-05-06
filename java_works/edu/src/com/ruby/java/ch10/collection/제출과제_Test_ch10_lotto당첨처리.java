package com.ruby.java.ch10.collection;
//구현과제로 실습
//hashset을 arraylist로 변환하여 정렬하기 구현

/*
* 로또 당첨 규칙:
* 꽝: 번호 2개, 1개
* 5등: 번호 3개 - 5000원
* 4등: 번호 4개 - 5만원
* 3등: 번호 5개 - 150만원 - 판매금액에 변동(판매금액의 12.5%)
* 2등: 3등번호 + 보너스번호 - 3000만원 - 판매 금액에 변동, 당첨 확률: 1,300,000분의1
* 1등: 6개 숫자 - 당첨 확률 8,000,000 분의 1, 10억 ~ 30억
*/
//hashset을 arraylist로 변환하여 정렬하기 구현
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class ListComparator implements Comparator<List<Integer>>{					// 비교, Comparator 인터페이스 클래스 사용
	@Override
	public int compare(List<Integer> l1, List<Integer> l2) {
		Iterator<Integer> ait = l1.iterator();
		Iterator<Integer> bit = l2.iterator();
		while (ait.hasNext()) {
			int anum = ait.next();int bnum = bit.next();
			if ( anum > bnum) return 1;
			else if (anum < bnum) return -1;
			
		}
		return 0;
	}
}

public class 제출과제_Test_ch10_lotto당첨처리 {

	public static void main(String[] args) {

		lotto_generator(10);

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<HashSet<Integer>> lot = new HashSet<>();				// 여러장의 로또 번호는 같은 숫자의 집합을 가질 수 없음, lot는 10,000장 복권
		HashSet<Integer> lotto = null;									// 복권 	1장
		List<List<Integer>> al = new ArrayList<>();
		/*
		 * [[35, 40, 27, 29, 14, 31, 15], [0, 1, 18, 38, 6, 24, 29],
		 *  [16, 32, 0, 18, 34, 22, 14], [32, 34, 40, 9, 12, 28, 14],
		 *  [0, 19, 6, 9, 42, 29, 13], [2, 3, 37, 43, 44, 29, 14],
		 *  [33, 1, 17, 22, 6, 8, 12], [34, 21, 9, 10, 27, 44, 45], [18, 34, 23, 9, 28, 29, 15],
		 *  [32, 6, 23, 24, 10, 27, 43]]
		 */
		
		for (int i = 0; i < n; i++) {						// n = 10,000이면 lot 변수가 10,000개 복권 갖고 있어야함

			//구현할 부분
			/*
			   새로운 HashSet<Integer> 객체 생성, lotto 변수가 참조, HashSet에 사이즈가 0~5 총 6개의 Random한 요소값을 저장,
			   HashSet<HashSet<Integer>> 타입의 lot에 HashSet<Integer> 타입인 lotto를 추가한다.
			*/
			lotto = new HashSet<Integer>();					// 복권 1장
			for (int j = 0; lotto.size() < 6; j++) {
				lotto.add(number.nextInt(45) + 1);
			}
			System.out.println(lotto);
			lot.add(lotto);
		}
		
		System.out.println("\nlot hashset을 출력\n");
		for (HashSet<Integer> eachLotto : lot) {
			/*
			 * 33  1 17 22  6  8  + 보너스번호: 12
			 *  0  1 18 38  6 24  + 보너스번호: 29
			 */
			//구현할 부분 - ArrayList 사용
			/*
			   HashSet 컬렉션 객체인 eachLotto를 iterator() 메서드를 이용해 Iterator 객체로 변환하여 반환함, 
			   iterator() 메서드는 Collection 인터페이스에서 선언한 메서드이므로 List, Set 계열의 모든 컬렉션에서 사용 가능
			   iter.hasNext()는 현재 커서 다음에 데이터가 존재하는지 판단 후 iter.next() 메서드로 커서 다음의 데이터를 반환하고 커서를 다음 데이터로 이동
			   eachLotto 컬렉션의 데이터를 순차적으로 접근하여 출력
			*/
			Iterator<Integer> iter = eachLotto.iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next() + " ");
			}
			// 보너스 번호를 중복되지 않게 추가
			int bonus = 0;
			for(int k = 0; k < 1; k++) {					// 보너스 번호 1나만 추가
				bonus = number.nextInt(45) + 1;				
				if(!eachLotto.contains(bonus)) {			// eachLotto의 요소 중 bonus 번호를 포함하지 않으면 반복
					eachLotto.add(bonus);
				}
			}
			System.out.println("+ 보너스번호 [" + bonus + "]");
			/*
			   al은 List<List<Integer>> 타입의 리스트, al에는 List<Integer> 타입의 요소만 추가, 
			   HashSet<Integer> eachLotto 변수는 List<Integer> 타입이 아니므로 직접 추가x -> (eachLotto) HashSet 컬렉션을 받아 ArrayList 객체로 새로 생성, 
			   List<Iteger> 타입의 eachLottoList를 변수에 객체를 저장하여, List<List<Integer>> 타입 al에 추가
			*/
			List<Integer> eachLottoList = new ArrayList<>(eachLotto);
			al.add(eachLottoList);
		}
		
		System.out.println("복권 정렬전::lot = " + al);
		
		al.sort(new ListComparator());
		System.out.println("복권 정렬후::lot = " + al);
		//hashset의 리스트를 정렬하는 알고리즘 개발
		//hashset를 arrayList로 변환
		//당첨번호 추첨
		HashSet<Integer> win = new HashSet<>();
		for (int j = 0; win.size() < 7; j++) {//6개 번호 set에 넣음 중복체크, 보너스 번호 별도
			win.add(number.nextInt(46));
		}
		System.out.print("당첨번호: " + win);//6개의 당첨번호와 보너스번호
		// 6개를 맞힌 복권을 찾는다 
		System.out.println();
		winnerLotto(win, al);//1등을 찾는다
		
	}

	static void winnerLotto(HashSet<Integer> w, List<List<Integer>> al ) {
		// 당첨번호 w에 대하여 발행된 복권 리스트 al의 모든 원소 elem에 대하여 조사한다
		for (int i = 0; i < al.size(); i++) {
			//구현할 부분
			// al의 각 요소를 추출하여 List<Integer> 타입의 elem로 변환
			// 당첨번호 체크 checkWinner() 메서드 호출
			List<Integer> elem = al.get(i);
			checkWinner(w, elem);
		}
	}
	static void checkWinner(HashSet<Integer> w, List<Integer> elem) {
		// 당첨번호 w의 각 숫자를 꺼내 복권 엔트리에 포함되어 있는지를 조사
		// HashSet 컬렉션 타입 당첨번호 w를 List 타입의 L로 변환
		List<Integer> L = new ArrayList<>(w);
		int count = 0;
		for (int i = 0; i < L.size()-1; i++)
		{
			/*
			 * 당첨번호 각 번호를 몇개 포함하는지를 elem에 대하여 조사
			 */
			//구현할 부분
			/*
			   L 요소가 매개변수 List<Integer> 타입의 elem의 요소에 포함되는지 확인  
			   있을경우 count 값 1증가
			*/
			if(elem.contains(L.get(i))) {
				count++;
			}
		}
		switch (count) {
		case 0:
		case 1:
		case 2:
			System.out.println("꽝");
			break;
		case 3:
			System.out.println("5등 복권 " + elem + " 당첨번호:" + w);
			break;
		case 4:
			System.out.println("4등 복권 " + elem + " 당첨번호:" + w);
			break;
		case 5:
			if (L.get(6).equals(elem.get(6))) { //보너스 번호가 일치하는 지를 조사 
				System.out.println("2등 복권 " + elem + " 당첨번호:" + w);
				break;
			}
			else {
				System.out.println("3등 복권 " + elem + " 당첨번호:" + w);
				break;
			}
			
		case 6:
			System.out.println("1등 복권 " + elem + " 당첨번호:" + w);
			break;
		}


	}
}