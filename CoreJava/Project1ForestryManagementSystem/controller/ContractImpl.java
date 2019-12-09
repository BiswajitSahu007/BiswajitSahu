package com.cpg.forest_sys.controller;

//import java.io.ObjectInputStream.GetField;
import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.cpg.forest_sys.dto.Contract;
import com.cpg.forest_sys.factory.Factory;
import com.cpg.forest_sys.dao.*;

public class ContractImpl {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ForestDAO fd=Factory.getForestDAOImpl();
		Map<Integer, Contract> output=null;
		while (true) {
			Contract cbean=Factory.getContract();
			System.out.println("1.Insert Contract data");
			System.out.println("2.Delete Contract data");
			System.out.println("3.Search Contract data");
			System.out.println("4.To get all Contract data");
			System.out.println("5.To know the size");
			System.out.println("6.HOME");
			System.out.println("7.Modify Contract data");

			int choice=sc.nextInt();
			switch (choice) {
			case 1:	
			System.out.println("ContactNumber:");
			cbean.setContractno(sc.nextInt()) ;
			System.out.println("CustomerId:");
			cbean.setCustomerid(sc.nextInt());
			System.out.println("Productid:");
			cbean.setProductid(sc.nextInt());
			System.out.println("Haulierid:");
			cbean.setHaulierid(sc.nextInt());
			System.out.println("Deliverydate:");
			cbean.setDeliverydate(sc.next());
			System.out.println("Deliveryday:");
			cbean.setDeliveryday(sc.next());
			System.out.println("Quantity:");
			cbean.setQuantity(sc.nextInt());
			output=fd.addTheContract(cbean);
			break;
			case 2:
				System.out.println("Enter ContractNumber to delete the data");
				int delete=sc.nextInt();
				output.remove(delete);
				break;
			case 3:
				System.out.println("Enter ContractNumber to search the data");
				int detail=sc.nextInt();
				boolean b1=output.containsKey(detail);
				if(b1==true) {
					System.out.println("-----------Contract Details---------");
					System.out.println("*************************************");
					System.out.println("THE CONTRACT DETAILS ARE:"+detail);
					Collection<Contract> c1=output.values();
					for (Contract contract : c1) {
						System.out.println(contract);
					}
				}	
				break;
			case 4:if(output!=null) {
				Set<Map.Entry<Integer, Contract>> s1=output.entrySet();
				System.out.println("--------------------THE CONTRACT DETAILS ARE---------------");
				for (Map.Entry<Integer, Contract> entry : s1) {
					System.out.println("THE CONTRACT NO IS : "+entry.getKey());
					System.out.println(entry.getValue());
				}
				System.out.println("***********************************************************");
				break;
			}
			case 5:
				System.out.println("THE SIZE IS: "+output.size());
				break;
			case 6:
				AccessAll.main(args);
				break;
			case 7:
				System.out.println("Give the Contract number Modify the Contract Details:");
				int modify=sc.nextInt();
				Contract cbean1=Factory.getContract();
				
				System.out.println("ContactNumber:");
				cbean1.setContractno(sc.nextInt()) ;
				System.out.println("CustomerId:");
				cbean1.setCustomerid(sc.nextInt());
				System.out.println("Productid:");
				cbean1.setProductid(sc.nextInt());
				System.out.println("Haulierid:");
				cbean1.setHaulierid(sc.nextInt());
				System.out.println("Deliverydate:");
				cbean1.setDeliverydate(sc.next());
				System.out.println("Deliveryday:");
				cbean1.setDeliveryday(sc.next());
				System.out.println("Quantity:");
				cbean1.setQuantity(sc.nextInt());
				output.replace(modify, cbean1);
				break;
				
			default:
				break;
			}
			//sc.close();
		}

	}
}
