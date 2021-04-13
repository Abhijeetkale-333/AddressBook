package AddressBook;
import AddressBook.Contacts;

public class Main {
     public static void main(String[] args) {
    	 
    	 System.out.println("Welcome To Address Book Program");
    	 
    	 Contacts storeValue = new Contacts("Abhijeet", "Kale", "Nagpur", "Maharashtra", "abhijeetkale786@gmail.com", 9422 ,4400);
		 storeValue.Display();
		 
		 AddContact displayContact = new AddContact();
		 displayContact.NewContact();		
	}
}
