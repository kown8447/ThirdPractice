package Study_02;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class ElectronicStore {
	private ProductList productlist;
	private CustomerList customerlist;
	
	public ProductList getProductlist() {
		return productlist;
	}
	
	@Autowired
	public void setProductlist(ProductList productlist) {
		this.productlist = productlist;
	}
	
	public CustomerList getCustomerlist() {
		return customerlist;
	}
	
	@Autowired
	public void setCustomerlist(CustomerList customerlist) {
		this.customerlist = customerlist;
	}
	
	@Override
	public String toString() {
		return "ElectronicStore\n [productlist=" + productlist + "]\n [customerlist=" + customerlist + "]";
	}

}
