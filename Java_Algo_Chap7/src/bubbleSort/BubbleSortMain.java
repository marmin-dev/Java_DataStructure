package bubbleSort;

import java.util.Arrays;

public class BubbleSortMain {

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		
		int[] arr = new int[] {4,3,2,5,6,7,8,11,32,26};
		bs.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
