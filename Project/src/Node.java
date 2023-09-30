
public class Node <T>{
	
	public Node<T> next;
	public T data;
	
	public Node() {
		data=null;
		next=null;
	}
	
	public Node(T val) {
		data=val;
		next=null;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}