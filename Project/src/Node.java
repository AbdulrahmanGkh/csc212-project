
public class Node <T>{
	
	public Node<T> next;
	public Contact data;
	public Event Data;
	
	public Node() {
		data=null;
		next=null;
	}
	
	public Node(Event val) {
		Data=val;
		next=null;
	}
	
	public Node(Contact val) {
		data=val;
		next=null;
	}
	//setters and getters
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Contact getdata() {
		return data;
	}
	
	public Event getData() {
		return Data;
	}

	public void setData(Contact data) {
		this.data = data;
	}

	public void setData(Event data) {
		Data = data;
	}
	
		
	}

