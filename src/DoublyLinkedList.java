import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void fillLinkedList() {
		
		try {
			Scanner input = new Scanner(new FileReader("airports.txt"));
			
			while(input.hasNext()) {
				String line = input.nextLine();
				String[] values = line.split(",");
				String code = values[0];
				String city = values [1];
				
				Node newNode = new Node(code, city);
				insert(newNode, this.size + 1);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
	}

	public void insert(Node newNode, int n) {
		if(size == 0) { //insert into empty LL
			head = newNode;
			tail = newNode;
		}
		else if(n == 1) { //insert at the beginning
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;		
		}
		else if(n == size + 1) {//insert at the end
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		}
		else {	//insert somewhere in the middle
			Node current = head;
			for(int i = 0; i < n - 1; i++) {
				current = current.getNext();
			}
			Node prevNode = current.getPrev();
			current.setPrev(newNode);
			newNode.setNext(current);
			prevNode.setNext(newNode);
			newNode.setPrev(prevNode);
		}
		size++;
	}
	public void printLinkedList() {
		Node current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public void remove(String search) {
		Node current = head;
		while(current != null) {
			if(current.getCode().equals(search)) {
				if(current == head) {
					head = current.getNext();
					head.setPrev(null);
				}
				else if(current == tail) {
					tail = current.getPrev();
					tail.setNext(null);
				}
				else {
					
				}
			}
			current = current.getNext();
		}
	}
	
}
