package arrayLoop;

public class Practice02_2 {

	public static void main(String[] args) {
		int[] arr = {10,11,2,5,3,3,24,15,6,9};
		int min = arr[0],max = arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 : "+min +"최솟값 : "+max);
	}

}
