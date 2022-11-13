package binarySearchTree;
//package binarySearchTree;
//
//public class BinarySearchTree {
//	/*
//	 * 재귀 함수를 사용하는 방법
//	 */
//	
//	public Node search(Node root, int value) {
//		if(root == null) {
//			return null;
//		}else if(root.getValue() == value) {
//			return root;
//		}else if(root.getValue() > value) {
//			return search(root.getLeftChild(),value);
//		}else {
//			return search(node.getRightChild(),value);
//		}
//	}
//	/*
//	 * 반복문을 사용하는 방
//	 */	
//	public Node search(int value) {
//		if(this.root == null) {
//			return null;
//		}
//		
//		Node target = this.root;
//		while(target != null && target.getValue() != value) {
//			if(target.getValue() > value) {
//				target = target.getLeftChild();
//			}else {
//				target = target.getRightChild();
//			}
//		}
//		return target;
//	}
//	
//}
