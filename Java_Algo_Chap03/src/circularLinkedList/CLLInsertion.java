package circularLinkedList;

public class CLLInsertion {
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.append(11);
		cll.append(9);
		cll.append(27);
		cll.append(41);
		cll.append(3);
		
		System.out.println("원형 단일 연결 리스트");
		cll.printAll();
	}
}
