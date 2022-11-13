package recursive_3;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int num = sc.nextInt();
		System.out.printf("피보나치 수열 : ");
		
		for(int i =0; i< num;i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}
	private static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n -1) + fibonacci(n-2);
	}
}