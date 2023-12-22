package com.addressbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Address Book");
        
        // Console Input:-
        String firstName, lastName, address, city, state, email;
        int zip, phoneNo;

        System.out.print("First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("City: ");
        city = scanner.nextLine();
        System.out.print("State: ");
        state = scanner.nextLine();
        System.out.print("Zip: ");
        zip = scanner.nextInt();
        scanner.nextLine(); // Consume New Line
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Contact: ");
        phoneNo = scanner.nextInt();
        scanner.nextLine(); // Consume New Line

        Contact person = new Contact(firstName, lastName, address, city, state, email, zip, phoneNo);
        scanner.close();
    }
}

class Contact{
    public String firstName, lastName, address, city, state, email;
    public int zip, phoneNo;

    Contact(){}
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