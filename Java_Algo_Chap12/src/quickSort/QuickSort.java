package quickSort;

public class QuickSort {
	public void quick(int[] arr, int left, int right) {
		if(left>=right) {
			return;
		}
		int l = left;
		int r = right;
		
		//배열의 가운데 요소를 pivot으로 잡는다
		int pivot = arr[(left + right)/2];
		System.out.println("pivot의 값: "+pivot);
		
		while(l<r) {
			while(arr[l]<pivot) {
				l++;
			}
			while(arr[r]>pivot) {
				r--;
			}
			while(l>=r) {
				break;
			}
			if(arr[l]==pivot && arr[r]==pivot) {
				l++;
				continue;
			}
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
		}
		// pivot 기준으로 좌, 우측 부분 리스트로 정렬
		quick(arr,left,l-1);
		quick(arr,l+1,right);
		
	}
}
