package circularQueue;

public class CircularArrayMain {

	public static void main(String[] args) {
		CircularArray queue = new CircularArray(5);
		queue.enqueue("사과");
		queue.enqueue("바나나");
		queue.enqueue("딸기");
		queue.enqueue("귤");
		queue.enqueue("배");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		

	}

}
