package selectionSort;

import java.util.Arrays;

public class SelectionSortMain {

	public static void main(String[] args) {
		SelectionSort sS = new SelectionSort();
		int[] arr = new int[] {2,8,0,5,7};
		sS.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
