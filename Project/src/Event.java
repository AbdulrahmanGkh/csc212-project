
public class Event implements Comparable<Event> {
	
	public String eventTitle;
	public String DateAndTime;
	public String location;
	public Contact contact;
	
	public Event() {
		this.eventTitle=null;
		this.DateAndTime=null;
		this.location=null;
	}
	
	public Event(String eventTitle, String DateAndTime, String location, Contact contact) {
		this.eventTitle = eventTitle;
		this.DateAndTime=DateAndTime;
		this.location = location;
		this.contact=contact;
	}
@Override
	public int compareTo(Event event)throws NullPointerException  {
		if(this.eventTitle==null || event.eventTitle==null)
			throw new NullPointerException("Please enter a valid name");
		 else
		 {
		 if(this.eventTitle.equals(event.eventTitle))
			return 0;// this means this.title==event
		 else if(this.eventTitle.compareTo(event.eventTitle)<=-1)
			return -1; // this means this.title>event
		 else
			 return 1;// this means this.title<event
		 }
	}
//setters and getters
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	
	public String getDateAndTime() {
		return DateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		DateAndTime = dateAndTime;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
