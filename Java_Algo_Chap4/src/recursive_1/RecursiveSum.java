package recursive_1;

public class RecursiveSum {

	public static void main(String[] args) {
		System.out.println(sum(100));
	}
	private static int sum(int num) {
		if(num==1) {
			return num;
		}
		return num + sum(num-1);
	}
}
