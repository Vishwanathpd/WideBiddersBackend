package com.widebidders.models.service;

import java.util.List;
import java.util.Map;

import com.widebidders.models.entities.Customer;
import com.widebidders.models.entities.LoginEntity;
  
public interface CustomerService {
	public List getCustomers();
	public int addCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void deleteCustomer(int id);
	public void updateCustomer(Customer customer);
	public Customer loginAuthentication(LoginEntity login);
	public String getCustomerByEmail(String email);
	public String getMailId(int id);
}