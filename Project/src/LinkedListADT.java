
public class LinkedListADT <T extends Comparable<T>> {
	
	public Node<T> head;
	public Node<T> current;
	
	public LinkedListADT() {// Big O(1)
		head = current= null;	
	}
	
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
	
	public void insertSort(Contact val) {
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
	
	public boolean search(Contact val) {
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
   
	public void Firstname(String name) {
		 current = head;
		 boolean exist=false;
		 while(current != null) {
			 String names = current.data.getName();
			 String first[]= names.split(" ");
			if(first[0].equals(name)) {
				exist=true;
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
		Contact c = new Contact(name,phoneNumber,emailAddres,address,birthday,notes);
		C.insertSort(c);
	}
	
	public void removeContact(String name,LinkedList<Event> E) {
		if(isEmpty()) { // empty linked list
			System.out.println("There is no contacts to remove");
			return;
		}
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
				temp=current.next;
				System.out.println("The name " + name +" is removed");
				E.removeEvent(name);// removing the events with the contact
				return;
			}
			temp =current;
			current=current.next;
		}
	}
		
	
	 public Contact searchName(String name) {// Big O(n)
		 if(isEmpty()) {
				return null;
				}// there is no Contacts
		 current=head;
			while(current!=null) {
				if(current.data.getName().equals(name))
					return current.data;// return the contact with the same name
				current=current.next;
					}
			return null;// there is no contact with the same name
	}
	
	 public Contact searchPhoneNB(String phoneNumber) { // Big O(n)   phone number
		if(isEmpty())
				return null;// there is no Contacts
		current=head;
		while(current!=null) {
			if(current.data.getPhoneNumber().equals(phoneNumber))
					return current.data;// return the contact with the same phone number
			current=current.next;
				}
			return null;// there is no contact with the same phone number
	 }  
	 
	 public void searchEmail(String emailAddress) {// Big O(n)
		 current=head;
			boolean exist = false;// this is our indicator if there is any contacts with same email address or not
			while(current!=null) {
				if(current.data.getEmailAddress().equals(emailAddress)) {// to print every contact with the same email address
					exist=true;// we found contacts
					System.out.println("Contact found!");
					System.out.println("Name:"+ current.data.getName());
					System.out.println("Phone Number: "+ current.data.getPhoneNumber());
					System.out.println("Email Address: "+current.data.getEmailAddress());
					System.out.println("Address: "+ current.data.getAddress());
					System.out.println("Birthday:"+ current.data.getBirthday());
					System.out.println("Notes: "+ current.data.getNotes());
				}
				current=current.next;	
			}
			if(!exist)
				System.out.println("There is no contact with the same email address ");
	} 
	 
	public void searchAddress(String address) {// Big O(n)
		current=head;
		boolean exist = false;// this is our indicator if there is any contacts with same email address or not
			while(current!=null) {
				if(current.data.getAddress().equals(address)) {// to print every contact with the same  address
					exist=true;// we found contacts
					System.out.println("Contact found!");
					System.out.println("Name:"+ current.data.getName());
					System.out.println("Phone Number: "+ current.data.getPhoneNumber());
					System.out.println("Email Address: "+current.data.getEmailAddress());
					System.out.println("Address: "+ current.data.getAddress());
					System.out.println("Birthday:"+ current.data.getBirthday());
					System.out.println("Notes: "+ current.data.getNotes());
				}
				current=current.next;	
			}
			if(!exist)
				System.out.println("There is no contact with the same email address ");
	} 
	 
	public void searchBirthday(String birthday) {// Big O(n)
		 current=head;
			boolean exist = false;// this is our indicator if there is any contacts with same email address or not
			while(current!=null) {
				if(current.data.getBirthday().equals(birthday)) {// to print every contact with the same  address
					exist=true;// we found contacts
					System.out.println("Contact found!");
					System.out.println("Name:"+ current.data.getName());
					System.out.println("Phone Number: "+ current.data.getPhoneNumber());
					System.out.println("Email Address: "+current.data.getEmailAddress());
					System.out.println("Address: "+ current.data.getAddress());
					System.out.println("Birthday:"+ current.data.getBirthday());
					System.out.println("Notes: "+ current.data.getNotes());
				}
				current=current.next;	
			}
			if(!exist)
				System.out.println("There is no contact with the same email address ");
	} 
  
}
