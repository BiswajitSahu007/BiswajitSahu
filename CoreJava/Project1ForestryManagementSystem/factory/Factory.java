package com.cpg.forest_sys.factory;

import com.cpg.forest_sys.dao.ForestDAO;
import com.cpg.forest_sys.dao.ForestDAOImpl;
import com.cpg.forest_sys.dto.Contract;
import com.cpg.forest_sys.dto.Customer;
import com.cpg.forest_sys.dto.Product;

public class Factory {
	public static Contract getContract() {
		return new Contract();
	}
	public static ForestDAO getForestDAOImpl() {
		return new ForestDAOImpl();
	}
	public static Customer getCustomer() {
		return new Customer();
	}
	public static Product getProduct() {
		return new Product();
	}
}
