package arrayLoop;

public class chapter3_mutltiArray_2 {

	public static void main(String[] args) {
		int[][] fruitMarket = new int[][] {
			{10000,20000,12000},
			{8000,3000,15000},
			{20000, 15000, 38000},
			{13000, 20000, 30000},
			{30000, 12000, 20000},
			{35000, 30000, 25000},
			{50000, 23000, 10000}
		};
		int total = 0;
		int apple = 0;
		int grape = 0;
		int orange = 0;
		
		for(int i=0; i<fruitMarket.length;i++) {
			for(int j =0; j<fruitMarket[i].length;j++) {
				if(j == 0) {
					apple += fruitMarket[i][j];
				}else if(j ==1) {
					grape += fruitMarket[i][j];
				}else {
					orange += fruitMarket[i][j];
				}
				total += fruitMarket[i][j];
			}
		}
		System.out.println(total);
		System.out.println(apple/fruitMarket.length);
		System.out.println(grape/fruitMarket.length);
		System.out.println(orange/fruitMarket.length);

	}

}
