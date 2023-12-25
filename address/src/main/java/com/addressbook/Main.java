package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Address Book");
        AddressBook abook = new AddressBook(); 
        ArrayList<Contact> addressBook = abook.wrapper();

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
                    System.out.print("ENTER FIRST NAME: ");
                    String firstNameE = scanner.nextLine();
                    System.out.print("ENTER LAST NAME: ");
                    String lastNameE = scanner.nextLine();
                    for(int i=0; i<addressBook.size(); i++){
                        if(addressBook.get(i).firstName == firstNameE && addressBook.get(i).lastName == lastNameE){
                            Contact personEdit = new Contact();
                            addressBook.set(i, personEdit);
                        }
                    }
                    break;
                
                case 3:
                    System.out.print("ENTER FIRST NAME: ");
                    String firstNameD = scanner.nextLine();
                    System.out.print("ENTER LAST NAME: ");
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