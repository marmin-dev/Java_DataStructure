package deque;

public class LinkedDequeMain {

	public static void main(String[] args) {
		LinkedDeque ld = new LinkedDeque();
		ld.addFirst(12);
		ld.addFirst(32);
		ld.addFirst(24);
		ld.addFirst(18);
		ld.addLast(36);
		ld.addLast(28);
		System.out.println(ld.print());
		System.out.println(ld.removeFirst());
		System.out.println(ld.removeLast());

	}

}
