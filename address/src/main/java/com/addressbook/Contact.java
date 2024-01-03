package com.addressbook;
import java.util.Scanner;

public class Contact{
    public String firstName, lastName, address, city, state, email;
    public int zip, phoneNo;

    Contact(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nENTER PERSON DETAILS:- ");
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
        this.phoneNo = scanner.nextInt();
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

    public boolean equals(Contact other) {
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    } 
}
