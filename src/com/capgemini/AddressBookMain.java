package com.capgemini;

import java.util.*;

public class AddressBookMain {
	
	static Scanner sc = new Scanner(System.in);
	List<Contact> addressBook = new ArrayList<Contact>();

	public void deleteContact(String firstName) {
		boolean check = false;
		for (Contact c : addressBook) {
			if (firstName.equals(c.getFirstName())) {
				addressBook.remove(c);
				check = true;
				break;
			}
		}
		if (check == false) {
			System.out.println("contact with first name " + firstName + " doesn't exist.");
		}
	}

	public void addContact() {

		Contact entry = new Contact();

		char selection = 'Y';
		while (selection == 'Y') {
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

	public void editContact(String firstName) {

		boolean exitFlag = true;
		boolean check = false;
		for (Contact entry : addressBook) {
			if (entry.getFirstName().equals(firstName)) {
				check = true;
				while (exitFlag) {
					System.out.println(
							"Enter your choice:\n 1.firstName\n 2.lastName\n 3.address\n 4.city\n 5.state\n 6.zip\n 7.phoneNo\n 8.email\n 9.exit");
					int choice = sc.nextInt();
					switch (choice) {
					case 1: {
						System.out.println("Enter First Name:");
						entry.setFirstName(sc.next());
						System.out.println("Do you want to continue edit?(Y/N)");
						char answer = sc.next().charAt(0);
						if (answer == 'N') {
							exitFlag = false;
						}
						break;
					}
					case 2: {
						System.out.println("Enter Last Name:");
						entry.setLastName(sc.next());
						System.out.println("Do you want to continue edit?(Y/N)");
						char answer = sc.next().charAt(0);
						if (answer == 'N') {
							exitFlag = false;
						}
						break;
					}
					case 3: {
						System.out.println("Enter the Address:");
						entry.setAddress(sc.next());
						break;
					}
					case 4: {
						System.out.println("Enter the City:");
						entry.setCity(sc.next());
						System.out.println("Do you want to continue edit?(Y/N)");
						char answer = sc.next().charAt(0);
						if (answer == 'N') {
							exitFlag = false;
						}
						break;
					}
					case 5: {
						System.out.println("Enter the State:");
						entry.setState(sc.next());
						System.out.println("Do you want to continue edit?(Y/N)");
						char answer = sc.next().charAt(0);
						if (answer == 'N') {
							exitFlag = false;
						}
						break;
					}
					case 6: {
						System.out.println("Enter Zip:");
						entry.setZip(sc.next());
						System.out.println("Do you want to continue edit?(Y/N)");
						char answer = sc.next().charAt(0);
						if (answer == 'N') {
							exitFlag = false;
						}
						break;
					}
					case 7: {
						System.out.println("Enter Phone Number:");
						entry.setPhoneNo(sc.next());
						System.out.println("Do you want to continue edit?(Y/N)");
						char answer = sc.next().charAt(0);
						if (answer == 'N') {
							exitFlag = false;
						}
						break;
					}

					case 8: {
						System.out.println("Enter Email Id:");
						entry.setEmail(sc.next());
						System.out.println("Do you want to continue edit?(Y/N)");
						char answer = sc.next().charAt(0);
						if (answer == 'N') {
							exitFlag = false;
						}
						break;
					}

					case 9: {
						System.out.println("Exiting edit section");
						exitFlag = false;
						break;
					}

					default:
						System.out.println("Enter number from 1 to 9");
					}
				}
			}
		}
		if (check == false) {
			System.out.println("contact with first name " + firstName + " doesn't exist.");
		}
	}

	public static void main(String[] args) {
		
		// welcome statement
		AddressBookMain addressBookMain = new AddressBookMain();
		System.out.println("Welcome to Address Book Program");

		addressBookMain.addContact();

		System.out.println("Enter the name of the conatact to be edited:");
		addressBookMain.editContact(sc.next());

		System.out.println("Enter the name of the contact to be deleted:");
		addressBookMain.deleteContact(sc.next());
	}
}