
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
	
	public Contact retrive() {// Big O(1)
		return current.data;
	}
	
	public void ubdate(Contact val) {// Big O(1)
		current.data=val;
	}
	
	public void insert(Contact val) { // Big O(1)
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
	
	public void add(String name,String phoneNumber,String emailAddres,String address,String birthday,String notes) { // big O(1)
		Contact c = new Contact(name,phoneNumber,emailAddres,address,birthday,notes);
		Node<T> temp;
		if(isEmpty())
			current = head = new Node<T>(c);
		else
		{
			temp=current.next;
			current.next=new Node<T> (c);
			current=current.next;
			current.next=temp;
		}
			
	}
	public Contact searchName(String name) {// Big O(n)
		if(head==null)
			return null;// there is no Contacts
		Node<T> temp = head;
		while(temp!=null) {
			if(temp.getData().getName().equals(name))
				return temp.getData();// return the contact with the same name
			temp=temp.getNext();
			}
		return null;
		
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
	
public void delete() {}
}
