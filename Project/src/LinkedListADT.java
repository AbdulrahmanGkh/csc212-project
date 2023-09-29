
public class LinkedListADT <T> {
	
	private Node<T> head;
	private Node<T> current;
	
	public LinkedListADT() {// Big O(1)
		head=null;
		current=null;
	}
	
	public boolean isEmpty() {// Big O(1)
		return head==null;
	}
	
	public boolean isLast() {// Big O(1)
		return current.next==null;
	}
	
	public boolean full() {// Big O(1)
		return false;
	}
	
	public void findFirst() {// Big O(1)
		current=head;
	}
	
	public void findNext() {// Big O(1)
		current=current.next;
	}
	
	public T retrive() {// Big O(1)
		return current.data;
	}
	
	public void ubdate(T val) {// Big O(1)
		current.data=val;
	}
	
	public void insert(T val) { // Big O(1)
		Node<T> temp;
		if(isEmpty())
			current=head= new Node<T> (val);
		else
		{
			temp=current.next;
			current.next=new Node<T> (val);
			current=current.next;
			current.next=temp;
			}	
	}
	
	public void add() {} // depends on class contact
	public T searchName() {} // depends on class contact
	public T searchEmail() {} // depends on class contact
	public T searchPhoneNB() {} // depends on class contact
	public T searchAddress() {} // depends on class contact
	public T searchBirthday() {} // depends on class contact
	public void delete() {}// depends on class contact
	
	

}
