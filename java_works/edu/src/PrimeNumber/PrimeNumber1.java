package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("Number[0:exit]: ");
			int num = sc.nextInt();									
			if(num == 0) break;										
			if(isPrime(num) == true)							
				System.out.println(num + " is a Prime.");		
			else
				System.out.println(num + " is not a Prime.");
		}
		sc.close();	
		System.out.println("Done!");							
	}
	
	static boolean isPrime(int num) {
		if(num < 2) return false;
		
		//	1. 2 ~ N-1 까지 확인	
		for(int i = 2; i <= (int)(Math.sqrt(num)); i++ ) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
    public static boolean isPrimeAll(int num) {
    	int i = 1;
    	String s = String.valueOf(num);
    	
    	/* for 반복문으로 소수 검사, 입력 자리번째 숫자 검사 ~ 1의 자리수까지 숫자값 전체의 소수 검사 */
//    	for(int n = 0; n < s.length(); n++) {
//			if(!isPrime(num)) {
//				return false;				
//			} else {
//				System.out.println(num + "=>" + Integer.parseInt(s.substring(0, n+1)));
//			}
//    	}
    	
    	/* while 반복문으로 소수 검사, 입력 자리번째 숫자 검사 ~ 1의 자리수까지 숫자값 전체의 소수 검사 */
    	while(true) {
    		if(!isPrime(num)) {
    			return false;
    		}
    		if(s.length() < i) {
    			break;
    		}
    		System.out.println(num + " => " + Integer.parseInt(s.substring(0, i++)));
    	}
    	
        return true;
        
    }
	
}
