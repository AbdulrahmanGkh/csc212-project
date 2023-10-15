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

	
	public void scheduleEvent(String eventTitle, String date, String time, String location, Contact contact) {}  // feras
	public void printAlphabitavlly() {} // feras 

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
	public void firstName() { } // feras in Class LINKEDLISTADT
	}
	
