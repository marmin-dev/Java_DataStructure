package binaryTreeEx;

public class LinkedListQueue {
	private Node front = null;
	private Node rear = null;
	private Node peek = null;
	
	private class Node{
		private Object value;
		private Node next;
		
		public Node(Object value) {
			this.value = value;
		}
		
		private Object getValue() {
			return this.value;
		}
	}
	
	public void enqueue(Object value) {
		if(front == null) {
			front = new Node(value);
			peek = front;
			rear = front;
		}else {
			rear.next = new Node(value);
			rear = rear.next;
		}
	}
	
	public Object dequeue() {
		Object value = peek.getValue();
		Node temp = front;
		front = front.next;
		peek = front;
		temp = null;
		return value;
	}
	
	public Object peek() {
		return this.peek.getValue();
	}
	
	public boolean empty() {
		return peek == null;
	}
	
	public void printAll() {
		while(peek!=rear) {
			System.out.println(peek.getValue());
			peek = peek.next;
		}
		peek = front;
	}
}
