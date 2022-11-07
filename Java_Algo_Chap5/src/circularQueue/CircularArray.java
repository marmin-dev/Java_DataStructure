package circularQueue;

public class CircularArray {
	private Object[] arr;
	private int front;
	private int rear;
	private int arrSize;
	
	public CircularArray(int arrSize) {
		this.arrSize = arrSize + 1;
		this.arr = new Object[this.arrSize];
	}
	public void enqueue(Object v) {
		if((rear+1)%arrSize == front) {
			throw new ArrayIndexOutOfBoundsException();
		}
		rear = (rear + 1)%arrSize;
		arr[rear] = v;
	}
	public Object dequeue() {
		if(empty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		front = (front + 1) % arrSize;
		Object value = arr[front];
		arr[front] = null;
		return value;
	}
	public boolean empty() {
		return front == rear;
	}
}
