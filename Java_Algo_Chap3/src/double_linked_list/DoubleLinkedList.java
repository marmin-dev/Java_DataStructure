package double_linked_list;

public class DoubleLinkedList {
	
	private Node head;

	DoubleLinkedList(){
		this.head = null;
	}
	class Node {
		private int value;
		private Node prev;
		private Node next;
		
		Node(int value){
			this.value = value;
			this.prev = null;
			this.next = null;
		}
		Node(int value, Node prev, Node next){
			
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
		
		public int getValue() {
			return this.value;
		}
	}
	public void printPrevNode(int value) {
		if(this.head == null) {
			System.out.println("이중 연결 리스트가 비어 있습니다");
			return;
		}
		
		if(this.head.getValue() == value) {
			System.out.println(String.format("노드 %s의 앞 노드는 존재하지 않습니다", value));
			return;
		}
		Node pointer = this.head;
		while(pointer != null && pointer.getValue() != value) {
			pointer = pointer.next;
		}
		if(pointer == null) {
			System.out.println(String.format("노드 %s은 존재하지 않습니다.", value));
		}else {
			System.out.println(String.format("노드 %s의 앞 노드의 값은 %s 입니다",
					value,pointer.prev.getValue()));
		}
	}
	
	
}
