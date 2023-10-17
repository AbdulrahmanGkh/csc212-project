
public class LinkedList<T> { // EVENT
	public Node<T> head;
	public Node<T> current;
	
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
	
	private void insertANDSort(Event val) {
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
				while(current.next!=null && val.compareTo(current.next.Data) > 0) { // The Event goes to its place alphabetically
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
			if(current.Data.getDateAndTime().equals(DateAndTime) && current.Data.getContact().equals(contact))
				return true; // there is a conflict so we can not schedule an event
			current=current.next;
		}
		return false;
	}
	
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
	
	public void scheduleEvent(String eventTitle, String DateAndTime, String location, Contact contact) {
		Event e = new Event(eventTitle,DateAndTime,location,contact);
		insertANDSort(e);
	}
	
	public void removeEvent(String name) {
		if(isEmpty())
			return;
		current=head;
		if(head.Data.getContact().getName().equalsIgnoreCase(name)) {// remove event is first element
			head=head.next;
			System.out.println("The event "+name +" is removed");
			return;
		}
		Node<T> temp =head;
		 current = head.next;
		while(current!=null) { // remove an event that is not the first element
			if(current.Data.getContact().getName().equalsIgnoreCase(name)) {
				temp=current.next;
				System.out.println("The event "+name +" is removed");
				return;
			}
			temp =current;
			current=current.next;
		}
	}

	public void searchEventByEventTitle(String eventTitle, LinkedList<T> E) {
		current=head;
		boolean exist = false;
		while(current!=null) {
			if(current.Data.getEventTitle().equals(eventTitle)) {
				Event event = current.Data;
				System.out.println("Event found!");
				System.out.println("Event Title "+ event.getEventTitle());
				System.out.println("Contact name "+ event.getContact().getName());
				System.out.println("Event date and time "+event.getDateAndTime());
				System.out.println("Event location "+ event.getLocation());
				exist = true;
			}
			current=current.next;
		}
		if (!exist)
			System.out.println("There is no events");
	}
	
	public void searchByContactName(String name,LinkedList<T> E) {
		current=head;
		boolean exist = false;
		while(current!=null) {
			exist = true;
			if(current.Data.getContact().getName().equals(name)) {
				Event event = current.Data;
				System.out.println("Event found!");
				System.out.println("Event Title "+ event.getEventTitle());
				System.out.println("Contact name "+ event.getContact().getName());
				System.out.println("Event date and time "+ event.getDateAndTime());
				System.out.println("Event location "+ event.getLocation());
				
			}
			current=current.next;
		}
		if (!exist)
			System.out.println("There is no events");
	}
	
	public void printContactShareEvent(String title) {
		current = head;
		boolean exist = false; // check if event exist or not
		boolean y = false; // printing in a different way for the frist time
		while (current != null) {
			if (current.Data.eventTitle.equals(title)) { // if he find the name
				exist = true;
				Event event = current.Data;
				if (y == false) {
					System.out.println("all contacts that share event: " + event.getContact().getName() + " ");// first time																					// time
					y = true;
				} else
					System.out.println(event.getContact().getName() + " ");
			}
			current = current.next;
		}
		if (exist == false)
			System.out.println("there is no event with this title ");
		System.out.println();

	}
	
}
	
