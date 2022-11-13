package insertionSort;

import java.util.Arrays;

public class InsertionSortMain {

	public static void main(String[] args) {
		InsertionSort iS = new InsertionSort();
		
		int[] arr = new int[] {7,2,9,3,1};
		iS.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
