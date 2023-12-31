
public class LinkedListADT <T extends Comparable<T>> {
	
	public Node<T> head;
	public Node<T> current;
	
	public LinkedListADT() {// Big O(1)
		head = current= null;	
	}
	//setters and getters
	public boolean isEmpty() {// Big O(1)
		return head==null;
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
	
	public Contact retrive() {// Big O(1)
		return current.data;
	}
	
	public void ubdate(Contact val) {// Big O(1)
		current.data=val;
	}
	
	private void insertSort(Contact val) { // Insert and sort at the same time to try to get the best case scenario
		Node<T> temp;
		if(isEmpty())
			head=current=new Node<T>(val);
		else {
			current=head;
			if(val.compareTo(head.data) < 0) { // The name is first alphabetically
				 temp =head;
				head=new Node<T>(val);
				head.next=temp;
			}
			else {
				while(current.next!=null && val.compareTo(current.next.data) > 0) { // The name goes to its place alphabetically
					current=current.next;
					 temp = current.next;
					current.next = new Node<T>(val);
					current = current.next;
					current.next = temp;
				}
			}
		}
	}
	
	public boolean search(Contact val) { // Search in the list for a contact
		if(head==null)
			return false;
		Node<T> temp= head;
		while(temp!=null) {
			if(temp.data.compareTo(val)==0) {
				current = temp;
				return true;
			}	
			temp=temp.getNext();
		}
		return false;
	}
   
	public void Firstname(String name) { // this method take the first name entered by the user and search for contacts with the same first name
		 current = head;
		 boolean exist=false; // this is our indicator if there is any contacts with same first name or not
		 while(current != null) {
			 String names = current.data.getName();
			 String first[]= names.split(" ");
			if(first[0].equals(name)) {
				exist=true;// we found contacts
				System.out.println("Contacts found!");
				System.out.println("Name: "+ current.data.getName());
				System.out.println("Phone Number: "+ current.data.getPhoneNumber());
				System.out.println("Email Address: "+ current.data.getEmailAddress());
				System.out.println("Address: "+ current.data.getAddress());
				System.out.println("Birthday: "+ current.data.getBirthday());
			}
			current = current.getNext();
		 }	
		 if(!exist)
			 System.out.println("There is no contact with the same first name");
	 } 
	
	public void addContact(String name,String phoneNumber,String emailAddres,String address,String birthday,String notes,LinkedListADT<T> C) { // big O(n)
		Contact c = new Contact(name,phoneNumber,emailAddres,address,birthday,notes); // this method take a contact to store it in the list
		insertSort(c);
	}
	
	public void removeContact(String name,LinkedList<Event> E,LinkedListADT<T> c) { // this method remove the contact with the same name and its event
		current =head;
		if(head.data.getName().equals(name)) { // removing the head
			head=head.next;
			System.out.println("The name "+ name +" is removed");
			E.removeEvent(name);// removing the events with the contact
			return;
		}
		Node<T> temp=head;
		  current = head.next;
		while(current!=null) { // remove a contact that is not the first element
			if(current.data.getName().equals(name)) {
				temp.next=current.next;
				System.out.println("The name " + name +" is removed");
				E.removeEvent(name);// removing the events with the contact
				return;
			}
			temp =current;
			current=current.next; 
		}
	}
		
	
	 public Contact searchName(String name) {// Big O(n)   this method search contact by its full name
		 if(isEmpty()) {
				return null;
				}// there is no Contacts
		 current=head;
			while(current!=null) {
				if(current.data.getName().equals(name))
					return current.data;// return the contact with the same name
				current=current.next; // moving to the next element in the list
					}
			return null;// there is no contact with the same name
	}
	
	 public Contact searchPhoneNB(String phoneNumber) { // Big O(n)   this method search contact by its phone number
		if(isEmpty())
				return null;// there is no Contacts
		current=head;
		while(current!=null) {
			if(current.data.getPhoneNumber().equals(phoneNumber))
					return current.data;// return the contact with the same phone number
			current=current.next; // moving to the next element in the list
				}
			return null;// there is no contact with the same phone number
	 }  
	 
	 public void searchEmail(String emailAddress,LinkedListADT<T> c) {// Big O(n)   this method search contact by its email aadress
		 c.findFirst();
			boolean exist = false;// this is our indicator if there is any contacts with same  address or not
			while(c.current!=null) {
				if(c.retrive().getEmailAddress().equals(emailAddress)) {// to print every contact with the same email address
					exist=true;// we found contacts
					System.out.println("Contact found!");
					System.out.println("Name:"+ c.retrive().getName());
					System.out.println("Phone Number: "+ c.retrive().getPhoneNumber());
					System.out.println("Email Address: "+c.retrive().getEmailAddress());
					System.out.println("Address: "+ c.retrive().getAddress());
					System.out.println("Birthday:"+ c.retrive().getBirthday());
					System.out.println("Notes: "+ c.retrive().getNotes());
				}
				c.findNext();	// moving to the next element in the list
			}
			if(!exist)
				System.out.println("There is no contact with the same email address ");
	 }
	 
	public void searchAddress(String address,LinkedListADT<T> c) {// Big O(n)    this method search contact by its  aadress
		c.findFirst();
		boolean exist = false;// this is our indicator if there is any contacts with same  address or not
		while(c.current!=null) {
			if(c.retrive().getAddress().equals(address)) {// to print every contact with the same  address
				exist=true;// we found contacts
				System.out.println("Contact found!");
				System.out.println("Name:"+ c.retrive().getName());
				System.out.println("Phone Number: "+ c.retrive().getPhoneNumber());
				System.out.println("Email Address: "+c.retrive().getEmailAddress());
				System.out.println("Address: "+ c.retrive().getAddress());
				System.out.println("Birthday:"+ c.retrive().getBirthday());
				System.out.println("Notes: "+ c.retrive().getNotes());
			}
			c.findNext();	// moving to the next element in the list
		}
		if(!exist)
			System.out.println("There is no contact with the same email address ");
	} 
	 
	public void searchBirthday(String birthday,LinkedListADT<T> c) {// Big O(n)   this method search contact by its birthday
		c.findFirst();
		boolean exist = false;// this is our indicator if there is any contacts with same birthday or not
		while(c.current!=null) {
			if(c.retrive().getBirthday().equals(birthday)) {// to print every contact with the same birthday
				exist=true;// we found contacts
				System.out.println("Contact found!");
				System.out.println("Name:"+ c.retrive().getName());
				System.out.println("Phone Number: "+ c.retrive().getPhoneNumber());
				System.out.println("Email Address: "+c.retrive().getEmailAddress());
				System.out.println("Address: "+ c.retrive().getAddress());
				System.out.println("Birthday:"+ c.retrive().getBirthday());
				System.out.println("Notes: "+ c.retrive().getNotes());
			}
			c.findNext();	// moving to the next element in the list
		}
		if(!exist)
			System.out.println("There is no contact with the same email address ");
	} 
  
}
