import java.util.Date;
public class Contact {
	public String name;
	public String phoneNumber;
	public String emailAddress;
	public String address;
	public Date birthday;
	public String notes;
	
	public Contact(String name,String phoneNumber,String emailAddres,String address,Date birthday,String notes) {
		this.name = name;
		this.phoneNumber=phoneNumber;
		this.emailAddress=emailAddress;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
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
	
//comparaple class
}
