package binaryTreeEx;

public class BinaryTreeEx {
	private Node root;
	
	public void setRoot(Node node) {
		this.root = node;
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	//너비 우선 탐색(Breadth-First Search)
	public void bfs(Node root) {
		LinkedListQueue llq = new LinkedListQueue();
		llq.enqueue(root);
		
		while(!llq.empty()) {
			Node node = (Node)llq.dequeue();
			//System.out.println(node.getValue()+" ");
		}
	}
}
