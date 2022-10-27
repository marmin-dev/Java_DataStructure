package arrayLoop;

import java.util.Scanner;

public class Practice02_5 {

	public static void main(String[] args) {
		System.out.println("소문자 입력하기");
		Scanner sc = new Scanner(System.in);
		char downer = sc.next().charAt(0);
		if(downer<96||downer>122) {
			System.exit(0);
		}
		int ascii = (int)downer - 32;
		char upper = (char)ascii;
		System.out.println(upper);
		sc.close();

	}

}
