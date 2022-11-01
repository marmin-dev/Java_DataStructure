package singly_linked_list;

public class SinglyLinkedList {
	
	private Node head;//첫 노드를 가리키는 head 변수를 null로 초기화
	
	public SinglyLinkedList() {
		this.head = null; // 생성자
	}
	
	SinglyLinkedList(int value){
		this.head = new Node(value,null); 
	}
	
	class Node{
		private int value; //노드 값
		private Node next; //노드 포인터
		
		public Node(int value,Node next) {
			this.value = value;
			this.next = next;
		}
		public int getValue() {
			return this.value;//노드 값 불러오는 Getter
		}
	}
	public Node getHead() {
		return this.head; //첫번째 노드의 포인터 불러오기
	}
	
	public void append(int value) {
		if(this.head == null) {
			this.head = new Node(value,null);
			return;
		}
		
		Node pointer = this.head;
		while(pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.next = new Node(value,null);
	}
	
	public void delete(int value) {
		Node pointer = this.head;
		if(pointer.getValue()==value) {
			Node removeNode = this.head;
			this.head = this.head.next;
			
			removeNode=null;
			return;
		}
		Node temp = pointer;
		//포인터 변수가 null이 아니면서 인자 값과 달라질 떄 까지 반복
		while(pointer != null && pointer.getValue() != value) {
			temp = pointer;
			pointer = pointer.next;
		}
		//마지막 노드를 삭제하는 경우
		if(pointer.next == null) {
			temp.next = null;
		}else {
			temp.next = pointer.next;
		}
		pointer = null;
	}
	
	
	
	
	public void printAll() { //전체 노드를 프린트하는 메서드
		Node pointer = this.head;
		
		StringBuilder builder = new StringBuilder();
		while(pointer.next !=null)
		{
			builder.append(pointer.getValue());
			builder.append("->");
			pointer = pointer.next;
		}
		builder.append(pointer.getValue());
		System.out.println(builder.toString());
	}

}
