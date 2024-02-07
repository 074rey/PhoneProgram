/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.lab5;

/**
 *
 * @author rey7s
 */
import java.util.Scanner;
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        AddressBook addressbook=new AddressBook();
        int anynumber=0;
        while(anynumber!=10){
        System.out.println("choose number from 1 to 9 to do it:\n"
                + "1-Add a new contact\n" +
                "2-Update a contact\n"+
                "3-Display a contact\n" +
                "4-Favorite a contact\n"+
                "5-Display all the favorite contacts\n"+
                "6-Display all the contacts\n"+
                "7-Block a contact\n"+
                "8-Display a blocked contacts\n"+
                "9-Display all the recent contacts");
     anynumber =  input.nextInt();
     switch (anynumber){
         case 1:
         if( AddressBook.NumberOfContacts<100)
         {
             System.out.println("First name");
             String firstname = input.next();
              System.out.println("Last name");
             String lastname = input.next();
              System.out.println("Company");
             String com = input.next();
             
             Name name = new Name(firstname, lastname, com);
             
              System.out.println("add phone");
             long ap = input.nextLong();
              System.out.println("add email");
             String ae = input.next();
              System.out.println("Street1");
             String s1 = input.next();
              System.out.println("Street2");
             String s2 = input.next();
              System.out.println("City");
             String city = input.next();
              System.out.println("Postal Code");
             int po = input.nextInt();
             
             Address address = new Address(s1, s2, city, po);
             
              System.out.println("Enter day");
             int d = input.nextInt();
              System.out.println("Enter month");
             String m = input.next();
              System.out.println("Enter Year");
             int y = input.nextInt();
             
             Date date = new Date (d , m , y);
             
             Contact c = new Contact(name, date,address, ap, ae);
            addressbook.AddContact(c);
         }else {
             System.out.println("Can't add another number.");
         }
         break;
         case 2:
         System.out.println("Enter old number");
             long oln = input.nextLong();
                System.out.println("Enter new number");
             long neu = input.nextLong();
                    for (int i = 0; i<AddressBook.NumberOfContacts;i++) {
                    if (addressbook.contacts[i].getNumber()==oln){
                    addressbook.UpdateContact(neu, i);
         }
                    }
         break;
         case 3:
             System.out.println("Enter number");
             long num = input.nextLong();
              for (int i = 0; i< AddressBook.NumberOfContacts;i++) {
                   if (addressbook.contacts[i].getNumber()==num)
                    {
                        addressbook.DisplayContact(i);
                    }
              }
     
         break;
         case 4:
            System.out.println("Enter number");
            long num1 = input.nextLong();
            for (int i = 0; i< AddressBook.NumberOfContacts;i++) {
                   if (addressbook.contacts[i].getNumber()==num1)
                    {
                        addressbook.favoriteContact(i);
                    }
              }
         
         break;
         case 5:
           addressbook.Displayfavorite();
         break;
         case 6:
             addressbook.DisplayallContact();
         break;
         case 7:
             System.out.println("Enter Number");
             long num2= input.nextLong();
            for (int i = 0; i< AddressBook.NumberOfContacts;i++) {
                   if (addressbook.contacts[i].getNumber()==num2){
             addressbook.blockContact(i);
                   }
            }
         break;
    case 8:
             addressbook.DisplaBlock();
         break;
    case 9:
             addressbook.Displayrecent();
         break;
         
     
     }
     }
    }

    
}
