package recursive_1;

public class Sum1to100 {

	public static void main(String[] args) {
		System.out.println(sum(100));
	}
	private static int sum(int num) {
		int result = 0;
		for(int i =1;i<=num;i++) {
			result += i;
		}
		return result;
	}

}
