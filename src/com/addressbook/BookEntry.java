package com.addressbook;
import java.util.Scanner;

public class BookEntry {
	class Entry{
		 private String first;
	        private String last;
	        private String address;
	        private String city;
	        private String state; 
	        private String zip;
	        private String phNumber;
	        private String email;
		 Entry(String first, String last, String address, String city, String state, String zip,
					String phNumber, String email) {
				this.first = first;
				this.last = last;
				this.address = address;
				this.city = city;
				this.state = state;
				this.zip = zip;
				this.phNumber = phNumber;
				this.email = email;
			}
		 Entry(){
			 first = "";
	         last = "";
	         address = "";
	         city= "";
	         state="";
	         zip="";
	         phNumber="";
	         email = "";
		 }
		 public void readEntry(){
	            System.out.println("First Name:"+first );
	            System.out.println("Last Name:"+last );
	            System.out.println("Address:"+address );
	            System.out.println("City:"+city );
	            System.out.println("State:"+state );
	            System.out.println("Zip:"+zip );
	            System.out.println("Phone Number:"+phNumber );
	            System.out.println("Email:"+email );
	        }
	        
	}
	 private int entries = 0;
	    Entry[] contact;
	    public void initEntries(int a)
	    {
	        contact = new Entry[a];
	        for (int i = 0;i<contact.length;i++)
	        {    
	        	contact[i] = new Entry();
	        }
	    }
	    public int getEntries()
	    {
	        return contact.length;
	    }
	  //Adds an entry to the book
	    public void add(String first, String last, String address, String city, String state, String zip,
				String phNumber, String email){
	        if (entries<contact.length){
	        contact[entries] = new Entry(first, last, address, city, state, zip, phNumber, email);
	        entries++;
	        }
	    }
	  //Changes the values of an entry
	    public void edit(String first, String last, String address, String city, String state, String zip,
				String phNumber, String email,int option){
	        contact[option].first = first;
	        contact[option].last = last;
	        contact[option].address = address;
	        contact[option].city = city;
	        contact[option].state = state;
	        contact[option].zip = zip;
	        contact[option].phNumber = phNumber;
	        contact[option].email = email;
	    }
	    public void remove(int entry){
	        if (entries>0){
	            contact[entry] = new Entry();
	            for (int i = 0;i<entries-entry;i++){
	                if (entry+1==entries) contact[entry] = new Entry();
	                else{
	                    Entry temp = contact[entry+i];
	                    contact[entry+i] = contact[entry+i+1]; //Removes an entry end moves each entry after it one backwards.
	                    contact[entry+i+1] = temp;
	                }
	            }
	            entries--;
	            }
	            else System.out.println("Error: book is empty.");
	    }
}
