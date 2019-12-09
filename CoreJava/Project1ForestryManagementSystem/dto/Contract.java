package com.cpg.forest_sys.dto;

import java.util.Date;

public class Contract {
	//initialization of data table
	private int contractno;
	private int customerid;
	private int productid;
	private int haulierid;
	private String deliverydate;
	private String deliveryday;
	private int quantity;
	//Getter Methods
	public int getContractno() {
		return contractno;
	}
	public void setContractno(int contractno) {
		this.contractno = contractno;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getHaulierid() {
		return haulierid;
	}
	public void setHaulierid(int haulierid) {
		this.haulierid = haulierid;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getDeliveryday() {
		return deliveryday;
	}
	public void setDeliveryday(String deliveryday) {
		this.deliveryday = deliveryday;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//toString 
	@Override
	public String toString() {
		return "contractno=" + contractno + "\n customerid=" + customerid + "\n productid=" + productid
				+ "\n haulierid=" + haulierid + "\n deliverydate=" + deliverydate + "\n deliveryday=" + deliveryday
				+ "\n quantity=" + quantity ;
	}


	
	
	
}
