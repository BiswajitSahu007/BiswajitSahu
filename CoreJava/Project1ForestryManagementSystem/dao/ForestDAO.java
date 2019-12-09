package com.cpg.forest_sys.dao;
import java.util.Map;
import com.cpg.forest_sys.dto.Contract;
import com.cpg.forest_sys.dto.Customer;
import com.cpg.forest_sys.dto.Product;
public interface ForestDAO {
	public Map<Integer,Contract> addTheContract(Contract cbean);
	public Map<Integer,Customer> addTheCustomer(Customer csbean);
	public Map<Integer,Product> addTheProduct(Product pbean);

}
