package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    public HashMap<String, ArrayList<Contact>> bookList = new HashMap<>();

    AddressBook(){}

    public ArrayList<Contact> wrapper(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- ADDRESS BOOK ---");
        
        this.display();
        System.out.println("1. ADD \n2. SELECT");
        System.out.print("ENTER OPTION: ");
    
        int option = scanner.nextInt();
        scanner.nextLine();

        if(option == 1) this.add();

        this.display();
        System.out.print("\nSELECT:- ");
        String bookName = scanner.nextLine();

        return bookList.get(bookName);
    }

    public void display(){
        System.out.println("AVAILABLE ADDRESS BOOKS:- ");
        System.out.println(bookList.keySet());
    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("\nEnter Name:- ");
            String bookName = scanner.nextLine();

            ArrayList<Contact> newAddBook = new ArrayList<>();
            bookList.put(bookName, newAddBook);

            System.out.println("CONTINUE: 0 \nBREAK: 1");
            System.out.print("ENTER OPTION:- ");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option != 0) break; 
        }
    }
}
