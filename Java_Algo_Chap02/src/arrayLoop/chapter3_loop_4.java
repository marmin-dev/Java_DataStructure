package arrayLoop;

import java.util.Arrays;

public class chapter3_loop_4 {

	public static void main(String[] args) {
		//식 검증 필요한 사항
		final int array_len = 10;
		
		int[] arr1 = new int[array_len];
		
		for(int i =0; i<10; i++) {
			
			arr1[i] = (int)((Math.random()*98)+1);
			
			if(arr1[i]==1) {
				break;
			}
			
			if(arr1[i]%2==0) {
				i-=1;
			}
			
			for(int j=3; j<arr1[i]; j++) {
				if(arr1[i]%j==0) {
					break;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr1));
	}
	
}