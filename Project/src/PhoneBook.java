import java.util.Scanner;

public class PhoneBook {//
	
	
	
	
	public static void ProgramMenu() {
	System.out.println("Welcome to the Linked Tree Phoonebook!");
	System.out.println("Please choose an option");
	System.out.println("1.Add a contact");
	System.out.println("2.Search for a contact");
	System.out.println("3.Dellet a contact");
	System.out.println("4.Sechedule an event");
	System.out.println("5.Print event details");
	System.out.println("6. Print contact by first name");
	System.out.println("7.Print all events alphabetically");
	System.out.println("8. Exit");
	System.out.println("Enter your choice: ");
	}
	public static void SearchContactMenu() {
		System.out.println("Enter Search criteria: ");
		System.out.println("Name");
		System.out.println("Phone Number");
		System.out.println("Email Address");
		System.out.println("Address");
		System.out.println("Birthday");
	}
	
	public static void PrintEvent() {
		System.out.println("Enter search criteria");
		System.out.println("1. contact name");
		System.out.println("2. Event tittle");
		System.out.println("Enter your choice");
	}
	
	

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 Scanner n = new Scanner(System.in);
	 Scanner p = new Scanner(System.in);
	 Scanner e = new Scanner(System.in);
	 Scanner a = new Scanner(System.in);
	 Scanner b = new Scanner(System.in);
	 Scanner nt = new Scanner(System.in);
	 Scanner ev = new Scanner(System.in);
	 Scanner cv = new Scanner(System.in);
	 Scanner dt = new Scanner(System.in);
	 Scanner l = new Scanner(System.in);
	 int choice;
	 LinkedListADT<Contact> C = new LinkedListADT<Contact>();
	 LinkedList <Event> E = new LinkedList<Event>();
		
		do {
			 ProgramMenu(); //this calls the menu we created above
			choice = input.nextInt();
			switch (choice){
			
			case 1:
				System.out.println("Enter the contact's name:");
				String name=n.nextLine();
				System.out.println("Enter the contact's phone number:");
				String phoneNumber=p.nextLine();
				System.out.println("Enter the contact's email address:");
				String emailAddress=e.nextLine();
				System.out.println("Enter the contact's address:");
				String address=a.nextLine();
				System.out.println("Enter the contact's birthday:");
				String birthday=b.nextLine();
				System.out.println("Enter any notes for the contact:");
				String notes=nt.nextLine();
				if(C.searchName(name)!=null || C.searchPhoneNB(phoneNumber) !=null) { 
					System.out.println("Contact is found");
					break;
				}
					C.addContact(name, phoneNumber, emailAddress, address, birthday, notes);
					System.out.println(" Contact added successfully! ");
				break;
				
			case 2:
				SearchContactMenu();
				int choice2;
				choice2=input.nextInt();
				switch(choice2) {
				case 1:
					System.out.println("Enter the contact's name:");
					name=n.next();
					if(C.searchName(name)!=null) {
						System.out.println("Name:" +C.searchName(name).getName());
						System.out.println("Phone Number:" +C.searchName(name).getPhoneNumber());
						System.out.println("Email Address:" +C.searchName(name).getEmailAddress());
						System.out.println("Address:" +C.searchName(name).getAddress());
						System.out.println("Birthday:" +C.searchName(name).getBirthday());
						System.out.println("Notes:" + C.searchName(name).getNotes());
						break;
					}
				case 2:
					System.out.println("Enter Phone number:");
					phoneNumber=p.next();
					if(C.searchPhoneNB(phoneNumber)!=null) {
						System.out.println("Name:" +C.searchPhoneNB(phoneNumber).getName());
						System.out.println("Phone Number:" +C.searchPhoneNB(phoneNumber).getPhoneNumber());
						System.out.println("Email Address:" +C.searchPhoneNB(phoneNumber).getEmailAddress());
						System.out.println("Address:" +C.searchPhoneNB(phoneNumber).getAddress());
						System.out.println("Birthday:" +C.searchPhoneNB(phoneNumber).getBirthday());
						System.out.println("Notes:" + C.searchPhoneNB(phoneNumber).getNotes());
						break;
					}
				case 3:
					System.out.println("Enter Email Address");
					emailAddress=e.next();
					C.searchEmail(emailAddress);
					break;
				case 4:
					System.out.println("Enter Address");
					address=a.next();
					C.searchAddress(address);
					break;
				case 5:
					System.out.println("Enter birthday");
					birthday=b.next();
					C.searchBirthday(birthday);
					break;
				}
				break;
				
			case 3: 
			System.out.println("Enter contact name that you want to delete");
			name=n.nextLine();
			C.removeContact(name);
				break;
		
			case 4:
			System.out.println("Enter event title:");
			String eventTitle=ev.nextLine();
			System.out.println("Enter contact name:");
			String cName=cv.nextLine();
			Contact contact = C.searchName(cName);
			if(contact==null) {
				System.out.println("There is no contact in the list do an event with them");
				break;
			}
			System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):");
			String DateAndtime =dt.nextLine();
			System.out.println("Enter event location:");
			String location=l.nextLine();
			if(E.Conflict(contact, DateAndtime)) {
				System.out.println("there is an event at the same time can not add an event");
				break;
			}
			E.scheduleEvent(eventTitle, DateAndtime, location, contact);
				break;
				
			case 5:
				PrintEvent();
				
			
				
				break;
				
				
				
			case 6:
				System.out.println("Enter the first name:");
				name=n.nextLine();
				C.Firstname(name);
				
				break;
				
				
				
			case 7:
				//Print all events alphabetically
				
				break;
				
				
				
			case 8:
				
				System.out.println("Exiting the program. Goodbye!");
				break;
				default: 
					System.out.println("Invaled choice,please try to Enter number from 1-8");
			}
			
		}while(choice !=8 );

	}

}
