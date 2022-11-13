package queue;



public class LinkedListMain {

	public static void main(String[] args) {
		LinkedListQueue llq = new LinkedListQueue();
		llq.enqueue(1000);
		llq.enqueue(2000);
		llq.enqueue(3000);
		llq.enqueue(4000);
		llq.enqueue(5000);
		
		llq.printAll();
		
		System.out.println(llq.dequeue());
		System.out.println(llq.dequeue());
		System.out.println(llq.dequeue());
		System.out.println(llq.dequeue());
		System.out.println(llq.dequeue());
		

	}

}
