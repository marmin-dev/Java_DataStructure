package shellSort;

import java.util.Arrays;

public class ShellSort {
	public void sort(int[] arr) {
		int length = arr.length;
		
		System.out.println(String.format("초기 배열: %s \n",
				Arrays.toString(arr)));
		
		for(int gap = length/2;gap>0;gap/=2) {
			System.out.printf("간격 %s로 배열을 나눕니다.\n",gap);
			for(int startIndex = 0; startIndex<gap;startIndex++) {
				this.insertionSortByGap(arr, gap, startIndex);
			}
		}
		System.out.println("----");
	}
	private void insertionSortByGap(int[] arr,int gap, int startIndex) {
		for(int i = startIndex+gap;i<arr.length; i+=gap) {
			int j;
			int temp =arr[i];
			
			for(j=i - gap; j>=0 && arr[j]>temp;j-=gap) {
				arr[j + gap] = arr[j];
			}
			arr[j + gap] = temp;
		}
		System.out.printf("정렬 진행 후 배열: %s\n",Arrays.toString(arr));
	}
}
