package com.cpg.forest_sys.controller;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cpg.forest_sys.dao.ForestDAO;
import com.cpg.forest_sys.dto.Product;
import com.cpg.forest_sys.factory.Factory;

public class ProductImpl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ForestDAO pd=Factory.getForestDAOImpl();
		Map<Integer, Product> output1=null;
		while (true) {
			Product pbean=Factory.getProduct();
			System.out.println("1.Insert Product data");
			System.out.println("2.Delete Product data");
			System.out.println("3.Search Product data");
			System.out.println("4.To get all Product data");
			System.out.println("5.To know the size");
			System.out.println("6.HOME");
			System.out.println("7.Modify Product details");
			int choice1=sc.nextInt();
			switch (choice1) {
			case 1:	
				System.out.println("Productid:");
				pbean.setProductId(sc.nextInt());
				System.out.println("ProductName:");
				pbean.setProductName(sc.next());
		
				output1=pd.addTheProduct(pbean);

				break;
			case 2:
				System.out.println("Enter ProductNumber to delete the data");
				int delete=sc.nextInt();
				output1.remove(delete);
				break;
			case 3:
				System.out.println("Enter ProductNumber to search the data");
				int detail=sc.nextInt();
				boolean b1=output1.containsKey(detail);
				if(b1==true) {
					System.out.println("-----------PRODUCT DETAILS---------");
					System.out.println("*************************************");
					System.out.println("THE PRODUCT DETAILS ARE:"+detail);
					Collection<Product> c1=output1.values();
					for (Product product : c1) {
						System.out.println(product);
					}
				}
				break;
			case 4:
				Set<Map.Entry<Integer, Product>> s1=output1.entrySet();
				System.out.println("--------------------THE PRODUCT DETAILS ARE---------------");
				System.out.println("************************************************************");
				for (Map.Entry<Integer, Product> entry : s1) {
					System.out.println("THE PRODUCT NUMBER IS : "+entry.getKey());
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
				System.out.println("Modify the Product Details:");
				int modify=sc.nextInt();
				Product pbean1=Factory.getProduct();
				
				System.out.println("Productid:");
				pbean1.setProductId(sc.nextInt());
				System.out.println("ProductName:");
				pbean1.setProductName(sc.next());
				
				output1.replace(modify, pbean1);
			default:
				break;
			}
			//sc.close();
		}

	}

}
