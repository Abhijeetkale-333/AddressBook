package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddContact {
	String FirstName;
	String LastName;
	String City;
	String State;
	String Email;
	int PhoneNo;
	int Zip;
	
	public void NewContact() {
		
		Scanner contact = new Scanner(System.in);
		List storeContact = new ArrayList();
		
		System.out.println("Add to new Contact to ADDRESS BOOK");
		for (int i = 0; i < 2; i++) {
			System.out.println("First Name: ");
			String FirstName = contact.next();
			storeContact.add(FirstName);
			
		    System.out.println("Last name: ");
		    String LastName = contact.next();
		    storeContact.add(LastName);
		    
		    System.out.println("City : ");
		    String City = contact.next();
		    storeContact.add(City);
		    
		    System.out.println("State : ");
		    String State = contact.next();
		    storeContact.add(State);
		    
		    System.out.println("Email: ");
		    String Email = contact.next();
		    storeContact.add(Email);
		    
		    System.out.println("Phone No: ");
		    int PhoneNo = contact.nextInt();
		    storeContact.add(PhoneNo);
		    
		    System.out.println("Zip: ");
		    int Zip = contact.nextInt();
		    storeContact.add(Zip);
		    
			System.out.println("FirstName: "+FirstName+ "\nLastName: "+LastName+ "\nCity: "+City+"\nState: "+ State+"Email: "+Email + "\nPhone Number: "+PhoneNo+ "\nZip: "+Zip);


		}
	}

}
