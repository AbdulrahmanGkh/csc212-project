import java.util.Scanner;

public class PhoneBook {
	
	
	
	
	public static void ProgramMenu() {
	System.out.println("Welcome to the Linked Tree Phoonebook!");
	System.out.println("Please choose an option");
	System.out.println("1.Add a contact");
	System.out.println("2.Search for a contact");
	System.out.println("3.Delete a contact");
	System.out.println("4.Sechedule an event");
	System.out.println("5.Print event details");
	System.out.println("6. Print contact by first name");
	System.out.println("7.Print all events alphabetically");
	System.out.println("8.Print Contact that share an event");
	System.out.println("9. Exit");
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
	 Scanner dt = new Scanner(System.in);
	 Scanner l = new Scanner(System.in);
	 String name;
	 String phoneNumber;
	 String emailAddress;
	 String address;
	 String birthday;
	 String notes;
	 String eventTitle;
	 String DateAndtime;
	 String location;
	 int choice;
	 LinkedListADT<Contact> C = new LinkedListADT<Contact>();
	 LinkedList <Event> E = new LinkedList<Event>();
		
		do {
			 ProgramMenu(); //this calls the menu we created above
			choice = input.nextInt();
			switch (choice){
			
			case 1:
				
				System.out.println("Enter the contact's name:");
				 name=n.nextLine();
				System.out.println("Enter the contact's phone number:");
				 phoneNumber=p.nextLine();
				System.out.println("Enter the contact's email address:");
				 emailAddress=e.nextLine();
				System.out.println("Enter the contact's address:");
				 address=a.nextLine();
				System.out.println("Enter the contact's birthday:");
				 birthday=b.nextLine();
				System.out.println("Enter any notes for the contact:");
				 notes=nt.nextLine();
				if(C.searchName(name)!=null || C.searchPhoneNB(phoneNumber) !=null) { 
					System.out.println("Contact is found");
					break;
				}
				else {
					C.addContact(name, phoneNumber, emailAddress, address, birthday, notes);
					System.out.println(" Contact added successfully! ");
				break; }
				
			case 2:
				
				SearchContactMenu();
				int choice2;
				choice2=input.nextInt();
				switch(choice2) {
				case 1:
					System.out.println("Enter the contact's name:");
					name=n.nextLine();
					Contact contact1 = C.searchName(name);
					if(contact1!=null) {
						System.out.println("Name:" +contact1.getName());
						System.out.println("Phone Number:" +contact1.getPhoneNumber());
						System.out.println("Email Address:" +contact1.getEmailAddress());
						System.out.println("Address:" +contact1.getAddress());
						System.out.println("Birthday:" +contact1.getBirthday());
						System.out.println("Notes:" + contact1.getNotes());
						break;
					}
					else {
					System.out.println("There is no contacts with the same name");
					 break;
					}
				case 2:
					System.out.println("Enter Phone number:");
					phoneNumber=p.nextLine();
					Contact contact2 = C.searchPhoneNB(phoneNumber);
					if(contact2!=null) {
						System.out.println("Name:" +contact2.getName());
						System.out.println("Phone Number:" +contact2.getPhoneNumber());
						System.out.println("Email Address:" +contact2.getEmailAddress());
						System.out.println("Address:" +contact2.getAddress());
						System.out.println("Birthday:" +contact2.getBirthday());
						System.out.println("Notes:" + contact2.getNotes());
						break;
					}
					System.out.println("There is no contacts with the same phone number");
					break;
				case 3:
					System.out.println("Enter Email Address");
					emailAddress=e.nextLine();
					C.searchEmail(emailAddress,C);
					break;
				case 4:
					System.out.println("Enter Address");
					address=a.nextLine();
					C.searchAddress(address,C);
					break;
				case 5:
					System.out.println("Enter birthday");
					birthday=b.nextLine();
					C.searchBirthday(birthday,C);
					break;
				}
				break;
				
			case 3: 
				
			System.out.println("Enter contact name that you want to delete");
			name=n.nextLine();
			C.removeContact(name,E);
				break;
		
			case 4:
				
			System.out.println("Enter event title:");
			 eventTitle=ev.nextLine();
			System.out.println("Enter contact name:");
			 name=n.nextLine();
			Contact contact3 = C.searchName(name);
			if( contact3==null) {
				System.out.println("There is no contact in the list to do an event with them");
				break;
			}
			System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):");
			 DateAndtime=dt.nextLine();
			System.out.println("Enter event location:");
			 location=l.nextLine();
			if(E.Conflict(contact3, DateAndtime)) {
				System.out.println("there is an event at the same time can not add an event");
				break;
			}
			E.scheduleEvent(eventTitle, DateAndtime, location, contact3);
			System.out.println("Event scheduled successfully!");
				break;
				
			case 5:
				
				PrintEvent();
				int choice3=input.nextInt();
				if(choice3==1) {
					System.out.println("Enter contact name:");
					 name=n.nextLine();
					Contact contact4 = C.searchName(name);
					if(contact4==null) {
						System.out.println("There is no contact in the list who has this event");
						break;
					}
					else {
						System.out.println("The contact is found!");
						E.searchByContactName(name,E);
						break;
					}
				}
					else if(choice3==2) {
						System.out.println("Enter the event title");
						 eventTitle=ev.nextLine();
						 E.searchEventByEventTitle(eventTitle,E);
						break;
					}
					else
						System.out.println("Wrong input");
				break;
				
			case 6:
				
				System.out.println("Enter the first name:");
				name=n.nextLine();
				C.Firstname(name);
				
				break;
				
			case 7:
				
				E.printAlphabiticly();
				break;
				
			case 8:
				
				System.out.println("Enter the event title");
				eventTitle=ev.nextLine();
				E.printContactShareEvent(eventTitle);
				break;
				
			case 9:

				System.out.println("Exiting the program. Goodbye!");
				break;
				default: 
					System.out.println("Invaled choice,please try to Enter number from 1-9");
			}
			
		}while(choice !=9 );

	}
}

