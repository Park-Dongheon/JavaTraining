package edu;

public class Test28 {
	public static void main(String[] args) {
		
		int cnt = 0;
		while(true) {
			System.out.println("OK");
			cnt = cnt + 2;
			if(cnt == 10) {
				break;
			}
		}
		
		for(int j = 0; j < 10; j++) {
			if((j % 2) == 0) continue;
				System.out.println(j);
		}
	
	}
}