
public class Node <T>{
	
	public Node<T> next;
	public Contact data;
	public Event Data;
	
	public Node() {
		data=null;
		next=null;
	}
	
	public Node(Contact val) {
		data=val;
		next=null;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Contact getData() {
		return data;
	}

	public void setData(Contact data) {
		this.data = data;
	}

	public void setData(Event data) {
		Data = data;
	}

}
