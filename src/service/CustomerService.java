package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customers;
	
	private static final CustomerService instance = new CustomerService();
	
	private CustomerService(){
		customers = new HashMap<String, Customer>();
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id){ // id를 받아서  Customer Bean 을 넘겨준다
		if(id != null)
			return(customers.get(id.toLowerCase())); // 소문자로 바꾸기
		else
			return null;
	}
	
	public Customer login(String id, String password){
		if(id != "customers.getId()" || password != "customers.getPassword()")
			return null;
		else
			return customers.get(id.toLowerCase());
	}
}	
