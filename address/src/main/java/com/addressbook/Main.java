package com.addressbook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Address Book");
        AddressBook abook = new AddressBook(); 
        ArrayList<Contact> addressBook = abook.wrapper();

        while(true){
            System.out.println("\n1. ADD \n2. EDIT \n3. DELETE \n4. Display \n5. Search \n6. Count \n7. Sort \n8. Write");
            System.out.print("ENTER OPTION:- ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Contact person = new Contact();
                    boolean duplicate = false;
                    for(Contact i : addressBook) if(i.equals(person)){ duplicate = true; break; }

                    if(duplicate) System.out.println("Error: Duplicate");
                    else addressBook.add(person);
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
                
                case 4:
                    for(int i=0; i<addressBook.size(); i++){
                        System.out.println(addressBook.get(i).firstName + " " + addressBook.get(i).lastName);
                    }
                    break;

                case 5:
                    System.out.println("Enter City:- ");
                    String searchCity = scanner.nextLine();

                    List<Contact> cityFilter = addressBook.stream()
                        .filter(contact -> contact.city.equals(searchCity))
                        .collect(Collectors.toList());

                    for(Contact contact : cityFilter){
                        System.out.println(contact.firstName + " " + contact.lastName);
                    }
                    break;

                case 6:
                    System.out.println("Count:- \n1. City \n2. State");
                    int select = scanner.nextInt();
                    scanner.nextLine();
                    if(select == 1){
                        System.out.println("Enter City:- ");
                        String searchCityCount = scanner.nextLine();

                        int count = addressBook.stream()
                        .filter(contact -> contact.city.equals(searchCityCount))
                        .collect(Collectors.toList()).size();

                        System.out.println("TOTAL:- " + count);
                    } else{
                        System.out.println("Enter State:- ");
                        String searchStateCount = scanner.nextLine();

                        int count = addressBook.stream()
                        .filter(contact -> contact.state.equals(searchStateCount))
                        .collect(Collectors.toList()).size();

                        System.out.println("TOTAL:- " + count);
                    }

                    break;
                
                case 7:
                    System.out.println("\nSORT BY: \n1. First Name \n2. CITY \n3. STATE \n4. Zip");
                    System.out.print("ENTER:- ");
                    select = scanner.nextInt();
                    scanner.nextLine();
                    List<Contact> sorted;

                    switch (select) {
                        case 1:
                            sorted = addressBook.stream()
                                .sorted(Comparator.comparing(contact -> contact.firstName))
                                .collect(Collectors.toList());
                            for(Contact i : sorted){
                                i.display();
                            }
                            break;
                        
                        case 2:
                            sorted = addressBook.stream()
                                .sorted(Comparator.comparing(contact -> contact.city))
                                .collect(Collectors.toList());
                            for(Contact i : sorted){
                                i.display();
                            }
                            break;

                        case 3:
                            sorted = addressBook.stream()
                                .sorted(Comparator.comparing(contact -> contact.state))
                                .collect(Collectors.toList());
                            for(Contact i : sorted){
                                i.display();
                            }
                            break;

                        case 4:
                            sorted = addressBook.stream()
                                .sorted(Comparator.comparing(contact -> contact.zip))
                                .collect(Collectors.toList());
                            for(Contact i : sorted){
                                i.display();
                            }
                            break;

                        default:
                            break;
                    }

                    break;

                case 8:
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("address_book.txt"));
                        for(Contact i : addressBook){
                            writer.write(i.toString() + "\n");
                        }
                        writer.close();

                        System.out.println("Writing Sucessful: address_book.txt");
                    } catch (IOException e) {
                        e.getStackTrace();
                        System.out.println("Error: File not created");
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