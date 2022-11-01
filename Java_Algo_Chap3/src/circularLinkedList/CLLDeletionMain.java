package circularLinkedList;

public class CLLDeletionMain {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.append(11);
		cll.append(9);
		cll.append(27);
		cll.append(41);
		cll.append(3);
		
		System.out.println("원본 원형 단일 연결 리스트");
		cll.printAll();
		
		System.out.println("3제거");
		cll.delete(3);
		cll.printAll();
		
		System.out.println("11제거");
		cll.delete(11);
		cll.printAll();
		
		System.out.println("27제거");
		cll.delete(27);
		cll.printAll();
		

	}

}
