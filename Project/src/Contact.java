

public class Contact<T> implements Comparable<Contact> {
	
	public String name;
	public String phoneNumber;
	public String emailAddress;
	public String address;
	public String birthday;
	public String notes;
	public LinkedListADT<Event> events; 
	
	

	public Contact() {
		this.name ="";
		this.phoneNumber = "";
		this.emailAddress = "";
		this.address = "";
		this.birthday = "";
		this.notes = "";
		events = new LinkedListADT<Event>();	
		}

	public Contact(String name,String phoneNumber,String emailAddres,String address,String birthday,String notes) {
		this.name = name;
		this.phoneNumber=phoneNumber;
		this.emailAddress=emailAddress;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
		events = new LinkedListADT<Event>();
	}
	
	public int compareTo(Contact otherPerson)throws NullPointerException {//bigO(n) this method compare two strings
		 if(this.name==null || otherPerson.name==null)
			throw new NullPointerException("Please enter a valid name");
		 else
		 {
		 if(this.name.equals(otherPerson.name))
			return 0;// this means name==otherPerson
		 else if(this.name.compareTo(otherPerson.name)<=-1)
			return -1; // this means this.name>otherPerson
		 else
			 return 1;// this means otherPerson>this.name
		 }
	}
	
		public boolean addEvent(Event e) { // the events info deals at phonebook
		if(!events.isEmpty() && events.search(e) ) // there is events in the list
			return false; // can not add because its already added
		events.insert(e); // adding the event
		return true;
	}
	
	public boolean removeEvent(String eventName) {
		Event e = new Event();
		e.setEventTitle(eventName);
		if(events.isEmpty() || !events.search(e))
			return false; // there is no events to remove or could not find the event
		events.delete(e); // the event is deleted
		return true;
	}
	
	public boolean searchEvent(String eventTitle) {
		Event e = new Event();
		e.setEventTitle(eventTitle);
		if(events.isEmpty() || !events.search(e))// there is no events or could not find the event
			return false;
		return true;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}




