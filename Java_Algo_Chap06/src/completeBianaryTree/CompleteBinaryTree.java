package completeBianaryTree;

public class CompleteBinaryTree {
	public void printAll(int[] arr) {
		for (int i=1;i<arr.length;i++) {
			int leftNode = this.getLeftNode(arr, i);
			int rightNode = this.getRightNode(arr, i);
			
			if(leftNode > -1) {
				System.out.printf("%d의 왼쪽 자식 노드는 %d\n",arr[i],
						leftNode);
			}
			if(rightNode > -1) {
				System.out.printf("%d의 오른쪽 자식의 노드는 %d\n",arr[i],
						rightNode);
			}
		}
	}
	private int getLeftNode(int[] arr, int index) {
		int findIndex = 2 * index;
		if(arr.length <= findIndex) {
			return -1;
		}
		return arr[findIndex];
	}
	
	private int getRightNode(int[] arr, int index) {
		int findIndex =(2*index) + 1;
		if(arr.length <= findIndex) {
			return -1;
		}
		
		return arr[findIndex];
	}
	
}
