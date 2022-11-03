package recursive_2;

public class LoopFactorialEx {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	private static int factorial(int num) {
		int result = 1;
		for(int i =num;i>0;i--) {
			result *= i;
		}
		return result;
	}
}
