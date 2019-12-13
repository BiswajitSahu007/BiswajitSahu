package com.capgemini.phonesimulatorapplication.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.phonesimulatorapplication.dao.ContactDao;
import com.capgemini.phonesimulatorapplication.factory.Factory;
import com.capgemini.phonesitmulatorapplication.bean.ContactBean;

public class AccessMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ContactDao dao= Factory.objectContactDaoImpl();
		while(true) {
			System.out.println("-----****WELCOME TO USER CONTACT APPLICATION DEVELOPEMENT****-----");
			System.out.println("select below options for functions");
			System.out.println(" 1.View all contacts");
			System.out.println("2.Search contact");
			System.out.println(" 3.Operations");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				List<ContactBean> l1= dao.viewAllContacts();
				if(l1!=null) {
					for (ContactBean contact : l1) {
						System.out.println(contact);
					}
				} else {
					System.err.println("no data found");
				}
				break;
			case 2:
				System.out.println("please enter the contact name to call / text");
				String name=sc.next();
				ContactBean con=dao.viewContact(name);
				if(con!=null) {
					System.out.println(" number is "+con.getNumber());
					System.out.println(" group name is "+con.getGroup());
					System.out.println("1.Call");
					System.out.println("2.Message");
					System.out.println("3.Go back");
							
					int choice1=sc.nextInt();
					switch(choice1) {
					case 1:
						System.out.println("The Call is in progress ...");
						System.out.println("press any key to end call");
						sc.next();
						break;
					case 2:
						System.out.println("Enter text message to send");
						sc.next();
						System.out.println("messageg sent successfully...");
						break;
					case 3:
						ContactBeanImpl.main(args);
						break;
					default:
						System.err.println("enter valid option!!!");
						break;
					}
				} else {
					System.err.println("contact not found!!!");
				}
				break;
			case 3:
				ContactBeanImpl.main(args);
				break;
			default:
				System.err.println("enter valid option!!!");
				break;
			}
		}
	}
}
