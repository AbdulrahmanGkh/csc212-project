

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
	
	
	public void addEvent(String eventTitle, String date, String time, String location) {
		Event e = new Event(eventTitle,date,time,location);
		events.insert(e);
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




