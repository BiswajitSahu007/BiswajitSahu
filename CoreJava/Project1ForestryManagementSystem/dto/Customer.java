package com.cpg.forest_sys.dto;

public class Customer {
	private int customerid;
	private String customerName;
	private String streetAddress1;
	private String streetAddress2;
	private String town;
	private int postalCode;
	private String email;
	private int telephoneNumber;
	public int getCustomerId() {
		return customerid;
	}
	public void setCustomerId(int customerId) {
		this.customerid = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getStreetAddress1() {
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	@Override
	public String toString() {
		return "customerId=" + customerid + "\n customerName=" + customerName + ", streetAddress1="
				+ streetAddress1 + "\n streetAddress2=" + streetAddress2 + "\n town=" + town + "\n postalCode="
				+ postalCode + "\n email=" + email + "\n telephoneNumber=" + telephoneNumber ;
	}
	
	
	
}
