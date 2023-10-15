
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
	
	public T retrive() {// Big O(1)
		return current.data;
	}
	
	public void ubdate(T val) {// Big O(1)
		current.data=val;
	}

	public void insertSort(T val) {
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
	
	public void insert(T val) { // Big O(1)
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
	
	public boolean search(T val) {
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
	
   public void delete(T val) {
	   if (current == head)
		   head = head.next;
	   else {
		   Node<T> tmp = head;
		   while (tmp.next != current)
			   tmp = tmp.next;
		   tmp.next = current.next;
		   }
		   if (current.next == null)
			   current = head;
		   else
			   current = current.next;
	 }	   
   }
   /*
	public void add(String name,String phoneNumber,String emailAddres,String address,String birthday,String notes)throws IllegalArgumentException  { // big O(1)
		if(searchName(name)!=null || searchPhoneNB(phoneNumber) != null)
			throw new IllegalArgumentException("The contact is already added");
		else {
		Contact c = new Contact(name,phoneNumber,emailAddres,address,birthday,notes);
		Node<T> temp= new Node<>(c);
		if(isEmpty())
			current = head = new Node<>(c);
		else
		{
		temp.next=current.next;
		temp.previous=current;
		if(current.next !=null)
		current.next.previous = temp;
		current.next=temp;
		current = temp;
		}
		}
	} */
   
   
   
   /*
	public Contact searchName(String name) {// Big O(n)
		if(head==null)
			return true;// there is no Contacts
		Node<T> temp = head;
		while(temp!=null) {
			if(temp.getData().getName().equalsIgnoreCase(name))
				return true;// return the contact with the same name
			temp=temp.getNext();
			}
		return false;
		
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
	} 
	*/
	

