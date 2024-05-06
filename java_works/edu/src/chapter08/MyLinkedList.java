package chapter08;

class LinkedList {				// LinkedList 클래스 선언, 멤버: head 필드, Node 클래스 선언, 멤버 모두 private로 외부에서 직접 접근x 

	// Node 타입의 head 필드 선언
	private Node head = null;
	
	
	// 내부 클래스 Node 선언, LinkedList 클래스 내에서만 사용
	private class Node {							// 힙에 Node의 data, link 필드가 생성
		// data, link 필드 선언
		private String data;
		private Node link;
		
		// Node(String) 생성자 선언
		public Node(String data) {					// Node(String) 생성자에 의해 "JAVA" 문자열이 data 필드에 저장
			this.data = data;
		}
	}
	
	// LinkedList 클래스의 add() 메서드가 실행할 때마다 내부 클래스 Node의 인스턴스를 생성
	public void add(String data) {					// "Java" 문자열이 매개변수 data에 저장
		Node newNode = new Node(data);				// 스택에 Node 타입의 newNode 변수가 생성, new Node(data) 명령문에 의해 새로운 Node 인스턴스 생성
													// 생성된 인스턴스의 주소는 newNode 변수에 저장, 새로 생성된 Node 인스턴스는 바로 이전에 생성된 Node의 link에서 참조
		if(head == null) {							// 객체 생성 후 head의 값을 판단, null이면 head 변수에 newNodw 변숫값을 저장
			head = newNode;
		} else {									// 현재 LinkedList의 head가 null 값이 아니므로 else 문 실행
			Node next = head;						// 새로운 Node 타입의 참조변수를 선언한 후 head값을 저장, next는 Node를 참조, Node의 link는 다른 노드 참조
			while(next.link != null) {				// next.link가 null이 아닐 때만 실행
				next = next.link;					// next.link의 값을 계속 가짐, 반복문 완료 시 next는 가장 마지막에 생성된 Node를 참조
			}
			next.link = newNode;					// 마지막 생성된 Node의 link에 생성된 인스턴스 값을 저장
		}
	}
/*	
	LinkedList의 head에는 첫 번째 생성된 Node(data:"JAVA", link:newNode)를 참조, 첫 번째 Node의 link는 두 번째 생성된 Node(data:"JSP", link:newNode)를 참조, 두 번째 생성된 Node의 link는 세 번째 생성된 Node를 참조
	세 번째 생성된 Node(data:"Servlet", link:null) 이후에는 새로 생성된 Node가 없으므로 link에 null이 저장
*/
	
	// LinkedList 인스턴스의 내부 객체인 Node의 data 값을 모두 출력
	public void print() {
		if(head == null) {							// head 값이 null인 경우 실행
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;						// head 값을 Node 타입의 next에 저장, head에는 처음 생성된 Node의 인스턴스의 참조값이 저장
			while(next != null) {					// next 변숫값이 null값이 아닌 때까지 반복 실행, next 변수는 LinkedList에서 생성된 Node를 참조하는 변수, null일 때는 마지막으로 생성된 Node를 참조
				System.out.println(next.data);		// next가 참조하는 Node 인스턴스의 data 필드값을 출력
				next = next.link;					// next.link는 현재 Node 다음에 생성된 Node를 참조, next를 다음 Node로 변경
			}
		}
	}
	
}

public class MyLinkedList {
	public static void main(String[] args) {
		// 스택에 참조변수 myList가 생성되고 힙에는 LinkedList 인스턴스가 생성됨, 생성된 인스턴스는 myList 변수가 참조
		LinkedList myList = new LinkedList();
		myList.print();
		
		myList.add("JAVA");					// add() 메서드 호출
		myList.add("JSP");					// add() 메서드 호출, 매개변수 data에 "JSP"가 저장, Node 인스턴스 생성 후 newNode 변수가 참조,
		myList.add("Servlet");				// add() 메서드 호출, "Servlet" 문자열을 전달
		myList.print();
	}
}
