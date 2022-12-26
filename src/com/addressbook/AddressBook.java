package com.addressbook;
import java.util.Scanner;
public class AddressBook {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int nEntries ;
		 int nBook=1;
		 BookEntry[] library = new BookEntry[0];
		 while(true)
		 { 
			 if(nBook>0)
			 {
				 library=new BookEntry[nBook];
				 break;
			 }
		 }
		 for(int i=0;i<library.length;i++) {
			 library[i] = new BookEntry();
			 while(true) {
				 System.out.print("How many entries in book ");
		         nEntries = s.nextInt();
		         if(nEntries>0)
		         {
		        	 library[i].initEntries(nEntries); 
		        	 break;
		         }
				 
			 }
		 }
			 boolean done=false;
			 int selectedBook = 0;
		     int option;
		     while(done==false) {
		    	 for(int i=0;i<library[selectedBook].getEntries();i++) {
		    		 System.out.println("***********Entry "+(i+1)+" ***********");
		    		 library[selectedBook].contact[i].readEntry();
		    		 System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
		    	 }
             System.out.println("Select an option!");
	            System.out.println("1. Add an entry");
	            System.out.println("2. Edit an entry");
	            System.out.println("3.Remove an entry");
	           option = s.nextInt();
	            
	                switch(option) {
	            case 1:String first, last, address, city, state, zip, phNumber, email;
	            System.out.print("First name? ");
                first = s.next();
                System.out.print("Last name? ");
                last = s.next();
                System.out.print("Address? ");
                address = s.next();
   			    System.out.print("Enter City ");
   			    city=s.next();
   			    System.out.print("Enter State ");
   			    state=s.next();
   			    System.out.print("Enter Zip ");
   			    zip=s.next();
   		        System.out.print("Enter Phone Number ");
   		        phNumber=s.next();
   			    System.out.print("Enter Email ");
   			    email=s.next();
   			    System.out.println();
                library[selectedBook].add(first, last, address, city, state, zip, phNumber, email);
                break;
	            case 2: 
	            	 System.out.print("Edit which entry?");
	                 int whichEntry = s.nextInt();
	                 System.out.print("First name? ");
	                 first = s.next();
	                 System.out.print("Last name? ");
	                 last = s.next();
	                 System.out.print("Address? ");
	                 address = s.next();
	    			 System.out.print("Enter City ");
	    		     city=s.next();
	    		     System.out.print("Enter State ");
	    		     state=s.next();
	    	         System.out.print("Enter Zip ");
	    	         zip=s.next();
	    	         System.out.print("Enter Phone Number ");
	    	         phNumber=s.next();
	    	         System.out.print("Enter Email ");
	    	         email=s.next();
	    	         System.out.println();
	                 library[selectedBook].edit(first, last, address, city, state, zip, phNumber, email, whichEntry-1);
	                 break;
	            case 3: 
	                System.out.print("Remove which entry? ");
	                int entry = s.nextInt();
	                library[selectedBook].remove(entry-1);
	                break;
	            }
	            
        }
	}

}
