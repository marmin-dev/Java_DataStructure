package arrayLoop;

import java.util.Arrays;

public class Practice02_4 {

	public static void main(String[] args) {
		int[] arr = {5,10,9,27,2,8,10,4,27,1};
		int[] result = new int[10];
		
		System.arraycopy(arr, 0, result, 0, arr.length);
		System.out.println(Arrays.toString(result));
		for(int i=0;i<result.length;i++) {
			for(int j=i+1;j<result.length;j++) {
				if(result[i]==result[j]) {
					result[j]=0;
				}
			}
		}
		System.out.println(Arrays.toString(result));

	}

}
