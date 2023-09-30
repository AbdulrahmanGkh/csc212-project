import java.util.Date;
public class Contact {
	private String name;
	private String phoneNumber;
	private String emailAddress;
	private String address;
	private Date birthday;
	private String notes;
	
	public Contact(String name,String phoneNumber,String emailAddres,String address,Date birthday,String notes) {
		this.name = name;
		this.phoneNumber=phoneNumber;
		this.emailAddress=emailAddress;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
	}
	public int compareto(Contact otherPerson) {//bigO(n) this method compare two strings
		if(this.name == null && otherPerson.name == null)
			return 0;//we check if both names are nulls we return 0 that means they are equal
 		try {
 			return this.name.compareTo(otherPerson.name);
 		}catch (NullPointerException a) {
 			if (this.name == null) {
 				return -1; //if this case excuted then current name is null 
 			}
 			else {
 				return 1; //if this case excuted then otherPerson name is null  
 			}
 		}
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	

}
