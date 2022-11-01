package double_linked_list;

public class DLLInsertionMain {

	public static void main(String[] args) {
		
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.append(1);
		dll.append(3);
		dll.append(2);
		dll.append(20);
		dll.append(19);
		
		System.out.println("이중 연결 리스트 : ");
		
		dll.printAll();
		dll.printPrevNode(2);
		dll.printPrevNode(1);
		dll.printPrevNode(19);
	}

}
