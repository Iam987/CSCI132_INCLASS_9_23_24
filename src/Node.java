
public class Node {
	
	private String code;
	private String city;
	
	private Node next;
	private Node prev;
	
	public Node(String c, String city) {
		this.code = c;
		this.city = city;
		this.next = null;
		this.prev = null;
	}
	
	
	public Node getNext() {
		return this.next;
	}
	public Node getPrev() {
		return this.prev;
	}
	public void setNext(Node n) {
		this.next = n;
	}
	public void setPrev(Node n) {
		this.prev = n;
	}


	public String getData() {
		return code + ": " + city;
	}


	public String getCode() {
		return code;
	}
}
