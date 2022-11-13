package bubbleSort;

public class BubbleSortEx {

	public static void main(String[] args) {
		final int arrSize = 100000;
		int[] arr = new int[arrSize];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i;
		}
		sort(arr);
	}
	public static void sort(int[] arr) {
		boolean sorter = false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorter = true;
				break;
			}
		}
		if(sorter == true) {
			System.out.println("정렬을 시작합니다");
			for(int i=1;i<arr.length;i++) {
				for(int j=0;j<arr.length-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1]= temp;
					}
				}
			}
		}else {
			System.out.println("이미 정렬된 배열입니다");
		}
	}
}
