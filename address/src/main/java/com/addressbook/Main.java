package com.addressbook;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");

        Contact c1 = new Contact("Roop", "Lala", "Adajan", "Surat", "Gujarat", "abc@gmail.com", 112233, 111222333);
    }
}

class Contact{
    public String firstName, lastName, address, city, state, email;
    public int zip, phoneNo;

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