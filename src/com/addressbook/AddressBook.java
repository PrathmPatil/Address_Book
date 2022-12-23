package com.addressbook;
import java.util.Scanner;

public class AddressBook extends Name {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter First and Last Name ");
		String fname=sc.next();
		String lname=sc.next();


		 System.out.println("Enter Address ");
		 String add=sc.next();
		 System.out.println("Enter City ");
		 String city=sc.next();
		 System.out.println("Enter State ");
		 String state=sc.next();
		 System.out.println("Enter Zip ");
		 String zip=sc.next();
		 
		 System.out.println("Enter Phone Number ");
		 String phNumber=sc.next();
		 System.out.println("Enter Email ");
		 String email=sc.next();

		 /*
		  * obj of Name Class
		  */
		 Name obj1=new Name();
		  obj1.name(fname, lname);
		 /*
		  * obj of Address class
		  */
		 Address obj2=new Address();
		 obj2.address(add, city, state, zip);
		 /*
		  * obj of EContact class
		  */
		 Econtact obj3=new Econtact();
		 obj3.econtact(phNumber, email);
	}

}
