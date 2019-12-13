package com.capgemini.phonesimulatorapplication.controller;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.phonesimulatorapplication.dao.ContactDao;
import com.capgemini.phonesimulatorapplication.factory.Factory;
import com.capgemini.phonesitmulatorapplication.bean.ContactBean;

public class ContactBeanImpl {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ContactDao dao= Factory.objectContactDaoImpl();
		while(true) {
			System.out.println("Enter option to perform operations");
			System.out.println(" 1.Insert contact");
			System.out.println("2.Delete contact");
			System.out.println("3.Update contact");
			System.out.println("4.view all contacts");
			System.out.println("5.Go back");
			
			
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the contact details to insert");
				ContactBean con = new ContactBean();
				System.out.println("Enter the name ");
				con.setName(sc.next());
				System.out.println("enter the phone number");
				con.setNumber(sc.nextInt());
				System.out.println("enter the group name");
				con.setGroup(sc.next());
				if(dao.insertContact(con)) {
					System.out.println("contact inserted");
				} else {
					System.err.println("contact not inserted!!!");
				}
				break;
			case 2:
				System.out.println("enter contact name to delete");
				String name=sc.next();
				if(dao.deleteContact(name)) {
					System.out.println("contact deleted");
				} else {
					System.err.println("contact not found!!!");
				}
				break;
			case 3:
				System.out.println("enter the contact name to update");
				String namee=sc.next();
				ContactBean con2=dao.viewContact(namee);
				if(con2!=null) {
					System.out.println("enter the new number to update ");
					String num=sc.next();
					if(dao.updateContact(namee, num)) {
						System.out.println("contact updated...");
					} else {
						System.err.println("contact not updated...");
					} 
				} else {
					System.err.println("contact not found!!!");
				}
				break;
			case 4:
				List<ContactBean> l1= dao.viewAllContacts();
				if(l1!=null) {
					for (ContactBean contact : l1) {
						System.out.println(contact);
					}
				} else {
					System.err.println("no data");
				}
				break;
			case 5:
				AccessMain.main(args);
				break;
			default:
				System.err.println("enter valid option!!!");
				break;
			}
		}

	}
}