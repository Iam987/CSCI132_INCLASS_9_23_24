
public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.fillLinkedList();
		dll.printLinkedList();
		System.out.println();
		System.out.println();
		System.out.println();
		dll.insert(new Node("BIL", "Billings"), 3);
		dll.insert(new Node("SLC", "Salt Lake City"), 6);
		dll.printLinkedList();
		dll.remove("LAX");
		System.out.println();
		System.out.println();
		dll.printLinkedList();
	}

}
