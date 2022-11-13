package recursive_exam;

public class Prac_2Ex {

	public static void main(String[] args) {
		starTree(5);
	}
	public static void starTree(int n) {
		for(int i=0;i<n;i++) {
			for(int j = n-1; j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
	}
}
