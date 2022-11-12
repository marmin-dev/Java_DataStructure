package binarySearchTree;

public class Node {
	
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public Object getValue() {
		return this.value;
	}
	
	private int getLeftNode(int[] arr, int index) {
		int findIndex = 2*index;
		if(arr.length<=findIndex) {
			return -1;
		}
		return arr[findIndex];
	}
	private int getRightNode(int[] arr, int index) {
		int findIndex = (2*index)+1;
		if(arr.length<=findIndex) {
			return -1;
		}
		return arr[findIndex];
	}
}
