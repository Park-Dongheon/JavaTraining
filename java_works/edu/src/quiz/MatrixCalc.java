package quiz;
/*
 * M*N 행렬의 값을 랜덤으로 입력하고 가로 세로의 합을 출력하세요
 * 실행 예
	입력
		1	2	3
		4	5	6
		7	8	9
	출력
		1 + 2 + 3 = 6 		1 + 4 + 7 = 12
		4 + 5 + 6 = 15	 	2 + 5 + 8 = 15
		7 + 8 + 9 = 24		3 + 6 + 9 = 18
*/



import java.util.Scanner;												/*
																			Java에서 java.util 패키지는 유용한 유틸리티 클래스를 제공, 여기서 Scanner는 입력을 읽기 위한 클래스
																			import 문은 현재 파일이나 클래스에서 Scanner 클래스를 사용할 수 있도록 Java 컴파일러에게 알려줌 
																			그러면 코드 내에서 Scanner 클래스를 사용할 때마다 패키지 이름까지 모두 지정할 필요가 없어짐.
 																		*/

public class MatrixCalc {												// MatrixCalc라는 이름의 public 클래스를 정의, 접근 제어자가 public 이므로 다른 패키지에서 접근 가능 

	private int[][] matrix ;											// matrix 이름의 이차원 정수형 배열을 '선언', 여기서 private 접근 제어자는 해당 배열이 선언된 클래스 내부에서만 접근 가능,
																		// 아직 크기가 지정되지 않았으므로 배열에 데이터를 할당하거나 사용할 수 없음

	private void getMatrix() {											// getMatrix라는 이름의 private 메서드를 정의, 다른 클래스에서 메소드 접근 불가, 매개변수를 받지 않고 (void) 메소드가 값을 반환하지 않음
		Scanner sc = new Scanner(System.in);							// 표준 입력(System.in)에서 데이터를 읽기 위해 Scanner 객체를 생성하고 sc라는 변수에 할당, 
																		// Scanner는 Java에서 입력을 읽어오는 유틸리티 클래스, 표준 입력(Sysytem.in)은 콘솔 창에서 키보드로 입력한 데이터를 의미

		System.out.print("행을 입력하시요 : ");
		int n = sc.nextInt();											// Scanner 객체인 sc를 사용해 사용자로부터 정수형 데이터를 입력 받음,
																		// nextInt() 메서드는 Scanner 객체에서 입력데이터를 정수로 해석하고 그 값을 반환
																		// 입력 받은 정수값을 정수형 변수 n에 할당
		System.out.print("열을 입력하시요 : ");
		int m = sc.nextInt();											// 입력 받은 정수값을 정수형 변수 m에 할당


		matrix = new int[n][m];											// n행 m열인 이차원 정수형 배열을 '생성'하고, 변수 matrix에 할당
																		/*
																			new int[n][m]은 새로운 이차원 배열을 '생성',
																			첫 번째 차원은 n개의 요소, 두 번째 차원은 m개의 요소를 갖도록 지정 즉, 행의 개수 n·열의 개수 m
																			변수 matrix에 할당함으로써 크기가 n행 m열인 이차원 배열을 가리키는 참조 변수가 됨
																		 */


//		행렬 입력(무작위 random값(1~9) 입력)
		for(int i = 0; i < n; i++) {									// 바깥쪽 반복문, 행에 대한 루프, 0~(n-1)까지 반복
			for(int j = 0; j < m; j++) {								// 안쪽 반복문, 열에 대한 루프, 0~(m-1)까지 반복
				matrix[i][j] = (int) (Math.random() * 9)+1;				// matrix 배열의 각 요소를 (1~9)까지의 랜덤한 정수로 초기화,
																		/*
																			Math.random() 함수는 0이상 1미만의 double 값을 반환하며, 이를 9와 곱해서 0이상 9미만의 값을 만듬,
																			그 후에 1을 더하여 범위를 1부터 9까지로 조정, (int)로 강제 형변환하여 정수형으로 변환
																		 */
			}
		}
		sc.close();														// Sanner 객체 sc를 닫음, 입력스트림을 종료, 입력스트림을 닫지 않으면 메모리 누수가 발생
	}

	public void work(boolean flag) { 									// getMatrix라는 이름의 public 메서드를 정의, 다른 클래스에서 메소드 접근 가능, 매개변수가 하나의 boolean 타입 자료형의 인자값을 받아 flag라는 매개변수 이름에 저장,  (void) 값을 반환하지 않음
		if(flag) getMatrix();											// boolean 타입인 flag의 값이 true일 때, 해당 클래스의 내부에서만 동작 할 수 있는 == 접근 제어자가 private 
																		// getMatrix() 메소드를 호출한다 

		int n = matrix.length;											// 행의 개수 입력, 이차원 배열로 선언된 matrix의 첫 번째 차원의 크기가 행의 개수가 된다. 
		int m = matrix[0].length;										// 열의 개수 입력, matrix[0]은 이차원 배열 matrix 첫 번째 행,
																		// matrix[0].length - 각 행은 동일한 열의 개수를 갖기 때문에 첫 번째 행의 길이를 알면 모든 열의 길이를 알 수 있음


//		입력값 행렬 출력, n행 m열의 이차원 배열 matrix의 각 요소의 입력값을 출력 한다.
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");					// 이차원 배열의 각 요소를 줄바꿈 없이 출력
			}
			System.out.println();										// 각 행마다 열의 값이 출력된 후 다음 줄로 바꿈
		}
		System.out.println();


/*
		가로(열)의 합, 이차원 배열 matrix의 각 행마다 열의 합을 계산·출력
		바깥쪽 반복문 for(int i=0; i < n; i++) 행에 대한 루프, i변수는 현재 처리 중인 행의 인덱스
		안쪽 반복문 for(int j=0; j < m; j++) 해댕 행의 각 열에 대한 루프, j변수는 열의 인덱스
 */
		for(int i = 0; i < n; i++) {
			int sum = 0;												// 각 행의 합을 저장할 sum 변수를 0으로 초기화
			for(int j = 0; j < m; j++) {
				sum += matrix[i][j];									// 현재 행 i에서의 각 열 j의 값을 sum에 누적 합
			}
			System.out.println(i+1 + "행의 열의 총합 : " + sum);			// 각 행의 합을 출력, 행의 인덱스는 0부터 시작하므로 출력할 때 인덱스를 1씩 더해주고 합인 sum을 출력 
		}

		System.out.println();


/*
 		세로(행)의 합, 이차원 배열 matrix의 각 열마다 행의 합을 계산·출력
 		바깥쪽 반복문 for(int j=0; j < m; j++) 열에 대한 루프, 0~(m-1)까지 반복
 		안쪽 반복문, for(int i=0; i < n; i++) 행에 대한 루프, 0~(n-1)까지 반복
 */
		for(int j = 0; j < m ; j++) {
			int sum = 0;												// 각 열의 합을 저장할 sum 변수를 0으로 초기화
			for(int i = 0; i < n ; i++) {
				sum += matrix[i][j];									// 현재 열 j에서의 각 행 i의 값을 sum에 누적 합
			}
			System.out.println(j+1 + "열의 행의 총합 : " + sum);			// 각 열의 합을 출력, 열의 인덱스는 0부터 시작하므로 출력할 때 인덱스를 1씩 더해주고 합인 sum을 출력
		}
	}
}