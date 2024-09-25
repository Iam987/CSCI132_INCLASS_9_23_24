
public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.fillLinkedList();
		dll.printLinkedList();
		System.out.println();
		System.out.println();
		dll.insert(new Node("BIL", "Billings"), 3);
		dll.insert(new Node("SLC", "Salt Lake City"), 6);
		dll.printLinkedList();
		System.out.println();
		System.out.println();
		dll.printLinkedListReversed();
		
		
		/*dll.remove("LAX");
		dll.remove("ORD");
		System.out.println();
		System.out.println();
		dll.printLinkedList();
		dll.remove(1);
		System.out.println();
		System.out.println();
		dll.printLinkedList();*/
	}

}
