package singly_linked_list;

public class SLLDeletionMain {

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.append(85);
		singlyLinkedList.append(59);
		singlyLinkedList.append(70);
		singlyLinkedList.append(23);
		singlyLinkedList.append(65);
		
		System.out.println("원본 단일 연결 리스트 : ");
		singlyLinkedList.printAll();
		
		singlyLinkedList.delete(85);
		singlyLinkedList.printAll();
		
		singlyLinkedList.delete(59);
		singlyLinkedList.printAll();
		
		singlyLinkedList.delete(70);
		singlyLinkedList.printAll();
		
		singlyLinkedList.delete(23);
		singlyLinkedList.printAll();
		
		singlyLinkedList.delete(65);
		singlyLinkedList.printAll();

	}

}
