package double_linked_list;

public class DLLDeletionMain {

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.append(1);
		dll.append(3);
		dll.append(2);
		dll.append(20);
		dll.append(19);
		
		System.out.println("원본 이중 연결 리스트");
		dll.printAll();
		
		dll.delete(1);
		System.out.println("1제거");
		dll.printAll();

		dll.delete(2);
		System.out.println("2제거");
		dll.printAll();
		
		dll.delete(19);
		System.out.println("19제거");
		dll.printAll();
	}

}
