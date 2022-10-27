package arrayLoop;

import java.util.Random;

public class Chapter3_loop_4_1 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		final int ARRAY_LENGTH = 10;
		
		int[] arr = new int[ARRAY_LENGTH];
		for(int i=0; i<ARRAY_LENGTH;i++) {
			boolean isPrimeNumber = true;
			int randomValue = rand.nextInt(ARRAY_LENGTH);
			
			if(randomValue == 1) {
				continue;
			}
			
			if(randomValue == 2) {
				arr[i] = randomValue;
				continue;
			}
			
			for(int j =2; j< randomValue; j++) {
				if(randomValue % j ==0) {
					isPrimeNumber = false;
					break;
				}
			}
			
			if(isPrimeNumber) {
				arr[i] = randomValue;
			}
		}
		
		System.out.println("[배열에 저장된 소수]");
		
		for(int k:arr) {
			if(k>0) {
				
				System.out.println(k);
			}
		}

	}
}
