package AddressBook;

public class Contacts {
	String FirstName;
	String LastName;
	String City;
	String State;
	String Email;
	int PhoneNo;
	int Zip;

	public Contacts(String firstName, String lastName, String city, String state, String email, int phoneNo, int zip) {
		super();
		FirstName = firstName;
		LastName = lastName;
		City = city;
		State = state;
		Email = email;
		PhoneNo = phoneNo;
		Zip = Zip;
	}	
	public void Display() {
		System.out.println("First Name: " + this.FirstName);
		System.out.println("Last Name: " + this.LastName);
		System.out.println("City: " + this.City);
		System.out.println("State: " + this.State);
		System.out.println("EmailId: " + this.Email);
		System.out.println("Phone Number: " + this.PhoneNo);
		System.out.println("Zip: " + this.Zip);
	}

   
}
