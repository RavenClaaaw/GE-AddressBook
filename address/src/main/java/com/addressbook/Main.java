package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Address Book");
        ArrayList<Contact> addressBook = new ArrayList<>();

        while(true){
            System.out.println("1. ADD \n2. EDIT \n3. DELETE \n4. Display");
            System.out.print("ENTER OPTION:- ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Contact person = new Contact();
                    addressBook.add(person);
                    break;

                case 2:
                    String firstNameE = scanner.nextLine();
                    String lastNameE = scanner.nextLine();
                    for(int i=0; i<addressBook.size(); i++){
                        if(addressBook.get(i).firstName == firstNameE && addressBook.get(i).lastName == lastNameE){
                            Contact personEdit = new Contact();
                            addressBook.set(i, personEdit);
                        }
                    }
                    break;
                
                case 3:
                    String firstNameD = scanner.nextLine();
                    String lastNameD = scanner.nextLine();
                    for(int i=0; i<addressBook.size(); i++){
                        if(addressBook.get(i).firstName == firstNameD && addressBook.get(i).lastName == lastNameD){
                            addressBook.remove(i);
                        }
                    }
                    break;

                default:
                    for(int i=0; i<addressBook.size(); i++){
                        System.out.println(addressBook.get(i).firstName + " " + addressBook.get(i).lastName);
                    }
                    break;
            }

        }

        // scanner.close();
    }
}

class Contact{
    public String firstName, lastName, address, city, state, email;
    public int zip;
    public long phoneNo;

    Contact(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Address: ");
        this.address = scanner.nextLine();
        System.out.print("City: ");
        this.city = scanner.nextLine();
        System.out.print("State: ");
        this.state = scanner.nextLine();
        System.out.print("Zip: ");
        this.zip = scanner.nextInt();
        scanner.nextLine(); // Consume New Line
        System.out.print("Email: ");
        this.email = scanner.nextLine();
        System.out.print("Contact: ");
        this.phoneNo = scanner.nextLong();
        scanner.nextLine(); // Consume New Line

        // scanner.close();
    }

    Contact(String firstName, String lastName, String address, String city, String state, String email, int zip, int phoneNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }
}