
public class LinkedListADT <T extends Comparable<T>> {
	
	private Node<T> head;
	private Node<T> current;
	
	public LinkedListADT() {// Big O(1)
		head = current= null;	
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
	
	public Contact retrive() {// Big O(1)
		return current.data;
	}
	
	public void ubdate(Contact val) {// Big O(1)
		current.data=val;
	}

	public void insertSort(Contact val) {
		if(isEmpty())
			head=current=new Node<T>(val);
		else {
			current=head;
			if(val.compareTo(head.data)<0) { // The name is first alphabetically
				Node<T> temp =head;
				head=new Node<T>(val);
				head.next=temp;
			}
			else {
				while(current.next!=null && val.compareTo(head.data) >0) { // The name goes to its place alphabetically
					current=current.next;
					Node<T> temp = current.next;
					current.next = new Node<T>(val);
					current = current.next;
					current.next = temp;
				}
			}
		}
	}
	
	public void insert(Contact val) { // Big O(1)
		Node<T> tmp;
		if(isEmpty()) {
			current=head=new Node<T>(val);
			}
		else {
			tmp = current.next;
			 current.next = new Node<T> (val);
			 current = current.next;
			 current.next = tmp;
			}
		}
	
	public boolean search(Contact val) {
		if(head==null)
			return false;
		Node<T> temp= head;
		while(temp!=null) {
			if(temp.getData().compareTo(val)==0) {
				current = temp;
				return true;
			}	
			temp=temp.getNext();
		}
		return false;
	}
	
 public void removeContact(String name) {
		LinkedList e = new LinkedList();// for removing the events connected with this contact
		if(isEmpty()) { // empty linked list
			System.out.println("There is no contacts to remove");
			return;
		}
		current =head;
		if(head.data.getName().equalsIgnoreCase(name)) { // removing the head
			head=head.next;
			System.out.println("The name "+ name +" is removed");
			e.removeEvent(name);// removing the events with the contact
			return;
		}
		Node<T> temp=head;
		Node<T> current = head.next;
		while(current!=null) { // remove a contact that is not the first element
			if(current.data.getName().equalsIgnoreCase(name)) {
				temp=current.next;
				System.out.println("The name " + name +" is removed");
				e.removeEvent(name);// removing the events with the contact
				return;
			}
			temp =current;
			current=current.next;
		}
	}

public void addContact(String name,String phoneNumber,String emailAddres,String address,String birthday,String notes) { // big O(n)
		Contact c = new Contact(name,phoneNumber,emailAddres,address,birthday,notes);
		insertSort(c);
	}
		
	
	 public Contact searchName(String name) {// Big O(n)
		if(head==null)
				return null;// there is no Contacts
			Node<T> temp = head;
			while(temp!=null) {
				if(temp.getData().getName().equalsIgnoreCase(name))
					return temp.getData();// return the contact with the same name
				temp=temp.getNext();
				}
			return null;
			
		}
	
	 public Contact searchPhoneNB(String phoneNumber) { // Big O(n)
	 	 if(head==null)
	 			return null; // there is no Contacts
	 		Node<T> temp = head;
	 		while(temp!=null) {
	 			if(temp.getData().getPhoneNumber().equals(phoneNumber))
						return temp.getData();// return the contact with the same phone number
	 			temp=temp.getNext();
	 			}
	 			return null;// there is no contract with the same phone number
	 		}  
	 
	 public void searchEmail(String emailAddress) {// Big O(n)
			if(head==null)
				System.out.println("There is no contacts");// there is no Contacts
			Node<T> temp = head;
			boolean exist = false;// this is our indicator if there is any contacts with same email address or not
			while(temp!=null) {
				if(temp.getData().getEmailAddress().equals(emailAddress)) {// to print every contact with the same email address
					System.out.println("Contact found!");
					System.out.println("Name:"+ temp.getData().getName());
					System.out.println("Phone Number: "+ temp.getData().getPhoneNumber());
					System.out.println("Email Address: "+ temp.getData().getEmailAddress());
					System.out.println("Birthday:"+ temp.getData().getBirthday());
					System.out.println("Notes: "+ temp.getData().getNotes());
					exist=true;// we found contacts
				}
				temp=temp.getNext();	
			}
			if(!exist)
				System.out.println("There is no contact with the same email address ");
		} 
	 
	 public void searchAddress(String address) {// Big O(n)
			if(head==null)
				System.out.println("There is no contacts");// there is no Contacts
			Node<T> temp = head;
			boolean exist = false;// this is our indicator if there is any contacts with same  address or not
			while(temp!=null) {
				if(temp.getData().getEmailAddress().equals(address)) {// to print every contact with the same  address
					System.out.println("Contact found!");
					System.out.println("Name:"+ temp.getData().getName());
					System.out.println("Phone Number: "+ temp.getData().getPhoneNumber());
					System.out.println("Email Address: "+ temp.getData().getEmailAddress());
					System.out.println("Birthday:"+ temp.getData().getBirthday());
					System.out.println("Notes: "+ temp.getData().getNotes());
					exist=true;// we found contacts
				}
				temp=temp.getNext();	
			}
			if(!exist)
				System.out.println("There is no contact with the same address ");
		}
	 
	 public void searchBirthday(String birthday) {// Big O(n)
			if(head==null)
				System.out.println("There is no contacts");// there is no Contacts
			Node<T> temp = head;
			boolean exist = false;// this is our indicator if there is any contacts with same  birth date or not
			while(temp!=null) {
				if(temp.getData().getEmailAddress().equals(birthday)) {// to print every contact with the same  birth date
					System.out.println("Contact found!");
					System.out.println("Name:"+ temp.getData().getName());
					System.out.println("Phone Number: "+ temp.getData().getPhoneNumber());
					System.out.println("Email Address: "+ temp.getData().getEmailAddress());
					System.out.println("Birthday:"+ temp.getData().getBirthday());
					System.out.println("Notes: "+ temp.getData().getNotes());
					exist=true;// we found contacts
				}
				temp=temp.getNext();	
			}
			if(!exist)
				System.out.println("There is no contact with the same birth date ");
		
	public void Firstname(String name) {
		 int i=0;
		   ;
		 if(isEmpty())
			 System.out.println("There is no contact with this name");
		 current = head;
		 while(current != null) {
			 String fname = current.getData().getName();
			String sname[]= fname.split(" ");
			if(sname[i].compareTo(name)==0)
				System.out.println(current.get);
				 
			 
			 
			System.out.println("");
			current = current.getNext();
			
			
		 }
			 
	 } 
   }
  
