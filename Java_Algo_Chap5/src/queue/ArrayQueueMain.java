package queue;

public class ArrayQueueMain {
 public static void main(String[] args) {
	 ArrayQueue aQ = new ArrayQueue(5);
	 aQ.enqueue(1000);
	 aQ.enqueue(2000);
	 aQ.enqueue(3000);
	 aQ.enqueue(4000);
	 aQ.enqueue(5000);
	 aQ.printAll();
	 System.out.println(aQ.isFull());
	 System.out.println(aQ.dequeue());
	 System.out.println(aQ.dequeue());
	 System.out.println(aQ.dequeue());
	 System.out.println(aQ.dequeue());
	 System.out.println(aQ.dequeue());
	 System.out.println(aQ.isFull());
 }
}
