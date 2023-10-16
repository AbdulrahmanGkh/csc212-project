public class LinkedList<T> { // EVENT
	private Node<T> head;
	private Node<T> current;
	public Event Data;

	public LinkedList() {
		head=current=null;
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
	public boolean last() {// Big O(1)
		return current.next == null;
	}
	
	public void findFirst() {// Big O(1)
		current=head;
	}
	
	public void findNext() {// Big O(1)
		current=current.next;
	}
	
	public Event retrive() {// Big O(1)
		return current.Data;
	}
	
	public void ubdate(Event val) {// Big O(1)
		current.Data=val;
	}

	public void insertSort(Event val) {
		Node<T> temp;
		if(isEmpty())
			head=current=new Node<T>(val);
		else {
			current=head;
			if(val.compareTo(head.Data) < 0) { // The Event is first alphabetically
				 temp =head;
				head=new Node<T>(val);
				head.next=temp;
			}
			else {
				while(current.next!=null && val.compareTo(head.Data) > 0) { // The Event goes to its place alphabetically
					current=current.next;
					 temp = current.next;
					current.next = new Node<T>(val);
					current = current.next;
					current.next = temp;
				}
			}
		}
	}
	
	public boolean Conflict(Contact contact, String DateAndTime) {
		current=head;
		while(current!=null) {
			if(current.Data.getDateAndTime().equalsIgnoreCase(DateAndTime) && current.Data.getContact().equals(contact))
				return true; // there is a conflict so we can not schedule an event
			current=current.next;
		}
		return false; // there is no conflict we can add the event
	}

	public void scheduleEvent(String eventTitle, String DateAndTime, String location, Contact contact) {
		Event e = new Event(eventTitle,DateAndTime,location,contact);
		insertSort(e);
	}

	public void removeEvent(String name) {
		if(isEmpty())
			return;
		current=head;
		if(head.Data.getContact().getName().equalsIgnoreCase(name)) {
			head=head.next;
			return;
		}
		Node<T> temp =head;
		Node<T> current = head.next;
		while(current!=null) { // remove an event that is not the first element
			if(current.Data.getContact().getName().equalsIgnoreCase(name)) {
				temp=current.next;
				return;
			}
			temp =current;
			current=current.next;
		}
	}

	public void searchEventByEventTitle(String eventTitle) {
		
		if (head == null)
			System.out.println("there is no contact");
		Node<T> temp = head;
		boolean exist = false;
		while(temp.getNext() != null) {
			if(temp.getdata().getEventTitle().equalsIgnoreCase(eventTitle)) {
			System.out.println("Event found!");
			System.out.println("Event Title "+ temp.getdata().eventTitle);
			System.out.println("Contact name "+ temp.getData().getName());
			System.out.println("Event date and time "+temp.getdata().date + temp.getdata().time);
			System.out.println("Event location "+ temp.getdata().location);
			exist = true;
			}
			temp = temp.getNext();
		}
		
		if (!exist)
			System.out.println("There is no events");
		
	} // search email  abdul
	public void searchByContactName(String name) {
		if (head == null)
		System.out.println("There is no contact");
		Node<T> temp = head;
		boolean exist = false;
		while(temp.getNext() != null) {
			if(temp.getData().getName().equalsIgnoreCase(name)) { 
				System.out.println("Event found!");
				System.out.println("Event Title "+ temp.getdata().eventTitle);
				System.out.println("Contact name "+ temp.getData().getName());
				System.out.println("Event date and time "+temp.getdata().date + temp.getdata().time);
				System.out.println("Event location "+ temp.getdata().location);
				exist = true;
			}
			temp = temp.getNext();
			
		}
		if (!exist)
			System.out.println("There is no events for "+name);
	} // abdul
	public void printAlphabiticly() {
		if(isEmpty()) {
			System.out.println("There is no events");
			return;
			}
		current = head;
		while(current!=null) {
			System.out.println("Title: " +current.Data.getEventTitle());
			current = current.getNext();
		}
	}
}
	
