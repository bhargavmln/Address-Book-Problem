import java.util.*;
public class AddressBookMain{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//welcome statemment
		System.out.println("Welcome to Address Book Program");
		
		Contact entry = new Contact();
		List<Contact> addressBook = new ArrayList<Contact>();
		char selection = 'Y';
		while(selection =='Y'){
			System.out.println("Enter First Name: ");
			entry.setFirstName(sc.next());
			System.out.println("Enter Last Name:");
            entry.setLastName(sc.next());
            System.out.println("Enter  Address:");
			entry.setAddress(sc.next());
			System.out.println("Enter the City:");
			entry.setCity(sc.next());
			System.out.println("Enter the State:");
			entry.setState(sc.next());
            System.out.println("Enter Zip Code:");
			entry.setZip(sc.next());
            System.out.println("Enter Phone Number:");
			entry.setPhoneNo(sc.next());
            System.out.println("Enter Email Address:");
			entry.setEmail(sc.next());
			System.out.println(entry.toString());
            System.out.println("Add new Contact? (Y/N):");
            selection = sc.next().charAt(0);
			addressBook.add(entry);
		}			
	}
}