package basic_Algorithm;

public class Exam2 {

	public static void main(String[] args) {
		int min = maxValue(20,31,15,31,7);
		System.out.println("최댓값 = "+min);

	}
	public static int maxValue(int d1, int d2, int d3, int d4, int d5) {
		int min = d1;
		if(min<d2) {
			min = d2;
		}
		if(min<d3) {
			min = d3;
		}
		if(min<d4) {
			min = d4;
		}
		if(min<d5) {
			min = d5;
		}
		return min;
	}

}
