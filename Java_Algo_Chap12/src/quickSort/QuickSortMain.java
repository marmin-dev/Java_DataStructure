package quickSort;

import java.util.Arrays;

public class QuickSortMain {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] arr = new int[] {26,10,35,19,7,3,12};
		
		System.out.println("초기배열 : "+Arrays.toString(arr));
		qs.quick(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
