package arrayLoop;

public class Practice02_3 {

	public static void main(String[] args) {
		int[] arr1 = {1,3,2};
		int[] arr2 = {2,3,1};
		equals(arr1, arr2);
		
	}
	public static void equals(int[] arr1,int[]arr2) {
		int truth = 0; //true finder
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					truth++;
				}
			}
		}
		if(truth == arr1.length && truth==arr2.length) {
			System.out.println("일치");
		}
		else {
			System.out.println("불일치");
		}
	}

}
