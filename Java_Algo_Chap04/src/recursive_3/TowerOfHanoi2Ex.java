package recursive_3;

import java.util.Scanner;

public class TowerOfHanoi2Ex {

	public static void main(String[] args) {
		System.out.println("원반의 개수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int disks = sc.nextInt();
		
		System.out.println("[결과] ");
		topOfHanoi(disks, "A", "B", "C");
		
	}
	public static void topOfHanoi(int disks, String begin, String middle,
			String end) {
		if(disks == 1) {
			System.out.println(String.format("1번 원반을 %s기둥으로 옮깁니다", end));
			return;
		}
		
		topOfHanoi(disks -1, begin, end, middle);
		System.out.println(String.format("%s번 원반을 %s번 기둥으로 옮깁니다", disks, end));
		topOfHanoi(disks -1, middle, begin, end);
	}
}
