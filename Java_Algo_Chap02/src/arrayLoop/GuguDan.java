package arrayLoop;

public class GuguDan {

	public static void main(String[] args) {
		int[][] gugu = new int[8][9];
		
		for(int i =0;i<8;i++) {	
			for(int j =0;j<9;j++) {
				gugu[i][j] = (i+2)*(j+1);
			}
		}
		for(int i=0;i<8;i++) {
			for(int j=0;j<9;j++) {
				if(j%3==0&&j!=0) {
					System.out.println((i+2)+"x"+(j+1)+"="+gugu[i][j]);
				}
				else {
					System.out.print((i+2)+"x"+(j+1)+"="+gugu[i][j]+" ");
				}
			}
			System.out.printf("\n\n");
			
		}
		

	}

}
