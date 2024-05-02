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
		if(num <= 1) return false;


		//	1. 2 ~ N-1 까지 확인	
		for(int i = 2; i <= Math.sqrt(num); i++ ) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
    public static boolean isPrimeAll(int num) {
    	int i = 1;
    	String s = String.valueOf(num);
    	
    	while(true) {
    		if(!isPrime(num)) {
    			if(!isPrime(Integer.parseInt(s.substring(0,i++)))) {
    				return false;
    			}
    		 } else System.out.print(Integer.parseInt(s.substring(0,i++)) + ", ");
    		
    		if(s.length() < i) {
    			break;
    		}
    	}
        return true;
    }
	
}
