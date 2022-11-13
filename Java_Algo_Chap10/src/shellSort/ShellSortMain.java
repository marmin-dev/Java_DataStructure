package shellSort;

import java.util.Arrays;

public class ShellSortMain {

	public static void main(String[] args) {
		ShellSort ss = new ShellSort();
		int[] arr = new int[] {32,29,15,20,41,10,30,22,1};
		
		ss.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
