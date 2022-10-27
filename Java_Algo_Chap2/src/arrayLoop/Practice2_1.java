package arrayLoop;

import java.util.Scanner;

public class Practice2_1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++) {
			System.out.println((i+1)+"번째 숫자 입력");
			arr[i] = sc.nextInt();
			if(arr[i]<0) {
				System.out.println("양수를 입력하시오.");
				i -=1;
				continue;
			}
			sum += arr[i];
		}
		System.out.println("총합은 "+sum+"입니다");
		sc.close();
	}

}
