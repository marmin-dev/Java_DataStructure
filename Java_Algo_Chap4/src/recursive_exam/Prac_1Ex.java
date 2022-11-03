package recursive_exam;

import java.util.Scanner;

public class Prac_1Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑수를 입력해주세요");
		int x = sc.nextInt();
		System.out.println("지수를 입력해주세요");
		int n = sc.nextInt();
		System.out.println(pow(x,n));
		sc.close();
	}
	public static int pow(int x,int n) {
		if(n==1) {
			return x;
		}
		return x * pow(x,n-1);
	}
}
