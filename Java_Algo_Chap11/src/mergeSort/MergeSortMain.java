package mergeSort;

import java.util.Arrays;

public class MergeSortMain {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] arr = new int[] {5,2,30,11,9,17,12,24};
		
		System.out.printf("초기배열 : %s\n",Arrays.toString(arr));
		ms.merge(arr, 0, arr.length-1);
		System.out.println("정렬왼료:  "+Arrays.toString(arr));
	}

}
