package com.cpg.forest_sys.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//import com.cpg.forest_sys.dto.Contract;
import com.cpg.forest_sys.dao.ForestDAO;
import com.cpg.forest_sys.dto.Contract;
import com.cpg.forest_sys.dto.Customer;
import com.cpg.forest_sys.factory.Factory;

public class CustomerImpl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		ForestDAO fs=Factory.getForestDAOImpl();
		Map<Integer, Customer> output1=null;
		while (true) {
			Customer csbean=Factory.getCustomer();
			System.out.println("1.Insert customer data");
			System.out.println("2.Delete customer data");
			System.out.println("3.Search customer data");
			System.out.println("4.To get all customer data");
			System.out.println("5.To know the size");
			System.out.println("6.HOME");
			int choice1=sc.nextInt();
			switch (choice1) {
			case 1:	
				System.out.println("Customerid:");
				csbean.setCustomerId(sc.nextInt());
				System.out.println("CustomerName:");
				csbean.setCustomerName(sc.next());
				System.out.println("StreetAdderss1:");
				csbean.setStreetAddress1(sc.next());
				System.out.println("StreetAddress2:");
				csbean.setStreetAddress2(sc.next());
				System.out.println("Town:");
				csbean.setTown(sc.next());
				System.out.println("Postalcode:");
				csbean.setPostalCode(sc.nextInt());
				System.out.println("EmailId:");		 	
				csbean.setEmail(sc.next());
				System.out.println("TelephoneNumber");
				csbean.setTelephoneNumber(sc.nextInt());

				output1=fs.addTheCustomer(csbean);

				break;
			case 2:
				System.out.println("Enter CustomerNumber to delete the data");
				int delete=sc.nextInt();
				output1.remove(delete);
				break;
			case 3:
				System.out.println("Enter CustomerNumber to search the data");
				int detail=sc.nextInt();
				boolean b1=output1.containsKey(detail);
				if(b1==true) {
					System.out.println("-----------CUSTOMER DETAILS---------");
					System.out.println("*************************************");
					System.out.println("THE CUSTOMER DETAILS ARE:"+detail);
					Collection<Customer> c1=output1.values();
					for (Customer customer : c1) {
						System.out.println(customer);
					}
				}
				break;
			case 4:
				Set<Map.Entry<Integer, Customer>> s1=output1.entrySet();
				System.out.println("--------------------THE CUSTOMER DETAILS ARE---------------");
				System.out.println("************************************************************");
				for (Map.Entry<Integer, Customer> entry : s1) {
					System.out.println("THE CUSTOMER NUMBER IS : "+entry.getKey());
					System.out.println(entry.getValue());
				}
				System.out.println("------------------------------------------------------------");
				break;
			case 5:
				System.out.println("THE SIZE IS: "+output1.size());
				break;
			case 6:
				AccessAll.main(args);
				break;
			case 7:
				System.out.println("Modify the Customer Details:");
				int modify=sc.nextInt();
				Customer csbean1=Factory.getCustomer();
				
				System.out.println("Customerid:");
				csbean1.setCustomerId(sc.nextInt());
				System.out.println("CustomerName:");
				csbean1.setCustomerName(sc.next());
				System.out.println("StreetAdderss1:");
				csbean1.setStreetAddress1(sc.next());
				System.out.println("StreetAddress2:");
				csbean1.setStreetAddress2(sc.next());
				System.out.println("Town:");
				csbean1.setTown(sc.next());
				System.out.println("Postalcode:");
				csbean1.setPostalCode(sc.nextInt());
				System.out.println("EmailId:");		 	
				csbean1.setEmail(sc.next());
				System.out.println("TelephoneNumber");
				csbean1.setTelephoneNumber(sc.nextInt());
				output1.replace(modify, csbean1);
			default:
				break;
			}
			//sc.close();
		}

	}

}
