
public class Node <T>{
	
public Node<T> next;
public Contact data;
public Node<T> previous;
	
public Node() {
	data=null;
	next=null;
	previous = null;
}
	
public Node(Contact val) {
	data=val;
	next=null;
	previous = null;
}

public Node<T> getPrevious() {
	return previous;
}

public void setPrevious(Node<T> previous) {
	this.previous = previous;
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

}
